package dad.geofx.contenido.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SecurityModel {

	
	
	private StringProperty threatLvl = new SimpleStringProperty();
	
	private StringProperty potentialThreat = new SimpleStringProperty();
	
	private StringProperty status = new SimpleStringProperty();
	
	private BooleanProperty proxy = new SimpleBooleanProperty();
	
	private BooleanProperty tor = new SimpleBooleanProperty();
	
	private BooleanProperty crawler = new SimpleBooleanProperty();

	public final StringProperty threatLvlProperty() {
		return this.threatLvl;
	}
	

	public final String getThreatLvl() {
		return this.threatLvlProperty().get();
	}
	

	public final void setThreatLvl(final String threatLvl) {
		this.threatLvlProperty().set(threatLvl);
	}
	

	public final StringProperty potentialThreatProperty() {
		return this.potentialThreat;
	}
	

	public final String getPotentialThreat() {
		return this.potentialThreatProperty().get();
	}
	

	public final void setPotentialThreat(final String potentialThreat) {
		this.potentialThreatProperty().set(potentialThreat);
	}
	

	public final StringProperty statusProperty() {
		return this.status;
	}
	

	public final String getStatus() {
		return this.statusProperty().get();
	}
	

	public final void setStatus(final String status) {
		this.statusProperty().set(status);
	}
	

	public final BooleanProperty proxyProperty() {
		return this.proxy;
	}
	

	public final boolean isProxy() {
		return this.proxyProperty().get();
	}
	

	public final void setProxy(final boolean proxy) {
		this.proxyProperty().set(proxy);
	}
	

	public final BooleanProperty torProperty() {
		return this.tor;
	}
	

	public final boolean isTor() {
		return this.torProperty().get();
	}
	

	public final void setTor(final boolean tor) {
		this.torProperty().set(tor);
	}
	

	public final BooleanProperty crawlerProperty() {
		return this.crawler;
	}
	

	public final boolean isCrawler() {
		return this.crawlerProperty().get();
	}
	

	public final void setCrawler(final boolean crawler) {
		this.crawlerProperty().set(crawler);
	}
	
	
	
}
