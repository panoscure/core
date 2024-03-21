
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "quickPick",
        "requested",
        "selection",
        "QPSelections"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Panel {

    @JsonProperty("quickPick")
    private Boolean quickPick;
    @JsonProperty("requested")
    private Integer requested;
    @JsonProperty("selection")
    private List<Integer> selection;
    @JsonProperty("QPSelections")
    private Integer qPSelections;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("quickPick")
    public Boolean getQuickPick() {
        return quickPick;
    }

    @JsonProperty("quickPick")
    public void setQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
    }

    @JsonProperty("requested")
    public Integer getRequested() {
        return requested;
    }

    @JsonProperty("requested")
    public void setRequested(Integer requested) {
        this.requested = requested;
    }

    @JsonProperty("selection")
    public List<Integer> getSelection() {
        return selection;
    }

    @JsonProperty("selection")
    public void setSelection(List<Integer> selection) {
        this.selection = selection;
    }

    @JsonProperty("QPSelections")
    public Integer getQPSelections() {
        return qPSelections;
    }

    @JsonProperty("QPSelections")
    public void setQPSelections(Integer qPSelections) {
        this.qPSelections = qPSelections;
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
