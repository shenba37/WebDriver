package automation_framework;

import framework.appModule.SignIn;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utilities.Constants;
import utilities.Utils;

/**
 * Created by Shenbaga on 21-09-2017.
 */
public class LoginPageTest {
    private static Logger Log = Logger.getLogger(LoginPageTest.class);
    public static void main(String[] args) {
        Log.warn("Started the Login Page Test");
        //The path to the driver executable must be set by the webdriver.gecko.driver system property;
        System.setProperty(Constants.GECKO_DRIVER_PROPERTY, Constants.GECKO_DRIVER_PATH);
        WebDriver driver = Utils.loadBrowser("Mozilla");
        driver.get(Constants.URL);
        SignIn.execute(driver, Constants.USER_NAME,Constants.PASSWORD);
        Log.info("Logged in");
        Utils.quitBrowser(driver);
        Log.info("End Test of Login Page");
    }
}
