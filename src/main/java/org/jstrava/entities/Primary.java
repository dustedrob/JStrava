package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Primary{

	@SerializedName("urls")
	private Urls urls;

	@SerializedName("unique_id")
	private String uniqueId;

	@SerializedName("id")
	private Object id;

	@SerializedName("source")
	private int source;

	public void setUrls(Urls urls){
		this.urls = urls;
	}

	public Urls getUrls(){
		return urls;
	}

	public void setUniqueId(String uniqueId){
		this.uniqueId = uniqueId;
	}

	public String getUniqueId(){
		return uniqueId;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	public void setSource(int source){
		this.source = source;
	}

	public int getSource(){
		return source;
	}

	@Override
 	public String toString(){
		return 
			"Primary{" + 
			"urls = '" + urls + '\'' + 
			",unique_id = '" + uniqueId + '\'' + 
			",id = '" + id + '\'' + 
			",source = '" + source + '\'' + 
			"}";
		}
}