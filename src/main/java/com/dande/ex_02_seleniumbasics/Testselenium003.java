package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium003 {
@Description
    @Test

    public void test_selenium03(){
    EdgeDriver driver = new EdgeDriver(); //Opens the Edge browser
    driver.get("https://www.google.com/");
    driver.quit();

    }
}
