package com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame.src.object;

import javax.imageio.ImageIO;
import java.io.File;

public class OBJ_Chest extends SuperObject {
    public OBJ_Chest(){
        name="Chest";
        try{
            image = ImageIO.read(new File(
                    "src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/objects/chest.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
