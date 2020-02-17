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
public class StudentCijfers {
    
 protected static ArrayList<Integer> studentcijfers;
  
   protected static void SetupStudentCijfers() {    
   /*TotaalLijst met opgeslagen toets-scores.*/
   /*Dummy data met per student 3x opgeslagen toets scores. Deze data zou normaal gesproken uit een gekoppelde database moeten worden opgehaald*/ 
    studentcijfers = new ArrayList<Integer>();
    studentcijfers.add(8);
    studentcijfers.add(6);
    studentcijfers.add(9);
    studentcijfers.add(4);
    studentcijfers.add(7);
    studentcijfers.add(4);
    studentcijfers.add(9);
    studentcijfers.add(10);
    studentcijfers.add(8);
    }           
    protected static ArrayList<Integer> getStudentCijfers() {        
         return studentcijfers; }
  
    /*Lijst per student met opgeslagen toets-scores.*/
        protected static ArrayList<Integer> joenna;  
    static void SetupJoenna() {              
    joenna = new ArrayList<Integer>();  
    joenna.add(8);
    joenna.add(4);
    joenna.add(9);
    }            
    protected static ArrayList<Integer> getJoenna() {        
         return joenna; }

 
        protected static ArrayList<Integer> lisa; 
        static void SetupLisa() {              
            lisa = new ArrayList<Integer>();
            lisa .add(6);
            lisa .add(7);
            lisa .add(10);
        }           
        protected static ArrayList<Integer> getLisa() {        
        return lisa; }

    
            protected static ArrayList<Integer> Rafael; 
            static void SetupRafael() {              
                Rafael = new ArrayList<Integer>();
                Rafael .add(9);
                Rafael .add(4);
                Rafael .add(8);
            }          
                protected static ArrayList<Integer> getRafael() {        
                return Rafael; }    
}
