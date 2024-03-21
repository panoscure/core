
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "draws",
        "firstDraw",
        "firstDrawTime",
        "firstVisualDraw",
        "lastDraw",
        "lastDrawTime",
        "lastVisualDraw",
        "multipleDraws",
        "playedDraw"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticipatingDraws {

    @JsonProperty("draws")
    private List<Integer> draws;
    @JsonProperty("firstDraw")
    private Integer firstDraw;
    @JsonProperty("firstDrawTime")
    private String firstDrawTime;
    @JsonProperty("firstVisualDraw")
    private Integer firstVisualDraw;
    @JsonProperty("lastDraw")
    private Integer lastDraw;
    @JsonProperty("lastDrawTime")
    private String lastDrawTime;
    @JsonProperty("lastVisualDraw")
    private Integer lastVisualDraw;
    @JsonProperty("multipleDraws")
    private Integer multipleDraws;
    @JsonProperty("playedDraw")
    private Integer playedDraw;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("draws")
    public List<Integer> getDraws() {
        return draws;
    }

    @JsonProperty("draws")
    public void setDraws(List<Integer> draws) {
        this.draws = draws;
    }

    @JsonProperty("firstDraw")
    public Integer getFirstDraw() {
        return firstDraw;
    }

    @JsonProperty("firstDraw")
    public void setFirstDraw(Integer firstDraw) {
        this.firstDraw = firstDraw;
    }

    @JsonProperty("firstDrawTime")
    public String getFirstDrawTime() {
        return firstDrawTime;
    }

    @JsonProperty("firstDrawTime")
    public void setFirstDrawTime(String firstDrawTime) {
        this.firstDrawTime = firstDrawTime;
    }

    @JsonProperty("firstVisualDraw")
    public Integer getFirstVisualDraw() {
        return firstVisualDraw;
    }

    @JsonProperty("firstVisualDraw")
    public void setFirstVisualDraw(Integer firstVisualDraw) {
        this.firstVisualDraw = firstVisualDraw;
    }

    @JsonProperty("lastDraw")
    public Integer getLastDraw() {
        return lastDraw;
    }

    @JsonProperty("lastDraw")
    public void setLastDraw(Integer lastDraw) {
        this.lastDraw = lastDraw;
    }

    @JsonProperty("lastDrawTime")
    public String getLastDrawTime() {
        return lastDrawTime;
    }

    @JsonProperty("lastDrawTime")
    public void setLastDrawTime(String lastDrawTime) {
        this.lastDrawTime = lastDrawTime;
    }

    @JsonProperty("lastVisualDraw")
    public Integer getLastVisualDraw() {
        return lastVisualDraw;
    }

    @JsonProperty("lastVisualDraw")
    public void setLastVisualDraw(Integer lastVisualDraw) {
        this.lastVisualDraw = lastVisualDraw;
    }

    @JsonProperty("multipleDraws")
    public Integer getMultipleDraws() {
        return multipleDraws;
    }

    @JsonProperty("multipleDraws")
    public void setMultipleDraws(Integer multipleDraws) {
        this.multipleDraws = multipleDraws;
    }

    @JsonProperty("playedDraw")
    public Integer getPlayedDraw() {
        return playedDraw;
    }

    @JsonProperty("playedDraw")
    public void setPlayedDraw(Integer playedDraw) {
        this.playedDraw = playedDraw;
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
