package com.kurtulussahin.codekata.gamedevelopment.ryisnow2dgame.src.main;

import com.kurtulussahin.codekata.gamedevelopment.ryisnow2dgame.src.object.OBJ_Key;

import java.awt.*;
import java.awt.image.BufferedImage;

public class UI {
    GamePanel gp;
    Font arial_40, arial_80B;
    BufferedImage keyImage;
    public boolean messageOn=false;
    public String message="";
    int messageCounter=0;
    public boolean gameFinished=false;

    public UI(GamePanel gp){
        this.gp=gp;
        arial_40=new Font("Arial", Font.PLAIN, 40);
        arial_80B=new Font("Arial", Font.BOLD, 80);
        OBJ_Key key=new OBJ_Key();
        keyImage = key.image;
    }

    public void showMessage(String text){
        message=text;
        messageOn=true;
    }

    public void draw(Graphics2D g2){


        if(gameFinished==true){

            g2.setFont(arial_40);
            g2.setColor(Color.white);

            String text;
            int textLength;
            int x;
            int y;

            text="You found the treasure!";
            textLength=(int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();

            x=gp.screenWith/2-textLength/2;
            y=gp.screenHeight/2- (gp.tileSize*3);

            g2.drawString(text,x,y);

            g2.setFont(arial_80B);
            g2.setColor(Color.yellow);
            text="Congratulations!";
            textLength=(int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x=gp.screenWith/2-textLength/2;
            y=gp.screenHeight/2+ (gp.tileSize*2);
            g2.drawString(text,x,y);
            gp.gameThread=null;

        }else{
            g2.setFont(arial_40);
            g2.setColor(Color.white);
            g2.drawImage(keyImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
            g2.drawString("x "+gp.player.hasKey,74,65);

            if(messageOn==true){
                g2.setFont(g2.getFont().deriveFont(30F));
                g2.drawString(message, gp.tileSize/2, gp.tileSize*5);

                messageCounter++;
                if(messageCounter>120){
                    messageOn=false;
                    messageCounter=0;
                }
            }
        }


    }
}
