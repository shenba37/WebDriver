package com.training.selenium.handson;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Shenbaga on 28-09-2017.
 */
public class JunitExampleWebdriverClass {
    WebDriver firefoxDriver;
    WebDriver chromeDriver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        firefoxDriver = new FirefoxDriver();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testFirefox(){
        firefoxDriver.get("https://www.google.com");
    }

    @Test
    public void testChrome(){
        chromeDriver.get("https://www.google.com");
    }

    @After
    public void tearDown(){
        firefoxDriver.quit();
        chromeDriver.quit();
    }
}
