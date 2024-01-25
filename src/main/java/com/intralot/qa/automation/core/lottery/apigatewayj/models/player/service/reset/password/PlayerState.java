package com.intralot.qa.automation.core.lottery.apigatewayj.models.player.service.reset.password;

import com.google.gson.annotations.SerializedName;

public class PlayerState{

	@SerializedName("realityChecks")
	private int realityChecks;

	@SerializedName("locked")
	private boolean locked;

	@SerializedName("realityCheckSnooze")
	private int realityCheckSnooze;

	@SerializedName("expiresAt")
	private long expiresAt;

	@SerializedName("attempts")
	private int attempts;

	public int getRealityChecks(){
		return realityChecks;
	}

	public boolean isLocked(){
		return locked;
	}

	public int getRealityCheckSnooze(){
		return realityCheckSnooze;
	}

	public long getExpiresAt(){
		return expiresAt;
	}

	public int getAttempts(){
		return attempts;
	}
}