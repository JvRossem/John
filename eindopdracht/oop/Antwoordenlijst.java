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
public class Antwoordenlijst extends Toetslijst{
    
    /*de gelecteerde antwoorden van de user worden hier in een arraylist opgeslagen*/  
    
    protected static ArrayList<String> antwoordenlijst;  
   static void SetupAntwoordenlijst() { 
             
  antwoordenlijst = new ArrayList<String>();         
    }          
    protected static ArrayList<String> getAntwoordenlijst() {        
         return antwoordenlijst; 
}
}