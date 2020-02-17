/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 *
 * @author mosqu
 */
public class StudentFXMLController implements Initializable {
    
    @FXML
    private Label studentNameLabel;
    
        @FXML
    private Button okbutton;
            @FXML
    protected ComboBox comboboxnamen;
        
        @FXML
    private void handleButtonAction(ActionEvent event) {
        
    String naam = comboboxnamen.getValue().toString();
    AlleNamen.getAlleNamen().add(naam);
  
         
        try {  
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
            stage.setMaximized(true);
            }
        catch(Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Foutmelding");
            alert.setHeaderText("Exception loading fxml");
            alert.setContentText("Oeps, er is een fout opgetreden.Druk op OK om nogmaals te proberen! ");
            alert.showAndWait();         
  }
    }
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    AlleNamen.SetupAlleNamen();
    Toetslijst.SetupToetslijst();  
    comboboxnamen.getItems().removeAll(comboboxnamen.getItems());
    comboboxnamen.getItems().addAll("Joenna", "Lisa", "Rafael");
    comboboxnamen.getSelectionModel().select("Joenna");
     
    studentNameLabel.setText("Selecteer uw naam en druk op OK");
    
     
    }   
}