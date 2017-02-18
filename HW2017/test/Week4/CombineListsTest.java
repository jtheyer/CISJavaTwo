/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import static Week4.CombineLists.union;
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
public class CombineListsTest {
    
    public CombineListsTest() {
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
    public void testCombineLists() {
        ArrayList<Integer> listUno = new ArrayList<>();
        ArrayList<Integer> listDos = new ArrayList<>(); 
        listUno.add(1);
        listUno.add(2);
        listUno.add(3);
        listUno.add(4);
        listUno.add(5);
        System.out.println(listUno);
        listDos.add(16);
        listDos.add(17);
        listDos.add(18);
        listDos.add(19);
        listDos.add(20);
        System.out.println(listDos);
        System.out.println(union(listDos, listUno));
    }
}
