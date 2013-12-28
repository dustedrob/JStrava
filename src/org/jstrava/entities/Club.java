package org.jstrava.entities;

/**
 * Created by roberto on 12/26/13.
 */
public class Club {

    private Integer id;	
    private Integer resource_state;
    private String name;


    @Override
    public String toString() {
        return name;
    }

    public Club(Integer id) {
        this.id = id;
    }

    public Club() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getResource_state() {
        return resource_state;
    }

    public void setResource_state(Integer resource_state) {
        this.resource_state = resource_state;
    }
}
