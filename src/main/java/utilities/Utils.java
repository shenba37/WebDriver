package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Shenbaga on 02-10-2017.
 */
public class Utils {
    public static WebDriver loadBrowser(String sBrowserName){
        WebDriver driver = null;
        if(sBrowserName.equals("Mozilla")){
            driver =  new FirefoxDriver();
        }
        return driver;
    }

    public static void quitBrowser(WebDriver driver){
        driver.quit();
    }
}
