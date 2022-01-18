package dad.geofx.contenido.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.contenido.model.LocationModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;
import javafx.scene.image.ImageView;

public class LocationController implements Initializable{
	
	private LocationModel locationModel= new LocationModel();
	
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
			
			LattitudeLabel.textProperty().bindBidirectional(locationModel.latitudeProperty(),new NumberStringConverter());
			
			LongitudLabel.textProperty().bindBidirectional(locationModel.longitudeProperty(),new NumberStringConverter());
			
			LocationLabel.textProperty().bind(locationModel.countryDataProperty());
			
			CiudadLabel.textProperty().bind(locationModel.cityDataProperty());
			
			CodigoPostalLabel.textProperty().bind(locationModel.zipCodeProperty());
			
			lenguajeLabel.textProperty().bind(locationModel.languageProperty());
			
			ZonaHorariaLabel.textProperty().bind(locationModel.timeZoneProperty());
			
			CodigoLlamadaLabel.textProperty().bind(locationModel.callingCodeProperty());
			
			MonedaLabel.textProperty().bind(locationModel.currencyProperty());
			
			ImageView.imageProperty().bind(locationModel.imagenProperty());
			
		}
		
	    
	    
		public void initialize(URL location, ResourceBundle resources) {
			
			
		}

		public GridPane getLocationGridPane() {
			return LocationGridPane;
		}



		public LocationModel getLocationModel() {
			return locationModel;
		}
	
	
}
