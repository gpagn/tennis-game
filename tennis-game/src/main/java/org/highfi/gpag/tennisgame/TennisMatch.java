package org.highfi.gpag.tennisgame;

import java.util.ArrayList;
import java.util.List;

public class TennisMatch {

    private int idMatch = 0;
    private TennisMatchStatus status = TennisMatchStatus.PLAY;
    private List<TennisSet> tennisSetList = new ArrayList<>();

//    public tennisSetList getCurrentSet() {
//
//        if (this.tennisSetList != null && !this.tennisSetList.isEmpty()) {
//            return this.tennisSetList.get(tennisSetList.size() - 1);
//        } else {
//
//            return initializeNewTennisGame();
//        }
//    }
}
