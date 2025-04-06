package com.dande.ex_08_SVG_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Testselenium034_SVG_Maps {
    EdgeDriver driver;

    @BeforeTest
    public void OpenBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
        options.addArguments("--incognito");
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
    }




    @Test
    public void test_Flipkartsearch_SVG_Maps() {
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> searchtext = driver.findElements(By.xpath("//*[name()=\"svg\"]/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement states : searchtext) {
            System.out.println(states.getDomAttribute("aria-label"));
            if (states.getDomAttribute("aria-label").contains("Tripura")) {
                states.click();
            }
        }
    }


        @AfterTest
        public void CloseBrowser () {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();

        }


}




