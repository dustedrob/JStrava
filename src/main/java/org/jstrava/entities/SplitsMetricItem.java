package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SplitsMetricItem{

	@SerializedName("pace_zone")
	private int paceZone;

	@SerializedName("split")
	private int split;

	@SerializedName("distance")
	private double distance;

	@SerializedName("elapsed_time")
	private int elapsedTime;

	@SerializedName("elevation_difference")
	private double elevationDifference;

	@SerializedName("average_speed")
	private double averageSpeed;

	@SerializedName("moving_time")
	private int movingTime;

	public void setPaceZone(int paceZone){
		this.paceZone = paceZone;
	}

	public int getPaceZone(){
		return paceZone;
	}

	public void setSplit(int split){
		this.split = split;
	}

	public int getSplit(){
		return split;
	}

	public void setDistance(double distance){
		this.distance = distance;
	}

	public double getDistance(){
		return distance;
	}

	public void setElapsedTime(int elapsedTime){
		this.elapsedTime = elapsedTime;
	}

	public int getElapsedTime(){
		return elapsedTime;
	}

	public void setElevationDifference(double elevationDifference){
		this.elevationDifference = elevationDifference;
	}

	public double getElevationDifference(){
		return elevationDifference;
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

	@Override
 	public String toString(){
		return 
			"SplitsMetricItem{" + 
			"pace_zone = '" + paceZone + '\'' + 
			",split = '" + split + '\'' + 
			",distance = '" + distance + '\'' + 
			",elapsed_time = '" + elapsedTime + '\'' + 
			",elevation_difference = '" + elevationDifference + '\'' + 
			",average_speed = '" + averageSpeed + '\'' + 
			",moving_time = '" + movingTime + '\'' + 
			"}";
		}
}