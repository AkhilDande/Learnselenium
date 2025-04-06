package com.dande.ex_10_Actionclasses;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class testselenium041_Actionclass extends Boilerplate {

    //private static final Logger log = LoggerFactory.getLogger(testselenium041_Actionclass.class);

    @Test
    public void test_actionclass041(){
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        WebElement from = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        Actions actions = new Actions(driver);
        actions
                .moveToElement(from)
                .click()
                .sendKeys("BLR")
                .build().perform();

    }
}
