package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema87;

import java.io.Serializable;

public class Bad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private int size = 0 ;
     private Entry head = null ;

     private static class Entry implements Serializable {
         String data ;
         Entry next ;
         Entry previous ;
     }
	
	
}
