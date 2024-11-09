package com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    final int originalTileSize = 16; //16*16 tile
    final int scale=3;

    final int tileSize = originalTileSize*scale; // 48*48 tile
    final int maxScreenCol=16;
    final int maxScreenRow=12;
    final int screenWith = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; //576 pixels

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;

    int playerX=100;
    int playerY=100;
    int playerSpeed=4;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWith, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start(); //starts run method
    }
    @Override
    public void run() {

        while(gameThread != null){
            update();
            repaint(); //paintComponent()
        }

    }

    public void update(){
        if(keyH.upPressed==true){
            playerY-=playerSpeed;
        }
        else if(keyH.downPressed==true){
            playerY+=playerSpeed;
        }
        else if(keyH.leftPressed==true){
            playerX+=playerSpeed;
        }
        else if(keyH.leftPressed==true){
            playerX-=playerSpeed;
        }
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.white);
        g2.fillRect(playerX,playerY,tileSize, tileSize);
        g2.dispose();

    }
}
