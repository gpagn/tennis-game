package org.highfi.gpag.tennisgame;

public enum TennisMatchStatus {
    PLAY(""),
    TIE_BREAK(""),
    PLAYER_1_WINS("Player 1 win Match"),
    PLAYER_2_WINS("Player 2 win Match");

    public final String label;

    TennisMatchStatus(String label) {
        this.label = label;
    }
}
