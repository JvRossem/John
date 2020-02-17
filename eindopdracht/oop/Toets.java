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
