
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Generic {

    @SerializedName("activationTime")
    @Expose
    private Long activationTime;
    @SerializedName("affectNextDraw")
    @Expose
    private Long affectNextDraw;
    @SerializedName("approverId")
    @Expose
    private Object approverId;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("deActivationTime")
    @Expose
    private Long deActivationTime;
    @SerializedName("drawConfig")
    @Expose
    private DrawConfig drawConfig;
    @SerializedName("gameId")
    @Expose
    private Long gameId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("status")
    @Expose
    private Long status;
    @SerializedName("record")
    @Expose
    private Long record;
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

    public Long getActivationTime() {
        return activationTime;
    }

    public void setActivationTime(Long activationTime) {
        this.activationTime = activationTime;
    }

    public Long getAffectNextDraw() {
        return affectNextDraw;
    }

    public void setAffectNextDraw(Long affectNextDraw) {
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

    public Long getDeActivationTime() {
        return deActivationTime;
    }

    public void setDeActivationTime(Long deActivationTime) {
        this.deActivationTime = deActivationTime;
    }

    public DrawConfig getDrawConfig() {
        return drawConfig;
    }

    public void setDrawConfig(DrawConfig drawConfig) {
        this.drawConfig = drawConfig;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getRecord() {
        return record;
    }

    public void setRecord(Long record) {
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
