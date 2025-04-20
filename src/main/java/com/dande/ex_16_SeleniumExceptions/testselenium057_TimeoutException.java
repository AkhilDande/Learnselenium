package com.dande.ex_16_SeleniumExceptions;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class testselenium057_TimeoutException extends Boilerplate {
    @Test
    public void testselenium_Timeout(){
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Akhil")));

        System.out.println("End of the program");
    }
}
