package testNG;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Shenbaga on 04-10-2017.
 */
public class TestNGSampleClass {

    @BeforeTest
    public void setUpTestData(){
        System.out.println("Set Up Test Data");
    }

    @Test
    public void testOne(){
        System.out.println("Test One");
    }

    @Test
    public void testTwo(){
        System.out.println("Test Two");
    }

    @AfterTest
    public void tearDownTestData(){
        System.out.println("Tear Down Test Data");
    }
}
