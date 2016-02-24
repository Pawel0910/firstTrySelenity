package com.com.sileniumsimplified.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Kielan on 24.02.2016.
 */
public class FirstTest {

    @Test
    public void driverIsKing()
    {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Selenium"));
    }
}
