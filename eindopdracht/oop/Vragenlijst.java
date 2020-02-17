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
public class Vragenlijst extends Toetslijst {
    
    protected static ArrayList<Vragen> vragenlijst;
  
   protected static void SetupVragenlijst() { 
      /*Op dit moment alleen de eerste 10 vragen iit Toetslijst arraylist halen. 
       *In toekomst een willekeurige sublijst met 10 vragen uit Toetslijst halen
       */     
       vragenlijst = new ArrayList<Vragen>();  
        vragenlijst.addAll(Toetslijst.getToetslijst1());
       
         System.out.println(Toetslijst.getToetslijst());
    /*vragenlijst = new ArrayList<Vragen>(); 
        Vragen vragenlijst = Toetslijst.getToetslijst().get(0);       
        vragenlijst.addAll(Toetslijst.getToetslijst().get(0));
    */
    }           
    protected static ArrayList<Vragen> getVragenlijst() {        
         return vragenlijst;}
}