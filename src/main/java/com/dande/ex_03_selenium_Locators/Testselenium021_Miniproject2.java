package com.dande.ex_03_selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class Testselenium021_Miniproject2 {
    @Description("Mini project 2")
    @Test
    public void test_selenium21() throws  Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        driver.manage().window().maximize();

        //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link" data-qa="bericafeqo">Start a free trial</a>

        WebElement saft = driver.findElement(By.linkText("Start a free trial"));
        saft.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        //Enter invalid business email
        // <input class="W(100%) Py(14px) input-text" placeholder="name@yourcompany.com" type="email" id="page-v1-step1-email" name="email"
        // data-qa="page-su-step1-v1-email" required="" fdprocessedid="cld2sq">
        WebElement be = driver.findElement(By.id("page-v1-step1-email"));
        be.sendKeys("admin");

        //Check box selection
        //<input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)" type="checkbox" name="gdpr_consent_checkbox"
        // id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        // value="true" data-qa="page-free-trial-step1-gdpr-consent-checkbox" data-gtm-form-interact-field-id="1">
        WebElement cb = driver.findElement(By.name("gdpr_consent_checkbox"));
        cb.click();

        //Click on free trail account
        //<button type="submit" class="button W(100%) btn-modal-form-submit" data-qa="page-su-submit">Create a Free Trial Account</button>
        List<WebElement> caftbutton = driver.findElements(By.tagName("button"));
        caftbutton.get(0).click();


        //Error message validation
        //<div class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.</div>
        WebElement em = driver.findElement(By.className("invalid-reason"));
        assertTrue(em.isDisplayed());
        Assert.assertEquals(em.getText(),"The email address you entered is incorrect.");

        Thread.sleep(3000);
        driver.quit();
    }
}
