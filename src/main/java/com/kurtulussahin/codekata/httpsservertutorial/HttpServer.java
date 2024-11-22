package com.kurtulussahin.codekata.httpsservertutorial;

import com.kurtulussahin.codekata.httpsservertutorial.config.Configuration;
import com.kurtulussahin.codekata.httpsservertutorial.config.ConfigurationManager;

public class HttpServer {

    public static void main(String[] args){

        System.out.println("Server starting ...");

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf= ConfigurationManager.getInstance().getCurrentConfigurtion();
        System.out.println("Using Port: "+conf.getPort());
        System.out.println("Using WebRoot: "+conf.getWebroot());
    }
}
