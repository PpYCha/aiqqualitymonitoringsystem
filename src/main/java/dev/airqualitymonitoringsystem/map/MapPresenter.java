/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.airqualitymonitoringsystem.map;

import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.Animation;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.InfoWindow;
import com.lynden.gmapsfx.javascript.object.InfoWindowOptions;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import dev.airqualitymonitoringsystem.login.LoginView;
import dev.airqualitymonitoringsystem.uiextention.ControlledScreen;
import dev.airqualitymonitoringsystem.uiextention.ScreenController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Mew
 */
public class MapPresenter implements Initializable, ControlledScreen, MapComponentInitializedListener {

    @FXML
    Button showLogin;

    protected StringProperty from = new SimpleStringProperty();
    protected StringProperty to = new SimpleStringProperty();

    @FXML
    protected GoogleMapView mapView;

    private ScreenController screenController;

    public void handleShowLogin() {
        LoginView showlogin = new LoginView();
        screenController.navigateToView(showlogin, null);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mapView.addMapInializedListener(this);
    }

    @Override
    public void mapInitialized() {

        LatLong dalakit = new LatLong(12.503178, 124.623087);
        LatLong jajas = new LatLong(12.499203, 124.64009);
        LatLong terminal = new LatLong(12.494797, 124.640807);
        LatLong gaisano = new LatLong(12.489845, 124.64029);
        LatLong uep = new LatLong(12.511187, 124.663615);

        MapOptions options = new MapOptions();

        options.center(new LatLong(12.502896, 124.633806))
                .zoomControl(true)
                .zoom(15)
                .overviewMapControl(false)
                .mapTypeControl(false)
                
                .mapType(MapTypeIdEnum.TERRAIN);
        
        GoogleMap map = mapView.createMap(options);

        MarkerOptions markerOptions1 = new MarkerOptions();
        markerOptions1.position(dalakit);

        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.position(jajas);

        MarkerOptions markerOptions3 = new MarkerOptions();
        markerOptions3.position(terminal);

        MarkerOptions markerOptions4 = new MarkerOptions();
        markerOptions4.position(gaisano);

        MarkerOptions markerOptions5 = new MarkerOptions();
        markerOptions5.position(uep);

        Marker dalakitMarker = new Marker(markerOptions1);
        Marker jajasMarker = new Marker(markerOptions2);
        Marker terminalMarker = new Marker(markerOptions3);
        Marker gaisanoMarker = new Marker(markerOptions4);
        Marker uepMarker = new Marker(markerOptions5);

        map.addMarker(dalakitMarker);
        map.addMarker(jajasMarker);
        map.addMarker(terminalMarker);
        map.addMarker(gaisanoMarker);
        map.addMarker(uepMarker);

        InfoWindowOptions dalakitInfoWindowOptions = new InfoWindowOptions();
        dalakitInfoWindowOptions.content("<h2>Dalakit</h2>"
                + "1.0 CO<br>"
                + "2017-02-15 15:39:00");
        InfoWindow dalakitInfoWindow = new InfoWindow(dalakitInfoWindowOptions);
        dalakitInfoWindow.open(map, dalakitMarker);

        InfoWindowOptions jajasInfoWindowOptions = new InfoWindowOptions();
        jajasInfoWindowOptions.content("<h2>Jajas</h2>"
                + "1.0 CO<br>"
                + "2017-02-15 16:15:00");
        InfoWindow jajasInfoWindow = new InfoWindow(jajasInfoWindowOptions);
        jajasInfoWindow.open(map, jajasMarker);
        
        InfoWindowOptions terminalInfoWindowOptions = new InfoWindowOptions();
        terminalInfoWindowOptions.content("<h2>Terminal</h2>"
                + "1.5 CO<br>"
                + "2017-02-15 16:47:00");
        InfoWindow terminalInfoWindow = new InfoWindow(terminalInfoWindowOptions);
        terminalInfoWindow.open(map, terminalMarker);

        InfoWindowOptions gaisanoInfoWindowOptions = new InfoWindowOptions();
        gaisanoInfoWindowOptions.content("<h2>Gaisano</h2>"
                + "1.5 CO<br>"
                + "2017-02-15 17:15:00");
        InfoWindow gaisanoInfoWindow = new InfoWindow(gaisanoInfoWindowOptions);
        gaisanoInfoWindow.open(map, gaisanoMarker);

         InfoWindowOptions uepInfoWindowOptions = new InfoWindowOptions();
       uepInfoWindowOptions.content("<h2>Uep</h2>"
                + "1.5 CO<br>"
                + "2017-02-15 17:58:00");
        InfoWindow uepInfoWindow = new InfoWindow(uepInfoWindowOptions);
       uepInfoWindow.open(map, uepMarker);
    }

    @Override
    public void setScreenController(ScreenController screenController) {
        this.screenController = screenController;

    }

}
