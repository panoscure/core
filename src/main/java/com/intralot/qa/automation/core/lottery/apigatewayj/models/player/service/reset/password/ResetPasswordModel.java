package com.intralot.qa.automation.core.lottery.apigatewayj.models.player.service.reset.password;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResetPasswordModel {

	@SerializedName("lastName")
	private String lastName;

	@SerializedName("preferences")
	private List<PreferencesItem> preferences;

	@SerializedName("gender")
	private Integer gender;

	@SerializedName("ethnicity")
	private Integer ethnicity;

	@SerializedName("created")
	private long created;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("exclusion")
	private Exclusion exclusion;

	@SerializedName("title")
	private Integer title;

	@SerializedName("birthDate")
	private long birthDate;

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("addressBooks")
	private AddressBooks addressBooks;

	@SerializedName("kyc")
	private Kyc kyc;

	@SerializedName("identity")
	private Identity identity;

	@SerializedName("id")
	private Integer id;

	@SerializedName("playerState")
	private PlayerState playerState;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	@SerializedName("status")
	private String status;

	public String getLastName(){
		return lastName;
	}

	public List<PreferencesItem> getPreferences(){
		return preferences;
	}

	public Integer getGender(){
		return gender;
	}

	public Integer getEthnicity(){
		return ethnicity;
	}

	public long getCreated(){
		return created;
	}

	public String getMobile(){
		return mobile;
	}

	public Exclusion getExclusion(){
		return exclusion;
	}

	public Integer getTitle(){
		return title;
	}

	public long getBirthDate(){
		return birthDate;
	}

	public String getFirstName(){
		return firstName;
	}

	public AddressBooks getAddressBooks(){
		return addressBooks;
	}

	public Kyc getKyc(){
		return kyc;
	}

	public Identity getIdentity(){
		return identity;
	}

	public Integer getId(){
		return id;
	}

	public PlayerState getPlayerState(){
		return playerState;
	}

	public String getEmail(){
		return email;
	}

	public String getUsername(){
		return username;
	}

	public String getStatus(){
		return status;
	}
}