package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Testselenium016_AddExtension {
    @Description
    @Test
    public void test_selenium16(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--window-size(1920,1080");
        options.addExtensions(new File("src/main/java/com/dande/ex_02_seleniumbasics/AdBlock.crx"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=QNJL6nfu__Q&list=RDQNJL6nfu__Q&start_radio=1");
    }
}
