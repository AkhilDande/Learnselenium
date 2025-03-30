package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium005 {
    @Test
    @Description
    public void test_selenium05(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

    }

}
