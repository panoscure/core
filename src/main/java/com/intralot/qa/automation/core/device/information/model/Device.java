package com.intralot.qa.automation.core.device.information.model;

public interface Device {

    String getUniqueDeviceID();

    String getProductVersion();

    String getBuildVersion();

    String getSerialNumber();

    String getModelNumber();

    String getDeviceProductName();

    String getDeviceProductPlatform();

    String getIntegratedCircuitCardIdentity();

}