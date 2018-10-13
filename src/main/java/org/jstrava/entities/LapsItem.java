package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LapsItem{

	@SerializedName("average_cadence")
	private double averageCadence;

	@SerializedName("activity")
	private Activity activity;

	@SerializedName("distance")
	private double distance;

	@SerializedName("athlete")
	private Athlete athlete;

	@SerializedName("resource_state")
	private int resourceState;

	@SerializedName("start_date_local")
	private String startDateLocal;

	@SerializedName("end_index")
	private int endIndex;

	@SerializedName("max_speed")
	private double maxSpeed;

	@SerializedName("device_watts")
	private boolean deviceWatts;

	@SerializedName("total_elevation_gain")
	private int totalElevationGain;

	@SerializedName("lap_index")
	private int lapIndex;

	@SerializedName("average_watts")
	private double averageWatts;

	@SerializedName("split")
	private int split;

	@SerializedName("start_index")
	private int startIndex;

	@SerializedName("name")
	private String name;

	@SerializedName("elapsed_time")
	private int elapsedTime;

	@SerializedName("id")
	private long id;

	@SerializedName("average_speed")
	private double averageSpeed;

	@SerializedName("moving_time")
	private int movingTime;

	@SerializedName("start_date")
	private String startDate;

	public void setAverageCadence(double averageCadence){
		this.averageCadence = averageCadence;
	}

	public double getAverageCadence(){
		return averageCadence;
	}

	public void setActivity(Activity activity){
		this.activity = activity;
	}

	public Activity getActivity(){
		return activity;
	}

	public void setDistance(double distance){
		this.distance = distance;
	}

	public double getDistance(){
		return distance;
	}

	public void setAthlete(Athlete athlete){
		this.athlete = athlete;
	}

	public Athlete getAthlete(){
		return athlete;
	}

	public void setResourceState(int resourceState){
		this.resourceState = resourceState;
	}

	public int getResourceState(){
		return resourceState;
	}

	public void setStartDateLocal(String startDateLocal){
		this.startDateLocal = startDateLocal;
	}

	public String getStartDateLocal(){
		return startDateLocal;
	}

	public void setEndIndex(int endIndex){
		this.endIndex = endIndex;
	}

	public int getEndIndex(){
		return endIndex;
	}

	public void setMaxSpeed(double maxSpeed){
		this.maxSpeed = maxSpeed;
	}

	public double getMaxSpeed(){
		return maxSpeed;
	}

	public void setDeviceWatts(boolean deviceWatts){
		this.deviceWatts = deviceWatts;
	}

	public boolean isDeviceWatts(){
		return deviceWatts;
	}

	public void setTotalElevationGain(int totalElevationGain){
		this.totalElevationGain = totalElevationGain;
	}

	public int getTotalElevationGain(){
		return totalElevationGain;
	}

	public void setLapIndex(int lapIndex){
		this.lapIndex = lapIndex;
	}

	public int getLapIndex(){
		return lapIndex;
	}

	public void setAverageWatts(double averageWatts){
		this.averageWatts = averageWatts;
	}

	public double getAverageWatts(){
		return averageWatts;
	}

	public void setSplit(int split){
		this.split = split;
	}

	public int getSplit(){
		return split;
	}

	public void setStartIndex(int startIndex){
		this.startIndex = startIndex;
	}

	public int getStartIndex(){
		return startIndex;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setElapsedTime(int elapsedTime){
		this.elapsedTime = elapsedTime;
	}

	public int getElapsedTime(){
		return elapsedTime;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setAverageSpeed(double averageSpeed){
		this.averageSpeed = averageSpeed;
	}

	public double getAverageSpeed(){
		return averageSpeed;
	}

	public void setMovingTime(int movingTime){
		this.movingTime = movingTime;
	}

	public int getMovingTime(){
		return movingTime;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"LapsItem{" + 
			"average_cadence = '" + averageCadence + '\'' + 
			",activity = '" + activity + '\'' + 
			",distance = '" + distance + '\'' + 
			",athlete = '" + athlete + '\'' + 
			",resource_state = '" + resourceState + '\'' + 
			",start_date_local = '" + startDateLocal + '\'' + 
			",end_index = '" + endIndex + '\'' + 
			",max_speed = '" + maxSpeed + '\'' + 
			",device_watts = '" + deviceWatts + '\'' + 
			",total_elevation_gain = '" + totalElevationGain + '\'' + 
			",lap_index = '" + lapIndex + '\'' + 
			",average_watts = '" + averageWatts + '\'' + 
			",split = '" + split + '\'' + 
			",start_index = '" + startIndex + '\'' + 
			",name = '" + name + '\'' + 
			",elapsed_time = '" + elapsedTime + '\'' + 
			",id = '" + id + '\'' + 
			",average_speed = '" + averageSpeed + '\'' + 
			",moving_time = '" + movingTime + '\'' + 
			",start_date = '" + startDate + '\'' + 
			"}";
		}
}