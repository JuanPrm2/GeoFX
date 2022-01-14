package dad.geofx.contenido.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class RootController implements Initializable{

	LocationController controllerLocation= new LocationController();
	SecurityController controllerSecurity= new SecurityController();
	ConnectionController controllerConnection= new ConnectionController();
	
    @FXML
    private Tab ConnectionTab;

    @FXML
    private HBox HBoxCabecera;

    @FXML
    private TextField IPTextField;

    @FXML
    private Tab LocationTab;

    @FXML
    private Tab SecurityTab;

    @FXML
    private Button checkIpTextField;

    @FXML
    private BorderPane root;

    public RootController() throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootView.fxml"));
    	loader.setController(this);
    	loader.load();
    	
    }
    
    
	public void initialize(URL location, ResourceBundle resources) {
		LocationTab.setContent(controllerLocation.getLocationGridPane());
		SecurityTab.setContent(controllerSecurity.getSecurityGridPane());
		ConnectionTab.setContent( controllerConnection.getConnectionGridPane());
		
		
	}

	public BorderPane getRoot() {
		return root;
		
		
		
	}

	
	
	
	
	
}
