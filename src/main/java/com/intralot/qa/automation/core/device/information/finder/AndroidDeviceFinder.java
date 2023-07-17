package com.intralot.qa.automation.core.device.information.finder;

import com.google.gson.reflect.TypeToken;
import com.intralot.qa.automation.core.device.information.exception.DeviceNotFoundException;
import com.intralot.qa.automation.core.device.information.helper.JsonHelper;
import com.intralot.qa.automation.core.device.information.helper.ProcessHelper;
import com.intralot.qa.automation.core.device.information.model.Android;
import com.intralot.qa.automation.core.device.information.model.DeviceInfoModel;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AndroidDeviceFinder implements DeviceFinder<Android> {

    private final String ADB_LIST_SHELL_COMMAND = "adb devices";
    private final String ADB_SERIAL_NUMBER_PUT_SHELL_COMMAND = "adb -s serialNumber shell getprop";
    private final String ADB_INTEGRATED_CIRCUIT_CARD_IDENTITY_SHELL_COMMAND = "adb -s serialNumber shell dumpsys CustomFrequencyManagerService | grep 'mIccid sim'";
    private final String LIB_MOBILE_DEVICE_DEVICE_NAME_SHELL_COMMAND = "adb -s serialNumber shell getprop ro.product.model";

    @Override
    public DeviceInfoModel<Android> findDevices(String localPath) throws IOException {
        DeviceInfoModel<Android> deviceInfoModel =
                JsonHelper.convertJsonToDeviceInfo(
                        readDeviceInfo(localPath), new TypeToken<DeviceInfoModel<Android>>() {
                        });
        if (deviceInfoModel == null
                || (deviceInfoModel.getDevices() == null || deviceInfoModel.getDevices().size() == 0)) {
            try {
                throw new DeviceNotFoundException("Android Device Not Found !!!");
            } catch (DeviceNotFoundException e) {
                // System.err.println(e.toString());
            }
        }
        return deviceInfoModel;
    }

    @Override
    public Map<String, Object> readDeviceInfo(String localPath) throws IOException {
        Map<String, Object> parentMap;
        List<Map<String, Object>> deviceMapList = new ArrayList<>();
        Map<String, Object> device = new HashMap<>();

        Process deviceListProcess =
                ProcessHelper.runTimeExec(String.format("%s%s", localPath, ADB_LIST_SHELL_COMMAND));
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(deviceListProcess.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            if (StringUtils.isEmpty(line) || line.startsWith("List of devices attached")) {
                continue;
            }

            String[] serialNumberArray = line.replace(" ", "").split("device");
            String serialNumber = serialNumberArray[0].trim();

            Process deviceDetailInfoProcess =
                    ProcessHelper.runTimeExec(
                            String.format("%s%s", localPath, ADB_SERIAL_NUMBER_PUT_SHELL_COMMAND)
                                    .replace("serialNumber", serialNumber));

            String infoLine;
            BufferedReader infoReader =
                    new BufferedReader(new InputStreamReader(deviceDetailInfoProcess.getInputStream()));
            parentMap = new HashMap<>();
            parentMap.put("UniqueDeviceID", serialNumber);
            while ((infoLine = infoReader.readLine()) != null) {
                try {
                    infoLine = infoLine.replaceAll("\\[", "").replaceAll("]", "");
                    if (infoLine.contains(":")) {
                        String[] detailInfo = infoLine.split(": ", -1);
                        parentMap.put(
                                detailInfo[0].replace(".", "").replace("_", "").replace("-", ""), detailInfo[1]);
                    }
                } catch (Exception e) {
                }
            }

            Process deviceListProcessOnlyCard =
                    ProcessHelper.runTimeExec(
                            String.format("%s%s", localPath, ADB_INTEGRATED_CIRCUIT_CARD_IDENTITY_SHELL_COMMAND)
                                    .replace("serialNumber", serialNumber));
            BufferedReader readerOnlyCard =
                    new BufferedReader(new InputStreamReader(deviceListProcessOnlyCard.getInputStream()));

            try {
                String[] mIccidsim = readerOnlyCard.readLine().replaceAll(" ", "").split("=");
                parentMap.put(mIccidsim[0], mIccidsim[1]);
            } catch (Exception e) {
                parentMap.put("mIccidsim", "null");
            }

            Process deviceListProcessOnlyDeviceName =
                    ProcessHelper.runTimeExec(
                            String.format("%s%s", localPath, LIB_MOBILE_DEVICE_DEVICE_NAME_SHELL_COMMAND)
                                    .replace("serialNumber", serialNumber));
            BufferedReader readerOnlyDeviceName =
                    new BufferedReader(new InputStreamReader(deviceListProcessOnlyDeviceName.getInputStream()));

            try {
                String deviceModelName = readerOnlyDeviceName.readLine().replaceAll(" ", "");
                parentMap.put("deviceModelName", deviceModelName);
            } catch (Exception e) {
                parentMap.put("deviceModelName", "null");
            }

            readerOnlyDeviceName.close();
            readerOnlyCard.close();
            infoReader.close();
            deviceMapList.add(parentMap);
            device.put("android", deviceMapList);
        }
        reader.close();
        return device;
    }

}
