package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AthleteStats{

	@SerializedName("recent_run_totals")
	private RecentRunTotals recentRunTotals;

	@SerializedName("all_run_totals")
	private AllRunTotals allRunTotals;

	@SerializedName("recent_swim_totals")
	private RecentSwimTotals recentSwimTotals;

	@SerializedName("biggest_ride_distance")
	private int biggestRideDistance;

	@SerializedName("ytd_swim_totals")
	private YtdSwimTotals ytdSwimTotals;

	@SerializedName("all_swim_totals")
	private AllSwimTotals allSwimTotals;

	@SerializedName("recent_ride_totals")
	private RecentRideTotals recentRideTotals;

	@SerializedName("biggest_climb_elevation_gain")
	private int biggestClimbElevationGain;

	@SerializedName("ytd_ride_totals")
	private YtdRideTotals ytdRideTotals;

	@SerializedName("all_ride_totals")
	private AllRideTotals allRideTotals;

	@SerializedName("ytd_run_totals")
	private YtdRunTotals ytdRunTotals;

	public void setRecentRunTotals(RecentRunTotals recentRunTotals){
		this.recentRunTotals = recentRunTotals;
	}

	public RecentRunTotals getRecentRunTotals(){
		return recentRunTotals;
	}

	public void setAllRunTotals(AllRunTotals allRunTotals){
		this.allRunTotals = allRunTotals;
	}

	public AllRunTotals getAllRunTotals(){
		return allRunTotals;
	}

	public void setRecentSwimTotals(RecentSwimTotals recentSwimTotals){
		this.recentSwimTotals = recentSwimTotals;
	}

	public RecentSwimTotals getRecentSwimTotals(){
		return recentSwimTotals;
	}

	public void setBiggestRideDistance(int biggestRideDistance){
		this.biggestRideDistance = biggestRideDistance;
	}

	public int getBiggestRideDistance(){
		return biggestRideDistance;
	}

	public void setYtdSwimTotals(YtdSwimTotals ytdSwimTotals){
		this.ytdSwimTotals = ytdSwimTotals;
	}

	public YtdSwimTotals getYtdSwimTotals(){
		return ytdSwimTotals;
	}

	public void setAllSwimTotals(AllSwimTotals allSwimTotals){
		this.allSwimTotals = allSwimTotals;
	}

	public AllSwimTotals getAllSwimTotals(){
		return allSwimTotals;
	}

	public void setRecentRideTotals(RecentRideTotals recentRideTotals){
		this.recentRideTotals = recentRideTotals;
	}

	public RecentRideTotals getRecentRideTotals(){
		return recentRideTotals;
	}

	public void setBiggestClimbElevationGain(int biggestClimbElevationGain){
		this.biggestClimbElevationGain = biggestClimbElevationGain;
	}

	public int getBiggestClimbElevationGain(){
		return biggestClimbElevationGain;
	}

	public void setYtdRideTotals(YtdRideTotals ytdRideTotals){
		this.ytdRideTotals = ytdRideTotals;
	}

	public YtdRideTotals getYtdRideTotals(){
		return ytdRideTotals;
	}

	public void setAllRideTotals(AllRideTotals allRideTotals){
		this.allRideTotals = allRideTotals;
	}

	public AllRideTotals getAllRideTotals(){
		return allRideTotals;
	}

	public void setYtdRunTotals(YtdRunTotals ytdRunTotals){
		this.ytdRunTotals = ytdRunTotals;
	}

	public YtdRunTotals getYtdRunTotals(){
		return ytdRunTotals;
	}

	@Override
 	public String toString(){
		return 
			"AthleteStats{" + 
			"recent_run_totals = '" + recentRunTotals + '\'' + 
			",all_run_totals = '" + allRunTotals + '\'' + 
			",recent_swim_totals = '" + recentSwimTotals + '\'' + 
			",biggest_ride_distance = '" + biggestRideDistance + '\'' + 
			",ytd_swim_totals = '" + ytdSwimTotals + '\'' + 
			",all_swim_totals = '" + allSwimTotals + '\'' + 
			",recent_ride_totals = '" + recentRideTotals + '\'' + 
			",biggest_climb_elevation_gain = '" + biggestClimbElevationGain + '\'' + 
			",ytd_ride_totals = '" + ytdRideTotals + '\'' + 
			",all_ride_totals = '" + allRideTotals + '\'' + 
			",ytd_run_totals = '" + ytdRunTotals + '\'' + 
			"}";
		}
}