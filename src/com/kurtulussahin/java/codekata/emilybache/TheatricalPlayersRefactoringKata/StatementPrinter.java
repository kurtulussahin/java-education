package com.kurtulussahin.java.codekata.emilybache.TheatricalPlayersRefactoringKata;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class StatementPrinter {

    public String print(Invoice invoice, Map<String, Play> plays) {
        StatementData statementData = new StatementData(invoice, plays);
        return renderPlainText(statementData);
    }

    private static String renderPlainText(StatementData statementData) {
        var result = String.format("Statement for %s\n", statementData.getInvoice().customer);

        for (var perf : statementData.getPerformances()) {
            // print line for this order
            result += String.format("  %s: %s (%s seats)\n", statementData.playForPerformance(perf).getName(),
                    formatAsUsd(new PerformanceData(perf, statementData.playForPerformance(perf)).amountFor()),
                    perf.audience);
        }

        result += String.format("Amount owed is %s\n",formatAsUsd(statementData.totalAmountFor()));
        result += String.format("You earned %s credits\n", statementData.totalVolumeCredits());
        return result;
    }
    private static String renderHtlm(StatementData statementData) {
        //TODO implement this.
        return "";
    }
    private static String formatAsUsd(int amount) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(amount / 100);
    }

}
