package com.dande.March30_Task1;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.util.List;

public class Task1 {
    @Description("Automate Book Appt full flow")
    @Test
    public void test_task1(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement BA = driver.findElement(By.id("btn-make-appointment"));
        BA.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        WebElement UN = driver.findElement(By.id("txt-username"));
        UN.sendKeys("John Doe");

        WebElement PWD = driver.findElement(By.id("txt-password"));
        PWD.sendKeys("ThisIsNotAPassword");


        WebElement LB = driver.findElement(By.id("btn-login"));
        LB.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        WebElement facility1 = driver.findElement(By.id("combo_facility"));
        Select select = new Select(facility1);
        select.selectByIndex(2);


        WebElement cb = driver.findElement(By.id("chk_hospotal_readmission"));
        cb.click();

        WebElement rb = driver.findElement(By.id("radio_program_medicaid"));
        rb.click();

        WebElement cl = driver.findElement(By.id("txt_visit_date"));
        cl.sendKeys("27/06/2025");

        WebElement comment  = driver.findElement(By.id("txt_comment"));
        comment.sendKeys("Hi, This is completed");

        WebElement bk = driver.findElement(By.id("btn-book-appointment"));
        bk.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/appointment.php#summary");

        WebElement ac = driver.findElement(By.id("comment"));
        Assert.assertEquals(ac.getText(), "Hi, This is completed");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement hb = driver.findElement(By.id("menu-toggle"));
        hb.click();


        WebElement logout = driver.findElement(By.xpath("//a[@href=\"authenticate.php?logout\"]"));
        logout.click();

        driver.quit();

    }

}
