package org.jstrava.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SegmentEffort {

	@SerializedName("average_cadence")
	private double averageCadence;

	@SerializedName("kom_rank")
	private Object komRank;

	@SerializedName("achievements")
	private List<Object> achievements;

	@SerializedName("activity")
	private Activity activity;

	@SerializedName("distance")
	private double distance;

	@SerializedName("hidden")
	private boolean hidden;

	@SerializedName("athlete")
	private Athlete athlete;

	@SerializedName("resource_state")
	private int resourceState;

	@SerializedName("start_date_local")
	private String startDateLocal;

	@SerializedName("end_index")
	private int endIndex;

	@SerializedName("device_watts")
	private boolean deviceWatts;

	@SerializedName("average_watts")
	private double averageWatts;

	@SerializedName("start_index")
	private int startIndex;

	@SerializedName("segment")
	private Segment segment;

	@SerializedName("name")
	private String name;

	@SerializedName("elapsed_time")
	private int elapsedTime;

	@SerializedName("id")
	private long id;

	@SerializedName("pr_rank")
	private Object prRank;

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

	public void setKomRank(Object komRank){
		this.komRank = komRank;
	}

	public Object getKomRank(){
		return komRank;
	}

	public void setAchievements(List<Object> achievements){
		this.achievements = achievements;
	}

	public List<Object> getAchievements(){
		return achievements;
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

	public void setHidden(boolean hidden){
		this.hidden = hidden;
	}

	public boolean isHidden(){
		return hidden;
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

	public void setDeviceWatts(boolean deviceWatts){
		this.deviceWatts = deviceWatts;
	}

	public boolean isDeviceWatts(){
		return deviceWatts;
	}

	public void setAverageWatts(double averageWatts){
		this.averageWatts = averageWatts;
	}

	public double getAverageWatts(){
		return averageWatts;
	}

	public void setStartIndex(int startIndex){
		this.startIndex = startIndex;
	}

	public int getStartIndex(){
		return startIndex;
	}

	public void setSegment(Segment segment){
		this.segment = segment;
	}

	public Segment getSegment(){
		return segment;
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

	public void setPrRank(Object prRank){
		this.prRank = prRank;
	}

	public Object getPrRank(){
		return prRank;
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
			"SegmentEffort{" +
			"average_cadence = '" + averageCadence + '\'' + 
			",kom_rank = '" + komRank + '\'' + 
			",achievements = '" + achievements + '\'' + 
			",activity = '" + activity + '\'' + 
			",distance = '" + distance + '\'' + 
			",hidden = '" + hidden + '\'' + 
			",athlete = '" + athlete + '\'' + 
			",resource_state = '" + resourceState + '\'' + 
			",start_date_local = '" + startDateLocal + '\'' + 
			",end_index = '" + endIndex + '\'' + 
			",device_watts = '" + deviceWatts + '\'' + 
			",average_watts = '" + averageWatts + '\'' + 
			",start_index = '" + startIndex + '\'' + 
			",segment = '" + segment + '\'' + 
			",name = '" + name + '\'' + 
			",elapsed_time = '" + elapsedTime + '\'' + 
			",id = '" + id + '\'' + 
			",pr_rank = '" + prRank + '\'' + 
			",moving_time = '" + movingTime + '\'' + 
			",start_date = '" + startDate + '\'' + 
			"}";
		}
}