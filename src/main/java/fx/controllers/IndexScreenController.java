package fx.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class IndexScreenController implements Initializable {

    @FXML
    private BorderPane fxRoot;
    
    @FXML
    private MenuBar fxMenu;
    
    private AnchorPane loginScreen;
    private LoginScreenController controllerLogin;
    private AnchorPane getScreen;
    private GetScreenController controllerGet;
    private AnchorPane addScreen;
    private AddScreenController controllerAdd;
    private AnchorPane deleteScreen;
    private DeleteScreenController controllerDelete;
    /**
     * Initializes the controller class.
     */
    
    private void preLoadLogin() {
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource("/fxml/loginScreen.fxml"));
            loginScreen = loaderMenu.load();
            controllerLogin = loaderMenu.getController();
            controllerLogin.setIndex(this);         
        } catch (IOException ex) {
            Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadLogin() {
        fxRoot.setCenter(loginScreen);
    }
    
    private void preLoadGet() {
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource("/fxml/getScreen.fxml"));
            getScreen = loaderMenu.load();
            controllerGet = loaderMenu.getController();
            controllerGet.setIndex(this);
        } catch (IOException ex) {
            Logger.getLogger(GetScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadGet() {
        fxMenu.setVisible(true);
        fxRoot.setCenter(getScreen);
        //controllerGet.cargarCompras();
    }
    
    private void preLoadAdd() {
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource("/fxml/addScreen.fxml"));
            addScreen = loaderMenu.load();
            controllerAdd = loaderMenu.getController();
            controllerAdd.setIndex(this);
        } catch (IOException ex) {
            Logger.getLogger(AddScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadAdd() {
        fxRoot.setCenter(addScreen);
    }
    
    private void preLoadDelete() {
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource("/fxml/deleteScreen.fxml"));
            deleteScreen = loaderMenu.load();
            controllerDelete = loaderMenu.getController();
            controllerDelete.setIndex(this);
        } catch (IOException ex) {
            Logger.getLogger(DeleteScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadDelete() {
        fxRoot.setCenter(deleteScreen);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preLoadLogin();
        preLoadGet();
        preLoadAdd();
        preLoadDelete();
        fxMenu.setVisible(false);
        loadLogin();
    }    
    
}
