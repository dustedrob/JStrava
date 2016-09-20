package org.jstrava.entities.route;

import org.jstrava.entities.activity.Polyline;
import org.jstrava.entities.athlete.Athlete;
import org.jstrava.entities.segment.Segment;

import java.util.ArrayList;

/**
 * Created by roberto on 18/08/16.
 */
public class Route {

    private int id;
    private int resource_state;
    private String name;
    private String description;
    private Athlete athlete;
    private float distance;
    private float elevation_gain;
    private Polyline map;
    private int type;
    private int sub_type;
    private boolean PRIVATE;
    private boolean starred;
    private long timestamp;
    private ArrayList<Segment> segments = new ArrayList<>();

    public Route() {
    }

    @Override
    public String toString() {
        return "Route{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResource_state() {
        return resource_state;
    }

    public void setResource_state(int resource_state) {
        this.resource_state = resource_state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getElevation_gain() {
        return elevation_gain;
    }

    public void setElevation_gain(float elevation_gain) {
        this.elevation_gain = elevation_gain;
    }

    public Polyline getMap() {
        return map;
    }

    public void setMap(Polyline map) {
        this.map = map;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSub_type() {
        return sub_type;
    }

    public void setSub_type(int sub_type) {
        this.sub_type = sub_type;
    }

    public boolean isPRIVATE() {
        return PRIVATE;
    }

    public void setPRIVATE(boolean PRIVATE) {
        this.PRIVATE = PRIVATE;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public ArrayList<Segment> getSegments() {
        return segments;
    }

    public void setSegments(ArrayList<Segment> segments) {
        this.segments = segments;
    }
}
