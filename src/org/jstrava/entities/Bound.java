package org.jstrava.entities;

/**
 * Created by roberto on 1/14/14.
 */
public class Bound {


    private Float southwestLatitude;
    private Float southwestLongitude;
    private Float northeastLatitude;
    private Float northeastLongitude;

    public Bound() {
    }

    public Bound(Float southwestLatitude, Float southwestLongitude, Float northeastLatitude, Float northeastLongitude) {
        this.southwestLatitude = southwestLatitude;
        this.southwestLongitude = southwestLongitude;
        this.northeastLatitude = northeastLatitude;
        this.northeastLongitude = northeastLongitude;
    }

    public Float getSouthwestLatitude() {
        return southwestLatitude;
    }

    public void setSouthwestLatitude(Float southwestLatitude) {
        this.southwestLatitude = southwestLatitude;
    }

    public Float getSouthwestLongitude() {
        return southwestLongitude;
    }

    public void setSouthwestLongitude(Float southwestLongitude) {
        this.southwestLongitude = southwestLongitude;
    }

    public Float getNortheastLatitude() {
        return northeastLatitude;
    }

    public void setNortheastLatitude(Float northeastLatitude) {
        this.northeastLatitude = northeastLatitude;
    }

    public Float getNortheastLongitude() {
        return northeastLongitude;
    }

    public void setNortheastLongitude(Float northeastLongitude) {
        this.northeastLongitude = northeastLongitude;
    }

    @Override
    public String toString() {
        return southwestLatitude +
                "," + southwestLongitude +
                "," + northeastLatitude +
                "," + northeastLongitude;
    }
}
