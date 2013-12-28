package org.jstrava.entities;

/**
 * Created by roberto on 12/26/13.
 */
public class Segment {

    private Integer id;
    private Integer resource_state;
    private String name;
    private String activity_type;
    private Float distance;
    private Float average_grade;
    private Float maximum_grade;
    private Float elevation_high;
    private Float elevation_low;
    private String[] start_latlng;
    private String[] end_latlng;
    private Integer climb_category;
    private String city;
    private String state;
    private Boolean PRIVATE;
    private String created_at;
    private String updated_at;
    private Float total_elevation_gain;
    private StravaMap map;
    private Integer effort_count;
    private Integer athlete_count;
    private Boolean hazardous;
    private Integer pr_time;
    private Float pr_distance;
    private Boolean starred;


    public Segment(Integer id) {
        this.id = id;
    }

    public Segment() {
    }

    @Override
    public String toString() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResource_state() {
        return resource_state;
    }

    public void setResource_state(Integer resource_state) {
        this.resource_state = resource_state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity_type() {
        return activity_type;
    }

    public void setActivity_type(String activity_type) {
        this.activity_type = activity_type;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getAverage_grade() {
        return average_grade;
    }

    public void setAverage_grade(Float average_grade) {
        this.average_grade = average_grade;
    }

    public Float getMaximum_grade() {
        return maximum_grade;
    }

    public void setMaximum_grade(Float maximum_grade) {
        this.maximum_grade = maximum_grade;
    }

    public Float getElevation_high() {
        return elevation_high;
    }

    public void setElevation_high(Float elevation_high) {
        this.elevation_high = elevation_high;
    }

    public Float getElevation_low() {
        return elevation_low;
    }

    public void setElevation_low(Float elevation_low) {
        this.elevation_low = elevation_low;
    }

    public String[] getStart_latlng() {
        return start_latlng;
    }

    public void setStart_latlng(String[] start_latlng) {
        this.start_latlng = start_latlng;
    }

    public String[] getEnd_latlng() {
        return end_latlng;
    }

    public void setEnd_latlng(String[] end_latlng) {
        this.end_latlng = end_latlng;
    }

    public Integer getClimb_category() {
        return climb_category;
    }

    public void setClimb_category(Integer climb_category) {
        this.climb_category = climb_category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getPRIVATE() {
        return PRIVATE;
    }

    public void setPRIVATE(Boolean PRIVATE) {
        this.PRIVATE = PRIVATE;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Float getTotal_elevation_gain() {
        return total_elevation_gain;
    }

    public void setTotal_elevation_gain(Float total_elevation_gain) {
        this.total_elevation_gain = total_elevation_gain;
    }

    public StravaMap getMap() {
        return map;
    }

    public void setMap(StravaMap map) {
        this.map = map;
    }

    public Integer getEffort_count() {
        return effort_count;
    }

    public void setEffort_count(Integer effort_count) {
        this.effort_count = effort_count;
    }

    public Integer getAthlete_count() {
        return athlete_count;
    }

    public void setAthlete_count(Integer athlete_count) {
        this.athlete_count = athlete_count;
    }

    public Boolean getHazardous() {
        return hazardous;
    }

    public void setHazardous(Boolean hazardous) {
        this.hazardous = hazardous;
    }

    public Integer getPr_time() {
        return pr_time;
    }

    public void setPr_time(Integer pr_time) {
        this.pr_time = pr_time;
    }

    public Float getPr_distance() {
        return pr_distance;
    }

    public void setPr_distance(Float pr_distance) {
        this.pr_distance = pr_distance;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }
}
