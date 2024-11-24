package com.kurtulussahin.codekata.httpsservertutorial;

import com.kurtulussahin.codekata.httpsservertutorial.config.Configuration;
import com.kurtulussahin.codekata.httpsservertutorial.config.ConfigurationManager;
import com.kurtulussahin.codekata.httpsservertutorial.core.ServerListenerThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpServer.class);

    public static void main(String[] args){

        LOGGER.info("Server starting ...");

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf= ConfigurationManager.getInstance().getCurrentConfigurtion();

        LOGGER.info("Using Port: "+conf.getPort());
        LOGGER.info("Using WebRoot: "+conf.getWebroot());

        try {
            ServerListenerThread serverListenerThread = new ServerListenerThread(conf.getPort(),conf.getWebroot());
            serverListenerThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
