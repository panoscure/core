package com.intralot.qa.automation.core.sports.book.mobileAPI.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetPlayerOpenBetsModel {
    @SerializedName("openbets")
    @Expose
    private List<Openbet> openbets = null;

    public List<Openbet> getOpenbets() {
        return openbets;
    }

    public void setOpenbets(List<Openbet> openbets) {
        this.openbets = openbets;
    }
}
