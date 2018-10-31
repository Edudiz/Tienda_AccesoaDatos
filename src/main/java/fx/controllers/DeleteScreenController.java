package fx.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class DeleteScreenController implements Initializable {
    
    @FXML
    private ListView<String> fxDeleteList;
    
    private IndexScreenController index;
    private Alert alertError;

    public ListView<String> getFxDeleteList() {
        return fxDeleteList;
    }

    public void setFxDeleteList(ListView<String> fxDeleteList) {
        this.fxDeleteList = fxDeleteList;
    }

    public IndexScreenController getIndex() {
        return index;
    }

    public void setIndex(IndexScreenController index) {
        this.index = index;
    }
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        alertError = new Alert(Alert.AlertType.ERROR);
        alertError.setTitle("Info");
        alertError.setHeaderText(null);
        alertError.setContentText("The purchase file couldn´t be loaded");
        //cargarListaView();
    }    
    
}
