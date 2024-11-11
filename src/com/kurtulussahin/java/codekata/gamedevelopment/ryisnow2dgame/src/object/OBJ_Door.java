package com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame.src.object;

import javax.imageio.ImageIO;
import java.io.File;

public class OBJ_Door extends SuperObject{
    public OBJ_Door(){
        name="Door";
        try{
            image = ImageIO.read(new File(
                    "src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/objects/door.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
