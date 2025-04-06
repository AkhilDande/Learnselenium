package com.dande.ex_12_Windows;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class testselenium046_windows extends Boilerplate {

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        WebElement ch = driver.findElement(By.linkText("Click Here"));
        ch.click();

        Set<String> wh = driver.getWindowHandles();
        System.out.println("Window Handles: "+wh);

        for(String handles : wh){
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Passed");
            }
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.switchTo().window(parent);
    }
}
