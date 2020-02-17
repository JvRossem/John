/**
 * @author John van Rossem
 * OOP
 * 17-02-2020
 */
package eindopdracht.oop;

import java.util.ArrayList;

public class Antwoordenlijst extends Toetslijst{
    
    /*de gelecteerde antwoorden van de user worden hier in een arraylist opgeslagen*/  
    
    private static ArrayList<String> antwoordenlijst; 
    
    static void SetupAntwoordenlijst() { 
    antwoordenlijst = new ArrayList<String>();         
    } 
   
    protected static ArrayList<String> getAntwoordenlijst() {        
         return antwoordenlijst; 
}
      protected static ArrayList<String> setAntwoordenlijst() {        
         return antwoordenlijst; 
}
}