package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Comment{

	@SerializedName("post_id")
	private Object postId;

	@SerializedName("mentions_metadata")
	private Object mentionsMetadata;

	@SerializedName("athlete")
	private Athlete athlete;

	@SerializedName("resource_state")
	private int resourceState;

	@SerializedName("activity_id")
	private long activityId;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private long id;

	@SerializedName("text")
	private String text;

	public void setPostId(Object postId){
		this.postId = postId;
	}

	public Object getPostId(){
		return postId;
	}

	public void setMentionsMetadata(Object mentionsMetadata){
		this.mentionsMetadata = mentionsMetadata;
	}

	public Object getMentionsMetadata(){
		return mentionsMetadata;
	}

	public void setAthlete(Athlete athlete){
		this.athlete = athlete;
	}

	public Athlete getAthlete(){
		return athlete;
	}

	public void setResourceState(int resourceState){
		this.resourceState = resourceState;
	}

	public int getResourceState(){
		return resourceState;
	}

	public void setActivityId(long activityId){
		this.activityId = activityId;
	}

	public long getActivityId(){
		return activityId;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"Comment{" + 
			"post_id = '" + postId + '\'' + 
			",mentions_metadata = '" + mentionsMetadata + '\'' + 
			",athlete = '" + athlete + '\'' + 
			",resource_state = '" + resourceState + '\'' + 
			",activity_id = '" + activityId + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}