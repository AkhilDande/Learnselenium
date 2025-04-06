package com.dande.ex_05_selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class Testselenium024_Fix_Miniproject1 {
    @Description("Mini project 2")
    @Test
        public void test_selenium24() {
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

        //find the locator for error message->
        // <div class="notification-box-description" id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
        WebElement em = driver.findElement(By.className("notification-box-description"));

       // Thread.sleep(3000); -> Instead of using Thread.sleep we will use the Explicit wait here in next step

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(em));
        wait.until(ExpectedConditions.textToBePresentInElement(em,"Your email, password, IP address or location did not match"));

        //validation of error message through assertion
        Assert.assertEquals(em.getText(), "Your email, password, IP address or location did not match");

        driver.quit();
        }
}
