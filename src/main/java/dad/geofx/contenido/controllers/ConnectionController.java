package dad.geofx.contenido.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.contenido.model.ConnectionModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class ConnectionController implements Initializable{

	private ConnectionModel connectionModel = new ConnectionModel();
	
    @FXML
    private Label aSNLabel;

    @FXML
    private GridPane connectionGridPane;

    @FXML
    private Label hostNameLabel;

    @FXML
    private Label iPLabel;

    @FXML
    private Label typeLabel;
	
	public ConnectionController() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionView.fxml"));
		loader.setController(this);
		loader.load();
		
		aSNLabel.textProperty().bindBidirectional(connectionModel.asnProperty(), new NumberStringConverter());
		
		hostNameLabel.textProperty().bind(connectionModel.hostNameProperty());
		
		iPLabel.textProperty().bind(connectionModel.ipAddressProperty());
		
		typeLabel.textProperty().bind(connectionModel.tipoIpProperty());
		
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	public GridPane getConnectionGridPane() {
		return connectionGridPane;
	}
	
	
	

	
}
