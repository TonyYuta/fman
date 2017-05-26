package com.rhmsoft.fm;

/**
 * Created by aolyva on 5/24/17.
 */

import org.testng.annotations.Test;

public class ImageTest extends Environment {


    /*--------------------Test Cases--------------------T*/

    @Test(enabled = true, groups={"Images", "DryRun", "Regression"})
    public void quantityImages() {
        mainPage.navigateToImagePage();
    }

    @Test(enabled = true, groups={"Images", "DryRun", "Regression"})
    public void quantityImages2() {
    }




}