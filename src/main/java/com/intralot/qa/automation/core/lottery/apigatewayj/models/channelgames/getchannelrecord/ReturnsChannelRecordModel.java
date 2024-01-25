
package com.intralot.qa.automation.core.lottery.apigatewayj.models.channelgames.getchannelrecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnsChannelRecordModel {

    @SerializedName("channelId")
    @Expose
    private String channelId;
    @SerializedName("approverId")
    @Expose
    private Object approverId;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("gameId")
    @Expose
    private Long gameId;
    @SerializedName("record")
    @Expose
    private Long record;
    @SerializedName("gameRecord")
    @Expose
    private Long gameRecord;
    @SerializedName("operatorId")
    @Expose
    private String operatorId;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
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

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Long getRecord() {
        return record;
    }

    public void setRecord(Long record) {
        this.record = record;
    }

    public Long getGameRecord() {
        return gameRecord;
    }

    public void setGameRecord(Long gameRecord) {
        this.gameRecord = gameRecord;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

}
