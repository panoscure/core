package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.favorite.playslips;

import com.google.gson.annotations.SerializedName;

public class Sort{

	@SerializedName("unsorted")
	private boolean unsorted;

	@SerializedName("sorted")
	private boolean sorted;

	@SerializedName("empty")
	private boolean empty;

	public void setUnsorted(boolean unsorted){
		this.unsorted = unsorted;
	}

	public boolean isUnsorted(){
		return unsorted;
	}

	public void setSorted(boolean sorted){
		this.sorted = sorted;
	}

	public boolean isSorted(){
		return sorted;
	}

	public void setEmpty(boolean empty){
		this.empty = empty;
	}

	public boolean isEmpty(){
		return empty;
	}
}