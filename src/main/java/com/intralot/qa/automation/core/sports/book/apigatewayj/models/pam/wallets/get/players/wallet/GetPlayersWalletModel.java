package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.get.players.wallet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class GetPlayersWalletModel {

    @SerializedName("clientExternalID")
    @Expose
    private Object clientExternalID;
    @SerializedName("clientID")
    @Expose
    private Integer clientID;
    @SerializedName("clientStatID")
    @Expose
    private Integer clientStatID;
    @SerializedName("currencyISO")
    @Expose
    private String currencyISO;
    @SerializedName("currentBalance")
    @Expose
    private BigDecimal currentBalance;
    @SerializedName("currentBonusBalance")
    @Expose
    private BigDecimal currentBonusBalance;
    @SerializedName("currentBonusComponent")
    @Expose
    private BigDecimal currentBonusComponent;
    @SerializedName("currentBonusWinLockedComponent")
    @Expose
    private BigDecimal currentBonusWinLockedComponent;
    @SerializedName("currentFreeBetBalance")
    @Expose
    private BigDecimal currentFreeBetBalance;
    @SerializedName("currentLoyaltyPoints")
    @Expose
    private BigDecimal currentLoyaltyPoints;
    @SerializedName("currentRealBalance")
    @Expose
    private BigDecimal currentRealBalance;
    @SerializedName("currentRingFencedAmount")
    @Expose
    private BigDecimal currentRingFencedAmount;
    @SerializedName("currentRingFencedCasino")
    @Expose
    private BigDecimal currentRingFencedCasino;
    @SerializedName("currentRingFencedPoker")
    @Expose
    private BigDecimal currentRingFencedPoker;
    @SerializedName("currentRingFencedSB")
    @Expose
    private BigDecimal currentRingFencedSB;
    @SerializedName("cwFreeRoundsBalance")
    @Expose
    private BigDecimal cwFreeRoundsBalance;
    @SerializedName("cwFreeRoundsNum")
    @Expose
    private Integer cwFreeRoundsNum;
    @SerializedName("cwFreeRoundsPlayed")
    @Expose
    private BigDecimal cwFreeRoundsPlayed;
    @SerializedName("cwFreeRoundsPlayedNum")
    @Expose
    private Integer cwFreeRoundsPlayedNum;
    @SerializedName("cwFreeRoundsTransferredToBonus")
    @Expose
    private BigDecimal cwFreeRoundsTransferredToBonus;
    @SerializedName("cwFreeRoundsWinLocked")
    @Expose
    private BigDecimal cwFreeRoundsWinLocked;
    @SerializedName("deferredTax")
    @Expose
    private Integer deferredTax;
    @SerializedName("depositedAmount")
    @Expose
    private BigDecimal depositedAmount;
    @SerializedName("lastDepositDate")
    @Expose
    private Object lastDepositDate;
    @SerializedName("lastGameSessionRTP")
    @Expose
    private String lastGameSessionRTP;
    @SerializedName("lastPlayedDate")
    @Expose
    private Object lastPlayedDate;
    @SerializedName("lastSessionRTP")
    @Expose
    private BigDecimal lastSessionRTP;
    @SerializedName("lastWithdrawalDate")
    @Expose
    private Object lastWithdrawalDate;
    @SerializedName("lifetimeRTP")
    @Expose
    private BigDecimal lifetimeRTP;
    @SerializedName("maxAllowedWithdrawals")
    @Expose
    private BigDecimal maxAllowedWithdrawals;
    @SerializedName("maxCountryBalanceThreshold")
    @Expose
    private Object maxCountryBalanceThreshold;
    @SerializedName("maxPlayerBalanceThreshold")
    @Expose
    private Object maxPlayerBalanceThreshold;
    @SerializedName("nonWitdrawableFunds")
    @Expose
    private BigDecimal nonWitdrawableFunds;
    @SerializedName("numDeposits")
    @Expose
    private Integer numDeposits;
    @SerializedName("numWithdrawals")
    @Expose
    private Integer numWithdrawals;
    @SerializedName("provisionalRealMoneyBalance")
    @Expose
    private BigDecimal provisionalRealMoneyBalance;
    @SerializedName("totalAdjustments")
    @Expose
    private BigDecimal totalAdjustments;
    @SerializedName("totalBet")
    @Expose
    private BigDecimal totalBet;
    @SerializedName("totalBetBonus")
    @Expose
    private BigDecimal totalBetBonus;
    @SerializedName("totalBetBonusWinLocked")
    @Expose
    private BigDecimal totalBetBonusWinLocked;
    @SerializedName("totalBetReal")
    @Expose
    private BigDecimal totalBetReal;
    @SerializedName("totalBonusTurnedReal")
    @Expose
    private BigDecimal totalBonusTurnedReal;
    @SerializedName("totalCashPlayed")
    @Expose
    private BigDecimal totalCashPlayed;
    @SerializedName("totalCashPlayedRetail")
    @Expose
    private BigDecimal totalCashPlayedRetail;
    @SerializedName("totalCashPlayedSelfService")
    @Expose
    private BigDecimal totalCashPlayedSelfService;
    @SerializedName("totalCashWin")
    @Expose
    private BigDecimal totalCashWin;
    @SerializedName("totalCashWinPaidRetail")
    @Expose
    private BigDecimal totalCashWinPaidRetail;
    @SerializedName("totalCashWinPaidSelfService")
    @Expose
    private BigDecimal totalCashWinPaidSelfService;
    @SerializedName("totalLoyaltyPoints")
    @Expose
    private BigDecimal totalLoyaltyPoints;
    @SerializedName("totalLoyaltyPointsUsed")
    @Expose
    private BigDecimal totalLoyaltyPointsUsed;
    @SerializedName("totalWalletRealPlayed")
    @Expose
    private BigDecimal totalWalletRealPlayed;
    @SerializedName("totalWalletRealPlayedOnline")
    @Expose
    private BigDecimal totalWalletRealPlayedOnline;
    @SerializedName("totalWalletRealPlayedRetail")
    @Expose
    private BigDecimal totalWalletRealPlayedRetail;
    @SerializedName("totalWalletRealPlayedSelfService")
    @Expose
    private BigDecimal totalWalletRealPlayedSelfService;
    @SerializedName("totalWalletRealWon")
    @Expose
    private BigDecimal totalWalletRealWon;
    @SerializedName("totalWalletRealWonOnline")
    @Expose
    private BigDecimal totalWalletRealWonOnline;
    @SerializedName("totalWalletRealWonRetail")
    @Expose
    private BigDecimal totalWalletRealWonRetail;
    @SerializedName("totalWalletRealWonSelfService")
    @Expose
    private BigDecimal totalWalletRealWonSelfService;
    @SerializedName("totalWon")
    @Expose
    private BigDecimal totalWon;
    @SerializedName("totalWonBonus")
    @Expose
    private BigDecimal totalWonBonus;
    @SerializedName("totalWonBonusWinLocked")
    @Expose
    private BigDecimal totalWonBonusWinLocked;
    @SerializedName("totalWonReal")
    @Expose
    private BigDecimal totalWonReal;
    @SerializedName("withdrawalPendingAmount")
    @Expose
    private BigDecimal withdrawalPendingAmount;
    @SerializedName("withdrawnAmount")
    @Expose
    private BigDecimal withdrawnAmount;

    /**
     * No args constructor for use in serialization
     *
     */
    public GetPlayersWalletModel() {
    }

    /**
     *
     * @param currentRingFencedAmount
     * @param totalWalletRealPlayedSelfService
     * @param totalWalletRealWonRetail
     * @param cwFreeRoundsPlayed
     * @param currentRingFencedSB
     * @param totalLoyaltyPointsUsed
     * @param cwFreeRoundsNum
     * @param totalWon
     * @param clientStatID
     * @param lastGameSessionRTP
     * @param provisionalRealMoneyBalance
     * @param withdrawalPendingAmount
     * @param totalBonusTurnedReal
     * @param totalWalletRealWon
     * @param cwFreeRoundsPlayedNum
     * @param totalWalletRealWonSelfService
     * @param currentRealBalance
     * @param totalWalletRealPlayedRetail
     * @param currentRingFencedPoker
     * @param currentFreeBetBalance
     * @param currentBonusWinLockedComponent
     * @param totalAdjustments
     * @param totalCashPlayedRetail
     * @param totalWonBonus
     * @param depositedAmount
     * @param numWithdrawals
     * @param totalCashPlayed
     * @param totalCashWinPaidRetail
     * @param lastPlayedDate
     * @param cwFreeRoundsBalance
     * @param withdrawnAmount
     * @param cwFreeRoundsWinLocked
     * @param totalLoyaltyPoints
     * @param currentBonusComponent
     * @param totalBetBonus
     * @param currentBonusBalance
     * @param cwFreeRoundsTransferredToBonus
     * @param clientID
     * @param currentBalance
     * @param totalWalletRealPlayed
     * @param maxPlayerBalanceThreshold
     * @param totalWonReal
     * @param totalBetReal
     * @param lastSessionRTP
     * @param currentRingFencedCasino
     * @param nonWitdrawableFunds
     * @param clientExternalID
     * @param currencyISO
     * @param totalWonBonusWinLocked
     * @param lastDepositDate
     * @param totalWalletRealPlayedOnline
     * @param lifetimeRTP
     * @param totalBetBonusWinLocked
     * @param deferredTax
     * @param totalBet
     * @param totalCashPlayedSelfService
     * @param totalWalletRealWonOnline
     * @param lastWithdrawalDate
     * @param maxAllowedWithdrawals
     * @param totalCashWin
     * @param numDeposits
     * @param currentLoyaltyPoints
     * @param totalCashWinPaidSelfService
     * @param maxCountryBalanceThreshold
     */
    public GetPlayersWalletModel(Object clientExternalID, Integer clientID, Integer clientStatID, String currencyISO, BigDecimal currentBalance, BigDecimal currentBonusBalance, BigDecimal currentBonusComponent, BigDecimal currentBonusWinLockedComponent, BigDecimal currentFreeBetBalance, BigDecimal currentLoyaltyPoints, BigDecimal currentRealBalance, BigDecimal currentRingFencedAmount, BigDecimal currentRingFencedCasino, BigDecimal currentRingFencedPoker, BigDecimal currentRingFencedSB, BigDecimal cwFreeRoundsBalance, Integer cwFreeRoundsNum, BigDecimal cwFreeRoundsPlayed, Integer cwFreeRoundsPlayedNum, BigDecimal cwFreeRoundsTransferredToBonus, BigDecimal cwFreeRoundsWinLocked, Integer deferredTax, BigDecimal depositedAmount, Object lastDepositDate, String lastGameSessionRTP, Object lastPlayedDate, BigDecimal lastSessionRTP, Object lastWithdrawalDate, BigDecimal lifetimeRTP, BigDecimal maxAllowedWithdrawals, Object maxCountryBalanceThreshold, Object maxPlayerBalanceThreshold, BigDecimal nonWitdrawableFunds, Integer numDeposits, Integer numWithdrawals, BigDecimal provisionalRealMoneyBalance, BigDecimal totalAdjustments, BigDecimal totalBet, BigDecimal totalBetBonus, BigDecimal totalBetBonusWinLocked, BigDecimal totalBetReal, BigDecimal totalBonusTurnedReal, BigDecimal totalCashPlayed, BigDecimal totalCashPlayedRetail, BigDecimal totalCashPlayedSelfService, BigDecimal totalCashWin, BigDecimal totalCashWinPaidRetail, BigDecimal totalCashWinPaidSelfService, BigDecimal totalLoyaltyPoints, BigDecimal totalLoyaltyPointsUsed, BigDecimal totalWalletRealPlayed, BigDecimal totalWalletRealPlayedOnline, BigDecimal totalWalletRealPlayedRetail, BigDecimal totalWalletRealPlayedSelfService, BigDecimal totalWalletRealWon, BigDecimal totalWalletRealWonOnline, BigDecimal totalWalletRealWonRetail, BigDecimal totalWalletRealWonSelfService, BigDecimal totalWon, BigDecimal totalWonBonus, BigDecimal totalWonBonusWinLocked, BigDecimal totalWonReal, BigDecimal withdrawalPendingAmount, BigDecimal withdrawnAmount) {
        super();
        this.clientExternalID = clientExternalID;
        this.clientID = clientID;
        this.clientStatID = clientStatID;
        this.currencyISO = currencyISO;
        this.currentBalance = currentBalance;
        this.currentBonusBalance = currentBonusBalance;
        this.currentBonusComponent = currentBonusComponent;
        this.currentBonusWinLockedComponent = currentBonusWinLockedComponent;
        this.currentFreeBetBalance = currentFreeBetBalance;
        this.currentLoyaltyPoints = currentLoyaltyPoints;
        this.currentRealBalance = currentRealBalance;
        this.currentRingFencedAmount = currentRingFencedAmount;
        this.currentRingFencedCasino = currentRingFencedCasino;
        this.currentRingFencedPoker = currentRingFencedPoker;
        this.currentRingFencedSB = currentRingFencedSB;
        this.cwFreeRoundsBalance = cwFreeRoundsBalance;
        this.cwFreeRoundsNum = cwFreeRoundsNum;
        this.cwFreeRoundsPlayed = cwFreeRoundsPlayed;
        this.cwFreeRoundsPlayedNum = cwFreeRoundsPlayedNum;
        this.cwFreeRoundsTransferredToBonus = cwFreeRoundsTransferredToBonus;
        this.cwFreeRoundsWinLocked = cwFreeRoundsWinLocked;
        this.deferredTax = deferredTax;
        this.depositedAmount = depositedAmount;
        this.lastDepositDate = lastDepositDate;
        this.lastGameSessionRTP = lastGameSessionRTP;
        this.lastPlayedDate = lastPlayedDate;
        this.lastSessionRTP = lastSessionRTP;
        this.lastWithdrawalDate = lastWithdrawalDate;
        this.lifetimeRTP = lifetimeRTP;
        this.maxAllowedWithdrawals = maxAllowedWithdrawals;
        this.maxCountryBalanceThreshold = maxCountryBalanceThreshold;
        this.maxPlayerBalanceThreshold = maxPlayerBalanceThreshold;
        this.nonWitdrawableFunds = nonWitdrawableFunds;
        this.numDeposits = numDeposits;
        this.numWithdrawals = numWithdrawals;
        this.provisionalRealMoneyBalance = provisionalRealMoneyBalance;
        this.totalAdjustments = totalAdjustments;
        this.totalBet = totalBet;
        this.totalBetBonus = totalBetBonus;
        this.totalBetBonusWinLocked = totalBetBonusWinLocked;
        this.totalBetReal = totalBetReal;
        this.totalBonusTurnedReal = totalBonusTurnedReal;
        this.totalCashPlayed = totalCashPlayed;
        this.totalCashPlayedRetail = totalCashPlayedRetail;
        this.totalCashPlayedSelfService = totalCashPlayedSelfService;
        this.totalCashWin = totalCashWin;
        this.totalCashWinPaidRetail = totalCashWinPaidRetail;
        this.totalCashWinPaidSelfService = totalCashWinPaidSelfService;
        this.totalLoyaltyPoints = totalLoyaltyPoints;
        this.totalLoyaltyPointsUsed = totalLoyaltyPointsUsed;
        this.totalWalletRealPlayed = totalWalletRealPlayed;
        this.totalWalletRealPlayedOnline = totalWalletRealPlayedOnline;
        this.totalWalletRealPlayedRetail = totalWalletRealPlayedRetail;
        this.totalWalletRealPlayedSelfService = totalWalletRealPlayedSelfService;
        this.totalWalletRealWon = totalWalletRealWon;
        this.totalWalletRealWonOnline = totalWalletRealWonOnline;
        this.totalWalletRealWonRetail = totalWalletRealWonRetail;
        this.totalWalletRealWonSelfService = totalWalletRealWonSelfService;
        this.totalWon = totalWon;
        this.totalWonBonus = totalWonBonus;
        this.totalWonBonusWinLocked = totalWonBonusWinLocked;
        this.totalWonReal = totalWonReal;
        this.withdrawalPendingAmount = withdrawalPendingAmount;
        this.withdrawnAmount = withdrawnAmount;
    }

    public Object getClientExternalID() {
        return clientExternalID;
    }

    public void setClientExternalID(Object clientExternalID) {
        this.clientExternalID = clientExternalID;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public Integer getClientStatID() {
        return clientStatID;
    }

    public void setClientStatID(Integer clientStatID) {
        this.clientStatID = clientStatID;
    }

    public String getCurrencyISO() {
        return currencyISO;
    }

    public void setCurrencyISO(String currencyISO) {
        this.currencyISO = currencyISO;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BigDecimal getCurrentBonusBalance() {
        return currentBonusBalance;
    }

    public void setCurrentBonusBalance(BigDecimal currentBonusBalance) {
        this.currentBonusBalance = currentBonusBalance;
    }

    public BigDecimal getCurrentBonusComponent() {
        return currentBonusComponent;
    }

    public void setCurrentBonusComponent(BigDecimal currentBonusComponent) {
        this.currentBonusComponent = currentBonusComponent;
    }

    public BigDecimal getCurrentBonusWinLockedComponent() {
        return currentBonusWinLockedComponent;
    }

    public void setCurrentBonusWinLockedComponent(BigDecimal currentBonusWinLockedComponent) {
        this.currentBonusWinLockedComponent = currentBonusWinLockedComponent;
    }

    public BigDecimal getCurrentFreeBetBalance() {
        return currentFreeBetBalance;
    }

    public void setCurrentFreeBetBalance(BigDecimal currentFreeBetBalance) {
        this.currentFreeBetBalance = currentFreeBetBalance;
    }

    public BigDecimal getCurrentLoyaltyPoints() {
        return currentLoyaltyPoints;
    }

    public void setCurrentLoyaltyPoints(BigDecimal currentLoyaltyPoints) {
        this.currentLoyaltyPoints = currentLoyaltyPoints;
    }

    public BigDecimal getCurrentRealBalance() {
        return currentRealBalance;
    }

    public void setCurrentRealBalance(BigDecimal currentRealBalance) {
        this.currentRealBalance = currentRealBalance;
    }

    public BigDecimal getCurrentRingFencedAmount() {
        return currentRingFencedAmount;
    }

    public void setCurrentRingFencedAmount(BigDecimal currentRingFencedAmount) {
        this.currentRingFencedAmount = currentRingFencedAmount;
    }

    public BigDecimal getCurrentRingFencedCasino() {
        return currentRingFencedCasino;
    }

    public void setCurrentRingFencedCasino(BigDecimal currentRingFencedCasino) {
        this.currentRingFencedCasino = currentRingFencedCasino;
    }

    public BigDecimal getCurrentRingFencedPoker() {
        return currentRingFencedPoker;
    }

    public void setCurrentRingFencedPoker(BigDecimal currentRingFencedPoker) {
        this.currentRingFencedPoker = currentRingFencedPoker;
    }

    public BigDecimal getCurrentRingFencedSB() {
        return currentRingFencedSB;
    }

    public void setCurrentRingFencedSB(BigDecimal currentRingFencedSB) {
        this.currentRingFencedSB = currentRingFencedSB;
    }

    public BigDecimal getCwFreeRoundsBalance() {
        return cwFreeRoundsBalance;
    }

    public void setCwFreeRoundsBalance(BigDecimal cwFreeRoundsBalance) {
        this.cwFreeRoundsBalance = cwFreeRoundsBalance;
    }

    public Integer getCwFreeRoundsNum() {
        return cwFreeRoundsNum;
    }

    public void setCwFreeRoundsNum(Integer cwFreeRoundsNum) {
        this.cwFreeRoundsNum = cwFreeRoundsNum;
    }

    public BigDecimal getCwFreeRoundsPlayed() {
        return cwFreeRoundsPlayed;
    }

    public void setCwFreeRoundsPlayed(BigDecimal cwFreeRoundsPlayed) {
        this.cwFreeRoundsPlayed = cwFreeRoundsPlayed;
    }

    public Integer getCwFreeRoundsPlayedNum() {
        return cwFreeRoundsPlayedNum;
    }

    public void setCwFreeRoundsPlayedNum(Integer cwFreeRoundsPlayedNum) {
        this.cwFreeRoundsPlayedNum = cwFreeRoundsPlayedNum;
    }

    public BigDecimal getCwFreeRoundsTransferredToBonus() {
        return cwFreeRoundsTransferredToBonus;
    }

    public void setCwFreeRoundsTransferredToBonus(BigDecimal cwFreeRoundsTransferredToBonus) {
        this.cwFreeRoundsTransferredToBonus = cwFreeRoundsTransferredToBonus;
    }

    public BigDecimal getCwFreeRoundsWinLocked() {
        return cwFreeRoundsWinLocked;
    }

    public void setCwFreeRoundsWinLocked(BigDecimal cwFreeRoundsWinLocked) {
        this.cwFreeRoundsWinLocked = cwFreeRoundsWinLocked;
    }

    public Integer getDeferredTax() {
        return deferredTax;
    }

    public void setDeferredTax(Integer deferredTax) {
        this.deferredTax = deferredTax;
    }

    public BigDecimal getDepositedAmount() {
        return depositedAmount;
    }

    public void setDepositedAmount(BigDecimal depositedAmount) {
        this.depositedAmount = depositedAmount;
    }

    public Object getLastDepositDate() {
        return lastDepositDate;
    }

    public void setLastDepositDate(Object lastDepositDate) {
        this.lastDepositDate = lastDepositDate;
    }

    public String getLastGameSessionRTP() {
        return lastGameSessionRTP;
    }

    public void setLastGameSessionRTP(String lastGameSessionRTP) {
        this.lastGameSessionRTP = lastGameSessionRTP;
    }

    public Object getLastPlayedDate() {
        return lastPlayedDate;
    }

    public void setLastPlayedDate(Object lastPlayedDate) {
        this.lastPlayedDate = lastPlayedDate;
    }

    public BigDecimal getLastSessionRTP() {
        return lastSessionRTP;
    }

    public void setLastSessionRTP(BigDecimal lastSessionRTP) {
        this.lastSessionRTP = lastSessionRTP;
    }

    public Object getLastWithdrawalDate() {
        return lastWithdrawalDate;
    }

    public void setLastWithdrawalDate(Object lastWithdrawalDate) {
        this.lastWithdrawalDate = lastWithdrawalDate;
    }

    public BigDecimal getLifetimeRTP() {
        return lifetimeRTP;
    }

    public void setLifetimeRTP(BigDecimal lifetimeRTP) {
        this.lifetimeRTP = lifetimeRTP;
    }

    public BigDecimal getMaxAllowedWithdrawals() {
        return maxAllowedWithdrawals;
    }

    public void setMaxAllowedWithdrawals(BigDecimal maxAllowedWithdrawals) {
        this.maxAllowedWithdrawals = maxAllowedWithdrawals;
    }

    public Object getMaxCountryBalanceThreshold() {
        return maxCountryBalanceThreshold;
    }

    public void setMaxCountryBalanceThreshold(Object maxCountryBalanceThreshold) {
        this.maxCountryBalanceThreshold = maxCountryBalanceThreshold;
    }

    public Object getMaxPlayerBalanceThreshold() {
        return maxPlayerBalanceThreshold;
    }

    public void setMaxPlayerBalanceThreshold(Object maxPlayerBalanceThreshold) {
        this.maxPlayerBalanceThreshold = maxPlayerBalanceThreshold;
    }

    public BigDecimal getNonWitdrawableFunds() {
        return nonWitdrawableFunds;
    }

    public void setNonWitdrawableFunds(BigDecimal nonWitdrawableFunds) {
        this.nonWitdrawableFunds = nonWitdrawableFunds;
    }

    public Integer getNumDeposits() {
        return numDeposits;
    }

    public void setNumDeposits(Integer numDeposits) {
        this.numDeposits = numDeposits;
    }

    public Integer getNumWithdrawals() {
        return numWithdrawals;
    }

    public void setNumWithdrawals(Integer numWithdrawals) {
        this.numWithdrawals = numWithdrawals;
    }

    public BigDecimal getProvisionalRealMoneyBalance() {
        return provisionalRealMoneyBalance;
    }

    public void setProvisionalRealMoneyBalance(BigDecimal provisionalRealMoneyBalance) {
        this.provisionalRealMoneyBalance = provisionalRealMoneyBalance;
    }

    public BigDecimal getTotalAdjustments() {
        return totalAdjustments;
    }

    public void setTotalAdjustments(BigDecimal totalAdjustments) {
        this.totalAdjustments = totalAdjustments;
    }

    public BigDecimal getTotalBet() {
        return totalBet;
    }

    public void setTotalBet(BigDecimal totalBet) {
        this.totalBet = totalBet;
    }

    public BigDecimal getTotalBetBonus() {
        return totalBetBonus;
    }

    public void setTotalBetBonus(BigDecimal totalBetBonus) {
        this.totalBetBonus = totalBetBonus;
    }

    public BigDecimal getTotalBetBonusWinLocked() {
        return totalBetBonusWinLocked;
    }

    public void setTotalBetBonusWinLocked(BigDecimal totalBetBonusWinLocked) {
        this.totalBetBonusWinLocked = totalBetBonusWinLocked;
    }

    public BigDecimal getTotalBetReal() {
        return totalBetReal;
    }

    public void setTotalBetReal(BigDecimal totalBetReal) {
        this.totalBetReal = totalBetReal;
    }

    public BigDecimal getTotalBonusTurnedReal() {
        return totalBonusTurnedReal;
    }

    public void setTotalBonusTurnedReal(BigDecimal totalBonusTurnedReal) {
        this.totalBonusTurnedReal = totalBonusTurnedReal;
    }

    public BigDecimal getTotalCashPlayed() {
        return totalCashPlayed;
    }

    public void setTotalCashPlayed(BigDecimal totalCashPlayed) {
        this.totalCashPlayed = totalCashPlayed;
    }

    public BigDecimal getTotalCashPlayedRetail() {
        return totalCashPlayedRetail;
    }

    public void setTotalCashPlayedRetail(BigDecimal totalCashPlayedRetail) {
        this.totalCashPlayedRetail = totalCashPlayedRetail;
    }

    public BigDecimal getTotalCashPlayedSelfService() {
        return totalCashPlayedSelfService;
    }

    public void setTotalCashPlayedSelfService(BigDecimal totalCashPlayedSelfService) {
        this.totalCashPlayedSelfService = totalCashPlayedSelfService;
    }

    public BigDecimal getTotalCashWin() {
        return totalCashWin;
    }

    public void setTotalCashWin(BigDecimal totalCashWin) {
        this.totalCashWin = totalCashWin;
    }

    public BigDecimal getTotalCashWinPaidRetail() {
        return totalCashWinPaidRetail;
    }

    public void setTotalCashWinPaidRetail(BigDecimal totalCashWinPaidRetail) {
        this.totalCashWinPaidRetail = totalCashWinPaidRetail;
    }

    public BigDecimal getTotalCashWinPaidSelfService() {
        return totalCashWinPaidSelfService;
    }

    public void setTotalCashWinPaidSelfService(BigDecimal totalCashWinPaidSelfService) {
        this.totalCashWinPaidSelfService = totalCashWinPaidSelfService;
    }

    public BigDecimal getTotalLoyaltyPoints() {
        return totalLoyaltyPoints;
    }

    public void setTotalLoyaltyPoints(BigDecimal totalLoyaltyPoints) {
        this.totalLoyaltyPoints = totalLoyaltyPoints;
    }

    public BigDecimal getTotalLoyaltyPointsUsed() {
        return totalLoyaltyPointsUsed;
    }

    public void setTotalLoyaltyPointsUsed(BigDecimal totalLoyaltyPointsUsed) {
        this.totalLoyaltyPointsUsed = totalLoyaltyPointsUsed;
    }

    public BigDecimal getTotalWalletRealPlayed() {
        return totalWalletRealPlayed;
    }

    public void setTotalWalletRealPlayed(BigDecimal totalWalletRealPlayed) {
        this.totalWalletRealPlayed = totalWalletRealPlayed;
    }

    public BigDecimal getTotalWalletRealPlayedOnline() {
        return totalWalletRealPlayedOnline;
    }

    public void setTotalWalletRealPlayedOnline(BigDecimal totalWalletRealPlayedOnline) {
        this.totalWalletRealPlayedOnline = totalWalletRealPlayedOnline;
    }

    public BigDecimal getTotalWalletRealPlayedRetail() {
        return totalWalletRealPlayedRetail;
    }

    public void setTotalWalletRealPlayedRetail(BigDecimal totalWalletRealPlayedRetail) {
        this.totalWalletRealPlayedRetail = totalWalletRealPlayedRetail;
    }

    public BigDecimal getTotalWalletRealPlayedSelfService() {
        return totalWalletRealPlayedSelfService;
    }

    public void setTotalWalletRealPlayedSelfService(BigDecimal totalWalletRealPlayedSelfService) {
        this.totalWalletRealPlayedSelfService = totalWalletRealPlayedSelfService;
    }

    public BigDecimal getTotalWalletRealWon() {
        return totalWalletRealWon;
    }

    public void setTotalWalletRealWon(BigDecimal totalWalletRealWon) {
        this.totalWalletRealWon = totalWalletRealWon;
    }

    public BigDecimal getTotalWalletRealWonOnline() {
        return totalWalletRealWonOnline;
    }

    public void setTotalWalletRealWonOnline(BigDecimal totalWalletRealWonOnline) {
        this.totalWalletRealWonOnline = totalWalletRealWonOnline;
    }

    public BigDecimal getTotalWalletRealWonRetail() {
        return totalWalletRealWonRetail;
    }

    public void setTotalWalletRealWonRetail(BigDecimal totalWalletRealWonRetail) {
        this.totalWalletRealWonRetail = totalWalletRealWonRetail;
    }

    public BigDecimal getTotalWalletRealWonSelfService() {
        return totalWalletRealWonSelfService;
    }

    public void setTotalWalletRealWonSelfService(BigDecimal totalWalletRealWonSelfService) {
        this.totalWalletRealWonSelfService = totalWalletRealWonSelfService;
    }

    public BigDecimal getTotalWon() {
        return totalWon;
    }

    public void setTotalWon(BigDecimal totalWon) {
        this.totalWon = totalWon;
    }

    public BigDecimal getTotalWonBonus() {
        return totalWonBonus;
    }

    public void setTotalWonBonus(BigDecimal totalWonBonus) {
        this.totalWonBonus = totalWonBonus;
    }

    public BigDecimal getTotalWonBonusWinLocked() {
        return totalWonBonusWinLocked;
    }

    public void setTotalWonBonusWinLocked(BigDecimal totalWonBonusWinLocked) {
        this.totalWonBonusWinLocked = totalWonBonusWinLocked;
    }

    public BigDecimal getTotalWonReal() {
        return totalWonReal;
    }

    public void setTotalWonReal(BigDecimal totalWonReal) {
        this.totalWonReal = totalWonReal;
    }

    public BigDecimal getWithdrawalPendingAmount() {
        return withdrawalPendingAmount;
    }

    public void setWithdrawalPendingAmount(BigDecimal withdrawalPendingAmount) {
        this.withdrawalPendingAmount = withdrawalPendingAmount;
    }

    public BigDecimal getWithdrawnAmount() {
        return withdrawnAmount;
    }

    public void setWithdrawnAmount(BigDecimal withdrawnAmount) {
        this.withdrawnAmount = withdrawnAmount;
    }

}
