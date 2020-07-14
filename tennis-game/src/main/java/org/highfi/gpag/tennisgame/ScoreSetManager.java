package org.highfi.gpag.tennisgame;


public class ScoreSetManager {
    private ScoreGameManager scoreGameManager = new ScoreGameManager();

    private String convertScore(int playerScore) {
        return Integer.toString(playerScore);
    }


    public void addSetPointOnPlayer1(TennisSet tennisSet) {
        tennisSet.getScore().addScorePlayer1();
        checkStatus(tennisSet);
    }

    public void addSetPointOnPlayer2(TennisSet tennisSet) {
        tennisSet.getScore().addScorePlayer2();
        checkStatus(tennisSet);
    }

    public void checkStatus(TennisSet tennisSet) {
        if (tennisSet.getScore().getScorePlayer1() == 6 && tennisSet.getScore().getScorePlayer2() <= 4) {
            tennisSet.setStatus(TennisSetStatus.PLAYER_1_WINS);
        } else if (tennisSet.getScore().getScorePlayer2() == 6 && tennisSet.getScore().getScorePlayer1() <= 4) {
            tennisSet.setStatus(TennisSetStatus.PLAYER_2_WINS);
        } else if (tennisSet.getScore().getScorePlayer1() == 6 && tennisSet.getScore().getScorePlayer2() == 6) {
            tennisSet.setTieBreakActived(true);
        } else if (tennisSet.isTieBreakActived()) {
            int diff = tennisSet.getScore().getScorePlayer1() - tennisSet.getScore().getScorePlayer2();
            switch (diff) {
                case 2:
                    tennisSet.setStatus(TennisSetStatus.PLAYER_1_WINS_MATCH);
                    break;
                case -2:
                    tennisSet.setStatus(TennisSetStatus.PLAYER_2_WINS_MATCH);
                    break;
            }
        } else if (tennisSet.getScore().getScorePlayer1() == 7) {
            tennisSet.setStatus(TennisSetStatus.PLAYER_1_WINS);
        } else if (tennisSet.getScore().getScorePlayer2() == 7) {
            tennisSet.setStatus(TennisSetStatus.PLAYER_2_WINS);
        } else {
            tennisSet.setStatus(TennisSetStatus.PLAY);
        }
    }


    public String displaySetScore(TennisSet tennisSet) {
        StringBuilder builder = new StringBuilder("Set: ");
        if (TennisSetStatus.PLAY.equals(tennisSet.getStatus())) {
            builder.append(convertScore(tennisSet.getScore().getScorePlayer1())).append(" - ").append(convertScore(tennisSet.getScore().getScorePlayer2()));
            builder.append(" / ");
            builder.append(scoreGameManager.displayGameScore(tennisSet.getCurrentGame()));
        } else {
            builder.append(tennisSet.getStatus().label);
        }
        return builder.toString();
    }

}
