package com.training.selenium.handson;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import samples.ArithmeticOperations;

/**
 * Created by Shenbaga on 28-09-2017.
 */
public class JUnitExampleClass {
    ArithmeticOperations object;

    @Before
    public void setUp(){
        object = new ArithmeticOperations();
    }


    @Test
    public void testAddition(){
        int actualResult = object.addition(1,2);
        System.out.println("Test Addition- Actual result " + actualResult);
        Assert.assertEquals("Value should be equal",3,actualResult);
    }

    @Test
    public void testMultiplication(){
        int actualResult = object.multiplication(2, 2);
        System.out.println("Test Multiplication - Actual result " + actualResult);
        Assert.assertEquals(4,actualResult);
    }
}
