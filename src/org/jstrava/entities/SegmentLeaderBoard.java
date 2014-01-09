package org.jstrava.entities;

import java.util.List;

/**
 * Created by roberto on 1/9/14.
 */
public class SegmentLeaderBoard {

    private Integer effort_count;
    private Integer entry_count;
    private List<LeaderBoardEntry> entries;

    public SegmentLeaderBoard() {
    }



    public Integer getEffort_count() {
        return effort_count;
    }

    public void setEffort_count(Integer effort_count) {
        this.effort_count = effort_count;
    }

    public Integer getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(Integer entry_count) {
        this.entry_count = entry_count;
    }


    public List<LeaderBoardEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<LeaderBoardEntry> entries) {
        this.entries = entries;
    }
}
