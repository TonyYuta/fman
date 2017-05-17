package core;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ImageTest {

    AppiumDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
    	DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("deviceName", "0d89015443e4b8fb");
    	
    	//Non-mandatory
    	//capabilities.setCapability("clearSystemFiles", "true");
    	//capabilities.setCapability("automationName", "Appium");
    	//capabilities.setCapability("platformVersion", "5.1");
        //capabilities.setCapability("platformName", "Android");
        //capabilities.setCapability("activityName", "com.rhmsoft.fm.FileManager");
    	
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
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
    
    @Test
    public void quantityImages() {
        WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        imageBtn.click();    }
    

}
