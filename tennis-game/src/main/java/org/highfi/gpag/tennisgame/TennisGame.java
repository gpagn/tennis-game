package org.highfi.gpag.tennisgame;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TennisGame {
    private int idGame = 0;
    private Score score = new Score(0, 0);
    private TennisGameStatus status = TennisGameStatus.PLAY;

}
