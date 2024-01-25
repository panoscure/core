package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.gets.a.list.of.ladder.odds;

import com.google.gson.annotations.SerializedName;

public class RootLadderOdd {

	@SerializedName("fractional")
	private String fractional;

	@SerializedName("rootIndex")
	private Integer rootIndex;

	@SerializedName("decimal")
	private String decimal;

	public void setFractional(String fractional){
		this.fractional = fractional;
	}

	public String getFractional(){
		return fractional;
	}

	public void setRootIndex(Integer rootIndex){
		this.rootIndex = rootIndex;
	}

	public Integer getRootIndex(){
		return rootIndex;
	}

	public void setDecimal(String decimal){
		this.decimal = decimal;
	}

	public String getDecimal(){
		return decimal;
	}

	@Override
 	public String toString(){
		return 
			"RootLadderOdd{" +
			"fractional = '" + fractional + '\'' + 
			",rootIndex = '" + rootIndex + '\'' + 
			",decimal = '" + decimal + '\'' + 
			"}";
		}
}