package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Generic {

    @SerializedName("activationTime")
    @Expose
    private BigInteger activationTime;
    @SerializedName("affectNextDraw")
    @Expose
    private Integer affectNextDraw;
    @SerializedName("approverId")
    @Expose
    private Object approverId;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("deActivationTime")
    @Expose
    private Integer deActivationTime;
    @SerializedName("drawConfig")
    @Expose
    private DrawConfig drawConfig;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("record")
    @Expose
    private Integer record;
    @SerializedName("operators")
    @Expose
    private List<Operator> operators = null;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("pricePoints")
    @Expose
    private PricePoints pricePoints;
    @SerializedName("roundingParams")
    @Expose
    private RoundingParams roundingParams;
    @SerializedName("gameOperations")
    @Expose
    private GameOperations gameOperations;
    @SerializedName("channelGameOperations")
    @Expose
    private List<ChannelGameOperation> channelGameOperations = null;

    public BigInteger getActivationTime() {
        return activationTime;
    }

    public void setActivationTime(BigInteger activationTime) {
        this.activationTime = activationTime;
    }

    public Integer getAffectNextDraw() {
        return affectNextDraw;
    }

    public void setAffectNextDraw(Integer affectNextDraw) {
        this.affectNextDraw = affectNextDraw;
    }

    public Object getApproverId() {
        return approverId;
    }

    public void setApproverId(Object approverId) {
        this.approverId = approverId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getDeActivationTime() {
        return deActivationTime;
    }

    public void setDeActivationTime(Integer deActivationTime) {
        this.deActivationTime = deActivationTime;
    }

    public DrawConfig getDrawConfig() {
        return drawConfig;
    }

    public void setDrawConfig(DrawConfig drawConfig) {
        this.drawConfig = drawConfig;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        this.record = record;
    }

    public List<Operator> getOperators() {
        return operators;
    }

    public void setOperators(List<Operator> operators) {
        this.operators = operators;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PricePoints getPricePoints() {
        return pricePoints;
    }

    public void setPricePoints(PricePoints pricePoints) {
        this.pricePoints = pricePoints;
    }

    public RoundingParams getRoundingParams() {
        return roundingParams;
    }

    public void setRoundingParams(RoundingParams roundingParams) {
        this.roundingParams = roundingParams;
    }

    public GameOperations getGameOperations() {
        return gameOperations;
    }

    public void setGameOperations(GameOperations gameOperations) {
        this.gameOperations = gameOperations;
    }

    public List<ChannelGameOperation> getChannelGameOperations() {
        return channelGameOperations;
    }

    public void setChannelGameOperations(List<ChannelGameOperation> channelGameOperations) {
        this.channelGameOperations = channelGameOperations;
    }

}
