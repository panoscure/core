package com.intralot.qa.automation.core.device.information.finder;

import com.intralot.qa.automation.core.device.information.exception.DeviceNotFoundException;
import com.intralot.qa.automation.core.device.information.model.Device;
import com.intralot.qa.automation.core.device.information.model.DeviceInfoModel;

import java.io.IOException;
import java.util.Map;

public interface DeviceFinder<S extends Device> {

    default DeviceInfoModel<S> findDevices() throws IOException, DeviceNotFoundException {
        return findDevices("");
    }

    DeviceInfoModel<S> findDevices(String localPath) throws IOException, DeviceNotFoundException;

    default Map<String, Object> readDeviceInfo() throws IOException {
        return readDeviceInfo("");
    }

    Map<String, Object> readDeviceInfo(String localPath) throws IOException;

}
