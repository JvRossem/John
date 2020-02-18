/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

import static eindopdracht.oop.Toetslijst.toetslijst1;
import java.util.ArrayList;
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
public class VragenlijstTest {
    
    public VragenlijstTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {      
        ArrayList<Vraag> toetslijst1 = new ArrayList<Vraag>(); 
        Vraag toetsvraag1 = new Vraag("Hoe");
        toetslijst1.add(toetsvraag1);        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SetupVragenlijst method, of class Vragenlijst.
     */
    @Test
    public void testSetupVragenlijst() {
        System.out.println("SetupVragenlijst");
        Vragenlijst.SetupVragenlijst();
    }

    /**
     * Test of getVragenlijst method, of class Vragenlijst.
     */
    @Test
    public void testGetVragenlijst() {
        System.out.println("getVragenlijst");
        String expResult = "[Hoe]";
        String result = Vragenlijst.getVragenlijst().toString();
        assertEquals(expResult, result);
    }
    
}
