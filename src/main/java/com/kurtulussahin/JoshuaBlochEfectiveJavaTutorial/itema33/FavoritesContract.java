package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema33;

// API 
public interface FavoritesContract {
	
	public <T> void putFavorite(Class<T> type, T instance);
    public <T> T getFavorite(Class<T> type);

}
