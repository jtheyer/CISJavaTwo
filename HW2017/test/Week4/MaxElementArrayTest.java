/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jason
 */
public class MaxElementArrayTest {
    
    public MaxElementArrayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of max method, of class MaxElementArray.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        ArrayList<Integer> list = null;
        Integer expResult = null;
        Integer result = MaxElementArray.max(list);
        assertEquals(expResult, result);
    }

}
