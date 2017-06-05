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

public class HomePage {

    // xpath
    public String searchBtnXpathLoc = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.Button[1]";
    public String homeBtnXpathLoc   = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
    public String recentBtnXPathLoc = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";

    // id
    public String recentBtnLoc = "com.rhmsoft.fm:id/new_home_recent_file_layout";
    public String homeBtnLoc =  "com.rhmsoft.fm:id/new_home_title_tv";
    public String imageBtnLoc = "com.rhmsoft.fm:id/home_classify_text_images";
    public String audioBtnLoc = "com.rhmsoft.fm:id/home_classify_text_audio";
    public String videoBtnLoc = "com.rhmsoft.fm:id/home_classify_text_videos";
    public String docBtnLoc = "com.rhmsoft.fm:id/home_classify_text_docs";
    public String deviceBtnLoc = "com.rhmsoft.fm:id/home_storage_image";
    public String largeFilesBtnLoc = "com.rhmsoft.fm:id/main_card_icon";
    public String unnecessaryFilesBtnLoc = "com.rhmsoft.fm:id/main_card_content";
    public String usedApkBtnLoc = "com.rhmsoft.fm:id/main_card_icon";
    public String installedAppsBtnLoc = "com.rhmsoft.fm:id/main_card_icon";
    public String allFilesBtnLoc = "com.rhmsoft.fm:id/main_card_icon";
    public String hotAppsNearbyLoc = "com.rhmsoft.fm:id/main_card_icon";

    AppiumDriver driver;
    WebDriverWait wait;

    HomePage(AppiumDriver driver) {
        this.driver = driver;
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void navigateToImagePage() throws NullPointerException {

       // WebElement imageBtn = driver.findElement(By.id("com.rhmsoft.fm:id/home_classify_text_images"));
        WebElement imageBtnEl = driver.findElement(By.id(imageBtnLoc));
        imageBtnEl.click();

    }




}