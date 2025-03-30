package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium011 {
    @Description
    @Test
    public void test_selenium11(){
        ChromeDriver driver = new ChromeDriver();

        WebDriver driver1 = new ChromeDriver();
        driver1 = new EdgeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("CURA Healthcare Service is displaying");
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
        driver.quit();

    }

}
