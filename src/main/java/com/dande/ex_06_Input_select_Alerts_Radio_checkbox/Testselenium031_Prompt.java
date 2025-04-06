package com.dande.ex_06_Input_select_Alerts_Radio_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium031_Prompt {
    @Description
    @Test
    public void test_selenium31(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement prompt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        prompt.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hi");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();

        WebElement Result = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        Assert.assertEquals(Result.getText(),"You entered: Hi");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
