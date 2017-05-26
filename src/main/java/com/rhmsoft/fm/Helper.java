package com.rhmsoft.fm;

import io.appium.java_client.AppiumDriver;

/**
 * Created by aolyva on 5/10/17.
 */
public class Helper {

    AppiumDriver driver;

    public Helper(AppiumDriver driver) {
        this.driver = driver;
    }

    public int qqqGetDeviceSNLength (String device) {
        int deviceLength = device.toUpperCase().length();
        return deviceLength;
    }
<<<<<<< 06b0c77f84d19a6ff19ce01f8298008577a45960
=======

    public String deviceCapabilities(String testDevice) {
        return "============== qqq ================";
    }
>>>>>>> h intj
}
