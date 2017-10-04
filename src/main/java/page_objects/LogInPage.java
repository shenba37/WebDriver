package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Shenbaga on 27-09-2017.
 */
public class LogInPage {
    public static WebElement userNameTextBox(WebDriver driver){
        return driver.findElement(By.name("user[login]"));
    }

    public static WebElement userNamePasswordBox(WebDriver driver){
        return driver.findElement(By.id("login__user_password"));
    }

    public static WebElement submitButton(WebDriver driver){
        return driver.findElement(By.id("user_submit"));
    }
}
