package org.jstrava.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Stream{

	@SerializedName("data")
	private List<Double> data;

	@SerializedName("type")
	private String type;

	@SerializedName("series_type")
	private String seriesType;

	@SerializedName("resolution")
	private String resolution;

	@SerializedName("original_size")
	private int originalSize;

	public void setData(List<Double> data){
		this.data = data;
	}

	public List<Double> getData(){
		return data;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setSeriesType(String seriesType){
		this.seriesType = seriesType;
	}

	public String getSeriesType(){
		return seriesType;
	}

	public void setResolution(String resolution){
		this.resolution = resolution;
	}

	public String getResolution(){
		return resolution;
	}

	public void setOriginalSize(int originalSize){
		this.originalSize = originalSize;
	}

	public int getOriginalSize(){
		return originalSize;
	}

	@Override
 	public String toString(){
		return 
			"Stream{" + 
			"data = '" + data + '\'' + 
			",type = '" + type + '\'' + 
			",series_type = '" + seriesType + '\'' + 
			",resolution = '" + resolution + '\'' + 
			",original_size = '" + originalSize + '\'' + 
			"}";
		}
}