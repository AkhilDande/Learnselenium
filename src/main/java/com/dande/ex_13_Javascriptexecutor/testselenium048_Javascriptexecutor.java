package com.dande.ex_13_Javascriptexecutor;

import com.dande.Boilerplate;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testselenium048_Javascriptexecutor extends Boilerplate {

    @Test
    public void test_javascriptexecutor(){

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement l1 = driver.findElement(By.xpath("//div[@class=\"jackPart\"]"));

        js.executeScript("arguments[0].scrollIntoView(true);", l1);



    }
}
