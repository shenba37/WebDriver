package com.training.selenium.handson;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Shenbaga on 8/3/2017.
 *
 * The Purpose of this class is to test http://www.way2automation.com/demo.html
 */
public class Way2AutomationAppTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testLogin(){
        driver.get("http://way2automation.com/way2auto_jquery/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement signIn = driver.findElement(By.linkText("Signin"));
        signIn.click();

        WebElement login = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("ajaxlogin")));

        WebElement loginHeader = login.findElement(By.xpath("//div[@id='login']//h3"));
        Assert.assertEquals("LOGIN" , loginHeader.getText());

        WebElement userNameLabel = login.findElement(By.xpath("//div[@id='login']//fieldset[1]"));
        Assert.assertEquals("Username:" , userNameLabel.getText());

        WebElement passwordLabel = login.findElement(By.xpath("//div[@id='login']//fieldset[2]"));
        Assert.assertEquals("Password:" , passwordLabel.getText());

        WebElement username = login.findElement(By.name("username"));
        username.sendKeys("testselenium");

        WebElement password = login.findElement(By.name("password"));
        password.sendKeys("testselenium1");

        WebElement submit = login.findElement(By.className("button"));
        submit.click();

        (new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOf(login));
    }

    @Test
    public void testRegistration(){
        WebElement registration = driver.findElement(By.linkText("Registration"));
        registration.click();

        WebElement registerForm = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("register_form")));

        WebElement header1 = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals("Registration" , header1.getText());

        WebElement header2 = driver.findElement(By.xpath("//h2"));
        Assert.assertEquals("Registration Form" , header2.getText());

        WebElement registrationForm = driver.findElement(By.id("register_form"));

        WebElement firstNameLastNameSet = registrationForm.findElement(By.xpath("fieldset[1]"));
        WebElement firstNameLabel = firstNameLastNameSet.findElement(By.xpath("p[1]//label"));
        Assert.assertEquals("First Name:", firstNameLabel.getText());
        WebElement firstNameBox = firstNameLastNameSet.findElement(By.xpath("p[1]//input"));
        firstNameBox.sendKeys("Selenium");
        WebElement lastNameLabel = firstNameLastNameSet.findElement(By.xpath("p[2]//label"));
        Assert.assertEquals("Last Name:", lastNameLabel.getText());
        WebElement lastNameBox = firstNameLastNameSet.findElement(By.xpath("p[2]//input"));
        lastNameBox.sendKeys("Training");

        WebElement martialStatusLabel = registrationForm.findElement(By.xpath("fieldset[2]//label"));
        Assert.assertEquals("Marital Status:", martialStatusLabel.getText());
        List<WebElement> martialStatusButtons = registrationForm.findElements(By.xpath("fieldset[2]//div//label"));
        martialStatusButtons.get(0).click();

        WebElement hobbyLabel = registrationForm.findElement(By.xpath("fieldset[3]//label"));
        Assert.assertEquals("Hobby:", hobbyLabel.getText());
        List<WebElement> hobbyCheckBoxs = registrationForm.findElements(By.xpath("fieldset[3]//div//label"));
        hobbyCheckBoxs.get(0).click();

        WebElement countryLabel = registrationForm.findElement(By.xpath("fieldset[4]//label"));
        Assert.assertEquals("Country:", countryLabel.getText());
        WebElement countryDropDown = registrationForm.findElement(By.xpath("fieldset[4]//select"));
        Select countrySelect = new Select(countryDropDown);
        countrySelect.selectByIndex(1);

    }

    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

}

