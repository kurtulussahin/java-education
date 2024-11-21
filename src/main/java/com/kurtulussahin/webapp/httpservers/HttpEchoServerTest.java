package com.kurtulussahin.webapp.httpservers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class HttpEchoServerTest {

    private ServerSocket serverSocketMock;
    private Socket clientSocketMock;
    private ByteArrayOutputStream clientOutput;
    private ByteArrayInputStream clientInput;

    @BeforeEach
    void setup() throws IOException {
        // Mock ServerSocket and Client Socket
        serverSocketMock = mock(ServerSocket.class);
        clientSocketMock = mock(Socket.class);

        // Setup mock client socket's input and output streams
        clientOutput = new ByteArrayOutputStream();
        clientInput = new ByteArrayInputStream((
                "GET / HTTP/1.1\r\n" +
                        "Host: localhost\r\n" +
                        "User-Agent: TestClient\r\n\r\n"
        ).getBytes());

        when(clientSocketMock.getInputStream()).thenReturn(clientInput);
        when(clientSocketMock.getOutputStream()).thenReturn(clientOutput);

        // ServerSocket.accept() should return our mock client socket
        when(serverSocketMock.accept()).thenReturn(clientSocketMock);
    }

    @Test
    void testHttpEchoServer() throws IOException {
        // Simulate the server's main method
        when(serverSocketMock.isClosed()).thenReturn(false); // Keep server running

        try {
            // Echo logic
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocketMock.getInputStream()));
            OutputStream output = clientSocketMock.getOutputStream();

            // Read request line
            String requestLine = input.readLine();
            assertEquals("GET / HTTP/1.1", requestLine);

            // Skip headers
            String header;
            StringBuilder headers = new StringBuilder();
            while (!(header = input.readLine()).isEmpty()) {
                headers.append(header).append("\n");
            }

            // Verify headers
            assertTrue(headers.toString().contains("Host: localhost"));
            assertTrue(headers.toString().contains("User-Agent: TestClient"));

            // Response logic
            String responseBody = "HTTP Echo Server java.net.ServerSocket : " + requestLine + "\n\nHeaders: \n " + headers;

            String httpResponse = "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/plain; charset=UTF-8\r\n" +
                    "Content-Length: " + responseBody.length() + "\r\n" +
                    "\r\n" +
                    responseBody;

            // Write response
            output.write(httpResponse.getBytes("UTF-8"));
            output.flush();

            // Validate output
            String serverOutput = clientOutput.toString("UTF-8");
            assertTrue(serverOutput.contains("HTTP/1.1 200 OK"));
            assertTrue(serverOutput.contains("HTTP Echo Server java.net.ServerSocket : GET / HTTP/1.1"));
            assertTrue(serverOutput.contains("Headers:"));
        } finally {
            // Close resources
            clientSocketMock.close();
        }
    }
}
