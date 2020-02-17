/**
 * @author John van Rossem
 * OOP
 * 17-02-2020
 */
package eindopdracht.oop;

import javafx.scene.control.Alert;

public class Waardering {

    private static String waardering;
 
    protected static String getWaardering() {
    try{   
        if (Toets.getCijfer() >= 9) {
        return ("GOED");    
            } else if (Toets.getCijfer() >= 7) {
            return ("Ruim voldoende");    
            } else if (Toets.getCijfer() >= 6) {
            return ("Voldoende");   
                } else {
                return ("Onvoldoende");
                } 
            }
    catch(Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Foutmelding");
            alert.setHeaderText("Error");
            alert.setContentText("Oeps, er is een fout opgetreden.Druk op OK om door te gaan! ");
            alert.showAndWait();         
            return ("Waardering kan niet worden berekend");
    }   
    }
}