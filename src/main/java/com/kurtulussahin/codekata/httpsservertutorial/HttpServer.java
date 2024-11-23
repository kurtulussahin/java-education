package com.kurtulussahin.codekata.httpsservertutorial;

import com.kurtulussahin.codekata.httpsservertutorial.config.Configuration;
import com.kurtulussahin.codekata.httpsservertutorial.config.ConfigurationManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    public static void main(String[] args){

        System.out.println("Server starting ...");

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf= ConfigurationManager.getInstance().getCurrentConfigurtion();
        System.out.println("Using Port: "+conf.getPort());
        System.out.println("Using WebRoot: "+conf.getWebroot());

        try {
            ServerSocket serverSocket = new ServerSocket(conf.getPort());
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            String html = "<html><head><title>Simple Java HTTP Server</title></head>" +
                    "<body><h1>This page served using simple http server</h1></body></html>";

            final String CRLF="\n\r"; // 13,10 ASCII

            String response =
                    "HTTP/1.1 200 OK" + CRLF +  //Status line : HTTP_VERSION RESPONSE_CODE RESPONSE_MESSAGE
                    "Content-Length" + html.getBytes().length + CRLF + // HEADER
                            CRLF +
                            html +
                            CRLF + CRLF;

            outputStream.write(response.getBytes());

            inputStream.close();
            outputStream.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
