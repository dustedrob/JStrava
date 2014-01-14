package org.jstrava.entities;

/**
 * Created by roberto on 1/14/14.
 */
public class LapEffort {


    private Long id;
    private Integer resource_state;
    private String name;
    private Activity activity;
    private Athlete athlete;
    private Integer elapsed_time;
    private Integer moving_time;
    private String start_date;
    private String start_date_local;
    private Float distance;
    private Integer start_index;
    private Integer end_index;
    private Float total_elevation_gain;
    private Float average_speed;
    private Float max_speed;
    private Float average_cadence;
    private Float average_watts;
    private Float average_heartrate;
    private Float max_heartrate;
    private Integer lap_index;

    public LapEffort(Long id) {
        this.id = id;
    }

    public LapEffort() {
    }

    @Override
    public String toString() {
        return name ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public Integer getMoving_time() {
        return moving_time;
    }

    public void setMoving_time(Integer moving_time) {
        this.moving_time = moving_time;
    }

    public Integer getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(Integer elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getStart_date_local() {
        return start_date_local;
    }

    public void setStart_date_local(String start_date_local) {
        this.start_date_local = start_date_local;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Integer getStart_index() {
        return start_index;
    }

    public void setStart_index(Integer start_index) {
        this.start_index = start_index;
    }

    public Integer getEnd_index() {
        return end_index;
    }

    public void setEnd_index(Integer end_index) {
        this.end_index = end_index;
    }

    public Float getTotal_elevation_gain() {
        return total_elevation_gain;
    }

    public void setTotal_elevation_gain(Float total_elevation_gain) {
        this.total_elevation_gain = total_elevation_gain;
    }

    public Float getAverage_speed() {
        return average_speed;
    }

    public void setAverage_speed(Float average_speed) {
        this.average_speed = average_speed;
    }

    public Float getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(Float max_speed) {
        this.max_speed = max_speed;
    }

    public Float getAverage_cadence() {
        return average_cadence;
    }

    public void setAverage_cadence(Float average_cadence) {
        this.average_cadence = average_cadence;
    }

    public Float getAverage_watts() {
        return average_watts;
    }

    public void setAverage_watts(Float average_watts) {
        this.average_watts = average_watts;
    }

    public Float getAverage_heartrate() {
        return average_heartrate;
    }

    public void setAverage_heartrate(Float average_heartrate) {
        this.average_heartrate = average_heartrate;
    }

    public Float getMax_heartrate() {
        return max_heartrate;
    }

    public void setMax_heartrate(Float max_heartrate) {
        this.max_heartrate = max_heartrate;
    }

    public Integer getLap_index() {
        return lap_index;
    }

    public void setLap_index(Integer lap_index) {
        this.lap_index = lap_index;
    }
}
