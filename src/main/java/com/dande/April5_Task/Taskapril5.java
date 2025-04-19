package com.dande.April5_Task;

import com.dande.Boilerplate;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class Taskapril5 extends Boilerplate {

    @Test
    public void test_task(){

        driver.get("https://www.browserstack.com/app-automate");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //WebElement signin = wait.until((java.util.function.Function<? super org.openqa.selenium.WebDriver, WebElement>) driver.findElement(By.xpath("//a[@class=\" bstack-mm-link bstack-mm-main-link-sign-in \"]")));
        WebElement signin = driver.findElement(By.xpath("//a[@class=\" bstack-mm-link bstack-mm-main-link-sign-in \"]"));
        signin.click();



        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Assert.assertEquals(driver.getCurrentUrl(),"https://www.browserstack.com/users/sign_in");
        WebElement email = driver.findElement(By.xpath("//input[@id=\"user_email_login\"]"));
        email.sendKeys("akhildandeporanki@gmail.com");
        WebElement pwd = driver.findElement(By.xpath("//input[@id=\"user_password\"]"));
        pwd.sendKeys("Browser@123");
        WebElement submit = driver.findElement(By.xpath("//input[@id=\"user_submit\"]"));
        submit.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.get("https://app-automate.browserstack.com/dashboard/v2/getting-started");
        WebElement upload = driver.findElement(By.xpath("//button[@class=\"aa-app-uploader__upload-app-btn aa-app-uploader__upload-app-btn--blue\"]"));
        upload.sendKeys("src/main/java/com/dande/April5_Task/testdroid-sample-app (1).apk");

        Alert alert = driver.switchTo().alert();
        WebElement code = driver.findElement(By.xpath("//div[@class=\"prism-snippet__container\"]"));
        Assert.assertTrue(code.getText().contains("bs://"), "Upload code should contain 'bs://'");




    }
}
