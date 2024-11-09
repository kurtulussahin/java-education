package com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    final int originalTileSize = 16; //16*16 tile
    final int scale=3;

    final int tileSize = originalTileSize*scale; // 48*48 tile
    final int maxScreenCol=16;
    final int maxScreenRow=12;
    final int screenWith = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; //576 pixels

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWith, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
}
