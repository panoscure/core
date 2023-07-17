package com.intralot.qa.automation.core.device.information;

import com.intralot.qa.automation.core.device.information.exception.DeviceNotFoundException;
import com.intralot.qa.automation.core.device.information.model.Android;
import com.intralot.qa.automation.core.device.information.model.Device;
import com.intralot.qa.automation.core.device.information.model.Ios;
import com.intralot.qa.automation.core.device.information.model.IosSimulator;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public interface DeviceInfo {

    default boolean anyDeviceConnected() throws IOException, DeviceNotFoundException {
        return getDevices().size() > 0;
    }

    default Device getFirstDevice() throws IOException, DeviceNotFoundException {
        return getDevices().stream().findFirst().orElse(null);
    }

    default Android getFirstAndroid() throws IOException, DeviceNotFoundException {
        return (Android)
                getDevices().stream()
                        .filter(device -> device.getDeviceProductPlatform().contains("Android"))
                        .filter(device -> device.getSerialNumber() != null)
                        .filter(device -> !device.getModelNumber().contains("SDK"))
                        .findFirst()
                        .orElse(null);
    }

    default Android getFirstAndroidEmulator() throws IOException, DeviceNotFoundException {
        return (Android)
                getDevices().stream()
                        .filter(device -> device.getDeviceProductPlatform().contains("Android"))
                        .filter(device -> device.getSerialNumber() == null)
                        .filter(device -> device.getModelNumber().contains("SDK"))
                        .findFirst()
                        .orElse(null);
    }

    default Ios getFirstIos() throws IOException, DeviceNotFoundException {
        return (Ios)
                getDevices().stream()
                        .filter(device -> device.getDeviceProductPlatform().contains("Ios"))
                        .findFirst()
                        .orElse(null);
    }

    default IosSimulator getFirstIosSimulator() throws IOException, DeviceNotFoundException {
        return (IosSimulator)
                getDevices().stream()
                        .filter(device -> device.getDeviceProductPlatform().contains("Ios Simulator"))
                        .findFirst()
                        .orElse(null);
    }

    default Device getFirstAndroidDevice() throws IOException, DeviceNotFoundException {
        return getDevices().stream()
                .filter(device -> device.getDeviceProductPlatform().contains("Android"))
                .filter(device -> device.getSerialNumber() != null)
                .filter(device -> !device.getModelNumber().contains("SDK"))
                .findFirst()
                .orElse(null);
    }

    default Device getFirstAndroidEmulatorDevice() throws IOException, DeviceNotFoundException {
        return getDevices().stream()
                .filter(device -> device.getDeviceProductPlatform().contains("Android"))
                .filter(device -> device.getSerialNumber() == null)
                .filter(device -> device.getModelNumber().contains("SDK"))
                .findFirst()
                .orElse(null);
    }

    default Device getFirstIosDevice() throws IOException, DeviceNotFoundException {
        return getDevices().stream()
                .filter(device -> device.getDeviceProductPlatform().contains("Ios"))
                .findFirst()
                .orElse(null);
    }

    default Device getFirstIosSimulatorDevice() throws IOException, DeviceNotFoundException {
        return getDevices().stream()
                .filter(device -> device.getDeviceProductPlatform().contains("Ios Simulator"))
                .findFirst()
                .orElse(null);
    }

    default List<Android> getAndroidDevices() throws IOException, DeviceNotFoundException {
        return getAndroidDevices();
    }

    default List<Android> getAndroidEmulatorDevices() throws IOException, DeviceNotFoundException {
        return getAndroidDevices().stream()
                .filter(device -> device.getDeviceProductPlatform().contains("Android"))
                .filter(device -> device.getSerialNumber() == null)
                .filter(device -> device.getModelNumber().contains("SDK"))
                .collect(Collectors.toList());
    }

    default List<Ios> getIosDevices() throws IOException, DeviceNotFoundException {
        return getIosDevices();
    }

    default List<IosSimulator> getIosSimulatorDevices() throws IOException, DeviceNotFoundException {
        return getIosSimulatorDevices();
    }

    //    default Device searchDeviceByName(String name) throws IOException, DeviceNotFoundException {
    //        return getDevices().stream().filter(device ->
    // device.getDeviceProductName().equals(name)).findFirst().orElse(null);
    //    }

    List<Device> getDevices() throws IOException, DeviceNotFoundException;
}
