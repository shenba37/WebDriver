package com.training.selenium.handson;

import org.junit.*;
import org.junit.runners.MethodSorters;

/**
 * Created by Shenbaga on 8/3/2017.
 *
 * The Purpose of this class is to show the structure of the Selenium JUnit Class
 *
 * A Simple Junit Class contains three methods
 *  - method with @Before annotation (Will be executed before each Test Method)
 *  - method with @Test annotation
 *  - method with @After annotation (Will be executed after each Test Method)
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SampleJUnitClass {

    @BeforeClass
    public static void SetUpClassData(){
        System.out.println("Set Up / Initialize Data Once for the class\n");
    }

    @Before
    public void setUp(){
        System.out.println("Set Up / Initialize Data for each Test Method\n");

    }

    @Test
    public void testLogicOne(){
        System.out.println("Test Logic One\n");
    }

    @Test
    public void testLogicTwo(){
        System.out.println("Test Logic Two\n");
        //throw new NullPointerException();
    }

    @After
    public void tearDown(){
        System.out.println("Tear Down / Remove / Destroy Data for each Test Method\n");
    }

    @AfterClass
    public static void tearDownClassData(){
        System.out.println("Tear Down / Remove / Destroy Data for the class\n");
    }

}
