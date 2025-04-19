package com.dande.ex_15_Relativelocators;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class testselenium052_RL2 extends Boilerplate {
    @Test
    public void testseleniumRL2(){
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");
       driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();

        WebElement un = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        WebElement error = driver.findElement(with(By.tagName("small")).below(un));
        error.getText();
        System.out.println(error.getText());


    }

}
