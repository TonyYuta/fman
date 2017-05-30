package com.rhmsoft.fm;

/**
 * Created by aolyva on 5/24/17.
 */

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImageTest extends Environment {


    /*--------------------Test Cases--------------------T*/

    @Test(enabled = true, groups={"Images", "DryRun", "Regression"})
    public void quantityImages() {
        mainPage.navigateToImagePage();
    }

    @Test(enabled = true, groups={"Images", "DryRun", "Regression"})
    public void quantityImages2() {
    }

    @Test(enabled = true, groups={"Images", "DryRun", "Regression"})
    public void quantityImages3() {
    }



}
