package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.favorite.playslips;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Boards {

	@SerializedName("panels")
	private List<Panels> panels;

	@SerializedName("options")
	private List<Object> options;

	@SerializedName("quickPick")
	private boolean quickPick;

	@SerializedName("boardId")
	private int boardId;

	@SerializedName("multipliers")
	private List<Integer> multipliers;

	@SerializedName("betType")
	private int betType;

	public void setPanels(List<Panels> panels){
		this.panels = panels;
	}

	public List<Panels> getPanels(){
		return panels;
	}

	public void setOptions(List<Object> options){
		this.options = options;
	}

	public List<Object> getOptions(){
		return options;
	}

	public void setQuickPick(boolean quickPick){
		this.quickPick = quickPick;
	}

	public boolean isQuickPick(){
		return quickPick;
	}

	public void setBoardId(int boardId){
		this.boardId = boardId;
	}

	public int getBoardId(){
		return boardId;
	}

	public void setMultipliers(List<Integer> multipliers){
		this.multipliers = multipliers;
	}

	public List<Integer> getMultipliers(){
		return multipliers;
	}

	public void setBetType(int betType){
		this.betType = betType;
	}

	public int getBetType(){
		return betType;
	}
}