package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class EntriesItem{

	@SerializedName("start_date_local")
	private String startDateLocal;

	@SerializedName("elapsed_time")
	private int elapsedTime;

	@SerializedName("rank")
	private int rank;

	@SerializedName("athlete_name")
	private String athleteName;

	@SerializedName("moving_time")
	private int movingTime;

	@SerializedName("start_date")
	private String startDate;

	public void setStartDateLocal(String startDateLocal){
		this.startDateLocal = startDateLocal;
	}

	public String getStartDateLocal(){
		return startDateLocal;
	}

	public void setElapsedTime(int elapsedTime){
		this.elapsedTime = elapsedTime;
	}

	public int getElapsedTime(){
		return elapsedTime;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	public void setAthleteName(String athleteName){
		this.athleteName = athleteName;
	}

	public String getAthleteName(){
		return athleteName;
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
			"EntriesItem{" + 
			"start_date_local = '" + startDateLocal + '\'' + 
			",elapsed_time = '" + elapsedTime + '\'' + 
			",rank = '" + rank + '\'' + 
			",athlete_name = '" + athleteName + '\'' + 
			",moving_time = '" + movingTime + '\'' + 
			",start_date = '" + startDate + '\'' + 
			"}";
		}
}