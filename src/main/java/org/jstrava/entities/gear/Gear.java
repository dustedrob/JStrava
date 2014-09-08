package org.jstrava.entities.gear;

import javax.measure.Quantity;
import javax.measure.quantity.Length;

import tec.units.ri.function.DescriptionSupplier;
import tec.units.ri.function.Nameable;
import tec.uom.lib.common.function.Identifiable;

/**
 * Created by roberto on 12/26/13.
 * Updated by keilw on 09/07/14.
 */
public class Gear implements Nameable, Identifiable<String>, DescriptionSupplier {

    private String id;
    private boolean primary;
    private String name;
//    private Quantity<Length> distance;
    private double distance;
    private String brand_name;
    private String model_name;
    private String frame_type;
    private String description;
    private int resource_state;

    @Override
    public String toString() {
        return name;
    }

    public Gear(String id) {
        this.id = id;
    }


    public Gear() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public String getFrame_type() {
        return frame_type;
    }

    public void setFrame_type(String frame_type) {
        this.frame_type = frame_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResource_state() {
        return resource_state;
    }

    public void setResource_state(int resource_state) {
        this.resource_state = resource_state;
    }
}
