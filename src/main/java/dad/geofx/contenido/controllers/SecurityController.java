package dad.geofx.contenido.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable{

	
	
	@FXML
    private CheckBox CrawlerChechBox;

    @FXML
    private Label PotentialCheckBox;

    @FXML
    private CheckBox ProxyCheckBox;

    @FXML
    private GridPane SecurityGridPane;

    @FXML
    private Label ThreatCheckBox;

    @FXML
    private CheckBox TorCheckBox;

    @FXML
    private Label statusLabel;
	
	
    public SecurityController() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
		loader.setController(this);
		loader.load();
    }
    
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	
	
	public GridPane getSecurityGridPane() {
		return SecurityGridPane;
	}
	
	
	
}
