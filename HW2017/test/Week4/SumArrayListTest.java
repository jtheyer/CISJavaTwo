/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import static Week4.SumArrayList.sum;
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
public class SumArrayListTest {
    
    public SumArrayListTest() {
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

    @Test
    public void testSumMethod() {
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Prompt 5 nums: ");
        list.add(.1); 
        list.add(.1);
        list.add(.1); 
        list.add(.1); 
        list.add(.1); 
        System.out.println(sum(list)); //passes test,
        //i dont understand why its -5 instead of +
    }
    
}
