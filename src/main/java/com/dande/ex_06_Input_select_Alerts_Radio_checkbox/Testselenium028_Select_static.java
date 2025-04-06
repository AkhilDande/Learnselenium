package com.dande.ex_06_Input_select_Alerts_Radio_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testselenium028_Select_static {
    @Description
    @Test
    public void test_selenium28(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dd = driver.findElement(By.id("dropdown"));
        Select select = new Select(dd);
        select.selectByIndex(1);


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
