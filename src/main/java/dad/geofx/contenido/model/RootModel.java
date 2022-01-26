package dad.geofx.contenido.model;

import dad.geofx.api.ipapi.IpapiData;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RootModel {

	private StringProperty ip = new SimpleStringProperty();
	
	private ObjectProperty <IpapiData> datos= new SimpleObjectProperty<>();
	
	
	
	public final StringProperty ipProperty() {
		return this.ip;
	}
	

	public final String getIp() {
		return this.ipProperty().get();
	}
	

	public final void setIp(final String ip) {
		this.ipProperty().set(ip);
	}


	public final ObjectProperty<IpapiData> datosProperty() {
		return this.datos;
	}
	


	public final IpapiData getDatos() {
		return this.datosProperty().get();
	}
	


	public final void setDatos(final IpapiData datos) {
		this.datosProperty().set(datos);
	}
	
	
	
	
	
}
