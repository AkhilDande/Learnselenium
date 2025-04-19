package com.dande.ex_15_Relativelocators;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;
import java.util.List;

public class testselenium053_Realtime extends Boilerplate {

    @Test
    public void testselenium_realtime(){

        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();


        try {
            Thread.sleep(20000);  // Better for relative locators
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement search  = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        search.sendKeys("india"+ Keys.ENTER);

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.location-name>p")));

        try {
            Thread.sleep(20000);  // Better for relative locators
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> loc = driver.findElements(By.cssSelector("div.location-name>p"));


        for (WebElement loe : loc){
            //System.out.println(loe.getText());
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(loe)).getText();
            String AQI = driver.findElement(with(By.tagName("span")).toRightOf(loe)).getText();
            System.out.println(rank + loe.getText() + AQI);

        }

    }
}
