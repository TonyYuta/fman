package com.rhmsoft.fm;

/**
 * Created by aolyva on 5/9/17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

<<<<<<< 06b0c77f84d19a6ff19ce01f8298008577a45960
public class MainPage {

    AppiumDriver driver;
=======
//import io.appium.java_client.android.BaseAndroidTest;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class MainPage {

    AppiumDriver driver;
    WebDriverWait wait;
>>>>>>> h intj

    public MainPage(AppiumDriver driver) {

        this.driver = driver;
    }

<<<<<<< 06b0c77f84d19a6ff19ce01f8298008577a45960
    public void navigateToImagePage_() {
        WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        imageBtn.click();
    }

    public void navigateToImagePage() {
        WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        imageBtn.click();
=======
/*    public void waitForScreenToLoad(AppiumDriver lDriver, WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(lDriver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }*/

    /**
     * Test navigate to Image page
     */
    public void navigateToImagePage() {

        wait = new WebDriverWait(driver,20);
        WebElement imageBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.rhmsoft.fm:id/home_classify_text_images")));
        imageBtn.click();

/*
        WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        imageBtn.click();*/
>>>>>>> h intj
    }




}
