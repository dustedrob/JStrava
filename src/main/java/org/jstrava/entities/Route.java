package org.jstrava.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Route{

	@SerializedName("private")
	private boolean privateRoute;

	@SerializedName("distance")
	private int distance;

	@SerializedName("athlete")
	private Athlete athlete;

	@SerializedName("description")
	private String description;

	@SerializedName("elevation_gain")
	private int elevationGain;

	@SerializedName("type")
	private int type;

	@SerializedName("segments")
	private List<Segment> segments;

	@SerializedName("starred")
	private boolean starred;

	@SerializedName("directions")
	private List<DirectionsItem> directions;

	@SerializedName("sub_type")
	private int subType;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("map")
	private Map map;

	@SerializedName("timestamp")
	private int timestamp;

	public void setPrivateRoute(boolean privateRoute){
		this.privateRoute = privateRoute;
	}

	public boolean isPrivateRoute(){
		return privateRoute;
	}

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getDistance(){
		return distance;
	}

	public void setAthlete(Athlete athlete){
		this.athlete = athlete;
	}

	public Athlete getAthlete(){
		return athlete;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setElevationGain(int elevationGain){
		this.elevationGain = elevationGain;
	}

	public int getElevationGain(){
		return elevationGain;
	}

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public void setSegments(List<Segment> segments){
		this.segments = segments;
	}

	public List<Segment> getSegments(){
		return segments;
	}

	public void setStarred(boolean starred){
		this.starred = starred;
	}

	public boolean isStarred(){
		return starred;
	}

	public void setDirections(List<DirectionsItem> directions){
		this.directions = directions;
	}

	public List<DirectionsItem> getDirections(){
		return directions;
	}

	public void setSubType(int subType){
		this.subType = subType;
	}

	public int getSubType(){
		return subType;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setMap(Map map){
		this.map = map;
	}

	public Map getMap(){
		return map;
	}

	public void setTimestamp(int timestamp){
		this.timestamp = timestamp;
	}

	public int getTimestamp(){
		return timestamp;
	}

	@Override
 	public String toString(){
		return 
			"Route{" + 
			"private = '" + privateRoute + '\'' +
			",distance = '" + distance + '\'' + 
			",athlete = '" + athlete + '\'' + 
			",description = '" + description + '\'' + 
			",elevation_gain = '" + elevationGain + '\'' + 
			",type = '" + type + '\'' + 
			",segments = '" + segments + '\'' + 
			",starred = '" + starred + '\'' + 
			",directions = '" + directions + '\'' + 
			",sub_type = '" + subType + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",map = '" + map + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			"}";
		}
}