package com.kurtulussahin.webapp.httpservers;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimpleWebPageServer {

    public static void main(String[] args) throws IOException {
        int port = 8080;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        server.createContext("/index.html", new FileHandler("src/com/kurtulussahin/java/webapp/index.html"));

        server.setExecutor(null);
        System.out.println("Sunucu başlatıldı. Port: " + port);
        server.start();

        System.out.println("Çalışma Dizini: " + System.getProperty("user.dir"));
        Path path = Path.of("src/com/kurtulussahin/java/webapp/index.html");
        System.out.println("Dosya Mevcut: " + Files.exists(path) + " - Yol: " + path.toAbsolutePath());

    }
    static class FileHandler implements HttpHandler {
        private final String filePath;

        public FileHandler(String filePath) {
            this.filePath = filePath;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Dosyayı oku
            Path path = Path.of(filePath);
            if (Files.exists(path)) {
                // Dosya içerik tipi (HTML)
                String contentType = Files.probeContentType(path);
                byte[] fileBytes = Files.readAllBytes(path);

                // Yanıt başlıkları ve içerik
                exchange.getResponseHeaders().set("Content-Type", contentType != null ? contentType : "text/plain");
                exchange.sendResponseHeaders(200, fileBytes.length);
                System.out.println(filePath + " sayfasına erişildi.");

                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(fileBytes);
                }
            } else {
                //System.out.println(response);
                System.out.println("response");
                // Eğer dosya bulunamazsa 404 döner
                String response = "404 Not Found: " + filePath;
                exchange.sendResponseHeaders(404, response.getBytes(StandardCharsets.UTF_8).length);

                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }
}

