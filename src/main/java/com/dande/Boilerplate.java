package com.dande;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Boilerplate {

    public ChromeDriver driver;

    @BeforeTest
    public void Openbrowser(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        options.addArguments("--incognito");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void closebrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
