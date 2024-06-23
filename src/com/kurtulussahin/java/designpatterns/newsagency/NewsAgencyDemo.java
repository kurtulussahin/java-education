package com.kurtulussahin.java.designpatterns.newsagency;

public class NewsAgencyDemo {
	public static void main(String[] args) {

		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();

		observable.addObserver(observer);
		observable.setNews("important news");

	}
}
