package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Testselenium004 {
    @Test
    @Description
    public void test_selenium04(){

        //We have three types as below
        WebDriver driver5 = new ChromeDriver();
        SearchContext driver6 = new ChromeDriver();
        RemoteWebDriver driver7 = new ChromeDriver();

        //We use web driver when we want to use any one browser specifically like use chrome Driver
        ChromeDriver driver1 = new ChromeDriver();



        // We use Web driver when we want use chrome and later edge or microsoft later. we use this 97% and used mostly
        WebDriver driver2 = new ChromeDriver();
        WebDriver driver3 = new FirefoxDriver();
       WebDriver driver4 = new SafariDriver();

        // we use Remote driver when we want to Multiple browsers and AWS Machine we use this 2% only and used very less
    }

}
