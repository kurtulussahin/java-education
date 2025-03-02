package com.kurtulussahin.codekata.http.elegantobjectshttpserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class App extends IOException{

    void start(int port) throws IOException {
        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();
        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();
        byte[] buffer = new byte[10000];
        input.read(buffer);
        output.write("HTTP/1.1 200 OK\r\n\r\nHello, world!".getBytes());
        input.close();
        output.close();
        server.close();
    }
}
