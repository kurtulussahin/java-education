package com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame.src.main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Sound {

    Clip clip;
    URL soundURL[]=new URL[30];

    public Sound() throws MalformedURLException {
        soundURL[0]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/BlueBoyAdventure.wav").toURI().toURL();
        soundURL[1]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/coin.wav").toURI().toURL();;
        soundURL[2]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/powerup.wav").toURI().toURL();;
        soundURL[3]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/unlock.wav").toURI().toURL();;
        soundURL[4]=new File("src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/sound/fanfare.wav").toURI().toURL();;
    }

    public void setFile(int i){

        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip=AudioSystem.getClip();
            clip.open(ais);
        }catch(Exception e){
        }

    }

    public void play(){
        clip.stop();
    }

    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(){
        clip.stop();
    }
}
