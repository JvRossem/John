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
public class Volgendevraag { 

    /*Bijhouden van het aantal vragen, na elke vraag 1 erbij optellen*/
    
    protected static int volgendevraag;
    
        private static void Volgendevraag() { 
        int x = 0;     
}
        protected static int getVolgendevraag() {        
         return volgendevraag; 
} 

        protected static int setVolgendevraag() {
        return volgendevraag++;
        }       
}