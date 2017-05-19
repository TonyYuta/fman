package com.rhmsoft.fm;

/**
 * Created by aolyva on 5/9/17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class MainPage {

    AppiumDriver driver;

    public MainPage(AppiumDriver driver) {

        this.driver = driver;
    }

    public void navigateToImagePage() {
        WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        imageBtn.click();
    }




}
