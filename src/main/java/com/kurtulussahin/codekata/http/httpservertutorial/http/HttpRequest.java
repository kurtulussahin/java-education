package com.kurtulussahin.codekata.http.httpservertutorial.http;

import java.util.HashMap;
import java.util.Set;

public class HttpRequest extends HttpMessage{

    private HttpMethod method;
    private String requestTarget;
    private String originalHttpVersion; //literal from the request
    private HttpVersion bestCompatibleHttpVersion;
    private HashMap<String,String> headers = new HashMap<>();

    public HttpRequest(){
    }

    public HttpMethod getMethod(){
        return method;
    }

    void setMethod(String methodName) throws HttpParsingException {

        for(HttpMethod method : HttpMethod.values()){
            if(methodName.equals(method.name())){
                this.method=method;
                return;
            }
        }
        throw  new HttpParsingException(HttpStatusCode.SERVER_ERROR_501_NOT_IMPLEMENTED);
    }

    public String getRequestTarget() {
        return requestTarget;
    }

    void setRequestTarget(String requestTarget) throws HttpParsingException {
        if(requestTarget==null || requestTarget.length()==0) {
            throw new HttpParsingException(HttpStatusCode.SERVER_ERROR_500_INTERNAL_SERVER_ERROR);
        }
        this.requestTarget=requestTarget;
    }

    public HttpVersion getBestCompatibleHttpVersion() {
        return bestCompatibleHttpVersion;
    }

    void setHttpVersion(String originalHttpVersion) throws BadHttpVersionException, HttpParsingException {
        this.originalHttpVersion=originalHttpVersion;
        this.bestCompatibleHttpVersion= HttpVersion.getBestCompatibleVersion(originalHttpVersion);

        if(this.bestCompatibleHttpVersion==null){
            throw new HttpParsingException(HttpStatusCode.SERVER_ERROR_505_HTTP_VERSION_NOT_SUPPORTED);
        }
    }

    public String getOriginalHttpVersion() {
        return originalHttpVersion;
    }

    public Set<String> getHeaderNames(){
        return headers.keySet();
    }

    public String getHeader(String headerName){
        return headers.get(headerName.toLowerCase());
    }

    void addHeader(String headerName, String headerField){
        headers.put(headerName.toLowerCase(), headerField);
    }
}
