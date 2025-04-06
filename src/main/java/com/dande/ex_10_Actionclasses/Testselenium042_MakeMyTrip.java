package com.dande.ex_10_Actionclasses;

import com.dande.Boilerplate;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Testselenium042_MakeMyTrip extends Boilerplate {
    @Description("Make My Trip")
    @Test
    public void test_actionclass042(){
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"commonModal__close\"]")));
        WebElement modal = driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]"));
        modal.click();

        WebElement from = driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));


        Actions actions = new Actions(driver);
        actions
                .moveToElement(from)
                .click()
                .sendKeys(from,"IXC")
                .build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> list_autocomplete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for (WebElement e: list_autocomplete){

            if(e.getText().contains("Chandigarh")) {
                e.click();
                break;
            }
        }

    }
}
