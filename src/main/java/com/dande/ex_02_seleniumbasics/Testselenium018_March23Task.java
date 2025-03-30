package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium018_March23Task {
    @Description("Cura Healthcare service login validation")
    @Test
    public void test_selenium18() throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // 1. <a id="btn-make-appointment" href="./profile.php#login" class="btn btn-dark btn-lg">Make Appointment</a>
        WebElement ba = driver.findElement(By.id("btn-make-appointment"));
        ba.click();

        Thread.sleep(3000);

        //Navigate to next page and click on
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        Thread.sleep(3000);

        // Enter user name ->
        // <input type="text" class="form-control" id="txt-username" name="username" placeholder="Username" value="
        // " autocomplete="off" fdprocessedid="0c9gb">
        WebElement un = driver.findElement(By.id("txt-username"));
        un.sendKeys("John Doe");

        Thread.sleep(3000);

        //Enter password ->
        // <input type="password" class="form-control" id="txt-password" name="password"
        // placeholder="Password" value="" autocomplete="off" fdprocessedid="6e2cet">
        WebElement pwd = driver.findElement(By.name("password"));
        pwd.sendKeys("ThisIsNotAPassword");

        Thread.sleep(3000);

        //Click on Login button <button id="btn-login" type="submit" class="btn btn-default" fdprocessedid="vol429">Login</button>
        WebElement lb = driver.findElement(By.id("btn-login"));
        lb.click();

        Thread.sleep(3000);


        // Verify the current URL
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        Thread.sleep(3000);

        driver.quit();
    }
}
