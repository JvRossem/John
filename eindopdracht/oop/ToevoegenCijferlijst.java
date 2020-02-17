/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

import javafx.scene.control.Alert;


/**
 *
 * @author mosqu
 */
public class ToevoegenCijferlijst {
          
    private static Student Cijferlijst;
     
   protected static void getCijferlijst() { 
  
    StudentCijfers.SetupStudentCijfers();
    StudentCijfers.SetupJoenna();   
    StudentCijfers.SetupLisa();
    StudentCijfers.SetupRafael();
  
    
   try {  
   String n1 = AlleNamen.getAlleNamen().get(AlleNamen.getAlleNamen().size() - 1);     
   String s1 = "Joenna";
   String s2 = "Lisa";
   String s3 = "Rafael";
   
   if (n1.equals(s1)){
    StudentCijfers.getStudentCijfers().add(Toets.getCijfer());
    StudentCijfers.getJoenna().add(Toets.getCijfer());
       System.out.println("Score toegevoegd bij Joenna"); 
       
    }else if (n1.equals(s2)){
    StudentCijfers.getStudentCijfers().add(Toets.getCijfer());
    StudentCijfers.getLisa().add(Toets.getCijfer());
        System.out.println("Score toegevoegd bij Lisa");
    
    }else if (n1.equals(s3)){ 
    StudentCijfers.getStudentCijfers().add(Toets.getCijfer());
    StudentCijfers.getRafael().add(Toets.getCijfer());
        System.out.println("Score toegevoegd bij Rafael");
          }else{
            StudentCijfers.getStudentCijfers().add(Toets.getCijfer());
            System.out.println("Student niet bekend");
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