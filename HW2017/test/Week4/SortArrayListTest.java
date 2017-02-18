/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import static Week4.SortArrayList.sort;
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
public class SortArrayListTest {
    
    public SortArrayListTest() {
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
    public void testSort() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);//#2
        list.add(2);//#3
        list.add(6);//#4
        list.add(5);//#5 
        System.out.println(list.toString());
        sort(list);
    }
    
}
