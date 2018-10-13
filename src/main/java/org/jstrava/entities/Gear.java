package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Gear{

	@SerializedName("distance")
	private int distance;

	@SerializedName("resource_state")
	private int resourceState;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("primary")
	private boolean primary;

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getDistance(){
		return distance;
	}

	public void setResourceState(int resourceState){
		this.resourceState = resourceState;
	}

	public int getResourceState(){
		return resourceState;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPrimary(boolean primary){
		this.primary = primary;
	}

	public boolean isPrimary(){
		return primary;
	}

	@Override
 	public String toString(){
		return 
			"Gear{" + 
			"distance = '" + distance + '\'' + 
			",resource_state = '" + resourceState + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",primary = '" + primary + '\'' + 
			"}";
		}
}