package com.kielan.seleniumTest;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Kielan on 24.02.2016.
 */
public class FirstSeleniumTest {

    @Test
    public void startWebDriver(){
        //WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://localhost:4567");
        assertTrue(driver.getTitle().startsWith("Free"));
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("23");
        WebElement pass = driver.findElement(By.id("pwd"));
        pass.sendKeys("1");

        driver.findElement(By.id("zalogujButton")).click();
        String napis = driver.findElement(By.id("witaj")).getText();
        System.out.println(napis+" ciekawe");
        //driver.close();
       //driver.quit();
    }

    public void testDownloadLinkExists() {
        //validatePresent(HomePage.LOC_LNK_DOWNLOADSELENIUM);
    }
}
