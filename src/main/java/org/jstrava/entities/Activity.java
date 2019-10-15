package org.jstrava.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Activity{

	@SerializedName("comment_count")
	private int commentCount;

	@SerializedName("highlighted_kudosers")
	private List<HighlightedKudosersItem> highlightedKudosers;

	@SerializedName("segment_efforts")
	private List<SegmentEffort> segmentEfforts;

	@SerializedName("has_kudoed")
	private boolean hasKudoed;

	@SerializedName("laps")
	private List<LapsItem> laps;

	@SerializedName("device_watts")
	private boolean deviceWatts;

	@SerializedName("type")
	private String type;

	@SerializedName("photos")
	private Photos photos;

	@SerializedName("end_latlng")
	private List<Double> endLatlng;

	@SerializedName("splits_metric")
	private List<SplitsMetricItem> splitsMetric;

	@SerializedName("id")
	private long id;

	@SerializedName("kudos_count")
	private int kudosCount;

	@SerializedName("kilojoules")
	private double kilojoules;

	@SerializedName("athlete")
	private Athlete athlete;

	@SerializedName("athlete_count")
	private int athleteCount;

	@SerializedName("resource_state")
	private int resourceState;

	@SerializedName("max_speed")
	private double maxSpeed;

	@SerializedName("from_accepted_tag")
	private boolean fromAcceptedTag;

	@SerializedName("start_latlng")
	private List<Double> startLatlng;

	@SerializedName("achievement_count")
	private int achievementCount;

	@SerializedName("name")
	private String name;

	@SerializedName("embed_token")
	private String embedToken;

	@SerializedName("commute")
	private boolean commute;

	@SerializedName("gear")
	private Gear gear;

	@SerializedName("utc_offset")
	private int utcOffset;

	@SerializedName("average_cadence")
	private double averageCadence;

	@SerializedName("upload_id")
	private long uploadId;

	@SerializedName("private")
	private boolean privateActivity;

	@SerializedName("distance")
	private int distance;

	@SerializedName("timezone")
	private String timezone;

	@SerializedName("location_country")
	private String locationCountry;

	@SerializedName("has_heartrate")
	private boolean hasHeartrate;

	@SerializedName("description")
	private String description;

	@SerializedName("external_id")
	private String externalId;

	@SerializedName("location_state")
	private Object locationState;

	@SerializedName("manual")
	private boolean manual;

	@SerializedName("gear_id")
	private String gearId;

	@SerializedName("elev_low")
	private double elevLow;

	@SerializedName("device_name")
	private String deviceName;

	@SerializedName("flagged")
	private boolean flagged;

	@SerializedName("start_latitude")
	private double startLatitude;

	@SerializedName("trainer")
	private boolean trainer;

	@SerializedName("location_city")
	private Object locationCity;

	@SerializedName("total_photo_count")
	private int totalPhotoCount;

	@SerializedName("workout_type")
	private int workoutType;

	@SerializedName("elapsed_time")
	private int elapsedTime;

	@SerializedName("map")
	private Map map;

	@SerializedName("average_speed")
	private double averageSpeed;

	@SerializedName("average_temp")
	private int averageTemp;

	@SerializedName("moving_time")
	private int movingTime;

	@SerializedName("start_date")
	private String startDate;

	@SerializedName("pr_count")
	private int prCount;

	@SerializedName("start_date_local")
	private String startDateLocal;

	@SerializedName("calories")
	private double calories;

	@SerializedName("total_elevation_gain")
	private double totalElevationGain;

	@SerializedName("average_watts")
	private double averageWatts;

	@SerializedName("segment_leaderboard_opt_out")
	private boolean segmentLeaderboardOptOut;

	@SerializedName("start_longitude")
	private double startLongitude;

	@SerializedName("photo_count")
	private int photoCount;

	@SerializedName("elev_high")
	private double elevHigh;

	@SerializedName("leaderboard_opt_out")
	private boolean leaderboardOptOut;

	@SerializedName("suffer_score")
	private Object sufferScore;

	@SerializedName("partner_brand_tag")
	private Object partnerBrandTag;

	@SerializedName("max_watts")
	private int maxWatts;

	@SerializedName("weighted_average_watts")
	private int weightedAverageWatts;

	public void setCommentCount(int commentCount){
		this.commentCount = commentCount;
	}

	public int getCommentCount(){
		return commentCount;
	}

	public void setHighlightedKudosers(List<HighlightedKudosersItem> highlightedKudosers){
		this.highlightedKudosers = highlightedKudosers;
	}

	public List<HighlightedKudosersItem> getHighlightedKudosers(){
		return highlightedKudosers;
	}

	public void setSegmentEfforts(List<SegmentEffort> segmentEfforts){
		this.segmentEfforts = segmentEfforts;
	}

	public List<SegmentEffort> getSegmentEfforts(){
		return segmentEfforts;
	}

	public void setHasKudoed(boolean hasKudoed){
		this.hasKudoed = hasKudoed;
	}

	public boolean isHasKudoed(){
		return hasKudoed;
	}

	public void setLaps(List<LapsItem> laps){
		this.laps = laps;
	}

	public List<LapsItem> getLaps(){
		return laps;
	}

	public void setDeviceWatts(boolean deviceWatts){
		this.deviceWatts = deviceWatts;
	}

	public boolean isDeviceWatts(){
		return deviceWatts;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setPhotos(Photos photos){
		this.photos = photos;
	}

	public Photos getPhotos(){
		return photos;
	}

	public void setEndLatlng(List<Double> endLatlng){
		this.endLatlng = endLatlng;
	}

	public List<Double> getEndLatlng(){
		return endLatlng;
	}

	public void setSplitsMetric(List<SplitsMetricItem> splitsMetric){
		this.splitsMetric = splitsMetric;
	}

	public List<SplitsMetricItem> getSplitsMetric(){
		return splitsMetric;
	}

	public void setId(int id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setKudosCount(int kudosCount){
		this.kudosCount = kudosCount;
	}

	public int getKudosCount(){
		return kudosCount;
	}

	public void setKilojoules(double kilojoules){
		this.kilojoules = kilojoules;
	}

	public double getKilojoules(){
		return kilojoules;
	}

	public void setAthlete(Athlete athlete){
		this.athlete = athlete;
	}

	public Athlete getAthlete(){
		return athlete;
	}

	public void setAthleteCount(int athleteCount){
		this.athleteCount = athleteCount;
	}

	public int getAthleteCount(){
		return athleteCount;
	}

	public void setResourceState(int resourceState){
		this.resourceState = resourceState;
	}

	public int getResourceState(){
		return resourceState;
	}

	public void setMaxSpeed(double maxSpeed){
		this.maxSpeed = maxSpeed;
	}

	public double getMaxSpeed(){
		return maxSpeed;
	}

	public void setFromAcceptedTag(boolean fromAcceptedTag){
		this.fromAcceptedTag = fromAcceptedTag;
	}

	public boolean isFromAcceptedTag(){
		return fromAcceptedTag;
	}

	public void setStartLatlng(List<Double> startLatlng){
		this.startLatlng = startLatlng;
	}

	public List<Double> getStartLatlng(){
		return startLatlng;
	}

	public void setAchievementCount(int achievementCount){
		this.achievementCount = achievementCount;
	}

	public int getAchievementCount(){
		return achievementCount;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmbedToken(String embedToken){
		this.embedToken = embedToken;
	}

	public String getEmbedToken(){
		return embedToken;
	}

	public void setCommute(boolean commute){
		this.commute = commute;
	}

	public boolean isCommute(){
		return commute;
	}

	public void setGear(Gear gear){
		this.gear = gear;
	}

	public Gear getGear(){
		return gear;
	}

	public void setUtcOffset(int utcOffset){
		this.utcOffset = utcOffset;
	}

	public int getUtcOffset(){
		return utcOffset;
	}

	public void setAverageCadence(double averageCadence){
		this.averageCadence = averageCadence;
	}

	public double getAverageCadence(){
		return averageCadence;
	}

	public void setUploadId(long uploadId){
		this.uploadId = uploadId;
	}

	public long getUploadId(){
		return uploadId;
	}

	public void setPrivateActivity(boolean privateActivity){
		this.privateActivity = privateActivity;
	}

	public boolean isPrivateActivity(){
		return privateActivity;
	}

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getDistance(){
		return distance;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setLocationCountry(String locationCountry){
		this.locationCountry = locationCountry;
	}

	public String getLocationCountry(){
		return locationCountry;
	}

	public void setHasHeartrate(boolean hasHeartrate){
		this.hasHeartrate = hasHeartrate;
	}

	public boolean isHasHeartrate(){
		return hasHeartrate;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setExternalId(String externalId){
		this.externalId = externalId;
	}

	public String getExternalId(){
		return externalId;
	}

	public void setLocationState(Object locationState){
		this.locationState = locationState;
	}

	public Object getLocationState(){
		return locationState;
	}

	public void setManual(boolean manual){
		this.manual = manual;
	}

	public boolean isManual(){
		return manual;
	}

	public void setGearId(String gearId){
		this.gearId = gearId;
	}

	public String getGearId(){
		return gearId;
	}

	public void setElevLow(double elevLow){
		this.elevLow = elevLow;
	}

	public double getElevLow(){
		return elevLow;
	}

	public void setDeviceName(String deviceName){
		this.deviceName = deviceName;
	}

	public String getDeviceName(){
		return deviceName;
	}

	public void setFlagged(boolean flagged){
		this.flagged = flagged;
	}

	public boolean isFlagged(){
		return flagged;
	}

	public void setStartLatitude(double startLatitude){
		this.startLatitude = startLatitude;
	}

	public double getStartLatitude(){
		return startLatitude;
	}

	public void setTrainer(boolean trainer){
		this.trainer = trainer;
	}

	public boolean isTrainer(){
		return trainer;
	}

	public void setLocationCity(Object locationCity){
		this.locationCity = locationCity;
	}

	public Object getLocationCity(){
		return locationCity;
	}

	public void setTotalPhotoCount(int totalPhotoCount){
		this.totalPhotoCount = totalPhotoCount;
	}

	public int getTotalPhotoCount(){
		return totalPhotoCount;
	}

	public void setWorkoutType(int workoutType){
		this.workoutType = workoutType;
	}

	public int getWorkoutType(){
		return workoutType;
	}

	public void setElapsedTime(int elapsedTime){
		this.elapsedTime = elapsedTime;
	}

	public int getElapsedTime(){
		return elapsedTime;
	}

	public void setMap(Map map){
		this.map = map;
	}

	public Map getMap(){
		return map;
	}

	public void setAverageSpeed(double averageSpeed){
		this.averageSpeed = averageSpeed;
	}

	public double getAverageSpeed(){
		return averageSpeed;
	}

	public void setAverageTemp(int averageTemp){
		this.averageTemp = averageTemp;
	}

	public int getAverageTemp(){
		return averageTemp;
	}

	public void setMovingTime(int movingTime){
		this.movingTime = movingTime;
	}

	public int getMovingTime(){
		return movingTime;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setPrCount(int prCount){
		this.prCount = prCount;
	}

	public int getPrCount(){
		return prCount;
	}

	public void setStartDateLocal(String startDateLocal){
		this.startDateLocal = startDateLocal;
	}

	public String getStartDateLocal(){
		return startDateLocal;
	}

	public void setCalories(double calories){
		this.calories = calories;
	}

	public double getCalories(){
		return calories;
	}

	public void setTotalElevationGain(int totalElevationGain){
		this.totalElevationGain = totalElevationGain;
	}

	public double getTotalElevationGain(){
		return totalElevationGain;
	}

	public void setAverageWatts(double averageWatts){
		this.averageWatts = averageWatts;
	}

	public double getAverageWatts(){
		return averageWatts;
	}

	public void setSegmentLeaderboardOptOut(boolean segmentLeaderboardOptOut){
		this.segmentLeaderboardOptOut = segmentLeaderboardOptOut;
	}

	public boolean isSegmentLeaderboardOptOut(){
		return segmentLeaderboardOptOut;
	}

	public void setStartLongitude(double startLongitude){
		this.startLongitude = startLongitude;
	}

	public double getStartLongitude(){
		return startLongitude;
	}

	public void setPhotoCount(int photoCount){
		this.photoCount = photoCount;
	}

	public int getPhotoCount(){
		return photoCount;
	}

	public void setElevHigh(double elevHigh){
		this.elevHigh = elevHigh;
	}

	public double getElevHigh(){
		return elevHigh;
	}

	public void setLeaderboardOptOut(boolean leaderboardOptOut){
		this.leaderboardOptOut = leaderboardOptOut;
	}

	public boolean isLeaderboardOptOut(){
		return leaderboardOptOut;
	}

	public void setSufferScore(Object sufferScore){
		this.sufferScore = sufferScore;
	}

	public Object getSufferScore(){
		return sufferScore;
	}

	public void setPartnerBrandTag(Object partnerBrandTag){
		this.partnerBrandTag = partnerBrandTag;
	}

	public Object getPartnerBrandTag(){
		return partnerBrandTag;
	}

	public void setMaxWatts(int maxWatts){
		this.maxWatts = maxWatts;
	}

	public int getMaxWatts(){
		return maxWatts;
	}

	public void setWeightedAverageWatts(int weightedAverageWatts){
		this.weightedAverageWatts = weightedAverageWatts;
	}

	public int getWeightedAverageWatts(){
		return weightedAverageWatts;
	}

	@Override
 	public String toString(){
		return 
			"Activity{" + 
			"comment_count = '" + commentCount + '\'' + 
			",highlighted_kudosers = '" + highlightedKudosers + '\'' + 
			",segment_efforts = '" + segmentEfforts + '\'' + 
			",has_kudoed = '" + hasKudoed + '\'' + 
			",laps = '" + laps + '\'' + 
			",device_watts = '" + deviceWatts + '\'' + 
			",type = '" + type + '\'' + 
			",photos = '" + photos + '\'' + 
			",end_latlng = '" + endLatlng + '\'' + 
			",splits_metric = '" + splitsMetric + '\'' + 
			",id = '" + id + '\'' + 
			",kudos_count = '" + kudosCount + '\'' + 
			",kilojoules = '" + kilojoules + '\'' + 
			",athlete = '" + athlete + '\'' + 
			",athlete_count = '" + athleteCount + '\'' + 
			",resource_state = '" + resourceState + '\'' + 
			",max_speed = '" + maxSpeed + '\'' + 
			",from_accepted_tag = '" + fromAcceptedTag + '\'' + 
			",start_latlng = '" + startLatlng + '\'' + 
			",achievement_count = '" + achievementCount + '\'' + 
			",name = '" + name + '\'' + 
			",embed_token = '" + embedToken + '\'' + 
			",commute = '" + commute + '\'' + 
			",gear = '" + gear + '\'' + 
			",utc_offset = '" + utcOffset + '\'' + 
			",average_cadence = '" + averageCadence + '\'' + 
			",upload_id = '" + uploadId + '\'' + 
			",private = '" + privateActivity + '\'' +
			",distance = '" + distance + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",location_country = '" + locationCountry + '\'' + 
			",has_heartrate = '" + hasHeartrate + '\'' + 
			",description = '" + description + '\'' + 
			",external_id = '" + externalId + '\'' + 
			",location_state = '" + locationState + '\'' + 
			",manual = '" + manual + '\'' + 
			",gear_id = '" + gearId + '\'' + 
			",elev_low = '" + elevLow + '\'' + 
			",device_name = '" + deviceName + '\'' + 
			",flagged = '" + flagged + '\'' + 
			",start_latitude = '" + startLatitude + '\'' + 
			",trainer = '" + trainer + '\'' + 
			",location_city = '" + locationCity + '\'' + 
			",total_photo_count = '" + totalPhotoCount + '\'' + 
			",workout_type = '" + workoutType + '\'' + 
			",elapsed_time = '" + elapsedTime + '\'' + 
			",map = '" + map + '\'' + 
			",average_speed = '" + averageSpeed + '\'' + 
			",average_temp = '" + averageTemp + '\'' + 
			",moving_time = '" + movingTime + '\'' + 
			",start_date = '" + startDate + '\'' + 
			",pr_count = '" + prCount + '\'' + 
			",start_date_local = '" + startDateLocal + '\'' + 
			",calories = '" + calories + '\'' + 
			",total_elevation_gain = '" + totalElevationGain + '\'' + 
			",average_watts = '" + averageWatts + '\'' + 
			",segment_leaderboard_opt_out = '" + segmentLeaderboardOptOut + '\'' + 
			",start_longitude = '" + startLongitude + '\'' + 
			",photo_count = '" + photoCount + '\'' + 
			",elev_high = '" + elevHigh + '\'' + 
			",leaderboard_opt_out = '" + leaderboardOptOut + '\'' + 
			",suffer_score = '" + sufferScore + '\'' + 
			",partner_brand_tag = '" + partnerBrandTag + '\'' + 
			",max_watts = '" + maxWatts + '\'' + 
			",weighted_average_watts = '" + weightedAverageWatts + '\'' + 
			"}";
		}
}