package framework.appModule;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;
import page_objects.LogInPage;
import utilities.Constants;

import java.util.Map;

/**
 * Created by Shenbaga on 29-09-2017.
 */
public class SignIn {
    private static Logger Log = Logger.getLogger(SignIn.class);
    public static void execute(WebDriver driver,String username,String password){
        Log.info("Sign In Execution");
        HomePage.logInLink(driver).click();
        LogInPage.userNameTextBox(driver).sendKeys(username);
        LogInPage.userNamePasswordBox(driver).sendKeys(password);
        LogInPage.submitButton(driver).submit();
    }
}
