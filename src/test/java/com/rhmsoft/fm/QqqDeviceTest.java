package com.rhmsoft.fm;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;

/**
 * Created by aolyva on 5/10/17.
 */

    //  import com.cheetahmobile.filemanager.pages.MainPage;

        import io.appium.java_client.AppiumDriver;
        import io.appium.java_client.android.AndroidDriver;

public class QqqDeviceTest {

        AppiumDriver driver;
        MainPage mainPage;

        @BeforeMethod
        public void setUp() throws Exception {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            //MANDATORY
            capabilities.setCapability("deviceName", "AndroidTestDeviceNexus5");
            capabilities.setCapability("app", "/Users/Yutaka/Documents/Mobile_Testing/Apk/com.rhmsoft.fm_v2.5.8-20580589_Android-4.0.apk");

        /*
         * These two flags let you use already opened application
         * (opened on the phone) without reinstalling or reopening it.
         */
            capabilities.setCapability("fullReset", "false");
            capabilities.setCapability("noReset", "true");

            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            mainPage = new MainPage(driver);
        }

        @AfterMethod
        public void tearDown() throws Exception {
            driver.quit();
        }

        @Test
        public void quantityImages() {
            mainPage.navigateToImagePage();
        }




    }