package org.jstrava.entities;

/**
 * Created by roberto on 12/26/13.
 */
public class Polyline {

    private String id;
    private String polyline;
    private String summary_polyline;
    private String resource_state;


    @Override
    public String toString() {
        return id;
    }

    public Polyline(String id) {
        this.id = id;
    }

    public Polyline() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolyline() {
        return polyline;
    }

    public void setPolyline(String polyline) {
        this.polyline = polyline;
    }

    public String getSummary_polyline() {
        return summary_polyline;
    }

    public void setSummary_polyline(String summary_polyline) {
        this.summary_polyline = summary_polyline;
    }

    public String getResource_state() {
        return resource_state;
    }

    public void setResource_state(String resource_state) {
        this.resource_state = resource_state;
    }
}
