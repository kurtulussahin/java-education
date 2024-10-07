package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema15;

import java.util.*;

public abstract class GuvenliKod {

    public static final String[] ANLASMALI_SITELER = new String[]{"http://hızlıguvenlitemizhaber.com",
            "http://engercekciharikahaberler.com"};


	public static final List<String> ANLASMALI_SITELER_UNMODIFIABLE = Collections.unmodifiableList(Arrays.asList(ANLASMALI_SITELER));


    // this method allows untrusted code to connect to allowed sites (only)
    public static void haberleriAl(String url) {
        for (String haberler : ANLASMALI_SITELER) {
            if (url.equals(haberler)) {
                // Yap bişeyler
            }
        }
    }

    static void finalArrayBreaker() throws UnsupportedOperationException{
		//cant do this. final.
        //ANLASMALI_SITELER = new String[]{"xxx", "yyyy"};

		//FinalBreaker
		ANLASMALI_SITELER[0]="xxx";

		//throws UnsupportedOperationException at runtime
		ANLASMALI_SITELER_UNMODIFIABLE.remove("a");
    }

}
