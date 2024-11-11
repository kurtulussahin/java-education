package com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame.src.main;

import com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame.src.entity.Player;
import com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame.src.object.SuperObject;
import com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame.src.tile.TileManager;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class GamePanel extends JPanel implements Runnable {
    final int originalTileSize = 16; //16*16 tile
    final int scale=3;

    public final int tileSize = originalTileSize*scale; // 48*48 tile
    public final int maxScreenCol=16;
    public final int maxScreenRow=12;
    public final int screenWith = tileSize * maxScreenCol; //768 pixels
    public final int screenHeight = tileSize * maxScreenRow; //576 pixels

    public final int maxWorldCol=50;
    public final int maxWorldRow=50;

    int FPS=60;

    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();

    Sound sound;
    {
        try {
            sound = new Sound();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    Thread gameThread;
    public CollisionChecker cChecker = new CollisionChecker(this);
    public AssetSetter aSetter = new AssetSetter(this);

    public Player player = new Player(this, keyH);
    public SuperObject obj[] = new SuperObject[10];

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWith, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void setupGame(){
        aSetter.setObject();
        playMusic(0);
    }
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start(); //starts run method
    }
    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta=0;
        long lastTime=System.nanoTime();
        long currentTime;
        long timer=0;
        int drawCount=0;

        while(gameThread != null){
            currentTime = System.nanoTime();
            delta+=(currentTime-lastTime)/drawInterval;
            timer+=(currentTime-lastTime);
            lastTime=currentTime;

            if(delta>=1){
                update();
                repaint(); //paintComponent()
                delta--;
                drawCount++;
            }

            if(timer>=1000000000){
                System.out.println("FPS:" + drawCount);
                drawCount=0;
                timer=0;
            }
        }
    }

    public void update(){
        player.update();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        tileM.draw(g2);
        for(int i=0; i<obj.length; i++){
            if(obj[i]!=null){
                obj[i].draw(g2,this);
            }

        }

        player.draw(g2);

        g2.dispose();
    }

    public void playMusic(int i){
        sound.setFile(i);
        sound.play();
        sound.loop();
    }

    public void stopMusic(){
        sound.stop();
    }

    public void playSE(int i){
        sound.setFile(i);
        sound.play();

    }
}
