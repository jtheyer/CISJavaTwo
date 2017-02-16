/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 55heyerjt01
 */
public class PersonTest {

    public PersonTest() {
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

    //Create a Person
    @Test
    public void testPerson() {
        Person bub1 = new Person("bub", "1 main st", "123456789", "bub@yahoo.com");
        System.out.println(bub1);
        
    }

    //Create a Student + String status, String name, String address, String phone, String email 
    public void testPerson() {
        Student bub2 = new Student("freshman", "Bub2", "1 west Street", "123456879", "bub2@gmail.com");
    }
}
