package com.kurtulussahin.codekata.http.httpwebrest.examples.examples;

import com.sun.net.httpserver.HttpExchange;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class SimpleHttpServerTest {

    @Test
    void testHandleGetRequest() throws IOException {
        // Mock HttpExchange
        HttpExchange exchange = mock(HttpExchange.class);

        // Simulate GET request
        when(exchange.getRequestMethod()).thenReturn("GET");
        when(exchange.getRequestURI()).thenReturn(URI.create("/log?param1=value1&param2=value2"));

        // Capture response
        ByteArrayOutputStream responseStream = new ByteArrayOutputStream();
        when(exchange.getResponseBody()).thenReturn(responseStream);

        // Execute handler
        SimpleHttpServer.LogHandler handler = new SimpleHttpServer.LogHandler();
        handler.handle(exchange);

        // Verify response
        String response = responseStream.toString(StandardCharsets.UTF_8);
        assertTrue(response.contains("GET isteği alındı"));
        assertTrue(response.contains("param1=value1"));

        // Verify headers
        verify(exchange).sendResponseHeaders(eq(200), anyLong());
    }

    @Test
    void testHandlePostRequest() throws IOException {
        // Mock HttpExchange
        HttpExchange exchange = mock(HttpExchange.class);

        // Simulate POST request
        when(exchange.getRequestMethod()).thenReturn("POST");
        String requestBody = "name=John&age=30";
        InputStream requestBodyStream = new ByteArrayInputStream(requestBody.getBytes(StandardCharsets.UTF_8));
        when(exchange.getRequestBody()).thenReturn(requestBodyStream);

        // Capture response
        ByteArrayOutputStream responseStream = new ByteArrayOutputStream();
        when(exchange.getResponseBody()).thenReturn(responseStream);

        // Execute handler
        SimpleHttpServer.LogHandler handler = new SimpleHttpServer.LogHandler();
        handler.handle(exchange);

        // Verify response
        String response = responseStream.toString(StandardCharsets.UTF_8);
        assertTrue(response.contains("POST isteği alındı"));
        assertTrue(response.contains("Gövde: name=John&age=30"));

        // Verify headers
        verify(exchange).sendResponseHeaders(eq(200), anyLong());
    }

    @Test
    void testHandleUnsupportedMethod() throws IOException {
        // Mock HttpExchange
        HttpExchange exchange = mock(HttpExchange.class);

        // Simulate unsupported method
        when(exchange.getRequestMethod()).thenReturn("PUT");

        // Capture response
        ByteArrayOutputStream responseStream = new ByteArrayOutputStream();
        when(exchange.getResponseBody()).thenReturn(responseStream);

        // Execute handler
        SimpleHttpServer.LogHandler handler = new SimpleHttpServer.LogHandler();
        handler.handle(exchange);

        // Verify response
        String response = responseStream.toString(StandardCharsets.UTF_8);
        assertTrue(response.contains("Desteklenmeyen HTTP yöntemi: PUT"));

        // Verify headers
        verify(exchange).sendResponseHeaders(eq(405), anyLong());
    }
}
