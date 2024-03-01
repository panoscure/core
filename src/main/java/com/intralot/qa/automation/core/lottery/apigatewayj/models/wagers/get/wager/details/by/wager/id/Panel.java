
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Panel {

    @SerializedName("quickPick")
    @Expose
    private Boolean quickPick;
    @SerializedName("requested")
    @Expose
    private Integer requested;
    @SerializedName("selection")
    @Expose
    private List<Integer> selection = null;
    @SerializedName("qpselections")
    @Expose
    private Integer qpselections;

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


    public Integer getQpselections() {
        return qpselections;
    }

    public void setQpselections(Integer qpselections) {
        this.qpselections = qpselections;
    }
}
