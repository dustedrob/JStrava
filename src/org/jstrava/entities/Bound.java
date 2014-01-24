package org.jstrava.entities;

/**
 * Created by roberto on 1/14/14.
 */
public class Bound {


    private double southwestLatitude;
    private double southwestlongitude;
    private double northeastLatitude;
    private double northeastlongitude;


    public Bound(double southwestLatitude, double southwestlongitude, double northeastLatitude, double northeastlongitude) {
        this.southwestLatitude = southwestLatitude;
        this.southwestlongitude = southwestlongitude;
        this.northeastLatitude = northeastLatitude;
        this.northeastlongitude = northeastlongitude;
    }

    public double getSouthwestLatitude() {
        return southwestLatitude;
    }

    public void setSouthwestLatitude(double southwestLatitude) {
        this.southwestLatitude = southwestLatitude;
    }

    public double getSouthwestlongitude() {
        return southwestlongitude;
    }

    public void setSouthwestlongitude(double southwestlongitude) {
        this.southwestlongitude = southwestlongitude;
    }

    public double getNortheastLatitude() {
        return northeastLatitude;
    }

    public void setNortheastLatitude(double northeastLatitude) {
        this.northeastLatitude = northeastLatitude;
    }

    public double getNortheastlongitude() {
        return northeastlongitude;
    }

    public void setNortheastlongitude(double northeastlongitude) {
        this.northeastlongitude = northeastlongitude;
    }

    @Override
    public String toString() {
        return southwestLatitude +
                "," + southwestlongitude +
                "," + northeastLatitude +
                "," + northeastlongitude;
    }
}
