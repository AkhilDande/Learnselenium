package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium012 {
    @Description
    @Test
    public void test_selenium12() throws Exception {

        WebDriver driver = new EdgeDriver();
       // driver.get("https://www.google.com/"); ->To Navigate to URL
       //  driver.navigate().to("https://www.google.com/"); -> We can also use this to navigate to any URL
        // Additionally we have more uses if we use  driver.navigate().to we can perform multiple functions like below
        // We can navigate back
        // We can refresh
        // we can forward

        driver.navigate().to("https://www.google.com/");

        driver.navigate().to("https://www.bing.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        Thread.sleep(5000);

        driver.quit();

    }

}
