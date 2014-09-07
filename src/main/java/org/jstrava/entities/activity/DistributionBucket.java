package org.jstrava.entities.activity;

/**
 * Created by roberto on 2/7/14.
 */
public class DistributionBucket
{
    private int max;
    private int min;
    private int time;

    public DistributionBucket() {
    }


    public int getMaximum() {
        return max;
    }

    public void setMaximum(int max) {
        this.max = max;
    }

    public int getMinimum() {
        return min;
    }

    public void setMinimum(int min) {
        this.min = min;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
