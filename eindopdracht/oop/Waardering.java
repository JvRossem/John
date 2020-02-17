/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

/**
 *
 * @author mosqu
 */
public class Waardering {

    static String waardering;
    
    protected static String getWaardering() {
    String result = null;
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
}