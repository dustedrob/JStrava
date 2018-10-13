package org.jstrava.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Urls{

	@SerializedName("100")
	private String url100;

	@SerializedName("600")
	private String url600;

	public void setUrl100(String url100){
		this.url100 = url100;
	}

	public String getUrl100(){
		return url100;
	}

	public void setUrl600(String url600){
		this.url600 = url600;
	}

	public String getUrl600(){
		return url600;
	}

	@Override
 	public String toString(){
		return 
			"Urls{" + 
			"100 = '" + url100 + '\'' +
			",600 = '" + url600 + '\'' +
			"}";
		}
}