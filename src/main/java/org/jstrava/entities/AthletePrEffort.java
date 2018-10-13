package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AthletePrEffort{

	@SerializedName("distance")
	private int distance;

	@SerializedName("start_date_local")
	private String startDateLocal;

	@SerializedName("elapsed_time")
	private int elapsedTime;

	@SerializedName("is_kom")
	private boolean isKom;

	@SerializedName("id")
	private int id;

	@SerializedName("start_date")
	private String startDate;

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getDistance(){
		return distance;
	}

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

	public void setIsKom(boolean isKom){
		this.isKom = isKom;
	}

	public boolean isIsKom(){
		return isKom;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
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
			"AthletePrEffort{" + 
			"distance = '" + distance + '\'' + 
			",start_date_local = '" + startDateLocal + '\'' + 
			",elapsed_time = '" + elapsedTime + '\'' + 
			",is_kom = '" + isKom + '\'' + 
			",id = '" + id + '\'' + 
			",start_date = '" + startDate + '\'' + 
			"}";
		}
}