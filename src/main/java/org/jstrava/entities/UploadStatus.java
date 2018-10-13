package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class UploadStatus{

	@SerializedName("activity_id")
	private int activityId;

	@SerializedName("external_id")
	private String externalId;

	@SerializedName("id")
	private int id;

	@SerializedName("error")
	private String error;

	@SerializedName("status")
	private String status;

	public void setActivityId(int activityId){
		this.activityId = activityId;
	}

	public int getActivityId(){
		return activityId;
	}

	public void setExternalId(String externalId){
		this.externalId = externalId;
	}

	public String getExternalId(){
		return externalId;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setError(String error){
		this.error = error;
	}

	public String getError(){
		return error;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"UploadStatus{" + 
			"activity_id = '" + activityId + '\'' + 
			",external_id = '" + externalId + '\'' + 
			",id = '" + id + '\'' + 
			",error = '" + error + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}