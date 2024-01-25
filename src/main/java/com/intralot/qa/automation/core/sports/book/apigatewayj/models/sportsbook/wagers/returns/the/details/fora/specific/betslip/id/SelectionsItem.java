package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.details.fora.specific.betslip.id;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SelectionsItem{

	@SerializedName("eventId")
	private Integer eventId;

	@SerializedName("selectionId")
	private String selectionId;

	@SerializedName("scores")
	private List<Integer> scores;

	@SerializedName("selectionName")
	private String selectionName;

	@SerializedName("banker")
	private Boolean banker;

	@SerializedName("marketName")
	private String marketName;

	@SerializedName("competitors")
	private List<CompetitorsItem> competitors;

	@SerializedName("competitionParent")
	private CompetitionParent competitionParent;

	@SerializedName("competitionObj")
	private CompetitionObj competitionObj;

	@SerializedName("odds")
	private Odds odds;

	@SerializedName("eventTime")
	private Long eventTime;

	@SerializedName("eventName")
	private String eventName;

	@SerializedName("lines")
	private List<Double> lines;

	@SerializedName("resultType")
	private String resultType;

	@SerializedName("sport")
	private Sport sport;

	@SerializedName("partNo")
	private Integer partNo;

	public void setEventId(Integer eventId){
		this.eventId = eventId;
	}

	public Integer getEventId(){
		return eventId;
	}

	public void setSelectionId(String selectionId){
		this.selectionId = selectionId;
	}

	public String getSelectionId(){
		return selectionId;
	}

	public void setScores(List<Integer> scores){
		this.scores = scores;
	}

	public List<Integer> getScores(){
		return scores;
	}

	public void setSelectionName(String selectionName){
		this.selectionName = selectionName;
	}

	public String getSelectionName(){
		return selectionName;
	}

	public void setBanker(Boolean banker){
		this.banker = banker;
	}

	public boolean isBanker(){
		return banker;
	}

	public void setMarketName(String marketName){
		this.marketName = marketName;
	}

	public String getMarketName(){
		return marketName;
	}

	public void setCompetitors(List<CompetitorsItem> competitors){
		this.competitors = competitors;
	}

	public List<CompetitorsItem> getCompetitors(){
		return competitors;
	}

	public void setCompetitionParent(CompetitionParent competitionParent){
		this.competitionParent = competitionParent;
	}

	public CompetitionParent getCompetitionParent(){
		return competitionParent;
	}

	public void setCompetitionObj(CompetitionObj competitionObj){
		this.competitionObj = competitionObj;
	}

	public CompetitionObj getCompetitionObj(){
		return competitionObj;
	}

	public void setOdds(Odds odds){
		this.odds = odds;
	}

	public Odds getOdds(){
		return odds;
	}

	public void setEventTime(Long eventTime){
		this.eventTime = eventTime;
	}

	public Long getEventTime(){
		return eventTime;
	}

	public void setEventName(String eventName){
		this.eventName = eventName;
	}

	public String getEventName(){
		return eventName;
	}

	public void setLines(List<Double> lines){
		this.lines = lines;
	}

	public List<Double> getLines(){
		return lines;
	}

	public void setResultType(String resultType){
		this.resultType = resultType;
	}

	public String getResultType(){
		return resultType;
	}

	public void setSport(Sport sport){
		this.sport = sport;
	}

	public Sport getSport(){
		return sport;
	}

	public void setPartNo(Integer partNo){
		this.partNo = partNo;
	}

	public Integer getPartNo(){
		return partNo;
	}
}