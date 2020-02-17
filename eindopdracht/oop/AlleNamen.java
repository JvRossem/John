/**
 * @author John van Rossem
 * OOP
 * 17-02-2020
 */
package eindopdracht.oop;

import java.util.ArrayList;

public class AlleNamen {
 
   
  private static ArrayList<String> naamstudent;
  
   static void SetupAlleNamen() {              
  naamstudent = new ArrayList<String>();         
    }           
    protected static ArrayList<String> getAlleNamen() {        
         return naamstudent; 
   
    }
    
}