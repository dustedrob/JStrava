package org.jstrava.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Segment{

	@SerializedName("country")
	private String country;

	@SerializedName("private")
	private boolean privateSegment;

	@SerializedName("distance")
	private double distance;

	@SerializedName("average_grade")
	private double averageGrade;

	@SerializedName("maximum_grade")
	private double maximumGrade;

	@SerializedName("climb_category")
	private int climbCategory;

	@SerializedName("city")
	private String city;

	@SerializedName("end_longitude")
	private double endLongitude;

	@SerializedName("resource_state")
	private int resourceState;

	@SerializedName("hazardous")
	private boolean hazardous;

	@SerializedName("elevation_high")
	private double elevationHigh;

	@SerializedName("end_latitude")
	private double endLatitude;

	@SerializedName("start_latlng")
	private List<Double> startLatlng;

	@SerializedName("start_longitude")
	private double startLongitude;

	@SerializedName("elevation_low")
	private double elevationLow;

	@SerializedName("starred")
	private boolean starred;

	@SerializedName("end_latlng")
	private List<Double> endLatlng;

	@SerializedName("start_latitude")
	private double startLatitude;

	@SerializedName("activity_type")
	private String activityType;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("state")
	private String state;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setPrivateSegment(boolean privateSegment){
		this.privateSegment = privateSegment;
	}

	public boolean isPrivateSegment(){
		return privateSegment;
	}

	public void setDistance(double distance){
		this.distance = distance;
	}

	public double getDistance(){
		return distance;
	}

	public void setAverageGrade(double averageGrade){
		this.averageGrade = averageGrade;
	}

	public double getAverageGrade(){
		return averageGrade;
	}

	public void setMaximumGrade(double maximumGrade){
		this.maximumGrade = maximumGrade;
	}

	public double getMaximumGrade(){
		return maximumGrade;
	}

	public void setClimbCategory(int climbCategory){
		this.climbCategory = climbCategory;
	}

	public int getClimbCategory(){
		return climbCategory;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setEndLongitude(double endLongitude){
		this.endLongitude = endLongitude;
	}

	public double getEndLongitude(){
		return endLongitude;
	}

	public void setResourceState(int resourceState){
		this.resourceState = resourceState;
	}

	public int getResourceState(){
		return resourceState;
	}

	public void setHazardous(boolean hazardous){
		this.hazardous = hazardous;
	}

	public boolean isHazardous(){
		return hazardous;
	}

	public void setElevationHigh(double elevationHigh){
		this.elevationHigh = elevationHigh;
	}

	public double getElevationHigh(){
		return elevationHigh;
	}

	public void setEndLatitude(double endLatitude){
		this.endLatitude = endLatitude;
	}

	public double getEndLatitude(){
		return endLatitude;
	}

	public void setStartLatlng(List<Double> startLatlng){
		this.startLatlng = startLatlng;
	}

	public List<Double> getStartLatlng(){
		return startLatlng;
	}

	public void setStartLongitude(double startLongitude){
		this.startLongitude = startLongitude;
	}

	public double getStartLongitude(){
		return startLongitude;
	}

	public void setElevationLow(double elevationLow){
		this.elevationLow = elevationLow;
	}

	public double getElevationLow(){
		return elevationLow;
	}

	public void setStarred(boolean starred){
		this.starred = starred;
	}

	public boolean isStarred(){
		return starred;
	}

	public void setEndLatlng(List<Double> endLatlng){
		this.endLatlng = endLatlng;
	}

	public List<Double> getEndLatlng(){
		return endLatlng;
	}

	public void setStartLatitude(double startLatitude){
		this.startLatitude = startLatitude;
	}

	public double getStartLatitude(){
		return startLatitude;
	}

	public void setActivityType(String activityType){
		this.activityType = activityType;
	}

	public String getActivityType(){
		return activityType;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	@Override
 	public String toString(){
		return 
			"Segment{" + 
			"country = '" + country + '\'' + 
			",private = '" + privateSegment + '\'' +
			",distance = '" + distance + '\'' + 
			",average_grade = '" + averageGrade + '\'' + 
			",maximum_grade = '" + maximumGrade + '\'' + 
			",climb_category = '" + climbCategory + '\'' + 
			",city = '" + city + '\'' + 
			",end_longitude = '" + endLongitude + '\'' + 
			",resource_state = '" + resourceState + '\'' + 
			",hazardous = '" + hazardous + '\'' + 
			",elevation_high = '" + elevationHigh + '\'' + 
			",end_latitude = '" + endLatitude + '\'' + 
			",start_latlng = '" + startLatlng + '\'' + 
			",start_longitude = '" + startLongitude + '\'' + 
			",elevation_low = '" + elevationLow + '\'' + 
			",starred = '" + starred + '\'' + 
			",end_latlng = '" + endLatlng + '\'' + 
			",start_latitude = '" + startLatitude + '\'' + 
			",activity_type = '" + activityType + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",state = '" + state + '\'' + 
			"}";
		}
}