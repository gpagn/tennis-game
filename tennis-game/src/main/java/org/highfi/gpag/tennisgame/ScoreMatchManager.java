package org.highfi.gpag.tennisgame;


import java.util.ArrayList;

public class ScoreMatchManager {

    private TennisSet tennisSet;
    private ScoreGameManager scoreGameManager = new ScoreGameManager();
    private ScoreSetManager scoreSetManager = new ScoreSetManager();

    public void start() {
        tennisSet = TennisSet.builder()
                .score(Score.builder().scorePlayer1(0).scorePlayer2(0).build())
                .status(TennisSetStatus.PLAY)
                .tieBreakActived(false)
                .tennisGameList(new ArrayList<>())
                .build();
    }

    private void display(String s) {
        System.out.println(s);
    }

    public void addWinPointToPlayer1() {
        scoreGameManager.addGamePointOnPlayer1(tennisSet.getCurrentGame());
        display(scoreSetManager.displaySetScore(tennisSet));
        if (TennisGameStatus.PLAYER_1_WINS.equals(tennisSet.getCurrentGame().getStatus())) {
            scoreSetManager.addSetPointOnPlayer1(tennisSet);
            if (!TennisSetStatus.PLAYER_1_WINS_MATCH.equals(tennisSet.getStatus())) {
                tennisSet.startNewGame();
            }

            display(scoreSetManager.displaySetScore(tennisSet));
        }

    }

    public void addWinPointToPlayer2() {
        scoreGameManager.addGamePointOnPlayer2(tennisSet.getCurrentGame());
        display(scoreSetManager.displaySetScore(tennisSet));
        if (TennisGameStatus.PLAYER_2_WINS.equals(tennisSet.getCurrentGame().getStatus())) {
            scoreSetManager.addSetPointOnPlayer2(tennisSet);
            if (!TennisSetStatus.PLAYER_2_WINS_MATCH.equals(tennisSet.getStatus())) {
                tennisSet.startNewGame();
            }

            display(scoreSetManager.displaySetScore(tennisSet));
        }
    }

    public static void main(String[] args) {
        ScoreMatchManager scoreMatchManager = new ScoreMatchManager();
        scoreMatchManager.start();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();

        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();

        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();
        scoreMatchManager.addWinPointToPlayer1();

        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
        scoreMatchManager.addWinPointToPlayer2();
    }
}
