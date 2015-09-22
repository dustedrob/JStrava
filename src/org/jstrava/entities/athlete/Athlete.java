package org.jstrava.entities.athlete;

import org.jstrava.entities.club.Club;
import org.jstrava.entities.gear.Gear;

import java.util.List;

/**
 * Created by roberto on 12/26/13.
 */
public class Athlete {


    private int id;
    private String resource_state;
    private String firstname;
    private String lastname;
    private String profile_medium;
    private String profile;
    private String city;
    private String state;
    private String sex;
    private String friend;
    private String follower;
    private boolean premium;
    private String created_at;
    private String updated_at;
    private boolean approve_followers;
    private int follower_count;
    private int friend_count;
    private int mutual_friend_count;
    private String date_preference;
    private String measurement_preference;
    private String email;
    private int ftp;
    private float weight;
    private List<Club> clubs;
    private List<Gear> bikes;
    private List<Gear> shoes;

    @Override
    public String toString() {
        return firstname +" "+ lastname;
    }

    public Athlete(int id) {
        this.id = id;
    }

    public Athlete() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResource_state() {
        return resource_state;
    }

    public void setResource_state(String resource_state) {
        this.resource_state = resource_state;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProfile_medium() {
        return profile_medium;
    }

    public void setProfile_medium(String profile_medium) {
        this.profile_medium = profile_medium;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public boolean getPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
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

    public boolean getApprove_followers() {
        return approve_followers;
    }

    public void setApprove_followers(boolean approve_followers) {
        this.approve_followers = approve_followers;
    }

    public int getFollower_count() {
        return follower_count;
    }

    public void setFollower_count(int follower_count) {
        this.follower_count = follower_count;
    }

    public int getFriend_count() {
        return friend_count;
    }

    public void setFriend_count(int friend_count) {
        this.friend_count = friend_count;
    }

    public int getMutual_friend_count() {
        return mutual_friend_count;
    }

    public void setMutual_friend_count(int mutual_friend_count) {
        this.mutual_friend_count = mutual_friend_count;
    }

    public String getDate_preference() {
        return date_preference;
    }

    public void setDate_preference(String date_preference) {
        this.date_preference = date_preference;
    }

    public String getMeasurement_preference() {
        return measurement_preference;
    }

    public void setMeasurement_preference(String measurement_preference) {
        this.measurement_preference = measurement_preference;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFtp() {
        return ftp;
    }

    public void setFtp(int ftp) {
        this.ftp = ftp;
    }
    
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    public List<Gear> getBikes() {
        return bikes;
    }

    public void setBikes(List<Gear> bikes) {
        this.bikes = bikes;
    }

    public List<Gear> getShoes() {
        return shoes;
    }

    public void setShoes(List<Gear> shoes) {
        this.shoes = shoes;
    }
}
