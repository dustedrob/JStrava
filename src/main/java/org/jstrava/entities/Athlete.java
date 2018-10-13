package org.jstrava.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Athlete{

	@SerializedName("country")
	private String country;

	@SerializedName("profile_medium")
	private String profileMedium;

	@SerializedName("firstname")
	private String firstname;

	@SerializedName("date_preference")
	private String datePreference;

	@SerializedName("city")
	private String city;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("follower_count")
	private int followerCount;

	@SerializedName("premium")
	private boolean premium;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("friend")
	private Object friend;

	@SerializedName("mutual_friend_count")
	private int mutualFriendCount;

	@SerializedName("clubs")
	private List<Object> clubs;

	@SerializedName("id")
	private long id;

	@SerializedName("state")
	private String state;

	@SerializedName("friend_count")
	private int friendCount;

	@SerializedName("email")
	private String email;

	@SerializedName("follower")
	private Object follower;

	@SerializedName("athlete_type")
	private int athleteType;

	@SerializedName("ftp")
	private Object ftp;

	@SerializedName("bikes")
	private List<Gear> bikes;

	@SerializedName("resource_state")
	private int resourceState;

	@SerializedName("sex")
	private String sex;

	@SerializedName("profile")
	private String profile;

	@SerializedName("measurement_preference")
	private String measurementPreference;

	@SerializedName("weight")
	private double weight;

	@SerializedName("shoes")
	private List<Gear> shoes;

	@SerializedName("lastname")
	private String lastname;

	@SerializedName("badge_type_id")
	private int badgeTypeId;

	@SerializedName("username")
	private String username;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setProfileMedium(String profileMedium){
		this.profileMedium = profileMedium;
	}

	public String getProfileMedium(){
		return profileMedium;
	}

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	public void setDatePreference(String datePreference){
		this.datePreference = datePreference;
	}

	public String getDatePreference(){
		return datePreference;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setFollowerCount(int followerCount){
		this.followerCount = followerCount;
	}

	public int getFollowerCount(){
		return followerCount;
	}

	public void setPremium(boolean premium){
		this.premium = premium;
	}

	public boolean isPremium(){
		return premium;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setFriend(Object friend){
		this.friend = friend;
	}

	public Object getFriend(){
		return friend;
	}

	public void setMutualFriendCount(int mutualFriendCount){
		this.mutualFriendCount = mutualFriendCount;
	}

	public int getMutualFriendCount(){
		return mutualFriendCount;
	}

	public void setClubs(List<Object> clubs){
		this.clubs = clubs;
	}

	public List<Object> getClubs(){
		return clubs;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setFriendCount(int friendCount){
		this.friendCount = friendCount;
	}

	public int getFriendCount(){
		return friendCount;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setFollower(Object follower){
		this.follower = follower;
	}

	public Object getFollower(){
		return follower;
	}

	public void setAthleteType(int athleteType){
		this.athleteType = athleteType;
	}

	public int getAthleteType(){
		return athleteType;
	}

	public void setFtp(Object ftp){
		this.ftp = ftp;
	}

	public Object getFtp(){
		return ftp;
	}

	public void setBikes(List<Gear> bikes){
		this.bikes = bikes;
	}

	public List<Gear> getBikes(){
		return bikes;
	}

	public void setResourceState(int resourceState){
		this.resourceState = resourceState;
	}

	public int getResourceState(){
		return resourceState;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getSex(){
		return sex;
	}

	public void setProfile(String profile){
		this.profile = profile;
	}

	public String getProfile(){
		return profile;
	}

	public void setMeasurementPreference(String measurementPreference){
		this.measurementPreference = measurementPreference;
	}

	public String getMeasurementPreference(){
		return measurementPreference;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public double getWeight(){
		return weight;
	}

	public void setShoes(List<Gear> shoes){
		this.shoes = shoes;
	}

	public List<Gear> getShoes(){
		return shoes;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getLastname(){
		return lastname;
	}

	public void setBadgeTypeId(int badgeTypeId){
		this.badgeTypeId = badgeTypeId;
	}

	public int getBadgeTypeId(){
		return badgeTypeId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return
			"Athlete{" +
			"country = '" + country + '\'' +
			",profile_medium = '" + profileMedium + '\'' +
			",firstname = '" + firstname + '\'' +
			",date_preference = '" + datePreference + '\'' +
			",city = '" + city + '\'' +
			",created_at = '" + createdAt + '\'' +
			",follower_count = '" + followerCount + '\'' +
			",premium = '" + premium + '\'' +
			",updated_at = '" + updatedAt + '\'' +
			",friend = '" + friend + '\'' +
			",mutual_friend_count = '" + mutualFriendCount + '\'' +
			",clubs = '" + clubs + '\'' +
			",id = '" + id + '\'' +
			",state = '" + state + '\'' +
			",friend_count = '" + friendCount + '\'' +
			",email = '" + email + '\'' +
			",follower = '" + follower + '\'' +
			",athlete_type = '" + athleteType + '\'' +
			",ftp = '" + ftp + '\'' +
			",bikes = '" + bikes + '\'' +
			",resource_state = '" + resourceState + '\'' +
			",sex = '" + sex + '\'' +
			",profile = '" + profile + '\'' +
			",measurement_preference = '" + measurementPreference + '\'' +
			",weight = '" + weight + '\'' +
			",shoes = '" + shoes + '\'' +
			",lastname = '" + lastname + '\'' +
			",badge_type_id = '" + badgeTypeId + '\'' +
			",username = '" + username + '\'' +
			"}";
		}
}