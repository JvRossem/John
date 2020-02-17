/**
 * @author John van Rossem
 * OOP
 * 17-02-2020
 */
package eindopdracht.oop;

import java.util.ArrayList;

public class Vragenlijst extends Toetslijst {
    
    private static ArrayList<Vragen> vragenlijst;
  
   final protected static void SetupVragenlijst() { 
      /*Op dit moment alleen de eerste 10 vragen iit Toetslijst arraylist halen. 
       *In toekomst een willekeurige sublijst met 10 vragen uit Toetslijst halen
       */     
       vragenlijst = new ArrayList<Vragen>();  
        vragenlijst.addAll(Toetslijst.getToetslijst1());
    }
   
    protected static ArrayList<Vragen> getVragenlijst() {        
         return vragenlijst;}
}