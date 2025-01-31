package com.kurtulussahin.codekata.gamedevelopment.ryisnow2dgame.src.object;

import javax.imageio.ImageIO;
import java.io.File;

public class OBJ_Key extends SuperObject{

    public OBJ_Key(){
        name="Key";
        try{
            image = ImageIO.read(new File(
                    "src/com/kurtulussahin/java/codekata/gamedevelopment/ryisnow2dgame/res/objects/key.png"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
