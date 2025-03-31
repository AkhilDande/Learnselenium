package com.dande.ex_03_selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testselenium020 {
    @Description
    @Test
    public void test_selenium20() throws  Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        driver.manage().window().maximize();

        //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link" data-qa="bericafeqo">Start a free trial</a>

        WebElement saft = driver.findElement(By.partialLinkText("trial"));
        saft.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
