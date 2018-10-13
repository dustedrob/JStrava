package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class HighlightedKudosersItem{

	@SerializedName("avatar_url")
	private String avatarUrl;

	@SerializedName("show_name")
	private boolean showName;

	@SerializedName("destination_url")
	private String destinationUrl;

	@SerializedName("display_name")
	private String displayName;

	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public void setShowName(boolean showName){
		this.showName = showName;
	}

	public boolean isShowName(){
		return showName;
	}

	public void setDestinationUrl(String destinationUrl){
		this.destinationUrl = destinationUrl;
	}

	public String getDestinationUrl(){
		return destinationUrl;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	@Override
 	public String toString(){
		return 
			"HighlightedKudosersItem{" + 
			"avatar_url = '" + avatarUrl + '\'' + 
			",show_name = '" + showName + '\'' + 
			",destination_url = '" + destinationUrl + '\'' + 
			",display_name = '" + displayName + '\'' + 
			"}";
		}
}