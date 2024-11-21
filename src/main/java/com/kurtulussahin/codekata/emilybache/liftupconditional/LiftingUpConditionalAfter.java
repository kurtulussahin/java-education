package com.kurtulussahin.codekata.emilybache.liftupconditional;

public class LiftingUpConditionalAfter {

    public static String liftUpConditional(boolean a, boolean b) {
        if (b) {
            if (a) {
                return "ATrueBTrue";
            } else {
                return "AFalseBTrue";
            }
        } else {
            if (a) {
                return "ATrueBFalse";
            } else {
                return "AFalseBFalse";
            }
        }
    }

}

