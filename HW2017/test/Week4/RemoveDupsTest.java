/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import static Week4.RemoveDups.removeDuplicates;
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
public class RemoveDupsTest {
    
    public RemoveDupsTest() {
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
    public void testRemoveDups() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Prompt for 10 numbers: ");
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(9);
        System.out.println(list);
        removeDuplicates(list);
        System.out.println(list);
    }
    
}
