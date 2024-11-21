package com.kurtulussahin.codekata.emilybache.tennisrefactoringkata;

public class TennisGame1 implements TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (isATie())
        {
            score = getTieScore();
        }
        else if (isEndGame())
        {
            score = getEndGameScore();
        }
        else
        {
            score= getRegularScore();
        }
        return score;
    }

    private String getRegularScore() {
        int playerScore;
        String score = "";
        for (int i=1; i<3; i++)
        {
            if (i==1) playerScore = m_score1;
            else {
                score+="-";
                playerScore = m_score2;
            }

            String scoreName = "";
            switch(playerScore)
            {
                case 0:
                    scoreName+="Love";
                    break;
                case 1:
                    scoreName+="Fifteen";
                    break;
                case 2:
                    scoreName+="Thirty";
                    break;
                case 3:
                    scoreName+="Forty";
                    break;
            }
            score+=scoreName;
        }
        return score;
    }

    private String getEndGameScore() {
        String score;
        int minusResult = m_score1-m_score2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private boolean isEndGame() {
        return m_score1 >= 4 || m_score2 >= 4;
    }

    private String getTieScore() {
        String score;
        int playerScore = m_score1;
        switch (playerScore)
        {
            case 0:
                    score = "Love-All";
                break;
            case 1:
                    score = "Fifteen-All";
                break;
            case 2:
                    score = "Thirty-All";
                break;
            default:
                    score = "Deuce";
                break;

        }
        return score;
    }

    private boolean isATie() {
        return m_score1 == m_score2;
    }
}
