package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.favorite.playslips;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ParticipatingDraws{

	@SerializedName("dayPattern")
	private List<Object> dayPattern;

	@SerializedName("drawOffsets")
	private List<Integer> drawOffsets;

	@SerializedName("multipleDraws")
	private int multipleDraws;

	public void setDayPattern(List<Object> dayPattern){
		this.dayPattern = dayPattern;
	}

	public List<Object> getDayPattern(){
		return dayPattern;
	}

	public void setDrawOffsets(List<Integer> drawOffsets){
		this.drawOffsets = drawOffsets;
	}

	public List<Integer> getDrawOffsets(){
		return drawOffsets;
	}

	public void setMultipleDraws(int multipleDraws){
		this.multipleDraws = multipleDraws;
	}

	public int getMultipleDraws(){
		return multipleDraws;
	}
}