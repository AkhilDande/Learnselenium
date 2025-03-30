package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium014 {
    @Description
    @Test
    public void test_selenium15() throws Exception{

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");

        // driver.close();  -> closes only tab that is used incase if we add a new tab manually in the same window
        //Session will not end

        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit(); //Closes all tabs and session id will be equal to null

    }

}
