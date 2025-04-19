package com.dande.ex_14_JS_ShadowDOM;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

    public class testselenium050_ShadowRoot2_pramod extends Boilerplate {

        @Test
        public void test_js() {
            driver.get("https://selectorshub.com/xpath-practice-page/");
            driver.manage().window().maximize();

            JavascriptExecutor js = (JavascriptExecutor) driver;

            WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

            // Shadow DOM -> js.executeCode

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\");");
            inputboxPizza.sendKeys("farmhouse");

        }
    }
