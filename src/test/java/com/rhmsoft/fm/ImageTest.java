package com.rhmsoft.fm;

/**
 * Created by Yutaka on 5/24/17.
 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ImageTest {

    AppiumDriver driver;
    MainPage mainPage;
    Helper helper;

    public String getCapabilInfo() {
        return capabilInfo;
    }

    public void setCapabilInfo(String newCapabilInfo) {
        capabilInfo = newCapabilInfo;
    }

    // Capabilities
    private String capabilInfo;

    @BeforeMethod
    public void setUp() throws Exception {
        // creating instance of MainPage class
        mainPage = new MainPage(driver);

        // creating instance of Helper class
        helper = new Helper(driver);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "AndroidTestDeviceNexus5");
        capabilities.setCapability("app", "/Users/Yutaka/Documents/Mobile_Testing/Apk/com.rhmsoft.fm_v2.5.8-20580589_Android-4.0.apk");
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("noReset", "true");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }



    /*--------------------Test Cases--------------------T*/

    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages() throws NullPointerException {
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mainPage.navigateToImagePage();
    }

    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages2() {
    }

    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages3() {
    }

    @Test(enabled = true, groups={"images", "dryrun", "regression", "all"})
    public void quantityImages4() {
    }



}
