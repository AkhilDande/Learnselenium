package com.dande.ex_15_Relativelocators;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class testselenium051_relativelocators extends Boilerplate {

    @Test
    public void testselenium_Relativepath(){

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement YOE = driver.findElement(By.xpath("//span[contains(text(),'Years of Experience')]"));
        driver.findElement(with(By.id("exp-2")).toRightOf(YOE)).click();
    }
}
