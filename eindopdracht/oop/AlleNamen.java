/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

import java.util.ArrayList;

/**
 *
 * @author mosqu
 */
public class AlleNamen {
 
    
  protected static ArrayList<String> naamstudent;   
   static void SetupAlleNamen() {              
  naamstudent = new ArrayList<String>();         
    }           
    protected static ArrayList<String> getAlleNamen() {        
         return naamstudent; 
   
    }
    
}