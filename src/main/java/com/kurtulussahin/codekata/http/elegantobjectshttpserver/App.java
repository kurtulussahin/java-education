package com.kurtulussahin.codekata.http.elegantobjectshttpserver;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Arrays;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class App extends IOException {

    void start(int port) throws IOException {
        try (ServerSocket server = new ServerSocket(port)) {
            server.setSoTimeout(1000);
            while (true) {
                try (Socket socket = server.accept()) {
                    try (InputStream input = socket.getInputStream();
                         OutputStream output = socket.getOutputStream()) {
                        byte[] buffer = new byte[10000];
                        int total = input.read(buffer);
                        String request = new String(Arrays.copyOfRange(buffer, 0, total));
                        //System.out.println(request);
                        output.write("HTTP/1.1 200 OK\r\n\r\nHello, world!".getBytes());
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
