/**
 * @author John van Rossem
 * OOP
 * 17-02-2020
 */
package eindopdracht.oop;

 public abstract class Toets implements iToets {
    protected int score;
    
   public abstract void setScore(int s);
   public abstract int getScore();
    
 protected static int getCijfer(){
         
 if (Teller.getTeller()==0){
    int score = 1;
        return score;                
            }else{
    int score = (Teller.getTeller()*10)/Volgendevraag.getVolgendevraag();
        return score;
 }              
}   
}
