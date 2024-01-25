
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.an.event.by.id.with.all.defined.markets;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetAnEventByIdWithAllDefinedMarketsModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sportId")
    @Expose
    private String sportId;
    @SerializedName("categId")
    @Expose
    private String categId;
    @SerializedName("tourId")
    @Expose
    private String tourId;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants = null;
    @SerializedName("markets")
    @Expose
    private List<Market> markets = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getCategId() {
        return categId;
    }

    public void setCategId(String categId) {
        this.categId = categId;
    }

    public String getTourId() {
        return tourId;
    }

    public void setTourId(String tourId) {
        this.tourId = tourId;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

}
