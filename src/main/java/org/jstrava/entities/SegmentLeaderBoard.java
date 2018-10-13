package org.jstrava.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SegmentLeaderBoard{

	@SerializedName("kom_type")
	private String komType;

	@SerializedName("entries")
	private List<EntriesItem> entries;

	@SerializedName("entry_count")
	private int entryCount;

	@SerializedName("effort_count")
	private int effortCount;

	public void setKomType(String komType){
		this.komType = komType;
	}

	public String getKomType(){
		return komType;
	}

	public void setEntries(List<EntriesItem> entries){
		this.entries = entries;
	}

	public List<EntriesItem> getEntries(){
		return entries;
	}

	public void setEntryCount(int entryCount){
		this.entryCount = entryCount;
	}

	public int getEntryCount(){
		return entryCount;
	}

	public void setEffortCount(int effortCount){
		this.effortCount = effortCount;
	}

	public int getEffortCount(){
		return effortCount;
	}

	@Override
 	public String toString(){
		return 
			"SegmentLeaderBoard{" + 
			"kom_type = '" + komType + '\'' + 
			",entries = '" + entries + '\'' + 
			",entry_count = '" + entryCount + '\'' + 
			",effort_count = '" + effortCount + '\'' + 
			"}";
		}
}