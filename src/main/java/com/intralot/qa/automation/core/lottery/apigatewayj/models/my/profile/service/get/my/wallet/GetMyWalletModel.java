package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.wallet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class GetMyWalletModel {

@SerializedName("playerId")
@Expose
private Integer playerId;
@SerializedName("balance")
@Expose
private BigDecimal balance;
@SerializedName("cashBalance")
@Expose
private BigDecimal cashBalance;
@SerializedName("withdrawable")
@Expose
private BigDecimal withdrawable;
@SerializedName("bonus")
@Expose
private BigDecimal bonus;

public Integer getPlayerId() {
return playerId;
}

public void setPlayerId(Integer playerId) {
this.playerId = playerId;
}

public BigDecimal getBalance() {
return balance;
}

public void setBalance(BigDecimal balance) {
this.balance = balance;
}

public BigDecimal getCashBalance() {
return cashBalance;
}

public void setCashBalance(BigDecimal cashBalance) {
this.cashBalance = cashBalance;
}

public BigDecimal getWithdrawable() {
return withdrawable;
}

public void setWithdrawable(BigDecimal withdrawable) {
this.withdrawable = withdrawable;
}

public BigDecimal getBonus() {
return bonus;
}

public void setBonus(BigDecimal bonus) {
this.bonus = bonus;
}

}