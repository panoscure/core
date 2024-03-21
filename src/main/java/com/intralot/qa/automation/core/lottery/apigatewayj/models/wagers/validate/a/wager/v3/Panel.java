package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.validate.a.wager.v3;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Panel {

    @SerializedName("quickPick")
    @Expose
    private Boolean quickPick;
    @SerializedName("qpSelections")
    @Expose
    private Integer qpSelections;
    @SerializedName("requested")
    @Expose
    private Integer requested;
    @SerializedName("selection")
    @Expose
    private List<Integer> selection = null;
    @SerializedName("options")
    @Expose
    private List<Object> options = null;

    public Boolean getQuickPick() {
        return quickPick;
    }

    public void setQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
    }

    public Integer getQpSelections() {
        return qpSelections;
    }

    public void setQpSelections(Integer qpSelections) {
        this.qpSelections = qpSelections;
    }

    public Integer getRequested() {
        return requested;
    }

    public void setRequested(Integer requested) {
        this.requested = requested;
    }

    public List<Integer> getSelection() {
        return selection;
    }

    public void setSelection(List<Integer> selection) {
        this.selection = selection;
    }

    public List<Object> getOptions() {
        return options;
    }

    public void setOptions(List<Object> options) {
        this.options = options;
    }

}
