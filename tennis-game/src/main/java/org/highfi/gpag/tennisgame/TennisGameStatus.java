package org.highfi.gpag.tennisgame;

public enum TennisGameStatus {
    PLAY(""),
    DEUCE("DEUCE"),
    ADVANTAGE_PLAYER_1("Advantage player 1"),
    ADVANTAGE_PLAYER_2("Advantage player 2"),
    PLAYER_1_WINS("Player 1 win game"),
    PLAYER_2_WINS("Player 2 win game");

    public final String label;

    TennisGameStatus(String label) {
        this.label = label;
    }
}
