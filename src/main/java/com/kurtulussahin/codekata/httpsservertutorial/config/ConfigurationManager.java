package com.kurtulussahin.codekata.httpsservertutorial.config;

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


    public void  loadConfigurationFile(String filePath){
        //TODO
    }

    public void getCurrentConfigurtion(){
        //TODO
    }
}
