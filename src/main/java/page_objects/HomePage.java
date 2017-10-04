package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Shenbaga on 27-09-2017.
 */
public class HomePage {
    public static WebElement logInLink(WebDriver driver){
        return driver.findElement(By.linkText("Log in"));
    }
}
