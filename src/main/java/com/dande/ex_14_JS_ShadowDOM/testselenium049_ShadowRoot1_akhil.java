package com.dande.ex_14_JS_ShadowDOM;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testselenium049_ShadowRoot1_akhil extends Boilerplate {

    @Test
    public void testselenium_shadowroot(){

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement l1 = driver.findElement(By.xpath("//div[@id='userName']"));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // use js.executeScript(script key,...)
        WebElement sr = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\")"); //
        sr.sendKeys("Italian");
    }
}
