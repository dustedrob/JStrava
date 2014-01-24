package org.jstrava.entities;

/**
 * Created by roberto on 12/27/13.
 */
public class Comment {

    private int id;
    private int resource_state;
    private String text;
    private Athlete athlete;
    private String created_at;


    @Override
    public String toString() {
        return text;
    }

    public Comment(int id) {
        this.id = id;
    }

    public Comment() {
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
