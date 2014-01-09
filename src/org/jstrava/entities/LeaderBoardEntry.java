package org.jstrava.entities;

/**
 * Created by roberto on 1/9/14.
 */
public class LeaderBoardEntry {

    private String athlete_name;
    private Integer athlete_id;
    private String athlete_gender;
    private Float average_hr;
    private Float average_watts;
    private Float distance;
    private Integer elapsed_time;
    private Integer moving_time;
    private String start_date;
    private String start_date_local;
    private Integer activity_id;
    private Long effort_id;
    private Integer rank;
    private String athlete_profile;


    @Override
    public String toString() {
        return athlete_name;
    }

    public LeaderBoardEntry() {
    }

    public String getAthlete_name() {
        return athlete_name;
    }

    public void setAthlete_name(String athlete_name) {
        this.athlete_name = athlete_name;
    }

    public Integer getAthlete_id() {
        return athlete_id;
    }

    public void setAthlete_id(Integer athlete_id) {
        this.athlete_id = athlete_id;
    }

    public String getAthlete_gender() {
        return athlete_gender;
    }

    public void setAthlete_gender(String athlete_gender) {
        this.athlete_gender = athlete_gender;
    }

    public Float getAverage_hr() {
        return average_hr;
    }

    public void setAverage_hr(Float average_hr) {
        this.average_hr = average_hr;
    }

    public Float getAverage_watts() {
        return average_watts;
    }

    public void setAverage_watts(Float average_watts) {
        this.average_watts = average_watts;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Integer getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(Integer elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public Integer getMoving_time() {
        return moving_time;
    }

    public void setMoving_time(Integer moving_time) {
        this.moving_time = moving_time;
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

    public Integer getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(Integer activity_id) {
        this.activity_id = activity_id;
    }

    public Long getEffort_id() {
        return effort_id;
    }

    public void setEffort_id(Long effort_id) {
        this.effort_id = effort_id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getAthlete_profile() {
        return athlete_profile;
    }

    public void setAthlete_profile(String athlete_profile) {
        this.athlete_profile = athlete_profile;
    }
}
