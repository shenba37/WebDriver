package z_obolete;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Shenbaga on 22-09-2017.
 */
public class Way2AutomationPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://way2automation.com/way2auto_jquery/index.php");

        WebElement signIn = driver.findElement(By.linkText("Signin"));
        signIn.click();

        WebElement login = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("ajaxlogin")));

        WebElement loginHeader = login.findElement(By.xpath("//div[@id='login']//h3"));
        if("LOGIN".equals(loginHeader.getText())){
            System.out.println("Log in label is correct");
        }

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

    /**
     * Created by Shenbaga on 20-09-2017.
     */
    public static class BrowserTest {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new FirefoxDriver();
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://www.codecademy.com/learn/all");
            WebElement loginTab = driver.findElement(By.partialLinkText("Log"));
            loginTab.click();

            WebElement usernameBox = driver.findElement(By.id("user_login"));
            usernameBox.sendKeys("testselenium19072017@gmail.com");

            WebElement passwordBox = driver.findElement(By.id("login__user_password"));
            passwordBox.sendKeys("testselenium1907");

            WebElement submitButton = driver.findElement(By.id("user_submit"));
            submitButton.submit();



            WebElement message = driver.findElement(By.className("react-root"));


            //driver.quit();
        }

    }
}
