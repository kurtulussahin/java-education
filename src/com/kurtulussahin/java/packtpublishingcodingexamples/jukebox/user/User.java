package com.kurtulussahin.java.packtpublishingcodingexamples.jukebox.user;
 
import com.kurtulussahin.java.packtpublishingcodingexamples.jukebox.jukebox.Jukebox;

public class User {
    private final Jukebox jukebox;

    public User(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    public Jukebox getJukebox() {
        return jukebox;
    }        
}
