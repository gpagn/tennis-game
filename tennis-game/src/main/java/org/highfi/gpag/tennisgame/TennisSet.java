package org.highfi.gpag.tennisgame;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TennisSet {
    private int idSet = 0;
    private Score score = new Score(0, 0);
    private TennisSetStatus status = TennisSetStatus.PLAY;
    private List<TennisGame> tennisGameList = new ArrayList<>();
    private boolean tieBreakActived = false;

    public TennisGame initializeNewTennisGame() {
        return TennisGame.builder()
                .score(
                        Score.builder()
                                .scorePlayer1(0)
                                .scorePlayer2(0)
                                .build())
                .status(TennisGameStatus.PLAY)
                .build();
    }

    public void startNewGame(){
        this.tennisGameList.add(initializeNewTennisGame());
    }


    public TennisGame getCurrentGame() {

        if (this.tennisGameList != null && !this.tennisGameList.isEmpty()) {
            return this.tennisGameList.get(tennisGameList.size() - 1);
        } else {
            TennisGame tennisGame = initializeNewTennisGame();
            tennisGameList.add(tennisGame);
            return tennisGame;
        }
    }

}
