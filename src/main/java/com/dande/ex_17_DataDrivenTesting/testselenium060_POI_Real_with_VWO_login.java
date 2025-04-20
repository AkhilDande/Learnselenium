package com.dande.ex_17_DataDrivenTesting;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class testselenium060_POI_Real_with_VWO_login extends Boilerplate {

        @Test(dataProvider = "getdata")
        public void testselenium_POI_Real(String email, String password)
        {

            System.out.println(email+ "-" +password);

          // ->   Adding the  VWO login code here

            driver.get("https://app.vwo.com/#/login");
            driver.manage().window().maximize();


            //Find the locator for email->
            // <input type="email" class="text-input W(100%)" name="username"
            // id="login-username" data-qa="hocewoqisi" fdprocessedid="ydari">

            WebElement email1 = driver.findElement(By.id("login-username"));
            email1.clear();
            email1.sendKeys(email);

            //Find the locator for password->
            //<input type="password" class="text-input W(100%)" name="password"
            // id="login-password" data-qa="jobodapuxe" fdprocessedid="p6hugt">

            WebElement password1 = driver.findElement(By.name("password"));
            password1.sendKeys(password);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            //Find the locator for Sigin button
            //<button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica" fdprocessedid="ugeh09">
            //<span class="icon loader hidden" data-qa="zuyezasugu"></span>
            //<span data-qa="ezazsuguuy">Sign in</span>
            //</button>

            WebElement sb = driver.findElement(By.id("js-login-btn"));
            sb.click();

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


            //find the locator for error message->
            // <div class="notification-box-description" id="js-notification-box-msg"
            // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
            WebElement em = driver.findElement(By.className("notification-box-description"));

            // Thread.sleep(3000); -> Instead of using Thread.sleep we will use the Explicit wait here in next step

            wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOf(em));
            wait.until(ExpectedConditions.textToBePresentInElement(em,"Your email, password, IP address or location did not match"));

            //validation of error message through assertion
            Assert.assertEquals(em.getText(), "Your email, password, IP address or location did not match");


        }
        @DataProvider
        public Object[][] getdata()
        {
            return utilExcel.getTestdatafromExcel("sheet1");

        }

}
