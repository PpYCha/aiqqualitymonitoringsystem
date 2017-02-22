package dev.airqualitymonitoringsystem.shell;

import com.airhacks.afterburner.views.FXMLView;
import dev.airqualitymonitoringsystem.uiextention.ScreenController;
import java.net.URL;
import java.util.ResourceBundle;

import dev.airqualitymonitoringsystem.login.LoginView;
import dev.airqualitymonitoringsystem.map.MapView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class ShellPresenter extends ScreenController implements Initializable {

    @FXML
    AnchorPane centerOfBorderPane;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        MapView mapView = new MapView();
        navigateToView(mapView, null);
    }

  
    @Override
    public void navigateToView(FXMLView view, Object param) {
        super.navigateToView(view, param); //To change body of generated methods, choose Tools | Templates.
        view.getViewAsync(v->centerOfBorderPane.getChildren().setAll(v));
    }
}
