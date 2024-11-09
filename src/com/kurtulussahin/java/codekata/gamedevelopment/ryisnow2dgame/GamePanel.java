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

    Thread gameThread;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWith, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start(); //starts run method
    }
    @Override
    public void run() {

        while(gameThread != null){
            System.out.println("The game loop is running");

            update();
            repaint(); //paintComponent()
        }

    }

    public void update(){

    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);

    }
}
