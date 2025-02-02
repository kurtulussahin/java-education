package com.kurtulussahin.codekata.http.httpservertutorial.httpserver.core.io;

import java.io.File;

public class WebRootHandler {

    private File webRoot;

    public WebRootHandler(String webRootPath) throws WebRootNotFoundException {
        webRoot =new File(webRootPath);
        if(!webRoot.exists() || !webRoot.isDirectory()){
            throw  new WebRootNotFoundException("Webroot provided does not exist or is not a folder");
        }
    }

    private boolean CheckIfEndsWithSlash(String relativePath){
        return relativePath.endsWith("/");
    }
}
