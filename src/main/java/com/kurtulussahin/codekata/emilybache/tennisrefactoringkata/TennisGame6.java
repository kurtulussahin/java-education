package com.kurtulussahin.codekata.emilybache.tennisrefactoringkata;

public class TennisGame6 implements TennisGame {
    private final String player1Name;
    private final String player2Name;
    private int player1Score;
    private int player2Score;

    public TennisGame6(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            player1Score++;
        else
            player2Score++;

    }

    public String getScore()
    {
        String result;

        if (isATie())
        {
            result = getTieScore();
        }
        else if (isAnEndGame())
        {
            result = getEndGameScore();
        }
        else
        {
            result = getRegularScore();
        }

        return result;
    }

    private String getRegularScore() {
        return getPlayerScore(player1Score) + "-" + getPlayerScore(player2Score);
    }

    private String getPlayerScore(int playerScore) {
        return switch (playerScore)
        {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            default -> "Forty";
        };
    }

    private boolean isAnEndGame() {
        return player1Score >= 4 || player2Score >= 4;
    }

    private String getEndGameScore() {
        String endGameScore;

        if (player1Score - player2Score == 1) {
            endGameScore = "Advantage " + player1Name;
        } else if (player1Score - player2Score == -1) {
            endGameScore = "Advantage " + player2Name;
        } else if (player1Score - player2Score >= 2) {
            endGameScore = "Win for " + player1Name;
        } else {
            endGameScore = "Win for " + player2Name;
        }
        return endGameScore;
    }

    private boolean isATie() {
        return player1Score == player2Score;
    }

    private String getTieScore() {
        String tieScore;
        switch (player1Score)
        {
            case 0:
                tieScore = "Love-All";
                break;
            case 1:
                tieScore = "Fifteen-All";
                break;
            case 2:
                tieScore = "Thirty-All";
                break;
            default:
                tieScore = "Deuce";
                break;
        }
        return tieScore;
    }
}
