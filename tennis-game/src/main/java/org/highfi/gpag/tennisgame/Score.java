package org.highfi.gpag.tennisgame;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Score {
    private int scorePlayer1;
    private int scorePlayer2;

    public void addScorePlayer1() {
        this.scorePlayer1++;
    }

    public void addScorePlayer2() {
        this.scorePlayer2++;
    }

    public void minusScorePlayer1() {
        this.scorePlayer1--;
    }

    public void minusScorePlayer2() {
        this.scorePlayer2--;
    }
}
