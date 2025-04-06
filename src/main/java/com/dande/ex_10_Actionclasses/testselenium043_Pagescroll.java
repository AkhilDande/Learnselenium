package com.dande.ex_10_Actionclasses;

import com.dande.Boilerplate;
import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testselenium043_Pagescroll extends Boilerplate {

    @Description
    @Test
    public void test_actionclass(){

        driver.manage().window().maximize();
        driver.get("https://thetestingacademy.com/");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
    }


}
