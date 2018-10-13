package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Map{

	@SerializedName("summary_polyline")
	private String summaryPolyline;

	@SerializedName("resource_state")
	private int resourceState;

	@SerializedName("id")
	private String id;

	@SerializedName("polyline")
	private String polyline;

	public void setSummaryPolyline(String summaryPolyline){
		this.summaryPolyline = summaryPolyline;
	}

	public String getSummaryPolyline(){
		return summaryPolyline;
	}

	public void setResourceState(int resourceState){
		this.resourceState = resourceState;
	}

	public int getResourceState(){
		return resourceState;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPolyline(String polyline){
		this.polyline = polyline;
	}

	public String getPolyline(){
		return polyline;
	}

	@Override
 	public String toString(){
		return 
			"Map{" + 
			"summary_polyline = '" + summaryPolyline + '\'' + 
			",resource_state = '" + resourceState + '\'' + 
			",id = '" + id + '\'' + 
			",polyline = '" + polyline + '\'' + 
			"}";
		}
}