package com.intralot.qa.automation.core.jira.models.zephyr.executions;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("1")
    @Expose
    private _1 _1;
    @SerializedName("2")
    @Expose
    private _2 _2;
    @SerializedName("3")
    @Expose
    private _3 _3;
    @SerializedName("4")
    @Expose
    private _4 _4;
    @SerializedName("5")
    @Expose
    private _5 _5;
    @SerializedName("-1")
    @JsonIgnore
    private MinusOne minusOne;

    public _1 get1() {
        return _1;
    }

    public void set1(_1 _1) {
        this._1 = _1;
    }

    public _2 get2() {
        return _2;
    }

    public void set2(_2 _2) {
        this._2 = _2;
    }

    public _3 get3() {
        return _3;
    }

    public void set3(_3 _3) {
        this._3 = _3;
    }

    public _4 get4() {
        return _4;
    }

    public void set4(_4 _4) {
        this._4 = _4;
    }

    public _5 get5() {
        return _5;
    }

    public void set5(_5 _5) {
        this._5 = _5;
    }

    public MinusOne getMinusOne() {
        return minusOne;
    }

    public void setMinusOne(MinusOne minusOne) {
        this.minusOne = minusOne;
    }

}