package com.dande.ex_10_Actionclasses;

import com.dande.Boilerplate;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testselenium040_Actionclass extends Boilerplate {
    @Description

    @Test
    public void test_actions(){

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        //Action class keys
        WebElement firstname = driver.findElement(By.name("firstname"));
        Actions actions = new Actions(driver);
        actions
                .keyDown(Keys.SHIFT)
                .sendKeys(firstname,"testing")
                .keyUp(Keys.SHIFT).build().perform();


    }


}
