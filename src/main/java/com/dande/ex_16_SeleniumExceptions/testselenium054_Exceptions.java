package com.dande.ex_16_SeleniumExceptions;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class testselenium054_Exceptions extends Boilerplate {
    @Test
    public void testselenium_exception(){
        driver.get("https://app.vwo.com/");
        try {
            driver.findElement(By.id("Akhil")); //Throws NoSuchElementException so to handle it we introduced try and catch
        } catch (NoSuchElementException e) {
            System.out.println("Element not found please check if the locator element provided is correct");
        }

        System.out.println("End of the Program");
    }
}
