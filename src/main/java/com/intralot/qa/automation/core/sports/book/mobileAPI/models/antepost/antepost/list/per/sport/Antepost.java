package com.intralot.qa.automation.core.sports.book.mobileAPI.models.antepost.antepost.list.per.sport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Antepost {
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("categoryImg")
    @Expose
    private String categoryImg;
    @SerializedName("tournaments")
    @Expose
    private List<Tournament> tournaments = null;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryImg() {
        return categoryImg;
    }

    public void setCategoryImg(String categoryImg) {
        this.categoryImg = categoryImg;
    }

    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

}
