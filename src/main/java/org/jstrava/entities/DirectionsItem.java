package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DirectionsItem{

	@SerializedName("distance")
	private int distance;

	@SerializedName("name")
	private String name;

	@SerializedName("action")
	private int action;

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getDistance(){
		return distance;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAction(int action){
		this.action = action;
	}

	public int getAction(){
		return action;
	}

	@Override
 	public String toString(){
		return 
			"DirectionsItem{" + 
			"distance = '" + distance + '\'' + 
			",name = '" + name + '\'' + 
			",action = '" + action + '\'' + 
			"}";
		}
}