package dad.geofx.contenido.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;

public class LocationController implements Initializable{
	
	
	 	@FXML
	    private Label CiudadLabel;

	    @FXML
	    private Label CodigoLlamadaLabel;

	    @FXML
	    private Label CodigoPostalLabel;

	    @FXML
	    private ImageView ImageView;

	    @FXML
	    private Label LattitudeLabel;

	    @FXML
	    private GridPane LocationGridPane;

	    @FXML
	    private Label LocationLabel;

	    @FXML
	    private Label LongitudLabel;

	    @FXML
	    private Label MonedaLabel;

	    @FXML
	    private Label ZonaHorariaLabel;

	    @FXML
	    private Label lenguajeLabel;

	    public LocationController() throws IOException {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
			loader.setController(this);
			loader.load();
		}
		
	    
	    
		public void initialize(URL location, ResourceBundle resources) {
			
			
		}

		public GridPane getLocationGridPane() {
			return LocationGridPane;
		}
	
	
}
