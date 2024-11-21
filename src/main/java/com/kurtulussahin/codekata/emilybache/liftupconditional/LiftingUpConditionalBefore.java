package com.kurtulussahin.codekata.emilybache.liftupconditional;

public class LiftingUpConditionalBefore {

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

