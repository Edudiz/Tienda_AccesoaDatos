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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import services.ArticleServices;
import services.PurchaseServices;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class AddScreenController implements Initializable {
    
    private IndexScreenController index;
    
    @FXML
    private TextField fxNewNIF;

    @FXML
    private TextField fxNewBuy;
    
    @FXML
    private ComboBox<String> fxSelect;

    @FXML
    private DatePicker fxNewDate;

    public IndexScreenController getIndex() {
        return index;
    }

    public void setIndex(IndexScreenController index) {
        this.index = index;
    }

    public TextField getFxNewNIF() {
        return fxNewNIF;
    }

    public void setFxNewNIF(TextField fxNewNIF) {
        this.fxNewNIF = fxNewNIF;
    }

    public TextField getFxNewBuy() {
        return fxNewBuy;
    }

    public void setFxNewBuy(TextField fxNewBuy) {
        this.fxNewBuy = fxNewBuy;
    }

    public ComboBox<String> getFxSelect() {
        return fxSelect;
    }

    public void setFxSelect(ComboBox<String> fxSelect) {
        this.fxSelect = fxSelect;
    }

    public DatePicker getFxNewDate() {
        return fxNewDate;
    }

    public void setFxNewDate(DatePicker fxNewDate) {
        this.fxNewDate = fxNewDate;
    }
    
    private Alert alertError;
    private Alert alertInfo;
    
    public void clear(){
        fxNewNIF.clear();
        fxNewBuy.clear();
        fxSelect.setValue(null);
        fxNewDate.setValue(null);
    }
    
    public void addPurchase() {
        PurchaseServices ps = new PurchaseServices();
        if (ps.addPurchase(fxNewNIF.getText(), fxNewBuy.getText(), fxSelect.getValue(), fxNewDate.getValue())) {
            alertInfo.setContentText("Purchase");
            alertInfo.showAndWait();
        } else {
            alertError.setContentText("No purchase");
            alertError.showAndWait();
        }

        clear();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        alertError = new Alert(Alert.AlertType.ERROR);
        alertInfo = new Alert(Alert.AlertType.INFORMATION);
        alertInfo.setTitle("Confirmation");
        alertInfo.setHeaderText(null);
    }    
    
}
