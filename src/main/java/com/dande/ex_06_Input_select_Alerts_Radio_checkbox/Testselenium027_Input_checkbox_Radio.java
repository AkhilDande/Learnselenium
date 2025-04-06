package com.dande.ex_06_Input_select_Alerts_Radio_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testselenium027_Input_checkbox_Radio {

    @Description
    @Test
    public void test_selenium27(){

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.manage().window().maximize();
        WebElement fn = driver.findElement(By.name("firstname"));
        fn.sendKeys("first");  //Input the data into text box


        WebElement rb = driver.findElement(By.id("sex-0"));
        rb.click();

        WebElement cb = driver.findElement(By.id("profession-1"));
        cb.click();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();

    }
}
