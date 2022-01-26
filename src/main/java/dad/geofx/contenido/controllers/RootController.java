package dad.geofx.contenido.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import dad.geofx.api.ipapi.IpapiData;
import dad.geofx.api.ipapi.IpapiService;
import dad.geofx.api.ipapi.Language;
import dad.geofx.api.ipifi.IpifiService;
import dad.geofx.contenido.model.RootModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class RootController implements Initializable{

	LocationController controllerLocation= new LocationController();
	SecurityController controllerSecurity= new SecurityController();
	ConnectionController controllerConnection= new ConnectionController();
	RootModel rootModel = new RootModel();
	IpapiService servicio= new IpapiService();
	StringProperty ip= new SimpleStringProperty();
	IpifiService ipifiService = new IpifiService();
	
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
    	
    	
    	IPTextField.textProperty().bindBidirectional(rootModel.ipProperty());
    
    	rootModel.datosProperty().addListener((o,ov,nv)-> actualizarDatos(nv)   );
    	
    }
    
    
	private void actualizarDatos(IpapiData ipapiData) {
		
		
		
		 controllerLocation.getLocationModel().setCallingCode(ipapiData.getLocation().getCallingCode());
		  controllerLocation.getLocationModel().setCityData(String.format("%s (%s)", ipapiData.getCity(),ipapiData.getRegionName()));
		  controllerLocation.getLocationModel().setCountryData(String.format("%s (%s)",ipapiData.getCountryName(),ipapiData.getCountryCode()));
		  controllerLocation.getLocationModel().setCurrency(String.format("%s (%s)", ipapiData.getCurrency().getName(),ipapiData.getCurrency().getSymbol()));
		  controllerLocation.getLocationModel().setImagen(new Image ("/64x42/"+ipapiData.getCountryCode()+".png"));
		  controllerLocation.getLocationModel().setLanguage(language(ipapiData.getLocation().getLanguages()));
		  controllerLocation.getLocationModel().setLatitude(ipapiData.getLatitude());
		  controllerLocation.getLocationModel().setLongitude(ipapiData.getLongitude());
		  controllerLocation.getLocationModel().setTimeZone(ipapiData.getTimeZone().getCode());
		  controllerLocation.getLocationModel().setZipCode(ipapiData.getZip());
		
		  controllerSecurity.getSecurityModel().setProxy(ipapiData.getSecurity().getIsProxy());
		  controllerSecurity.getSecurityModel().setTor(ipapiData.getSecurity().getIsTor());
		  controllerSecurity.getSecurityModel().setCrawler(ipapiData.getSecurity().getIsCrawler());
		  controllerSecurity.getSecurityModel().setThreatLvl(ipapiData.getSecurity().getThreatLevel());
		  
		  controllerConnection.getConnectionModel().setIpAddress(ipapiData.getIp());
//		  controllerConnection.getConnectionModel().setEntidad(ipapiData.get);
		  controllerConnection.getConnectionModel().setTipoIp(ipapiData.getType());
//		  controllerConnection.getConnectionModel().setAsn(ipapiData.get);
		  controllerConnection.getConnectionModel().setHostName(ipapiData.getHostname());
	}


	public void initialize(URL location, ResourceBundle resources) {
		
		LocationTab.setContent(controllerLocation.getLocationGridPane());
		SecurityTab.setContent(controllerSecurity.getSecurityGridPane());
		ConnectionTab.setContent( controllerConnection.getConnectionGridPane());
		
		try {
			rootModel.setIp(ipifiService.myIp());
			 rootModel.setDatos(servicio.getDatosIP(rootModel.getIp()));
			System.err.println(ipifiService.myIp());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	  @FXML
	    void OnCheckIpAction(ActionEvent event) throws IOException {
		  
		  rootModel.setDatos(servicio.getDatosIP(rootModel.getIp()));
		  
		  
		 
		  
		  
		  
		 
		  
		  
		  
	    }

	  private String language(List<Language> lista) {
		  String lenguaje="";
		  
		  for (Language language : lista) {
			lenguaje+=String.format("%s (%s)\n", language.getName(),language.getCode());
		}
		  
		  return lenguaje;
	  }
	  
	  
	  
	public BorderPane getRoot() {
		return root;
		
		
		
	}

	
	
	
	
	
}
