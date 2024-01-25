package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.favorite.playslips;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Dbg {

	@SerializedName("gameId")
	private int gameId;

	@SerializedName("participatingDraws")
	private ParticipatingDraws participatingDraws;

	@SerializedName("creationTime")
	private int creationTime;

	@SerializedName("isPrimary")
	private boolean isPrimary;

	@SerializedName("options")
	private List<Object> options;

	@SerializedName("quickPick")
	private boolean quickPick;

	@SerializedName("boards")
	private List<Boards> boards;

	@SerializedName("multipliers")
	private List<Integer> multipliers;

	public void setGameId(int gameId){
		this.gameId = gameId;
	}

	public int getGameId(){
		return gameId;
	}

	public void setParticipatingDraws(ParticipatingDraws participatingDraws){
		this.participatingDraws = participatingDraws;
	}

	public ParticipatingDraws getParticipatingDraws(){
		return participatingDraws;
	}

	public void setCreationTime(int creationTime){
		this.creationTime = creationTime;
	}

	public int getCreationTime(){
		return creationTime;
	}

	public void setIsPrimary(boolean isPrimary){
		this.isPrimary = isPrimary;
	}

	public boolean isIsPrimary(){
		return isPrimary;
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

	public void setBoards(List<Boards> boards){
		this.boards = boards;
	}

	public List<Boards> getBoards(){
		return boards;
	}

	public void setMultipliers(List<Integer> multipliers){
		this.multipliers = multipliers;
	}

	public List<Integer> getMultipliers(){
		return multipliers;
	}
}