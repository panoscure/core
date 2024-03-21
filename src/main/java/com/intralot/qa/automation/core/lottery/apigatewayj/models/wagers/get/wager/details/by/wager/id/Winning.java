
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "gameId",
        "totalAmounts",
        "startDraw",
        "endDraw",
        "paidDraws",
        "details",
        "summary",
        "status",
        "blockingStatus",
        "highWinner",
        "playedDraw",
        "teamShares",
        "playerId",
        "taxationLevel",
        "hasGift",
        "cost",
        "saleRetailerId",
        "saleChannel"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Winning {

    @JsonProperty("gameId")
    private Integer gameId;
    @JsonProperty("totalAmounts")
    private TotalAmounts totalAmounts;
    @JsonProperty("startDraw")
    private Integer startDraw;
    @JsonProperty("endDraw")
    private Integer endDraw;
    @JsonProperty("paidDraws")
    private List<Object> paidDraws;
    @JsonProperty("details")
    private List<Detail> details;
    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("status")
    private String status;
    @JsonProperty("blockingStatus")
    private String blockingStatus;
    @JsonProperty("highWinner")
    private Boolean highWinner;
    @JsonProperty("playedDraw")
    private Integer playedDraw;
    @JsonProperty("teamShares")
    private Integer teamShares;
    @JsonProperty("playerId")
    private Integer playerId;
    @JsonProperty("taxationLevel")
    private String taxationLevel;
    @JsonProperty("hasGift")
    private Boolean hasGift;
    @JsonProperty("cost")
    private Integer cost;
    @JsonProperty("saleRetailerId")
    private Integer saleRetailerId;
    @JsonProperty("saleChannel")
    private Integer saleChannel;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("gameId")
    public Integer getGameId() {
        return gameId;
    }

    @JsonProperty("gameId")
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("totalAmounts")
    public TotalAmounts getTotalAmounts() {
        return totalAmounts;
    }

    @JsonProperty("totalAmounts")
    public void setTotalAmounts(TotalAmounts totalAmounts) {
        this.totalAmounts = totalAmounts;
    }

    @JsonProperty("startDraw")
    public Integer getStartDraw() {
        return startDraw;
    }

    @JsonProperty("startDraw")
    public void setStartDraw(Integer startDraw) {
        this.startDraw = startDraw;
    }

    @JsonProperty("endDraw")
    public Integer getEndDraw() {
        return endDraw;
    }

    @JsonProperty("endDraw")
    public void setEndDraw(Integer endDraw) {
        this.endDraw = endDraw;
    }

    @JsonProperty("paidDraws")
    public List<Object> getPaidDraws() {
        return paidDraws;
    }

    @JsonProperty("paidDraws")
    public void setPaidDraws(List<Object> paidDraws) {
        this.paidDraws = paidDraws;
    }

    @JsonProperty("details")
    public List<Detail> getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("blockingStatus")
    public String getBlockingStatus() {
        return blockingStatus;
    }

    @JsonProperty("blockingStatus")
    public void setBlockingStatus(String blockingStatus) {
        this.blockingStatus = blockingStatus;
    }

    @JsonProperty("highWinner")
    public Boolean getHighWinner() {
        return highWinner;
    }

    @JsonProperty("highWinner")
    public void setHighWinner(Boolean highWinner) {
        this.highWinner = highWinner;
    }

    @JsonProperty("playedDraw")
    public Integer getPlayedDraw() {
        return playedDraw;
    }

    @JsonProperty("playedDraw")
    public void setPlayedDraw(Integer playedDraw) {
        this.playedDraw = playedDraw;
    }

    @JsonProperty("teamShares")
    public Integer getTeamShares() {
        return teamShares;
    }

    @JsonProperty("teamShares")
    public void setTeamShares(Integer teamShares) {
        this.teamShares = teamShares;
    }

    @JsonProperty("playerId")
    public Integer getPlayerId() {
        return playerId;
    }

    @JsonProperty("playerId")
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("taxationLevel")
    public String getTaxationLevel() {
        return taxationLevel;
    }

    @JsonProperty("taxationLevel")
    public void setTaxationLevel(String taxationLevel) {
        this.taxationLevel = taxationLevel;
    }

    @JsonProperty("hasGift")
    public Boolean getHasGift() {
        return hasGift;
    }

    @JsonProperty("hasGift")
    public void setHasGift(Boolean hasGift) {
        this.hasGift = hasGift;
    }

    @JsonProperty("cost")
    public Integer getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @JsonProperty("saleRetailerId")
    public Integer getSaleRetailerId() {
        return saleRetailerId;
    }

    @JsonProperty("saleRetailerId")
    public void setSaleRetailerId(Integer saleRetailerId) {
        this.saleRetailerId = saleRetailerId;
    }

    @JsonProperty("saleChannel")
    public Integer getSaleChannel() {
        return saleChannel;
    }

    @JsonProperty("saleChannel")
    public void setSaleChannel(Integer saleChannel) {
        this.saleChannel = saleChannel;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
