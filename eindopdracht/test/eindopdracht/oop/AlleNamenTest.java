/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

import static eindopdracht.oop.AlleNamen.naamstudent;
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
public class AlleNamenTest {
    
    public AlleNamenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
   
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    
       String naam1 = new String("John");
       String naam2 = new String("Kees");
       naamstudent = new ArrayList<String>();
    
    naamstudent.add(naam1);
    naamstudent.add(naam2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SetupAlleNamen method, of class AlleNamen.
     */
    @Test
    public void testSetupAlleNamen() {
        System.out.println("SetupAlleNamen");
        AlleNamen.SetupAlleNamen();
    }

    /**
     * Test of getAlleNamen method, of class AlleNamen.
     */
    @Test
    public void testGetAlleNamen() {
        System.out.println("getAlleNamen");
        String expResult = "[John, Kees]";
        String result = AlleNamen.getAlleNamen().toString();
        assertEquals(expResult, result);
    }
    
}
