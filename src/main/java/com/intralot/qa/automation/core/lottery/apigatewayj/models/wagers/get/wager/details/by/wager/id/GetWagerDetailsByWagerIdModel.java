
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
        "wager",
        "winnings",
        "serialNumbers",
        "metadata",
        "pilot",
        "teamIndex"
})
public class GetWagerDetailsByWagerIdModel {

    @JsonProperty("wager")
    private Wager wager;
    @JsonProperty("winnings")
    private List<Winning> winnings;
    @JsonProperty("serialNumbers")
    private List<String> serialNumbers;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("pilot")
    private Boolean pilot;
    @JsonProperty("teamIndex")
    private Integer teamIndex;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("wager")
    public Wager getWager() {
        return wager;
    }

    @JsonProperty("wager")
    public void setWager(Wager wager) {
        this.wager = wager;
    }

    @JsonProperty("winnings")
    public List<Winning> getWinnings() {
        return winnings;
    }

    @JsonProperty("winnings")
    public void setWinnings(List<Winning> winnings) {
        this.winnings = winnings;
    }

    @JsonProperty("serialNumbers")
    public List<String> getSerialNumbers() {
        return serialNumbers;
    }

    @JsonProperty("serialNumbers")
    public void setSerialNumbers(List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("pilot")
    public Boolean getPilot() {
        return pilot;
    }

    @JsonProperty("pilot")
    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

    @JsonProperty("teamIndex")
    public Integer getTeamIndex() {
        return teamIndex;
    }

    @JsonProperty("teamIndex")
    public void setTeamIndex(Integer teamIndex) {
        this.teamIndex = teamIndex;
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
