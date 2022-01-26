package dad.geofx.contenido.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.contenido.model.SecurityModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable{

	 private SecurityModel securityModel = new SecurityModel();
	
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
		
		CrawlerChechBox.selectedProperty().bind(securityModel.crawlerProperty());
		
		PotentialCheckBox.textProperty().bind(securityModel.potentialThreatProperty());
		
		ProxyCheckBox.selectedProperty().bind(securityModel.proxyProperty());
		
		ThreatCheckBox.textProperty().bind(securityModel.threatLvlProperty());
		
		TorCheckBox.selectedProperty().bind(securityModel.torProperty());
		
		statusLabel.textProperty().bind(securityModel.statusProperty());
		
		
    }
    
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	
	
	public GridPane getSecurityGridPane() {
		return SecurityGridPane;
	}


	public SecurityModel getSecurityModel() {
		return securityModel;
	}
	
	
	
}
