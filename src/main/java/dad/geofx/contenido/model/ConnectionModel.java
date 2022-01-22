package dad.geofx.contenido.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ConnectionModel {

	private StringProperty ipAddress = new SimpleStringProperty();
	
	private StringProperty entidad = new SimpleStringProperty();
	
	private StringProperty tipoIp = new SimpleStringProperty();
	
	private DoubleProperty asn = new SimpleDoubleProperty();
	
	private StringProperty hostName = new SimpleStringProperty();

	public final StringProperty ipAddressProperty() {
		return this.ipAddress;
	}
	

	public final String getIpAddress() {
		return this.ipAddressProperty().get();
	}
	

	public final void setIpAddress(final String ipAddress) {
		this.ipAddressProperty().set(ipAddress);
	}
	

	public final StringProperty entidadProperty() {
		return this.entidad;
	}
	

	public final String getEntidad() {
		return this.entidadProperty().get();
	}
	

	public final void setEntidad(final String entidad) {
		this.entidadProperty().set(entidad);
	}
	

	public final StringProperty tipoIpProperty() {
		return this.tipoIp;
	}
	

	public final String getTipoIp() {
		return this.tipoIpProperty().get();
	}
	

	public final void setTipoIp(final String tipoIp) {
		this.tipoIpProperty().set(tipoIp);
	}
	

	public final DoubleProperty asnProperty() {
		return this.asn;
	}
	

	public final double getAsn() {
		return this.asnProperty().get();
	}
	

	public final void setAsn(final double asn) {
		this.asnProperty().set(asn);
	}
	

	public final StringProperty hostNameProperty() {
		return this.hostName;
	}
	

	public final String getHostName() {
		return this.hostNameProperty().get();
	}
	

	public final void setHostName(final String hostName) {
		this.hostNameProperty().set(hostName);
	}
	
	
	
}
