package com.dande.ex_04_selenium_Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium022_Miniproject3 {
    @Description
    @Test
    public void test_selenium022() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement BA = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        BA.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        System.out.println(driver.getCurrentUrl());

        WebElement UN = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        UN.sendKeys("John Doe");

        WebElement PWD = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        PWD.sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]"));
        login.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}
