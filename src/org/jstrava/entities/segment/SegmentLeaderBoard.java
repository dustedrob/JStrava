package org.jstrava.entities.segment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roberto on 1/9/14.
 */
public class SegmentLeaderBoard {

    private int effort_count;
    private int entry_count;
    private List<LeaderBoardEntry> entries=new ArrayList<>();

    public SegmentLeaderBoard() {
    }



    public int getEffort_count() {
        return effort_count;
    }

    public void setEffort_count(int effort_count) {
        this.effort_count = effort_count;
    }

    public int getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(int entry_count) {
        this.entry_count = entry_count;
    }


    public List<LeaderBoardEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<LeaderBoardEntry> entries) {
        this.entries = entries;
    }
}
