package com.intralot.qa.automation.core.lottery.apigatewayj.models.player.service.reset.password;

import com.google.gson.annotations.SerializedName;

public class Kyc{

	@SerializedName("scanUrl")
	private String scanUrl;

	@SerializedName("verificationStatus")
	private String verificationStatus;

	@SerializedName("verified")
	private boolean verified;

	@SerializedName("verificationId")
	private String verificationId;

	@SerializedName("expirationDate")
	private long expirationDate;

	@SerializedName("scanUrlExpirationDate")
	private long scanUrlExpirationDate;

	public String getScanUrl(){
		return scanUrl;
	}

	public String getVerificationStatus(){
		return verificationStatus;
	}

	public boolean isVerified(){
		return verified;
	}

	public String getVerificationId(){
		return verificationId;
	}

	public long getExpirationDate(){
		return expirationDate;
	}

	public long getScanUrlExpirationDate(){
		return scanUrlExpirationDate;
	}
}