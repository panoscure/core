package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.a.page.of.resulted.events.of.a.sport;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("sportId")
    @Expose
    private String sportId;
    @SerializedName("categId")
    @Expose
    private String categId;
    @SerializedName("categName")
    @Expose
    private String categName;
    @SerializedName("tourId")
    @Expose
    private String tourId;
    @SerializedName("tourName")
    @Expose
    private String tourName;
    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("names")
    @Expose
    private Names names;
    @SerializedName("compNames")
    @Expose
    private CompNames compNames;
    @SerializedName("categoryNames")
    @Expose
    private CategoryNames categoryNames;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("outright")
    @Expose
    private Boolean outright;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants = null;
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("scoreProgress")
    @Expose
    private ScoreProgress scoreProgress;
    @SerializedName("path")
    @Expose
    private String path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getCategName() {
        return categName;
    }

    public void setCategName(String categName) {
        this.categName = categName;
    }

    public String getTourId() {
        return tourId;
    }

    public void setTourId(String tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    public CompNames getCompNames() {
        return compNames;
    }

    public void setCompNames(CompNames compNames) {
        this.compNames = compNames;
    }

    public CategoryNames getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(CategoryNames categoryNames) {
        this.categoryNames = categoryNames;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getOutright() {
        return outright;
    }

    public void setOutright(Boolean outright) {
        this.outright = outright;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public ScoreProgress getScoreProgress() {
        return scoreProgress;
    }

    public void setScoreProgress(ScoreProgress scoreProgress) {
        this.scoreProgress = scoreProgress;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
