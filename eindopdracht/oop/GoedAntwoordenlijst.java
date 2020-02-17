/**
 * @author John van Rossem
 * OOP
 * 17-02-2020
 */
package eindopdracht.oop;

import java.util.ArrayList;
import javafx.scene.control.Alert;


public class GoedAntwoordenlijst extends Toetslijst{
   
    private static ArrayList<String> goedantwoordenlijst; 
    
   /*Arraylist met de goede antwoorden die bij deze set vragen hoort*/ 
    
   final protected static void SetupGoedeAntwoordenlijst() { 
       
       String goedantwoord1 = ("C");
       String goedantwoord2 = ("A");
       String goedantwoord3 = ("C");
       String goedantwoord4 = ("D");
       String goedantwoord5 = ("D");
       String goedantwoord6 = ("B");
       String goedantwoord7 = ("C");
       String goedantwoord8 = ("A");
       String goedantwoord9 = ("B");
       String goedantwoord10 = ("D");
       
       goedantwoordenlijst = new ArrayList<String>();  
        goedantwoordenlijst.add(goedantwoord1);
        goedantwoordenlijst.add(goedantwoord2);
        goedantwoordenlijst.add(goedantwoord3);
        goedantwoordenlijst.add(goedantwoord4);
        goedantwoordenlijst.add(goedantwoord5);
        goedantwoordenlijst.add(goedantwoord6);
        goedantwoordenlijst.add(goedantwoord7);
        goedantwoordenlijst.add(goedantwoord8);
        goedantwoordenlijst.add(goedantwoord9);
        goedantwoordenlijst.add(goedantwoord10);
                  
    String goed = goedantwoordenlijst.get(Volgendevraag.getVolgendevraag());
    String ant = Antwoordenlijst.getAntwoordenlijst().get(Volgendevraag.getVolgendevraag()); 
    
    /* Vergelijk het gegeven antwoord met het juiste antwoord en indien juist 1 erbij optellen. 
    *Mocht er iets misgaan in de equals statement vangen foutmelding met try/catch op.
    */
   try{
    if (ant.equals(goed)){
        System.out.println("Goed");
        Teller.setTeller();
                }else{
        System.out.println("Fout");
    }
   }
    catch(Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Foutmelding");
            alert.setHeaderText("Error");
            alert.setContentText("Oeps, er is een fout opgetreden.Druk op OK om nogmaals te proberen! ");
            alert.showAndWait();         
  }
}
}
