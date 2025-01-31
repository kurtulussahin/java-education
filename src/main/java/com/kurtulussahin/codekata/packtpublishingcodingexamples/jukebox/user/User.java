package com.kurtulussahin.codekata.packtpublishingcodingexamples.jukebox.user;
 
import com.kurtulussahin.codekata.packtpublishingcodingexamples.jukebox.jukebox.Jukebox;

public class User {
    private final Jukebox jukebox;

    public User(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    public Jukebox getJukebox() {
        return jukebox;
    }        
}
