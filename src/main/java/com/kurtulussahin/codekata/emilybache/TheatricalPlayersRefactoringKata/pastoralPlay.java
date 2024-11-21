package com.kurtulussahin.codekata.emilybache.TheatricalPlayersRefactoringKata;

public class pastoralPlay implements Play {
    public String name;

    protected pastoralPlay(String name) {

        this.name = name;
    }

    @Override
    public int amountFor(PerformanceData performanceData) {
        int thisAmount = 0;
        thisAmount += 300 * performanceData.getPerf().audience;
        return thisAmount;
    }

    @Override
    public int volumeCreditFor(PerformanceData performanceData) {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }
}
