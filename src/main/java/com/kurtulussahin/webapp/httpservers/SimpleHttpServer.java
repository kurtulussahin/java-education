package com.kurtulussahin.webapp.httpservers;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class SimpleHttpServer {

    public static void main(String[] args) throws IOException {

        int port = 8080;
        String path = "/log";

        HttpServer server = getHttpServer(port, path);

        server.start();
        System.out.println("Sunucu başlatıldı. Port: " + port);
    }

    private static HttpServer getHttpServer(int port, String path) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext(path, new LogHandler());
        server.setExecutor(null);
        return server;
    }

    static class LogHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String method = exchange.getRequestMethod(); // İstek türü (GET/POST)
            String response;

            // GET isteği
            if ("GET".equalsIgnoreCase(method)) {
                String queryParams = exchange.getRequestURI().getQuery(); // Sorgu parametrelerini al
                System.out.println("GET İsteği Alındı: " + queryParams);

                response = "GET isteği alındı.\n" + (queryParams != null ? "Sorgu Parametreleri: " + queryParams : "Parametre yok");

                // POST isteği
            } else if ("POST".equalsIgnoreCase(method)) {
                String requestBody = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8); // Gövdeyi oku
                System.out.println("POST İsteği Alındı: " + requestBody);

                response = "POST isteği alındı.\nGövde: " + requestBody;

                // Desteklenmeyen HTTP yöntemi
            } else {
                System.out.println("Desteklenmeyen HTTP Yöntemi: " + method);
                response = "Desteklenmeyen HTTP yöntemi: " + method;
                exchange.sendResponseHeaders(405, response.getBytes(StandardCharsets.UTF_8).length); // 405 Method Not Allowed
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes(StandardCharsets.UTF_8));
                }
                return;
            }
            // Yanıt olarak istek verilerini aynen geri gönder
            byte[] responseBytes = response.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, responseBytes.length); // Yanıt başlığı gönderiliyor
            try (OutputStream os = exchange.getResponseBody()) { // Yanıt akışı
                os.write(responseBytes);
            }
        }
    }
}
