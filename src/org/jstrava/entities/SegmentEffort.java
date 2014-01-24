package org.jstrava.entities;

/**
 * Created by roberto on 12/27/13.
 */
public class SegmentEffort {

    private long id;
    private int resource_state;
    private String name;
    private Segment segment;
    private Activity activity;
    private Athlete athlete;
    private int kom_rank;
    private int pr_rank;
    private int elapsed_time;
    private int moving_time;
    private String start_date;
    private String start_date_local;
    private float distance;
    private int start_index;
    private int end_index;


    public SegmentEffort(long id) {
        this.id = id;
    }

    public SegmentEffort() {
    }

    @Override
    public String toString() {
        return name ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getResource_state() {
        return resource_state;
    }

    public void setResource_state(int resource_state) {
        this.resource_state = resource_state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
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

    public int getKom_rank() {
        return kom_rank;
    }

    public void setKom_rank(int kom_rank) {
        this.kom_rank = kom_rank;
    }

    public int getPr_rank() {
        return pr_rank;
    }

    public void setPr_rank(int pr_rank) {
        this.pr_rank = pr_rank;
    }

    public int getMoving_time() {
        return moving_time;
    }

    public void setMoving_time(int moving_time) {
        this.moving_time = moving_time;
    }

    public int getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(int elapsed_time) {
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

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getStart_index() {
        return start_index;
    }

    public void setStart_index(int start_index) {
        this.start_index = start_index;
    }

    public int getEnd_index() {
        return end_index;
    }

    public void setEnd_index(int end_index) {
        this.end_index = end_index;
    }
}
