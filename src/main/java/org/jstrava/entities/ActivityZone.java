package org.jstrava.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ActivityZone{

	@SerializedName("score")
	private int score;

	@SerializedName("sensor_based")
	private boolean sensorBased;

	@SerializedName("custom_zones")
	private boolean customZones;

	@SerializedName("max")
	private int max;

	@SerializedName("distribution_buckets")
	private List<DistributionBucketsItem> distributionBuckets;

	@SerializedName("type")
	private String type;

	@SerializedName("points")
	private int points;

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return score;
	}

	public void setSensorBased(boolean sensorBased){
		this.sensorBased = sensorBased;
	}

	public boolean isSensorBased(){
		return sensorBased;
	}

	public void setCustomZones(boolean customZones){
		this.customZones = customZones;
	}

	public boolean isCustomZones(){
		return customZones;
	}

	public void setMax(int max){
		this.max = max;
	}

	public int getMax(){
		return max;
	}

	public void setDistributionBuckets(List<DistributionBucketsItem> distributionBuckets){
		this.distributionBuckets = distributionBuckets;
	}

	public List<DistributionBucketsItem> getDistributionBuckets(){
		return distributionBuckets;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setPoints(int points){
		this.points = points;
	}

	public int getPoints(){
		return points;
	}

	@Override
 	public String toString(){
		return 
			"ActivityZone{" + 
			"score = '" + score + '\'' + 
			",sensor_based = '" + sensorBased + '\'' + 
			",custom_zones = '" + customZones + '\'' + 
			",max = '" + max + '\'' + 
			",distribution_buckets = '" + distributionBuckets + '\'' + 
			",type = '" + type + '\'' + 
			",points = '" + points + '\'' + 
			"}";
		}
}