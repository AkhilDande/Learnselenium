package com.dande.ex_08_SVG_Elements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Testselenium033_SVG_Elements {

    EdgeDriver driver;

    @BeforeTest
    public void OpenBrowser(){
        EdgeOptions options =new EdgeOptions();
        options.addArguments("--guest");
        options.addArguments("--incognito");
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();




    }
    @Test
    public void test_Flipkartsearch_SVG_icon(){
        driver.get("https://www.flipkart.com/");
        WebElement searchtext = driver.findElement(By.xpath("//input[@name=\"q\"]"));
        searchtext.sendKeys("macmini");

        List<WebElement> searchicon = driver.findElements(By.xpath("//*[name()=\"svg\"]"));
        searchicon.get(0).click();


        List<WebElement> p1 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
        p1.get(2).getText();
        System.out.println(p1.get(0).getText());

        for (WebElement title : p1){
            System.out.println(title.getText());
        }


    }

    @AfterTest
    public void CloseBrowser(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
