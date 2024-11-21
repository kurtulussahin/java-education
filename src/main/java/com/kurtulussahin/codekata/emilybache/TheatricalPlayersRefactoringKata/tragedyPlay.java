package com.kurtulussahin.codekata.emilybache.TheatricalPlayersRefactoringKata;

public class tragedyPlay implements Play {
    public String name;

    public tragedyPlay(String name) {
        this.name = name;
    }

    @Override
    public int amountFor(PerformanceData performanceData) {
        int thisAmount;
        thisAmount = 40000;
        if (performanceData.getPerf().audience > 30) {
            thisAmount += 1000 * (performanceData.getPerf().audience - 30);
        }
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
