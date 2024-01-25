package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.gets.a.list.of.ladder.odds;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GetAListOfLadderOddsModel{

	@SerializedName("priceAdjustment")
	private Integer priceAdjustment;

	@SerializedName("rootLadder")
	private List<RootLadderOdd> rootLadder;

	public void setPriceAdjustment(Integer priceAdjustment){
		this.priceAdjustment = priceAdjustment;
	}

	public Integer getPriceAdjustment(){
		return priceAdjustment;
	}

	public void setRootLadder(List<RootLadderOdd> rootLadder){
		this.rootLadder = rootLadder;
	}

	public List<RootLadderOdd> getRootLadder(){
		return rootLadder;
	}

	@Override
 	public String toString(){
		return 
			"GetAListOfLadderOddsModel{" + 
			"priceAdjustment = '" + priceAdjustment + '\'' + 
			",rootLadder = '" + rootLadder + '\'' + 
			"}";
		}
}