package org.jstrava.entities.activity;

import java.util.List;

/**
 * Created by roberto on 2/7/14.
 */
public class Zone {

    private int score;
    private List<DistributionBucket> distribution_buckets;
    private String type;
    private int resource_state;
    private boolean sensor_based;
    private int points;
    private boolean custom_zones;
    private int max;
    private double bike_weight;
    private double athlete_weight;


    public Zone() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<DistributionBucket> getDistribution_buckets() {
        return distribution_buckets;
    }

    public void setDistribution_buckets(List<DistributionBucket> distribution_buckets) {
        this.distribution_buckets = distribution_buckets;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getResource_state() {
        return resource_state;
    }

    public void setResource_state(int resource_state) {
        this.resource_state = resource_state;
    }

    public boolean isSensor_based() {
        return sensor_based;
    }

    public void setSensor_based(boolean sensor_based) {
        this.sensor_based = sensor_based;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isCustom_zones() {
        return custom_zones;
    }

    public void setCustom_zones(boolean custom_zones) {
        this.custom_zones = custom_zones;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getBike_weight() {
        return bike_weight;
    }

    public void setBike_weight(double bike_weight) {
        this.bike_weight = bike_weight;
    }

    public double getAthlete_weight() {
        return athlete_weight;
    }

    public void setAthlete_weight(double athlete_weight) {
        this.athlete_weight = athlete_weight;
    }
}
