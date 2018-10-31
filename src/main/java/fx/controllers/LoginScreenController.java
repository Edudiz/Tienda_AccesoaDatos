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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import services.UserServices;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class LoginScreenController implements Initializable {

    private IndexScreenController index;

    public void setIndex(IndexScreenController index) {
        this.index = index;
    }
    
    @FXML
    private TextField fxUser;

    @FXML
    private PasswordField fxPass;
    
    public void clickLogin() {
        UserServices us = new UserServices();
        if (us.checkUser(
                fxUser.getText(),fxPass.getText())) { 
            index.loadGet();
        } else {
            fxUser.clear();
            fxPass.clear();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Wrong");
            alert.setHeaderText(null);
            alert.setContentText("User and/or password is/are incorrect");
            alert.showAndWait();
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
