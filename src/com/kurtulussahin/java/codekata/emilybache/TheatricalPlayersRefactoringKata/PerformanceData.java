package com.kurtulussahin.java.codekata.emilybache.TheatricalPlayersRefactoringKata;

public final class PerformanceData {
    private final Performance perf;
    private final Play play;

    public PerformanceData(Performance perf, Play play) {
        this.perf = perf;
        this.play = play;
    }

    int volumeCredits() {
        var result=0;
        result += Math.max(getPerf().audience - 30, 0);
        result += play.volumeCreditFor(this);
        return result;
    }

    int amountFor() {
        return play.amountFor(this);
    }

    public Performance getPerf() {
        return perf;
    }

    public Play getPlay() {
        return play;
    }
}