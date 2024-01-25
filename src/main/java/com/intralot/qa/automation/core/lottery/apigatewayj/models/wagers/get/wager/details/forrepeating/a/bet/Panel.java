
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Panel {

    @SerializedName("options")
    @Expose
    private List<String> options = null;
    @SerializedName("quickPick")
    @Expose
    private Boolean quickPick;
    @SerializedName("requested")
    @Expose
    private Integer requested;
    @SerializedName("selection")
    @Expose
    private List<Integer> selection = null;
    @SerializedName("QPSelections")
    @Expose
    private Integer qPSelections;

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Boolean getQuickPick() {
        return quickPick;
    }

    public void setQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
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

    public Integer getQPSelections() {
        return qPSelections;
    }

    public void setQPSelections(Integer qPSelections) {
        this.qPSelections = qPSelections;
    }

}
