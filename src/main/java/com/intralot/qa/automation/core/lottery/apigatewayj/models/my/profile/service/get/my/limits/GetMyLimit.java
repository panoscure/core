package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.limits;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class GetMyLimit {

	@SerializedName("duration")
	private Integer duration;

	@SerializedName("soFar")
	private BigDecimal soFar;

	@SerializedName("min")
	private BigDecimal min;

	@SerializedName("max")
	private BigDecimal max;

	@SerializedName("groupId")
	private Integer groupId;

	@SerializedName("updatedDate")
	private Long updatedDate;

	@SerializedName("type")
	private String type;

	@SerializedName("value")
	private BigDecimal value;

	public Integer getDuration(){
		return duration;
	}

	public BigDecimal getSoFar(){
		return soFar;
	}

	public BigDecimal getMin(){
		return min;
	}

	public BigDecimal getMax(){
		return max;
	}

	public Integer getGroupId(){
		return groupId;
	}

	public Long getUpdatedDate(){
		return updatedDate;
	}

	public String getType(){
		return type;
	}

	public BigDecimal getValue(){
		return value;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public void setSoFar(BigDecimal soFar) {
		this.soFar = soFar;
	}

	public void setMin(BigDecimal min) {
		this.min = min;
	}

	public void setMax(BigDecimal max) {
		this.max = max;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public void setUpdatedDate(Long updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}