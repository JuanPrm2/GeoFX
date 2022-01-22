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
    private CheckBox crawlerChechBox;

    @FXML
    private Label potentialCheckBox;

    @FXML
    private CheckBox proxyCheckBox;

    @FXML
    private GridPane securityGridPane;

    @FXML
    private Label threatCheckBox;

    @FXML
    private CheckBox torCheckBox;

    @FXML
    private Label statusLabel;
	
	
    public SecurityController() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
		loader.setController(this);
		loader.load();
		
		crawlerChechBox.selectedProperty().bind(securityModel.crawlerProperty());
		
		potentialCheckBox.textProperty().bind(securityModel.potentialThreatProperty());
		
		proxyCheckBox.selectedProperty().bind(securityModel.proxyProperty());
		
		threatCheckBox.textProperty().bind(securityModel.threatLvlProperty());
		
		torCheckBox.selectedProperty().bind(securityModel.torProperty());
		
		statusLabel.textProperty().bind(securityModel.statusProperty());
		
		
    }
    
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	
	
	public GridPane getSecurityGridPane() {
		return securityGridPane;
	}
	
	
	
}
