package com.dande.ex_16_SeleniumExceptions;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testselenium055_StaleException extends Boilerplate {

    @Test
    public void testselenium_stale(){
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.id("APjFqb"));
        System.out.println(driver.getWindowHandle());

        driver.navigate().refresh();
        //After refreshing the page web driver thinks that the element which is provided is stale and not fresh anymore Hence it throws stale elememt exeception
        try {
            search.sendKeys("the testing academy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException Since Element is not fresh anymore");;
        }

        System.out.println(driver.getWindowHandle());
        System.out.println("End of the program");
    }
}
