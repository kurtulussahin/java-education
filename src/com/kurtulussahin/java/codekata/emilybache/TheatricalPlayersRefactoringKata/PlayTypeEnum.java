package com.kurtulussahin.java.codekata.emilybache.TheatricalPlayersRefactoringKata;

public enum PlayTypeEnum {
    HISTORY,
    COMEDY,
    PASTORAL,
    TRAGEDY,
    ;

    public static Play createPlay(String name, PlayTypeEnum type) {
        Play play;
        switch (type){
            case TRAGEDY -> {
                play = new tragedyPlay(name);
            }
            case COMEDY -> {
                play = new comedyPlay(name);
            }
            case HISTORY -> {
                play = new historyPlay(name);
            }
            case PASTORAL -> {
                play = new pastoralPlay(name);
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        return play;
    }
}
