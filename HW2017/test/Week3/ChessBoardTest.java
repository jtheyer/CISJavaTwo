/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

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
public class ChessBoardTest {

    public ChessBoardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before //Code here for anything that need to be set up a certain way before the test
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of move method, of class ChessBoard.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int rowFrom = 0;
        int colFrom = 0;
        int rowTo = 0;
        int colTo = 0;
        ChessBoard instance = new ChessBoard();
        instance.move(rowFrom, colFrom, rowTo, colTo);
        assertEquals(instance.board[rowFrom][colFrom], 'p');
        assertEquals(instance.board[rowTo][colTo], '-');
    }

    /**
     * Test of reset method, of class ChessBoard.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        ChessBoard instance = new ChessBoard();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ChessBoard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ChessBoard instance = new ChessBoard();
        String expResult = "";
        String result = instance.toString();
      //  assertEquals(expResult, result);
       assertNotEquals(expResult, result);
        
    }

}
