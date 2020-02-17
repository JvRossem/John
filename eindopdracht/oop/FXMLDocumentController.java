/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


/**
 *
 * @author mosqu
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
   @FXML
    private Label label1;
     @FXML
    private Button starten;
        @FXML
    private Button button;
         @FXML
    private Button exit;
           @FXML
    private ComboBox combobox;
         
    @FXML
    private void handleButtonAction1(ActionEvent event) {
     button.setVisible(true);
     starten.setVisible(false);
      combobox.setVisible(true);
      
      Vragen vragen = Vragenlijst.getVragenlijst().get(Volgendevraag.getVolgendevraag());
      label.setText(vragen.getVraag());  
    }
        @FXML
    private void handleButtonAction2(ActionEvent event) {
       Platform.exit(); 
    }
         
    @FXML
    private void handleButtonAction(ActionEvent event) { 
    
    if (Volgendevraag.getVolgendevraag()< 9) {
        String antwoord = combobox.getValue().toString(); 
        Antwoordenlijst.getAntwoordenlijst().add(antwoord);
        GoedAntwoordenlijst.SetupGoedeAntwoordenlijst();

          Volgendevraag.setVolgendevraag();             
        System.out.println(Volgendevraag.getVolgendevraag());
        Vragen vragen = Vragenlijst.getVragenlijst().get(Volgendevraag.getVolgendevraag());
        label.setText(vragen.getVraag());
            
     
    }else{
    exit.setVisible(true);
     button.setVisible(false);
      combobox.setVisible(false);
       label1.setVisible(true);
      ToevoegenCijferlijst.getCijferlijst();
        
      label.setText("Hallo "+AlleNamen.getAlleNamen().get(AlleNamen.getAlleNamen().size() - 1) + ", je hebt de volgende Cijfer gehaald:  " +  Toets.getCijfer()+ "\n \n Dit is "+ Waardering.getWaardering());  
      label1.setText("Dit zijn de cijferlijsten van alle studenten: \n\nCijfers van Joena: "+StudentCijfers.getJoenna()+"\t\tGemiddelde: "+GemCijfers.getGemJoenna()+"\nCijfers van Lisa: "+StudentCijfers.getLisa()+"\t\tGemiddelde: "+GemCijfers.getGemLisa()+"\nCijfers van Rafael: "+StudentCijfers.getRafael()+"\t\tGemiddelde: "+GemCijfers.getGemRafael());
    }  
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
    combobox.getItems().removeAll(combobox.getItems());
    combobox.getItems().addAll("A", "B", "C", "D");
    combobox.getSelectionModel().select("A");
     
    /*De arraylisten voorbereiden en klaarzetten om te vullen*/      
    Vragenlijst.SetupVragenlijst();
    Antwoordenlijst.SetupAntwoordenlijst();
    StudentCijfers.SetupStudentCijfers();
   
    String stud = AlleNamen.getAlleNamen().toString();
   label.setText("Hallo "+ AlleNamen.getAlleNamen().get(AlleNamen.getAlleNamen().size() - 1) +"! Druk op Starten om de toets te starten!");
   exit.setVisible(true);
   combobox.setVisible(false);
   button.setVisible(false);
   label1.setVisible(false);
}
}



        
      
       

