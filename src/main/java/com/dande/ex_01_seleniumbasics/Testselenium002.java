package com.dande.ex_01_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium002 {
    @Description("Open app.vwo.com and Verify the Title!")
    @Test
    public void test_selemium02(){
        // open the browser
        ChromeDriver driver = new ChromeDriver();  // This is a method created to access the browser in which you are validating

        // Navigate to the URL
        driver.get("https://app.vwo.com/");

        //Assert the URL - Validation
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        driver.getTitle();

        driver.quit();

    }


}
