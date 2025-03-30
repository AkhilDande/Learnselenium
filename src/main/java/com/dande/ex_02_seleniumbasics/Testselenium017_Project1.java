package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium017_Project1 {
    @Description("Verify that Error message is displaying when invalid Email and password is submitted")
    @Test
    public void test_selenium17() throws Exception{
        //EdgeOptions options = new EdgeOptions();
       // options.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();


        //Find the locator for email->
        // <input type="email" class="text-input W(100%)" name="username"
        // id="login-username" data-qa="hocewoqisi" fdprocessedid="ydari">

        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin@admin.com");

        //Find the locator for password->
        //<input type="password" class="text-input W(100%)" name="password"
        // id="login-password" data-qa="jobodapuxe" fdprocessedid="p6hugt">

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin");


        //Find the locator for Sigin button
        //<button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica" fdprocessedid="ugeh09">
        //<span class="icon loader hidden" data-qa="zuyezasugu"></span>
        //<span data-qa="ezazsuguuy">Sign in</span>
        //</button>

        WebElement sb = driver.findElement(By.id("js-login-btn"));
        sb.click();

        Thread.sleep(3000);

        //find the locator for error message->
       // <div class="notification-box-description" id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        WebElement em = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(em.getText(), "Your email, password, IP address or location did not match");

        driver.quit();

    }

}
