package com.rhmsoft.fm;

/**
 * Created by Yutaka on 5/9/17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage {

    AppiumDriver driver;
    WebDriverWait wait;

    MainPage(AppiumDriver driver) {

        this.driver = driver;
    }

/*    public void waitForScreenToLoad(AppiumDriver lDriver, WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(lDriver,seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }*/

    /**
     * Test navigate to Image page
     */
    public void navigateToImagePage() {

       // wait = new WebDriverWait(driver,20);
       // WebElement imageBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.rhmsoft.fm:id/home_classify_text_images")));
       // imageBtn.click();


       // WebElement imageBtn=(WebElement) (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("com.rhmsoft.fm:id/home_classify_text_images")));
       // WebElement imageBtn = driver.findElement(By.className("android.widget.EditText"));
       // imageBtn.click();


        WebElement imageBtn;
        imageBtn = (WebElement) (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("com.rhmsoft.fm:id/home_classify_text_images")));
       // WebDriverWait wait = new WebDriverWait(driver, 30);
      //  WebElement imageBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.rhmsoft.fm:id/home_classify_text_images")));
        imageBtn.click();
        imageBtn.click();

        // WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
       // imageBtn.click();
    }




}