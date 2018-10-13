package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Club{

	@SerializedName("owner")
	private boolean owner;

	@SerializedName("profile_medium")
	private String profileMedium;

	@SerializedName("country")
	private String country;

	@SerializedName("private")
	private boolean privateClub;

	@SerializedName("featured")
	private boolean featured;

	@SerializedName("cover_photo")
	private String coverPhoto;

	@SerializedName("city")
	private String city;

	@SerializedName("owner_id")
	private int ownerId;

	@SerializedName("resource_state")
	private int resourceState;

	@SerializedName("profile")
	private String profile;

	@SerializedName("verified")
	private boolean verified;

	@SerializedName("admin")
	private boolean admin;

	@SerializedName("description")
	private String description;

	@SerializedName("membership")
	private String membership;

	@SerializedName("url")
	private String url;

	@SerializedName("following_count")
	private int followingCount;

	@SerializedName("name")
	private String name;

	@SerializedName("club_type")
	private String clubType;

	@SerializedName("id")
	private int id;

	@SerializedName("cover_photo_small")
	private String coverPhotoSmall;

	@SerializedName("state")
	private String state;

	@SerializedName("post_count")
	private int postCount;

	@SerializedName("member_count")
	private int memberCount;

	@SerializedName("sport_type")
	private String sportType;

	public void setOwner(boolean owner){
		this.owner = owner;
	}

	public boolean isOwner(){
		return owner;
	}

	public void setProfileMedium(String profileMedium){
		this.profileMedium = profileMedium;
	}

	public String getProfileMedium(){
		return profileMedium;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setPrivateClub(boolean privateClub){
		this.privateClub = privateClub;
	}

	public boolean isPrivateClub(){
		return privateClub;
	}

	public void setFeatured(boolean featured){
		this.featured = featured;
	}

	public boolean isFeatured(){
		return featured;
	}

	public void setCoverPhoto(String coverPhoto){
		this.coverPhoto = coverPhoto;
	}

	public String getCoverPhoto(){
		return coverPhoto;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setOwnerId(int ownerId){
		this.ownerId = ownerId;
	}

	public int getOwnerId(){
		return ownerId;
	}

	public void setResourceState(int resourceState){
		this.resourceState = resourceState;
	}

	public int getResourceState(){
		return resourceState;
	}

	public void setProfile(String profile){
		this.profile = profile;
	}

	public String getProfile(){
		return profile;
	}

	public void setVerified(boolean verified){
		this.verified = verified;
	}

	public boolean isVerified(){
		return verified;
	}

	public void setAdmin(boolean admin){
		this.admin = admin;
	}

	public boolean isAdmin(){
		return admin;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setMembership(String membership){
		this.membership = membership;
	}

	public String getMembership(){
		return membership;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setFollowingCount(int followingCount){
		this.followingCount = followingCount;
	}

	public int getFollowingCount(){
		return followingCount;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setClubType(String clubType){
		this.clubType = clubType;
	}

	public String getClubType(){
		return clubType;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCoverPhotoSmall(String coverPhotoSmall){
		this.coverPhotoSmall = coverPhotoSmall;
	}

	public String getCoverPhotoSmall(){
		return coverPhotoSmall;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setPostCount(int postCount){
		this.postCount = postCount;
	}

	public int getPostCount(){
		return postCount;
	}

	public void setMemberCount(int memberCount){
		this.memberCount = memberCount;
	}

	public int getMemberCount(){
		return memberCount;
	}

	public void setSportType(String sportType){
		this.sportType = sportType;
	}

	public String getSportType(){
		return sportType;
	}

	@Override
 	public String toString(){
		return 
			"Club{" + 
			"owner = '" + owner + '\'' + 
			",profile_medium = '" + profileMedium + '\'' + 
			",country = '" + country + '\'' + 
			",private = '" + privateClub + '\'' +
			",featured = '" + featured + '\'' + 
			",cover_photo = '" + coverPhoto + '\'' + 
			",city = '" + city + '\'' + 
			",owner_id = '" + ownerId + '\'' + 
			",resource_state = '" + resourceState + '\'' + 
			",profile = '" + profile + '\'' + 
			",verified = '" + verified + '\'' + 
			",admin = '" + admin + '\'' + 
			",description = '" + description + '\'' + 
			",membership = '" + membership + '\'' + 
			",url = '" + url + '\'' + 
			",following_count = '" + followingCount + '\'' + 
			",name = '" + name + '\'' + 
			",club_type = '" + clubType + '\'' + 
			",id = '" + id + '\'' + 
			",cover_photo_small = '" + coverPhotoSmall + '\'' + 
			",state = '" + state + '\'' + 
			",post_count = '" + postCount + '\'' + 
			",member_count = '" + memberCount + '\'' + 
			",sport_type = '" + sportType + '\'' + 
			"}";
		}
}