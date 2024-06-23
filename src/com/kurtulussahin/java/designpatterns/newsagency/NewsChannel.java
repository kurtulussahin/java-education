package com.kurtulussahin.java.designpatterns.newsagency;

public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
        System.out.println("channel got:"+ news);
    }

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	} 

}
