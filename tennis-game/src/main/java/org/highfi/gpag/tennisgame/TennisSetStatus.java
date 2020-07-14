package org.highfi.gpag.tennisgame;

public enum TennisSetStatus {
    PLAY(""),
    PLAYER_1_WINS("Player 1 win set"),
    PLAYER_2_WINS("Player 2 win set"),
    PLAYER_1_WINS_MATCH("Player 1 win Match"),
    PLAYER_2_WINS_MATCH("Player 2 win Match");

    public final String label;

    TennisSetStatus(String label) {
        this.label = label;
    }
}
