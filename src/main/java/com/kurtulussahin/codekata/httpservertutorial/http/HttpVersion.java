package com.kurtulussahin.codekata.httpservertutorial.http;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum HttpVersion {

    HTTP_1_1("HTTP/1.1",1,1);

    public final String LITERAL;
    public final int MAJOR;
    public final int MINOR;

    HttpVersion(String LITERAL, int MAJOR, int MINOR) {
        this.LITERAL = LITERAL;
        this.MAJOR = MAJOR;
        this.MINOR = MINOR;
    }

    private static final Pattern httpVersionRegexPattern = Pattern.compile("^HTTP/(?<major>\\d+).(?<minor>\\d+)");

    public static HttpVersion getBestCompatibleVersion(String literalversion) throws BadHttpVersionException {
        Matcher matcher = httpVersionRegexPattern.matcher(literalversion);
        if(!matcher.find() || matcher.groupCount() !=2){
            throw  new BadHttpVersionException();
        }
        int major = Integer.parseInt(matcher.group("major"));
        int minor = Integer.parseInt(matcher.group("minor"));

        HttpVersion tempBestCompatible = null;

        for(HttpVersion version : HttpVersion.values()){
            if(version.LITERAL.equals(literalversion)){
                return version;
            }else {
                if(version.MAJOR==major){
                    if(version.MINOR<minor){
                        tempBestCompatible = version;
                    }
                }
            }
        }
        return tempBestCompatible;
    }
}
