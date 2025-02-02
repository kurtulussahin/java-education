package com.kurtulussahin.designpatterns.udemydesignpatterns.proxy;

public interface Network {
	public void telnet(String ip, String targetIp) throws YasakKardesimException;
	public void ftp(String ip, String targetIp) throws YasakKardesimException;
}
