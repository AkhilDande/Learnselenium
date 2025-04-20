package com.dande.ex_16_SeleniumExceptions;

import com.dande.Boilerplate;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class testselenium056_fixingstaleexception55 extends Boilerplate {
    @Test
    public void testselenium_fixstaleexception(){

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.id("APjFqb"));
        System.out.println(driver.getWindowHandle());

        // When REACT application(SPA), they change the DOM structure) That is not in your hand.


        // HTML Page (DOM) is refreshed NOW,
        // Driver will think that, element may or may not available now.
        // I have found the element before refresh.

        // Refresh, Navigate other Page, change in DOM elements (Ajax Calls) - VueJS, AngularJS

        // If you want to fix the stale element exp - refind the element after DOM changes)
        //search_inputbox  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));


        driver.navigate().refresh();
        //After refreshing the page web driver thinks that the element which is provided is stale and not fresh anymore Hence it throws stale elememt exeception
        try {
            search.sendKeys("the testing academy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            WebElement search1 = driver.findElement(By.id("APjFqb"));
            search1.sendKeys("the testing academy" + Keys.ENTER);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }

        System.out.println(driver.getWindowHandle());
        System.out.println("End of the program");
    }
}
