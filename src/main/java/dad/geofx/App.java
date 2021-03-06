package dad.geofx;

import dad.geofx.api.ipapi.IpapiService;
import dad.geofx.contenido.controllers.LocationController;
import dad.geofx.contenido.controllers.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	RootController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller= new RootController();
		

		
		
		
		
		primaryStage.setTitle("GeoFx");
		primaryStage.setScene(new Scene (controller.getRoot()));
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
