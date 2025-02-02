package com.kurtulussahin.codekata.http.httpservertutorial.httpserver.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.kurtulussahin.codekata.http.httpservertutorial.httpserver.util.Json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConfigurationManager {

    private static ConfigurationManager myConfigurationManager;
    private static Configuration myCurrentConfiguration;
    private ConfigurationManager(){

    }

    public static  ConfigurationManager getInstance(){
        if(myConfigurationManager==null){
            myConfigurationManager=new ConfigurationManager();
        }
        return myConfigurationManager;
    }


    public void  loadConfigurationFile(String filePath) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw new HttpConfigurationException(e);
        }
        StringBuffer sBuffer = new StringBuffer();
        int i;

        try {
            while((i=fileReader.read())!=-1){
                sBuffer.append((char)i);
            }
        } catch (IOException e) {
            throw new HttpConfigurationException(e);
        }

        JsonNode conf = null;
        try {
            conf = Json.parse(sBuffer.toString());
        } catch (JsonProcessingException e) {
            throw new HttpConfigurationException("Error parsing the Configuration file",e);
        }
        try {
            myCurrentConfiguration=Json.fromJson(conf,Configuration.class);
        } catch (JsonProcessingException e) {
            throw new HttpConfigurationException("Error parsinf the Configuration File internal",e);
        }
    }

    public Configuration getCurrentConfigurtion(){
        if(myCurrentConfiguration==null){
            throw new HttpConfigurationException("No Current Configuration Set.");
        }
        return myCurrentConfiguration;
    }
}
