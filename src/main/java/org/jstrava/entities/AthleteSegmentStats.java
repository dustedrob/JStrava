package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AthleteSegmentStats{

	@SerializedName("pr_elapsed_time")
	private int prElapsedTime;

	@SerializedName("pr_date")
	private String prDate;

	@SerializedName("effort_count")
	private int effortCount;

	public void setPrElapsedTime(int prElapsedTime){
		this.prElapsedTime = prElapsedTime;
	}

	public int getPrElapsedTime(){
		return prElapsedTime;
	}

	public void setPrDate(String prDate){
		this.prDate = prDate;
	}

	public String getPrDate(){
		return prDate;
	}

	public void setEffortCount(int effortCount){
		this.effortCount = effortCount;
	}

	public int getEffortCount(){
		return effortCount;
	}

	@Override
 	public String toString(){
		return 
			"AthleteSegmentStats{" + 
			"pr_elapsed_time = '" + prElapsedTime + '\'' + 
			",pr_date = '" + prDate + '\'' + 
			",effort_count = '" + effortCount + '\'' + 
			"}";
		}
}