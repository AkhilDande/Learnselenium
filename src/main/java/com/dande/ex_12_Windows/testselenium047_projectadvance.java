package com.dande.ex_12_Windows;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class testselenium047_projectadvance extends Boilerplate {

    @Test
    public void Advanceproject(){
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String parent = driver.getWindowHandle();
        System.out.println("Parent->"+parent);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> list_heatmaps = driver.findElements(By.cssSelector("[data-qa=yedexafobi]"));
        Actions actions = new Actions(driver);

        actions.moveToElement(list_heatmaps.get(1)).click().build().perform();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Set<String> handles = driver.getWindowHandles();
        System.out.println("Window Handles: "+handles);

        for (String handles1 : handles){
            if (!handles1.equals(parent))
            {
                driver.switchTo().window(handles1);
                driver.switchTo().frame("heatmap-iframe");
                WebElement clickmap = driver.findElement(By.xpath("//div[@data-qa=\"liqokuxuba\"]"));
                clickmap.click();

            }
        }


    }

}
