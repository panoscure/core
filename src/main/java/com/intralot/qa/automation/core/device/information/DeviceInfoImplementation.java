package com.intralot.qa.automation.core.device.information;

import com.intralot.qa.automation.core.device.information.exception.DeviceNotFoundException;
import com.intralot.qa.automation.core.device.information.finder.DeviceFinder;
import com.intralot.qa.automation.core.device.information.finder.DeviceFinderFactory;
import com.intralot.qa.automation.core.device.information.finder.DeviceType;
import com.intralot.qa.automation.core.device.information.model.Android;
import com.intralot.qa.automation.core.device.information.model.Device;
import com.intralot.qa.automation.core.device.information.model.Ios;
import com.intralot.qa.automation.core.device.information.model.IosSimulator;
import org.apache.commons.exec.OS;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.List;

public class DeviceInfoImplementation implements DeviceInfo {

    private DeviceFinder deviceFinder;

    public DeviceInfoImplementation(DeviceType deviceType) throws UnsupportedOperationException {
        if (!StringUtils.isEmpty(System.getProperty("key"))) {
            throw new IllegalArgumentException(
                    getClass().getSimpleName()
                            + " - "
                            + System.getProperty("key")
                            + " - will not work if you have any key value.");
        }

        if (deviceType == DeviceType.IOS && !isOperatingSystemMacOs()) {
            throw new UnsupportedOperationException(
                    "Operation System Is Not Valid! Ios device info only run macos operation system.");
        }

        if (deviceType == DeviceType.IOSSIMULATOR && !isOperatingSystemMacOs()) {
            throw new UnsupportedOperationException(
                    "Operation System Is Not Valid! Ios Simulator device info only run macos operation system.");
        }

        deviceFinder = DeviceFinderFactory.createDeviceFinder(deviceType);
    }

    private boolean isOperatingSystemMacOs() {
        return OS.isFamilyMac();
    }

    @Override
    public List<Device> getDevices() throws IOException, DeviceNotFoundException {
        return deviceFinder.findDevices().getDevices();
    }

    @Override
    public List<Android> getAndroidDevices() throws IOException, DeviceNotFoundException {
        return deviceFinder.findDevices().getAndroidDevices();
    }

    @Override
    public List<Ios> getIosDevices() throws IOException, DeviceNotFoundException {
        return deviceFinder.findDevices().getIosDevices();
    }

    @Override
    public List<IosSimulator> getIosSimulatorDevices() throws IOException, DeviceNotFoundException {
        return deviceFinder.findDevices().getIosSimulatorDevices();
    }
}
