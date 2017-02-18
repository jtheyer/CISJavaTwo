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
 * @author jason
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

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Person instance = new Person();
        instance.setName(name);
    }

    /**
     * Test of getAddress method, of class Person.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Person.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Person instance = new Person();
        instance.setAddress(address);
    }

    /**
     * Test of getPhone method, of class Person.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhone method, of class Person.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        Person instance = new Person();
        instance.setPhone(phone);
    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Person.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Person instance = new Person();
        instance.setEmail(email);
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new Person("Joe", "1mainSt", "570555555", "joe@vo.bo");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
