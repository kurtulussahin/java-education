package com.kurtulussahin.codekata.http.httpwebrest.examples.examples;
import java.io.*;
import java.net.*;

public class HttpEchoServer {

    public static void main(String[] args) {
        // HTTP Echo Server portu
        int port = 8080;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("HTTP Echo Server başlatıldı, port: " + port);

            while (true) {
                // Bağlantıyı kabul et
                Socket clientSocket = serverSocket.accept();
                System.out.println("Bir istemci bağlandı: " + clientSocket.getInetAddress());

                // İstemci ile iletişim kuracak input ve output stream oluştur
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                OutputStream output = clientSocket.getOutputStream();

                // HTTP request'in ilk satırını al
                String requestLine = input.readLine();
                System.out.println("Gelen istek: " + requestLine);
                System.out.println("Sunucu : " + serverSocket.getClass().getName());
                // HTTP başlıklarını geç
                String header;
                String headers="";
                while (!(header = input.readLine()).isEmpty()) {
                    System.out.println(header);
                    headers = headers + "\n" + header ;
                }

                // Echo edilen cevabı oluştur
                String responseBody = "HTTP Echo Server " + serverSocket.getClass().getName() + " : " + requestLine + "\n\nHeaders: \n " + headers;

                // HTTP response gönder
                String httpResponse = "HTTP/1.1 200 OK\r\n" +
                        "Content-Type: text/plain; charset=UTF-8\r\n" +
                        "Content-Length: " + responseBody.length() + "\r\n" +
                        "\r\n" +
                        responseBody;

                output.write(httpResponse.getBytes("UTF-8"));
                output.flush();

                clientSocket.close();
                System.out.println("Bağlantı kapatıldı.\n");
            }
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
