/**
 * @author John van Rossem
 * OOP
 * 17-02-2020
 */
package eindopdracht.oop;


public class Teller {
  /*Bijhouden van het aantal punten. 
   *SetTeller aanroepen wordt er 1 punt bij opgeteld*/
    
    private static int teller;   
    
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