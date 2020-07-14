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

    public void startNewGame(){
        this.tennisGameList.add(new TennisGame());
    }


    public TennisGame getCurrentGame() {

        if (this.tennisGameList != null && !this.tennisGameList.isEmpty()) {
            return this.tennisGameList.get(tennisGameList.size() - 1);
        } else {
            TennisGame tennisGame = new TennisGame();
            tennisGameList.add(tennisGame);
            return tennisGame;
        }
    }

}
