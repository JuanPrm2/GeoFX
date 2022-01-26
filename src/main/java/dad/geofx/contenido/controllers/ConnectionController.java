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
		
		ASNLabel.textProperty().bindBidirectional(connectionModel.asnProperty(), new NumberStringConverter());
		
		HostNameLabel.textProperty().bind(connectionModel.hostNameProperty());
	
		IPLabel.textProperty().bind(connectionModel.ipAddressProperty());
		
		TypeLabel.textProperty().bind(connectionModel.tipoIpProperty());
		
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	public GridPane getConnectionGridPane() {
		return ConnectionGridPane;
	}

	public ConnectionModel getConnectionModel() {
		return connectionModel;
	}

	public void setConnectionModel(ConnectionModel connectionModel) {
		this.connectionModel = connectionModel;
	}

	public Label getASNLabel() {
		return ASNLabel;
	}

	public void setASNLabel(Label aSNLabel) {
		ASNLabel = aSNLabel;
	}

	public Label getHostNameLabel() {
		return HostNameLabel;
	}

	public void setHostNameLabel(Label hostNameLabel) {
		HostNameLabel = hostNameLabel;
	}

	public Label getIPLabel() {
		return IPLabel;
	}

	public void setIPLabel(Label iPLabel) {
		IPLabel = iPLabel;
	}

	public Label getTypeLabel() {
		return TypeLabel;
	}

	public void setTypeLabel(Label typeLabel) {
		TypeLabel = typeLabel;
	}

	public void setConnectionGridPane(GridPane connectionGridPane) {
		ConnectionGridPane = connectionGridPane;
	}
	
	
	

	
}
