package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class YtdSwimTotals{

	@SerializedName("distance")
	private int distance;

	@SerializedName("achievement_count")
	private int achievementCount;

	@SerializedName("count")
	private int count;

	@SerializedName("elapsed_time")
	private int elapsedTime;

	@SerializedName("elevation_gain")
	private int elevationGain;

	@SerializedName("moving_time")
	private int movingTime;

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getDistance(){
		return distance;
	}

	public void setAchievementCount(int achievementCount){
		this.achievementCount = achievementCount;
	}

	public int getAchievementCount(){
		return achievementCount;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setElapsedTime(int elapsedTime){
		this.elapsedTime = elapsedTime;
	}

	public int getElapsedTime(){
		return elapsedTime;
	}

	public void setElevationGain(int elevationGain){
		this.elevationGain = elevationGain;
	}

	public int getElevationGain(){
		return elevationGain;
	}

	public void setMovingTime(int movingTime){
		this.movingTime = movingTime;
	}

	public int getMovingTime(){
		return movingTime;
	}

	@Override
 	public String toString(){
		return 
			"YtdSwimTotals{" + 
			"distance = '" + distance + '\'' + 
			",achievement_count = '" + achievementCount + '\'' + 
			",count = '" + count + '\'' + 
			",elapsed_time = '" + elapsedTime + '\'' + 
			",elevation_gain = '" + elevationGain + '\'' + 
			",moving_time = '" + movingTime + '\'' + 
			"}";
		}
}