
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Selection {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("names")
    @Expose
    private Names___ names;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("odd")
    @Expose
    private Odd odd;
    @SerializedName("sts")
    @Expose
    private String sts;
    @SerializedName("displayed")
    @Expose
    private Boolean displayed;
    @SerializedName("pos")
    @Expose
    private Pos pos;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Selection() {
    }

    /**
     * 
     * @param id
     * @param displayed
     * @param names
     * @param sts
     * @param name
     * @param code
     * @param odd
     * @param type
     * @param pos
     */
    public Selection(String id, String code, String name, Names___ names, String type, Odd odd, String sts, Boolean displayed, Pos pos) {
        super();
        this.id = id;
        this.code = code;
        this.name = name;
        this.names = names;
        this.type = type;
        this.odd = odd;
        this.sts = sts;
        this.displayed = displayed;
        this.pos = pos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Names___ getNames() {
        return names;
    }

    public void setNames(Names___ names) {
        this.names = names;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Odd getOdd() {
        return odd;
    }

    public void setOdd(Odd odd) {
        this.odd = odd;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos pos) {
        this.pos = pos;
    }

}
