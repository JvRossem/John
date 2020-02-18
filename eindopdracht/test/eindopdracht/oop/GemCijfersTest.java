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
public class GemCijfersTest {
    
    public GemCijfersTest() {
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
     * Test of getGemStudent method, of class GemCijfers.
     */
    @Test
    public void testGetGemStudent() {
        System.out.println("getGemStudent");
        int expResult = 0;
        int result = GemCijfers.getGemStudent();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGemJoenna method, of class GemCijfers.
     */
    @Test
    public void testGetGemJoenna() {
        System.out.println("getGemJoenna");
        int expResult = 0;
        int result = GemCijfers.getGemJoenna();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGemLisa method, of class GemCijfers.
     */
    @Test
    public void testGetGemLisa() {
        System.out.println("getGemLisa");
        int expResult = 0;
        int result = GemCijfers.getGemLisa();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGemRafael method, of class GemCijfers.
     */
    @Test
    public void testGetGemRafael() {
        System.out.println("getGemRafael");
        int expResult = 0;
        int result = GemCijfers.getGemRafael();
        assertEquals(expResult, result);
    }
    
}
