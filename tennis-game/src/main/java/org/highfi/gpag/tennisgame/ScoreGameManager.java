package org.highfi.gpag.tennisgame;


public class ScoreGameManager {

    private String convertScore(int playerScore) {
        String displayedScore = "";
        switch (playerScore) {
            case 0:
                displayedScore = "0";
                break;
            case 1:
                displayedScore = "15";
                break;
            case 2:
                displayedScore = "30";
                break;
            case 3:
                displayedScore = "40";
                break;
        }
        return displayedScore;
    }


    public void addGamePointOnPlayer1(TennisGame tennisGame) {
        switch (tennisGame.getStatus()) {
            case PLAY:
            case DEUCE:
            case ADVANTAGE_PLAYER_1:
                tennisGame.getScore().addScorePlayer1();;
                break;
            case ADVANTAGE_PLAYER_2:
                tennisGame.getScore().minusScorePlayer2();
                break;
        }
        checkStatus(tennisGame);
    }

    public void addGamePointOnPlayer2(TennisGame tennisGame) {
        switch (tennisGame.getStatus()) {
            case PLAY:
            case DEUCE:
            case ADVANTAGE_PLAYER_2:
                tennisGame.getScore().addScorePlayer2();
                break;
            case ADVANTAGE_PLAYER_1:
                tennisGame.getScore().minusScorePlayer1();
                break;
        }
        checkStatus(tennisGame);
    }

    public void checkStatus(TennisGame tennisGame) {
        if (tennisGame.getScore().getScorePlayer1() == 3 && tennisGame.getScore().getScorePlayer2() == 3) {
            tennisGame.setStatus(TennisGameStatus.DEUCE);
        } else if (tennisGame.getScore().getScorePlayer1() == 4 && tennisGame.getScore().getScorePlayer2() == 3) {
            tennisGame.setStatus(TennisGameStatus.ADVANTAGE_PLAYER_1);
        } else if (tennisGame.getScore().getScorePlayer1() == 3 && tennisGame.getScore().getScorePlayer2() == 4) {
            tennisGame.setStatus(TennisGameStatus.ADVANTAGE_PLAYER_2);
        } else if (tennisGame.getScore().getScorePlayer1() == 5) {
            tennisGame.setStatus(TennisGameStatus.PLAYER_1_WINS);
        } else if (tennisGame.getScore().getScorePlayer2() == 5) {
            tennisGame.setStatus(TennisGameStatus.PLAYER_2_WINS);
        } else if (TennisGameStatus.PLAY.equals(tennisGame.getStatus())) {
            if (tennisGame.getScore().getScorePlayer1() == 4) {
                tennisGame.setStatus(TennisGameStatus.PLAYER_1_WINS);
            } else if (tennisGame.getScore().getScorePlayer2() == 4) {
                tennisGame.setStatus(TennisGameStatus.PLAYER_2_WINS);
            }
        } else {
            tennisGame.setStatus(TennisGameStatus.PLAY);
        }
    }


    public String displayGameScore(TennisGame tennisGame) {
        StringBuilder builder = new StringBuilder("Game: ");
        if (TennisGameStatus.PLAY.equals(tennisGame.getStatus())) {
            builder.append(convertScore(tennisGame.getScore().getScorePlayer1())).append(" - ").append(convertScore(tennisGame.getScore().getScorePlayer2()));
        } else {
            builder.append(tennisGame.getStatus().label);
        }
        return builder.toString();
    }

}
