package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Testselenium015 {
    @Description
    @Test
    public void test_selenium15() throws Exception {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--window-size=800,600");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--headless");

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.quit();
    }
}
