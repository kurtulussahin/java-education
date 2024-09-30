package com.kurtulussahin.java.codekata.emilybache.liftupconditional;

public class LiftingUpConditionalAfter {

    public static String liftUpConditional(boolean a, boolean b) {
        if (a) {
            if (b) {
                return "ATrueBTrue";
            } else {
                return "ATrueBFalse";
            }
        } else {
            if (b) {
                return "AFalseBTrue";
            } else {
                return "AFalseBFalse";
            }
        }
    }

}

