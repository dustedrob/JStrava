package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Photos{

	@SerializedName("count")
	private int count;

	@SerializedName("use_primary_photo")
	private boolean usePrimaryPhoto;

	@SerializedName("primary")
	private Primary primary;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setUsePrimaryPhoto(boolean usePrimaryPhoto){
		this.usePrimaryPhoto = usePrimaryPhoto;
	}

	public boolean isUsePrimaryPhoto(){
		return usePrimaryPhoto;
	}

	public void setPrimary(Primary primary){
		this.primary = primary;
	}

	public Primary getPrimary(){
		return primary;
	}

	@Override
 	public String toString(){
		return 
			"Photos{" + 
			"count = '" + count + '\'' + 
			",use_primary_photo = '" + usePrimaryPhoto + '\'' + 
			",primary = '" + primary + '\'' + 
			"}";
		}
}