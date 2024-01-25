package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.details.fora.specific.betslip.id;

import com.google.gson.annotations.SerializedName;

public class CompetitorsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private Integer id;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}
}