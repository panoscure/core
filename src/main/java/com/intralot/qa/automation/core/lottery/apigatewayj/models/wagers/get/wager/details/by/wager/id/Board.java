
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
        "boardId",
        "multipliers",
        "panels"
})
public class Board {

    @JsonProperty("boardId")
    private Integer boardId;
    @JsonProperty("multipliers")
    private List<Integer> multipliers;
    @JsonProperty("panels")
    private List<Panel> panels;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("boardId")
    public Integer getBoardId() {
        return boardId;
    }

    @JsonProperty("boardId")
    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    @JsonProperty("multipliers")
    public List<Integer> getMultipliers() {
        return multipliers;
    }

    @JsonProperty("multipliers")
    public void setMultipliers(List<Integer> multipliers) {
        this.multipliers = multipliers;
    }

    @JsonProperty("panels")
    public List<Panel> getPanels() {
        return panels;
    }

    @JsonProperty("panels")
    public void setPanels(List<Panel> panels) {
        this.panels = panels;
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
