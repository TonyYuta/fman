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

public class HelperTest {

        AppiumDriver driver;
        MainPage mainPage;
        Helper helper;

        @BeforeMethod
        public void setUp() throws Exception {

            // creating instance of Helper class
            helper = new Helper(driver);
        }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test(enabled = true, groups={"Helper", "DryRun", "Regression"})
    public void helperTest() {
            int result = helper.qqqGetDeviceSNLength("abc");
            System.out.println("result = " + result);
    }








}