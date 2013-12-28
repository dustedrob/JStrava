package org.jstrava.entities;

/**
 * Created by roberto on 12/27/13.
 */
public class SplitsStandard {

    private Float distance;
    private Integer elapsed_time;
    private Float elevation_difference;
    private Integer moving_time;
    private Integer split;

    public SplitsStandard() {


    }

    @Override
    public String toString() {
        return split.toString();
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Integer getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(Integer elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public Float getElevation_difference() {
        return elevation_difference;
    }

    public void setElevation_difference(Float elevation_difference) {
        this.elevation_difference = elevation_difference;
    }

    public Integer getMoving_time() {
        return moving_time;
    }

    public void setMoving_time(Integer moving_time) {
        this.moving_time = moving_time;
    }

    public Integer getSplit() {
        return split;
    }

    public void setSplit(Integer split) {
        this.split = split;
    }
}
