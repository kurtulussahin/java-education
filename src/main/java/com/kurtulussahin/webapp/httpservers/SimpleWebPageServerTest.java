package com.kurtulussahin.webapp.httpservers;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SimpleWebPageServerTest {

    private static final String VALID_FILE_PATH = "src/com/kurtulussahin/java/webapp/index.html";
    private static final String INVALID_FILE_PATH = "src/com/kurtulussahin/java/webapp/missing.html";
    private HttpExchange exchange;
    private ByteArrayOutputStream responseStream;

    @BeforeEach
    void setup() {
        exchange = mock(HttpExchange.class);
        responseStream = new ByteArrayOutputStream();

        // Mock the response headers
        Headers headers = new Headers();
        when(exchange.getResponseHeaders()).thenReturn(headers);

        // Mock the response body
        when(exchange.getResponseBody()).thenReturn(responseStream);
    }

    @Test
    void testFileHandlerWithValidFile() throws IOException {
        // Prepare a valid file for testing
        Path validFilePath = Path.of(VALID_FILE_PATH);
        Files.createDirectories(validFilePath.getParent());
        Files.writeString(validFilePath, "<html><body><h1>Hello, World!</h1></body></html>");

        // Mock HttpExchange for GET request
        when(exchange.getRequestMethod()).thenReturn("GET");

        // Execute the handler
        SimpleWebPageServer.FileHandler handler = new SimpleWebPageServer.FileHandler(VALID_FILE_PATH);
        handler.handle(exchange);

        // Verify headers and response
        assertEquals("text/html", exchange.getResponseHeaders().getFirst("Content-Type"));
        verify(exchange).sendResponseHeaders(eq(200), anyLong());
        String response = responseStream.toString(StandardCharsets.UTF_8);
        assertTrue(response.contains("Hello, World!"));

        // Clean up
        Files.deleteIfExists(validFilePath);
    }

    @Test
    void testFileHandlerWithMissingFile() throws IOException {
        // Mock HttpExchange for GET request
        when(exchange.getRequestMethod()).thenReturn("GET");

        // Execute the handler
        SimpleWebPageServer.FileHandler handler = new SimpleWebPageServer.FileHandler(INVALID_FILE_PATH);
        handler.handle(exchange);

        // Verify 404 response
        verify(exchange).sendResponseHeaders(eq(404), anyLong());
        String response = responseStream.toString(StandardCharsets.UTF_8);
        assertTrue(response.contains("404 Not Found:"));

        // Ensure proper response mentions the missing file
        assertTrue(response.contains(INVALID_FILE_PATH));
    }

    @Test
    void testFileHandlerWithUnknownContentType() throws IOException {
        // Prepare a file with plain text content
        Path validFilePath = Path.of(VALID_FILE_PATH);
        Files.createDirectories(validFilePath.getParent());
        Files.write(validFilePath, "Plain text content".getBytes(StandardCharsets.UTF_8)); // Plain text file

        // Mock HttpExchange for GET request
        when(exchange.getRequestMethod()).thenReturn("GET");

        // Execute the handler
        SimpleWebPageServer.FileHandler handler = new SimpleWebPageServer.FileHandler(VALID_FILE_PATH);
        handler.handle(exchange);

        // Verify headers and response
        assertEquals("text/html", exchange.getResponseHeaders().getFirst("Content-Type"));
        verify(exchange).sendResponseHeaders(eq(200), anyLong());

        // Clean up
        Files.deleteIfExists(validFilePath);
    }
}
