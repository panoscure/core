
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "columns",
    "cost",
    "gameTypeId",
    "discount"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddOn {

    @JsonProperty("columns")
    private Integer columns;
    @JsonProperty("cost")
    private Double cost;
    @JsonProperty("gameTypeId")
    private Integer gameTypeId;
    @JsonProperty("discount")
    private Integer discount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    @JsonProperty("gameTypeId")
    public Integer getGameTypeId() {
        return gameTypeId;
    }

    @JsonProperty("gameTypeId")
    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    @JsonProperty("discount")
    public Integer getDiscount() {
        return discount;
    }

    @JsonProperty("discount")
    public void setDiscount(Integer discount) {
        this.discount = discount;
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
