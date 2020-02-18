/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mosqu
 */
public class TellerTest {
    
    public TellerTest() {
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
     * Test of getTeller method, of class Teller.
     */
    @Test
    public void testGetTeller() {
        System.out.println("getTeller");
        int expResult = 1;
        int result = Teller.getTeller();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeller method, of class Teller.
     */
    @Test
    public void testSetTeller() {
        System.out.println("setTeller");
        int expResult = 0;
        int result = Teller.setTeller();
        assertEquals(expResult, result);

    }
    
}
