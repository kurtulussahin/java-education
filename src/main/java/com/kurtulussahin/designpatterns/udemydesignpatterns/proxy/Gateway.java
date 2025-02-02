package com.kurtulussahin.designpatterns.udemydesignpatterns.proxy;

public class Gateway implements Network {
	private static Gateway gateway = new Gateway();

	public void ftp(String ip, String targetIp) {
		System.out.println(ip + " makes an ftp to " + targetIp + "\n");
	}

	public void telnet(String ip, String targetIp) {
		System.out.println(ip + " makes a telnet to " + targetIp + "\n");
	}
	
	public static Gateway getInstance(){
		return gateway;
	}
}
