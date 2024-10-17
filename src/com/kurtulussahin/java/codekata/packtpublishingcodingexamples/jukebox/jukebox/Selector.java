package com.kurtulussahin.java.problems.packtpublishingcodingexamples.jukebox.jukebox;
 
public interface Selector {
    
    public void nextSongBtn();
    public void prevSongBtn();
    public void addSongToPlaylistBtn(Song song);
    public void removeSongFromPlaylistBtn(Song song);
    public void shuffleBtn();
}
