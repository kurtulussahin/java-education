package com.kurtulussahin.java.codekata.emilybache.TheatricalPlayersRefactoringKata;

import java.util.List;
import java.util.Map;

public final class StatementData {
    private final Invoice invoice;
    private final Map<String, Play> plays;

    public StatementData(Invoice invoice, Map<String, Play> plays) {
        this.invoice = invoice;
        this.plays = plays;
    }

    int totalAmountFor() {
        return getPerformances()
                .stream()
                .mapToInt(perf -> getPerformanceData(perf).amountFor())
                .sum();
    }

    int totalVolumeCredits() {
        return getPerformances()
                .stream()
                .mapToInt(perf -> getPerformanceData(perf).volumeCredits())
                .sum();
    }

    private PerformanceData getPerformanceData(Performance perf) {
        return new PerformanceData(perf, playForPerformance(perf));
    }

    public Play playForPerformance(Performance perf) {
        return plays.get(perf.playID);
    }

    List<Performance> getPerformances() {
        return invoice.performances;
    }

    public Map<String, Play> getPlays() {
        return plays;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}