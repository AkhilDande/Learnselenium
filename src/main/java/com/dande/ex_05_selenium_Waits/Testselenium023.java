package com.dande.ex_05_selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium023 {


    @Description
    @Test

    public void test_selenium23(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        try {
            Thread.sleep(20000);  // Halts JVM Therefore JVM Will stop doing anything
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
