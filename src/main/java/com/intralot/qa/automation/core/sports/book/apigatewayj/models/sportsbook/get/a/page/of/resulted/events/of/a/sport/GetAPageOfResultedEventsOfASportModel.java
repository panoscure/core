package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.a.page.of.resulted.events.of.a.sport;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetAPageOfResultedEventsOfASportModel {

    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("totalPages")
    @Expose
    private Integer totalPages;
    @SerializedName("content")
    @Expose
    private List<Content> content = null;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

}