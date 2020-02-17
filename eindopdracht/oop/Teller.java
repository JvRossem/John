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
public class Teller {
  /*Bijhouden van het aantal punten. Bij elk goed antwoord word er 1 punt bij opgeteld*/
    protected static int teller;   
    
        private static void Teller() { 
        int tlr = 0;   
}
        protected static int getTeller(){
            return teller;
        }
        protected static int setTeller() {
            return teller++;
        } 
}     