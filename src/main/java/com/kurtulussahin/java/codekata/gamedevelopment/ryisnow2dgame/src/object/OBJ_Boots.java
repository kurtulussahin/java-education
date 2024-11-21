package com.kurtulussahin.java.codekata.gamedevelopment.ryisnow2dgame.src.object;

import javax.imageio.ImageIO;
import java.io.File;

public class OBJ_Boots extends SuperObject{

    public OBJ_Boots(){
        name="Boots";
        try{
            image = ImageIO.read(new File(
                    "src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/objects/boots.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
