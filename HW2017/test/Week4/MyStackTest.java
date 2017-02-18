/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.ArrayList;
import java.util.Collections;
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
public class MyStackTest {

    public MyStackTest() {
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
    public void testSomeMethod() {
        System.out.println("Enter 5 Strings: ");
        ArrayList<Object> list = new ArrayList<>();
        list.add("string 1");
        list.add("string 2");
        list.add("string 3");
        list.add("string 4");
        list.add("string 5"); 
        Collections.reverse(list);
        System.out.println(list);
    }

}
