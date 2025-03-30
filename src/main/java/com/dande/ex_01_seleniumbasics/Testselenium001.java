package com.dande.ex_01_seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testselenium001 {
        @Test
         public void test_Verify_VWO_login()
        {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");  // Used to Navigate to URL
        System.out.println(driver.getTitle());

        }
}
