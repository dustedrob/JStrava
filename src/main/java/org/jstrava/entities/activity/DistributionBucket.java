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


    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
