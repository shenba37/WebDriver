package testNG;

import framework.appModule.SignIn;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.Constants;
import utilities.ReadCSVData;
import utilities.Utils;

import java.util.Map;

/**
 * Created by Shenbaga on 8/3/2017.
 *
 */
public class TestWebApplication {

    private static Logger Log = Logger.getLogger(TestWebApplication.class);
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        //The path to the driver executable must be set by the webdriver.gecko.driver system property;
        System.setProperty(Constants.GECKO_DRIVER_PROPERTY,Constants.GECKO_DRIVER_PATH);
        driver = Utils.loadBrowser("Mozilla");
    }

    @Test
    public void testLogin(){
        Log.info("Started the Login Page Test");
        driver.get(Constants.URL);
        Map<String,String> loginData = ReadCSVData.getData();
        for(Map.Entry<String,String> entry : loginData.entrySet()){
            SignIn.execute(driver,entry.getKey(),entry.getValue());
            Log.info("Logged in successfully for user:" +entry.getKey());
        }
        Log.info("End Test of Login Page");
    }

    @AfterClass
    public static void tearDown(){
        Utils.quitBrowser(driver);
    }

}

