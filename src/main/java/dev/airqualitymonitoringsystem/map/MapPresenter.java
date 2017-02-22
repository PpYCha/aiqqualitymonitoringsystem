/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.airqualitymonitoringsystem.map;

import dev.airqualitymonitoringsystem.login.LoginView;
import dev.airqualitymonitoringsystem.uiextention.ControlledScreen;
import dev.airqualitymonitoringsystem.uiextention.ScreenController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Mew
 */
public class MapPresenter implements Initializable, ControlledScreen {

    @FXML
    Button showLogin;
    private ScreenController screenController;
    
    
    public void handleShowLogin(){
        LoginView showlogin = new LoginView();
        screenController.navigateToView(showlogin, null);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void setScreenController(ScreenController screenController) {
       this.screenController = screenController;
    }
    
}
