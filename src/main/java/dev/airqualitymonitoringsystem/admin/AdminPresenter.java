/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.airqualitymonitoringsystem.admin;

import dev.airqualitymonitoringsystem.hardware.Sensor;
import dev.airqualitymonitoringsystem.hardware.SensorData;
import dev.airqualitymonitoringsystem.uiextention.ControlledScreen;
import dev.airqualitymonitoringsystem.uiextention.ScreenController;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class AdminPresenter implements Initializable, ControlledScreen {

    ScreenController screenController;

    @FXML
    TableView<SensorData> sensorDataTable;
    @FXML
    TableColumn<SensorData, String> timeColumn;
    @FXML
    TableColumn<SensorData, String> carbonMonoxideColumn;
    @FXML
    TableColumn<SensorData, String> warningLevelColumn;
    @FXML
    TableColumn<SensorData, String> overrangeExposureColumn;

    @FXML
    MenuItem close;
    
    @FXML
    public void handleSelectTxtFileButton(Event e) throws IOException {
        FileChooser fileChooser = new FileChooser();

        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(((Button) e.getSource()).getScene().getWindow());
        if (selectedFile != null) {
            List<SensorData> sensorData = Sensor.readFile(selectedFile.getAbsolutePath());
            if (sensorData.size() > 0) {
                sensorData.remove(0);
            }
            sensorDataTable.setItems(FXCollections.observableList(sensorData));
        }

    }

    public void handleClose(){
     System.exit(0);
  
   
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timeColumn.setCellValueFactory(e -> new SimpleStringProperty(e.getValue().getTime()));
        carbonMonoxideColumn.setCellValueFactory(e -> new SimpleStringProperty(e.getValue().getCarbonMonoxide()));
        warningLevelColumn.setCellValueFactory(e -> new SimpleStringProperty(e.getValue().getWarningLevel()));
        overrangeExposureColumn.setCellValueFactory(e -> new SimpleStringProperty(e.getValue().getOverrangeExposure()));

    }

    @Override
    public void setScreenController(ScreenController screenController) {
        this.screenController = screenController;
    }

}
