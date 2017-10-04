package com.training.selenium.handson;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Shenbaga on 8/3/2017.
 *
 * The Purpose of this class is to initialize the browser
 */
public class InitializeBrowserTest {

    WebDriver driver; //Object Variable that stores the instances of drivers (Firefox , Chrome , IE , etc)
    WebDriver driver1;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new FirefoxDriver();  // Initializing FireFox Driver
        //driver1 = new ChromeDriver();  // Initializing Chrome Driver
    }

    @Test
    public void test(){

        driver.get("https://www.codecademy.com/");
        WebElement signinButton = driver.findElement(By.partialLinkText("Log"));
        signinButton.click();
        System.out.println("Do Nothing");
        String username = "testselenium19072017@gmail.com";
        String password = "testselenium1907";
        WebElement usernamefield = driver.findElement(By.id("user_login"));
        usernamefield.sendKeys(username);

        WebElement passwordfield = driver.findElement(By.id("user_password"));
        passwordfield.sendKeys(password);

        WebElement submitButton = driver.findElement(By.id("user_submit"));
        submitButton.click();

        //Do Nothing
    }

    @After
    public void tearDown(){
        driver.quit();
        //driver1.quit();
    }

}
