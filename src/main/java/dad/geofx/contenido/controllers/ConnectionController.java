package dad.geofx.contenido.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable{

	
    @FXML
    private Label ASNLabel;

    @FXML
    private GridPane ConnectionGridPane;

    @FXML
    private Label HostNameLabel;

    @FXML
    private Label IPLabel;

    @FXML
    private Label TypeLabel;
	
	public ConnectionController() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	public GridPane getConnectionGridPane() {
		return ConnectionGridPane;
	}
	
	
	

	
}
