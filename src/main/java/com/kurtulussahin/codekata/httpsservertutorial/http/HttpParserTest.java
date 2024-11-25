package com.kurtulussahin.codekata.httpsservertutorial.http;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HttpParserTest {

    private HttpParser httpParser;

    @BeforeAll
    public void beforeClass(){
        httpParser=new HttpParser();
    }

    @Test
    void parseHttpRequest() {
        HttpRequest request = null;
        try {
            request = httpParser.parseHttpRequest(generateValidTestCase());
        } catch (HttpParsingException e) {
            fail(e);
        }

        assertEquals(HttpMethod.GET,request.getMethod());
    }

    @Test
    void parseHttpRequestBadMethod1() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(generateBadTestCaseMethodName1());
            fail();
        } catch (HttpParsingException e) {
            assertEquals(HttpStatusCode.SERVER_ERROR_501_NOT_IMPLEMENTED, e.getErrorCode());
        }
    }

    @Test
    void parseHttpRequestBadMethod2() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(generateBadTestCaseMethodName2());
            fail();
        } catch (HttpParsingException e) {
            assertEquals(HttpStatusCode.SERVER_ERROR_501_NOT_IMPLEMENTED, e.getErrorCode());
        }
    }

    @Test
    void parseHttpRequestLineInvalidNumberOfItems() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(generateBadTestCaseRequestLineInvalidNumberOfItems());
            fail();
        } catch (HttpParsingException e) {
            assertEquals(HttpStatusCode.CLIENT_ERROR_400_BAD_REQUEST, e.getErrorCode());
        }
    }

    @Test
    void parseHttpRequestLineEmptyRequestLine() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(generateBadTestCaseEmptyRequestLine());
            fail();
        } catch (HttpParsingException e) {
            assertEquals(HttpStatusCode.CLIENT_ERROR_400_BAD_REQUEST, e.getErrorCode());
        }
    }

    @Test
    void parseHttpRequestLineCRnoLF() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(generateBadTestCaseRequestLineOnlyCRnoLF());
            fail();
        } catch (HttpParsingException e) {
            assertEquals(HttpStatusCode.CLIENT_ERROR_400_BAD_REQUEST, e.getErrorCode());
        }
    }



    private InputStream generateValidTestCase(){
        String rawData = "GET / HTTP/1.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Connection: keep-alive\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n" +
                "User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36\r\n" +
                "Sec-Fetch-User: ?1\r\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3\r\n" +
                "Sec-Fetch-Site: none\r\n" +
                "Sec-Fetch-Mode: navigate\r\n" +
                "Accept-Encoding: gzip, deflate, br\r\n" +
                "Accept-Language: en-US,en;q=0.9,es;q=0.8,pt;q=0.7,de-DE;q=0.6,de;q=0.5,la;q=0.4\r\n" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream( rawData.getBytes(StandardCharsets.US_ASCII));
        return inputStream;
    }

    private InputStream generateBadTestCaseMethodName1(){
        String rawData = "GeT / HTTP/1.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Accept-Language: en-US,en;q=0.9,es;q=0.8,pt;q=0.7,de-DE;q=0.6,de;q=0.5,la;q=0.4\r\n" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream( rawData.getBytes(StandardCharsets.US_ASCII));
        return inputStream;
    }

    private InputStream generateBadTestCaseMethodName2(){
        String rawData = "GETTTTTTTTT / HTTP/1.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Accept-Language: en-US,en;q=0.9,es;q=0.8,pt;q=0.7,de-DE;q=0.6,de;q=0.5,la;q=0.4\r\n" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream( rawData.getBytes(StandardCharsets.US_ASCII));
        return inputStream;
    }

    private InputStream generateBadTestCaseRequestLineInvalidNumberOfItems(){
        String rawData = "GET / EXTRA_ITEM HTTP/1.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Accept-Language: en-US,en;q=0.9,es;q=0.8,pt;q=0.7,de-DE;q=0.6,de;q=0.5,la;q=0.4\r\n" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream( rawData.getBytes(StandardCharsets.US_ASCII));
        return inputStream;
    }

    private InputStream generateBadTestCaseEmptyRequestLine(){
        String rawData = "\r\n" +
                "Host: localhost:8080\r\n" +
                "Accept-Language: en-US,en;q=0.9,es;q=0.8,pt;q=0.7,de-DE;q=0.6,de;q=0.5,la;q=0.4\r\n" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream( rawData.getBytes(StandardCharsets.US_ASCII));
        return inputStream;
    }

    private InputStream generateBadTestCaseRequestLineOnlyCRnoLF(){
        String rawData = "GET / HTTP/1.1\r" + //CR no LF
                "Host: localhost:8080\r\n" +
                "Accept-Language: en-US,en;q=0.9,es;q=0.8,pt;q=0.7,de-DE;q=0.6,de;q=0.5,la;q=0.4\r\n" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream( rawData.getBytes(StandardCharsets.US_ASCII));
        return inputStream;
    }
}