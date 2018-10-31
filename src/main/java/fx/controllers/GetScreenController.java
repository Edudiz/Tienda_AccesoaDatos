/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class GetScreenController implements Initializable {
    
    private IndexScreenController index;
    
    @FXML
    private DatePicker fxDate;
    
    @FXML
    private ListView<String> fxListView;

    public IndexScreenController getIndex() {
        return index;
    }

    public void setIndex(IndexScreenController index) {
        this.index = index;
    }

    
    public DatePicker getFxDate() {
        return fxDate;
    }

    public void setFxDate(DatePicker fxDate) {
        this.fxDate = fxDate;
    }

    public ListView<String> getFxListView() {
        return fxListView;
    }

    public void setFxListView(ListView<String> fxListView) {
        this.fxListView = fxListView;
    }

    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
