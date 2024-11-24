package com.kurtulussahin.codekata.httpsservertutorial.http;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HttpParserTest {

    private HttpParser httpParser;

    @BeforeAll
    public void beforeClass(){
        httpParser=new HttpParser();
    }

    @Test
    void parseHttpRequest() {
        httpParser.parseHttpRequest(generateVAlidTestCase());
    }

    private InputStream generateVAlidTestCase(){
        String rawData = "GET / HTTP/1.1\n" +
                "Host: localhost:8080\n" +
                "User-Agent: Mozilla/5.0 (X11; Linux x86_64; rv:128.0) Gecko/20100101 Firefox/128.0\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/png,image/svg+xml,*/*;q=0.8\n" +
                "Accept-Language: en-US,en;q=0.5\n" +
                "Accept-Encoding: gzip, deflate, br, zstd\n" +
                "Connection: keep-alive\n" +
                "Upgrade-Insecure-Requests: 1\n" +
                "Sec-Fetch-Dest: document\n" +
                "Sec-Fetch-Mode: navigate\n" +
                "Sec-Fetch-Site: none\n" +
                "Sec-Fetch-User: ?1\n" +
                "Priority: u=0, i";

        InputStream inputStream = new ByteArrayInputStream( rawData.getBytes(StandardCharsets.US_ASCII));
        return inputStream;
    }
}