package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium013 {
    @Description
    @Test

    public void test_selenium13(){

        EdgeDriver driver = new EdgeDriver();
        //driver.get("bing.com/"); -> This is not a correct URL because it is not meeting protocol cause it is not having http and WWW.
        driver.get("https://www.bing.com/");

    }
}
