package com.dande.ex_11_fileupload;

import com.dande.Boilerplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testselnium45_fileupload extends Boilerplate {

    @Test
    public void test_selenium(){
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        String directory = System.getProperty("user.dir");
        System.out.println(directory);

        WebElement upload = driver.findElement(By.id("fileToUpload"));
        upload.sendKeys(directory+"/src/main/java/com/dande/ex_11_fileupload/Testdata.txt");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();


    }
}
