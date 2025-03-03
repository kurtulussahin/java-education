package com.kurtulussahin.codekata.http.elegantobjectshttpserver;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Arrays;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

public class App extends IOException {

    interface Resource {
        Resource refine(String name, String value);
        void print(Output output);
    }

    interface Output {
        void print(String name, String value);
    }

    private final Resource resource;

    public App(Resource res) {
        this.resource = res;
    }

    class StringBuilderOutput implements Output {
        private final StringBuilder buffer;
        public StringBuilderOutput(StringBuilder buffer) {
            this.buffer = buffer;
        }

        @Override
        public void print(final String name, final String value) {
            if(this.buffer.length() == 0){
                this.buffer.append("HTTP/1.1 200 OK\r\n");
            }
            if(name.equals("X-Body")) {
                this.buffer.append("\r\n").append(value);
            }else{
                this.buffer.append(name).append(": ").append(value).append("\r\n");
            }
        }
    }
    String response(String response){
        Map<String, String> pairs = new HashMap<>();
        String[] lines = response.split("\r\n");
        for(int idx=1; idx<lines.length; idx++){
            String[] parts = lines[idx].split(":");
            pairs.put(parts[0].trim(), parts[1].trim());
        }
        String[] parts = lines[0].split(" ");
        pairs.put("X-Method", parts[0]);
        pairs.put("X-Query", parts[1]);
        pairs.put("X-protocol", parts[2]);
        Resource res = this.resource;
        for(Map.Entry<String, String> pair : pairs.entrySet()){
            res = res.refine(pair.getKey(), pair.getValue());
        }
        final StringBuilder buffer = new StringBuilder();
        res.print(new StringBuilderOutput(buffer));
        return buffer.toString();
    }
    void start(int port) throws IOException {
        try (ServerSocket server = new ServerSocket(port)) {
            server.setSoTimeout(1000);
            while (true) {
                try (Socket socket = server.accept()) {
                    try (InputStream input = socket.getInputStream();
                         OutputStream output = socket.getOutputStream()) {
                        byte[] buffer = new byte[10000];
                        int total = input.read(buffer);
                        output.write(
                                response(
                                    new String(Arrays.copyOfRange(buffer, 0, total))
                                ).getBytes()
                        );
                    }
                }catch (SocketTimeoutException e) {
                    if(Thread.currentThread().isInterrupted()){
                        break;
                    }
                }
            }
        }
    }
}
