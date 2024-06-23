package com.kurtulussahin.java.designpatterns.proxy;

public class NetworkServer {
	
	private static NetworkServer ns = new NetworkServer();
	private Network network;
	
	private NetworkServer(){
		network = new ProxyServer();
	}
	
	public Network getNetwork(){
		return network;
	}
	
	public static NetworkServer getInstance(){
		return ns;
	}
}
