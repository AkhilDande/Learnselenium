package com.dande.ex_06_Input_select_Alerts_Radio_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testselenium029_Alerts {
    @Description
    @Test
    public void test_selenium29(){

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement JSAlert = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        JSAlert.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement Result = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        Assert.assertEquals(Result.getText(),"You successfully clicked an alert");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}

