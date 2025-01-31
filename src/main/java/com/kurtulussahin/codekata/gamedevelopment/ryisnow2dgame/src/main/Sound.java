package com.kurtulussahin.codekata.gamedevelopment.ryisnow2dgame.src.main;

import javax.sound.sampled.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Sound {

    Clip clip;
    SourceDataLine sourceDataLine;
    URL soundURL[]=new URL[30];

    public Sound()  {
        try {
            soundURL[0]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/BlueBoyAdventure.wav").toURI().toURL();
            soundURL[1]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/coin.wav").toURI().toURL();
            soundURL[2]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/powerup.wav").toURI().toURL();
            soundURL[3]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/unlock.wav").toURI().toURL();
            soundURL[4]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/fanfare.wav").toURI().toURL();
        } catch (MalformedURLException e) {

        }
    }

    public void setFile(int i){

        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip=AudioSystem.getClip();
            clip.open(ais);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public synchronized void play() {
        clip.start();
        try {
            Thread.sleep( 1);
        } catch (InterruptedException e) {

        }
    }

    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(){
        clip.stop();
    }
}
