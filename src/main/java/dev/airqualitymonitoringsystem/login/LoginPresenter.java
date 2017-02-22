package dev.airqualitymonitoringsystem.login;

import dev.airqualitymonitoringsystem.admin.AdminView;
import dev.airqualitymonitoringsystem.uiextention.ControlledScreen;
import dev.airqualitymonitoringsystem.uiextention.ScreenController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Administrator on 1/25/2017.
 */
public class LoginPresenter implements Initializable, ControlledScreen {

    @FXML
    TextField usernameTextField;
    @FXML
    PasswordField passwordField;
    @FXML
    Button loginButton;

    private ScreenController screenController;

    @FXML
    public void handleLogin() {
        if (usernameTextField.getText().equalsIgnoreCase("1")
                && passwordField.getText().equalsIgnoreCase("1")) {

            AdminView adminview = new AdminView();
            screenController.navigateToView(adminview, null);
        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
           
    }

    @Override
    public void setScreenController(ScreenController screenController) {
        this.screenController = screenController;
        
        
    }
}
