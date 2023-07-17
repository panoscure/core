package com.intralot.qa.automation.core.device.information.helper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.intralot.qa.automation.core.device.information.model.Device;
import com.intralot.qa.automation.core.device.information.model.DeviceInfoModel;

import java.util.Map;

public class JsonHelper {
    private JsonHelper() {
    }

    public static <S extends Device> DeviceInfoModel<S> convertJsonToDeviceInfo(
            Map<String, Object> deviceList, TypeToken typeToken) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(String.valueOf(gson.toJson(deviceList)), typeToken.getType());
    }
}
