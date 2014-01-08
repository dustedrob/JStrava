package org.jstrava.entities;

import java.util.List;
/**
 * Created by roberto on 12/26/13.
 */
public class Activity {

    private Integer id;
    private Integer resource_state;
    private String external_id;
    private Integer upload_id;
    private Athlete athlete;/*Simple Athlete representation with just id*/
    private String name;
    private Float distance;
    private Integer moving_time;
    private Integer elapsed_time;
    private Float total_elevation_gain;
    private String type;
    private String start_date_local;
    private String time_zone;
    private String[] start_latlng;
    private String[] end_latlng;
    private String location_city;
    private String location_state;
    private Integer achievement_count;
    private Integer kudos_count;
    private Integer comment_count;
    private Integer athlete_count;
    private Integer photo_count;
    private StravaMap map;
    private Boolean trainer;
    private Boolean commute;
    private Boolean manual;
    private Boolean PRIVATE;
    private Boolean flagged;
    private String gear_id;
    private Float average_speed;
    private Float max_speed;
    private Float average_cadence;
    private Integer average_temp;
    private Float average_watts;
    private Float kilojoules;
    private Float average_heartrate;
    private Float max_heartrate;
    private Float calories;
    private Integer truncated;
    private Boolean has_kudoed;
    private List<SegmentEffort> segment_efforts;
    private List<SplitsMetric> splits_metric;
    private List<SplitsStandard> splits_standard;
    private List<SegmentEffort> best_efforts;


    @Override
    public String toString() {
        return name;
    }

    public Activity() {
    }

    public Activity(Integer id) {
        this.id = id;
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

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
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

    public Float getTotal_elevation_gain() {
        return total_elevation_gain;
    }

    public void setTotal_elevation_gain(Float total_elevation_gain) {
        this.total_elevation_gain = total_elevation_gain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart_date_local() {
        return start_date_local;
    }

    public void setStart_date_local(String start_date_local) {
        this.start_date_local = start_date_local;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
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

    public String getLocation_city() {
        return location_city;
    }

    public void setLocation_city(String location_city) {
        this.location_city = location_city;
    }

    public String getLocation_state() {
        return location_state;
    }

    public void setLocation_state(String location_state) {
        this.location_state = location_state;
    }

    public Integer getAchievement_count() {
        return achievement_count;
    }

    public void setAchievement_count(Integer achievement_count) {
        this.achievement_count = achievement_count;
    }

    public Integer getKudos_count() {
        return kudos_count;
    }

    public void setKudos_count(Integer kudos_count) {
        this.kudos_count = kudos_count;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Integer getAthlete_count() {
        return athlete_count;
    }

    public void setAthlete_count(Integer athlete_count) {
        this.athlete_count = athlete_count;
    }

    public Integer getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(Integer photo_count) {
        this.photo_count = photo_count;
    }

    public StravaMap getMap() {
        return map;
    }

    public void setMap(StravaMap map) {
        this.map = map;
    }

    public Boolean getTrainer() {
        return trainer;
    }

    public void setTrainer(Boolean trainer) {
        this.trainer = trainer;
    }

    public Boolean getCommute() {
        return commute;
    }

    public void setCommute(Boolean commute) {
        this.commute = commute;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public Boolean getPRIVATE() {
        return PRIVATE;
    }

    public void setPRIVATE(Boolean PRIVATE) {
        this.PRIVATE = PRIVATE;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    public String getGear_id() {
        return gear_id;
    }

    public void setGear_id(String gear_id) {
        this.gear_id = gear_id;
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

    public Integer getAverage_temp() {
        return average_temp;
    }

    public void setAverage_temp(Integer average_temp) {
        this.average_temp = average_temp;
    }

    public Float getAverage_watts() {
        return average_watts;
    }

    public void setAverage_watts(Float average_watts) {
        this.average_watts = average_watts;
    }

    public Float getKilojoules() {
        return kilojoules;
    }

    public void setKilojoules(Float kilojoules) {
        this.kilojoules = kilojoules;
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

    public Float getCalories() {
        return calories;
    }

    public void setCalories(Float calories) {
        this.calories = calories;
    }

    public Integer getTruncated() {
        return truncated;
    }

    public void setTruncated(Integer truncated) {
        this.truncated = truncated;
    }

    public Boolean getHas_kudoed() {
        return has_kudoed;
    }

    public void setHas_kudoed(Boolean has_kudoed) {
        this.has_kudoed = has_kudoed;
    }

    public List<SegmentEffort> getSegment_efforts() {
        return segment_efforts;
    }

    public void setSegment_efforts(List<SegmentEffort> segment_efforts) {
        this.segment_efforts = segment_efforts;
    }

    public List<SplitsMetric> getSplits_metric() {
        return splits_metric;
    }

    public void setSplits_metric(List<SplitsMetric> splits_metric) {
        this.splits_metric = splits_metric;
    }

    public List<SplitsStandard> getSplits_standard() {
        return splits_standard;
    }

    public void setSplits_standard(List<SplitsStandard> splits_standard) {
        this.splits_standard = splits_standard;
    }

    public List<SegmentEffort> getBest_efforts() {
        return best_efforts;
    }

    public void setBest_efforts(List<SegmentEffort> best_efforts) {
        this.best_efforts = best_efforts;
    }

    public Integer getUpload_id() {
        return upload_id;
    }

    public void setUpload_id(Integer upload_id) {
        this.upload_id = upload_id;
    }
}
