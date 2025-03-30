package com.dande.ex_02_seleniumbasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Testselenium009 {
    @Description
    @Test
    public void test_selenium09(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        assertThat(driver.getTitle()).isNotBlank().isNotNull().isEqualTo("Google");
        driver.quit();

    }

}
