package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

import java.util.Random;

public class FakeInput implements Input {

    private int value;

    @Override
    public int value(){

        int chance = new Random().nextInt(5);
        int change= new Random().nextInt(100);
        if(chance==1)
        {
            value = value +change;
        }else if (chance==2)
        {
            if(value - change>=0) {
                value = value - change;
            }
        }
        return value;
    }
}
