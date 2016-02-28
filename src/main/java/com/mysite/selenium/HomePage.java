package com.mysite.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static junit.framework.TestCase.assertTrue;
/**
 * Created by Kielan on 24.02.2016.
 */
public class HomePage {

    // the tabs
    public static final String LOC_LNK_PROJECTSTAB = "li#menu_projects a[href$='projects/']";
    public static final String LOC_LNK_DOWNLOADTAB = "li#menu_download a[href$='download/']";
    public static final By LOC_LNK_DOCUMENTATIONTAB = By.xpath("//li[@id='menu_documentation']/a[contains(@href, 'docs/')]");
    public static final String LOC_LNK_SUPPORTTAB = "li#menu_support a[href$='support/']";
    public static final String LOC_LNK_ABOUTTAB = "li#menu_about a[href$='about/']";

    // download link
    public static final By LOC_LNK_DOWNLOADSELENIUM = By.linkText("Download Selenium");

    @Test
    public void startWebDriver(){
        //WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://localhost:4567");
        assertTrue(driver.getTitle().startsWith("Free"));
        System.out.println("działa?");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("23");
        WebElement pass = driver.findElement(By.id("pwd"));
        pass.sendKeys("1");

        driver.findElement(By.id("zalogujButton")).click();
        String napis = driver.findElement(By.id("witaj")).getText();
        System.out.println(napis+" ciekawe");
        driver.close();
        driver.quit();
    }
}
