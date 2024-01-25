
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    public Panel withOptions(List<String> options) {
        this.options = options;
        return this;
    }

    public Boolean getQuickPick() {
        return quickPick;
    }

    public void setQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
    }

    public Panel withQuickPick(Boolean quickPick) {
        this.quickPick = quickPick;
        return this;
    }

    public Integer getRequested() {
        return requested;
    }

    public void setRequested(Integer requested) {
        this.requested = requested;
    }

    public Panel withRequested(Integer requested) {
        this.requested = requested;
        return this;
    }

    public List<Integer> getSelection() {
        return selection;
    }

    public void setSelection(List<Integer> selection) {
        this.selection = selection;
    }

    public Panel withSelection(List<Integer> selection) {
        this.selection = selection;
        return this;
    }

    public Integer getQPSelections() {
        return qPSelections;
    }

    public void setQPSelections(Integer qPSelections) {
        this.qPSelections = qPSelections;
    }

    public Panel withQPSelections(Integer qPSelections) {
        this.qPSelections = qPSelections;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("options", options).append("quickPick", quickPick).append("requested", requested).append("selection", selection).append("qPSelections", qPSelections).toString();
    }

}
