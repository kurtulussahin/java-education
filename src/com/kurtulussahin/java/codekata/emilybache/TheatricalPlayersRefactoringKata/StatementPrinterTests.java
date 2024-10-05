package com.kurtulussahin.java.codekata.emilybache.TheatricalPlayersRefactoringKata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.approvaltests.Approvals.verify;

public class StatementPrinterTests {

    @Test
    void exampleStatement() {
        Map<String, Play> plays = Map.of(
                "hamlet", PlayTypeEnum.createPlay("Hamlet", PlayTypeEnum.TRAGEDY),
                "as-like", PlayTypeEnum.createPlay("As You Like It", PlayTypeEnum.COMEDY),
                "othello", PlayTypeEnum.createPlay("Othello", PlayTypeEnum.TRAGEDY));

        Invoice invoice = new Invoice("BigCo", List.of(
                new Performance("hamlet", 55),
                new Performance("as-like", 35),
                new Performance("othello", 40)));

        StatementPrinter statementPrinter = new StatementPrinter();
        var result = statementPrinter.print(invoice, plays);

        verify(result);
    }

    @Test
    void statementWithNewPlayTypes() {
        Map<String, Play> plays = Map.of(
                "henry-v", PlayTypeEnum.createPlay("Henry V", PlayTypeEnum.HISTORY),
                "as-like", PlayTypeEnum.createPlay("As You Like It", PlayTypeEnum.PASTORAL));

        Invoice invoice = new Invoice("BigCo", List.of(
                new Performance("henry-v", 53),
                new Performance("as-like", 55)));

        StatementPrinter statementPrinter = new StatementPrinter();
        Assertions.assertDoesNotThrow(() -> {
            statementPrinter.print(invoice, plays);
        });
    }
}
