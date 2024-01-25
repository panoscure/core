package com.intralot.qa.automation.core.sports.book.apigatewayj.models;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

public class BaseModel {
    public String toJsonString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT, Modifier.VOLATILE)
                .create();
        return gson.toJson(this);
    }
}
