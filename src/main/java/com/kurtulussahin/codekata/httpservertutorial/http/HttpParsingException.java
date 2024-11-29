package com.kurtulussahin.codekata.httpservertutorial.http;

public class HttpParsingException extends Exception {

    private final HttpStatusCode errorCode;

    public HttpParsingException(HttpStatusCode errorCode) {
        super(errorCode.MESSAGE);
        this.errorCode = errorCode;
    }

    public HttpStatusCode getErrorCode(){
        return errorCode;
    }
}


