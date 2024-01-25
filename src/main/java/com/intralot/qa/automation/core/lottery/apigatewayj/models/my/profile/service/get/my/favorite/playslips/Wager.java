package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.favorite.playslips;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Wager{

	@SerializedName("wagerCost")
	private int wagerCost;

	@SerializedName("dbg")
	private List<Dbg> dbg;

	public void setWagerCost(int wagerCost){
		this.wagerCost = wagerCost;
	}

	public int getWagerCost(){
		return wagerCost;
	}

	public void setDbg(List<Dbg> dbg){
		this.dbg = dbg;
	}

	public List<Dbg> getDbg(){
		return dbg;
	}
}