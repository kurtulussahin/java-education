package com.kurtulussahin.codekata.emilybache.TheatricalPlayersRefactoringKata;

public class comedyPlay implements Play {
    public String name;

    protected comedyPlay(String name) {

        this.name = name;
    }

    @Override
    public int amountFor(PerformanceData performanceData) {
        int thisAmount;
        thisAmount = 30000;
        if (performanceData.getPerf().audience > 20) {
            thisAmount += 10000 + 500 * (performanceData.getPerf().audience - 20);
        }
        thisAmount += 300 * performanceData.getPerf().audience;
        return thisAmount;
    }

    @Override
    public int volumeCreditFor(PerformanceData performanceData) {
        int result = 0;
        result += Math.floor(performanceData.getPerf().audience / 5);
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
