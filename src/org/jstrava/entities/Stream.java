package org.jstrava.entities;

import java.util.List;

/**
 * Created by roberto on 1/27/14.
 */
public class Stream {

    private String type;
    private List<Object> data;
    private String series_type;
    private int original_size;
    private String resolution;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public String getSeries_type() {
        return series_type;
    }

    public void setSeries_type(String series_type) {
        this.series_type = series_type;
    }

    public int getOriginal_size() {
        return original_size;
    }

    public void setOriginal_size(int original_size) {
        this.original_size = original_size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
