
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "addOn",
        "blockStatus",
        "boards",
        "columns",
        "cost",
        "creationTime",
        "updatedTime",
        "discount",
        "gameId",
        "isPrimary",
        "multipliers",
        "options",
        "participatingDraws",
        "status",
        "selectionsType",
        "wagerType"
})
public class Dbg {

    @JsonProperty("addOn")
    private List<AddOn> addOn;
    @JsonProperty("blockStatus")
    private String blockStatus;
    @JsonProperty("boards")
    private List<Board> boards;
    @JsonProperty("columns")
    private Integer columns;
    @JsonProperty("cost")
    private Double cost;
    @JsonProperty("creationTime")
    private Long creationTime;
    @JsonProperty("updatedTime")
    private Long updatedTime;
    @JsonProperty("discount")
    private Double discount;
    @JsonProperty("gameId")
    private Integer gameId;
    @JsonProperty("isPrimary")
    private Boolean isPrimary;
    @JsonProperty("multipliers")
    private List<Object> multipliers;
    @JsonProperty("options")
    private List<String> options;
    @JsonProperty("participatingDraws")
    private ParticipatingDraws participatingDraws;
    @JsonProperty("status")
    private String status;
    @JsonProperty("selectionsType")
    private Integer selectionsType;
    @JsonProperty("wagerType")
    private Integer wagerType;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("addOn")
    public List<AddOn> getAddOn() {
        return addOn;
    }

    @JsonProperty("addOn")
    public void setAddOn(List<AddOn> addOn) {
        this.addOn = addOn;
    }

    @JsonProperty("blockStatus")
    public String getBlockStatus() {
        return blockStatus;
    }

    @JsonProperty("blockStatus")
    public void setBlockStatus(String blockStatus) {
        this.blockStatus = blockStatus;
    }

    @JsonProperty("boards")
    public List<Board> getBoards() {
        return boards;
    }

    @JsonProperty("boards")
    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    @JsonProperty("columns")
    public Integer getColumns() {
        return columns;
    }

    @JsonProperty("columns")
    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    @JsonProperty("cost")
    public Double getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(Double cost) {
        this.cost = cost;
    }

    @JsonProperty("creationTime")
    public Long getCreationTime() {
        return creationTime;
    }

    @JsonProperty("creationTime")
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    @JsonProperty("updatedTime")
    public Long getUpdatedTime() {
        return updatedTime;
    }

    @JsonProperty("updatedTime")
    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    @JsonProperty("discount")
    public Double getDiscount() {
        return discount;
    }

    @JsonProperty("discount")
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @JsonProperty("gameId")
    public Integer getGameId() {
        return gameId;
    }

    @JsonProperty("gameId")
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("isPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("isPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("multipliers")
    public List<Object> getMultipliers() {
        return multipliers;
    }

    @JsonProperty("multipliers")
    public void setMultipliers(List<Object> multipliers) {
        this.multipliers = multipliers;
    }

    @JsonProperty("options")
    public List<String> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<String> options) {
        this.options = options;
    }

    @JsonProperty("participatingDraws")
    public ParticipatingDraws getParticipatingDraws() {
        return participatingDraws;
    }

    @JsonProperty("participatingDraws")
    public void setParticipatingDraws(ParticipatingDraws participatingDraws) {
        this.participatingDraws = participatingDraws;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("selectionsType")
    public Integer getSelectionsType() {
        return selectionsType;
    }

    @JsonProperty("selectionsType")
    public void setSelectionsType(Integer selectionsType) {
        this.selectionsType = selectionsType;
    }

    @JsonProperty("wagerType")
    public Integer getWagerType() {
        return wagerType;
    }

    @JsonProperty("wagerType")
    public void setWagerType(Integer wagerType) {
        this.wagerType = wagerType;
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
