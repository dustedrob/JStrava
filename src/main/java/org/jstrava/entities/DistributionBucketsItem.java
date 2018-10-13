package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DistributionBucketsItem{

	@SerializedName("min")
	private int min;

	@SerializedName("max")
	private int max;

	@SerializedName("time")
	private int time;

	public void setMin(int min){
		this.min = min;
	}

	public int getMin(){
		return min;
	}

	public void setMax(int max){
		this.max = max;
	}

	public int getMax(){
		return max;
	}

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return time;
	}

	@Override
 	public String toString(){
		return 
			"DistributionBucketsItem{" + 
			"min = '" + min + '\'' + 
			",max = '" + max + '\'' + 
			",time = '" + time + '\'' + 
			"}";
		}
}