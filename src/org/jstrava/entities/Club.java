package org.jstrava.entities;

/**
 * Created by roberto on 12/26/13.
 */
public class Club {

    private int id;
    private int resource_state;
    private String name;


    @Override
    public String toString() {
        return name;
    }

    public Club(int id) {
        this.id = id;
    }

    public Club() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResource_state() {
        return resource_state;
    }

    public void setResource_state(int resource_state) {
        this.resource_state = resource_state;
    }
}
