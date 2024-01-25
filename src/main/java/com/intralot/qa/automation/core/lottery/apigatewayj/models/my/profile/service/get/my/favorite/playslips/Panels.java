package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.favorite.playslips;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Panels {

	@SerializedName("requested")
	private int requested;

	@SerializedName("selection")
	private List<Integer> selection;

	@SerializedName("options")
	private List<Object> options;

	@SerializedName("quickPick")
	private boolean quickPick;

	public void setRequested(int requested){
		this.requested = requested;
	}

	public int getRequested(){
		return requested;
	}

	public void setSelection(List<Integer> selection){
		this.selection = selection;
	}

	public List<Integer> getSelection(){
		return selection;
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
}