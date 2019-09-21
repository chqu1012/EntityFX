package de.dc.entity.lang.demo.metro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MetroDemoApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		MetroDemoPane root = new MetroDemoPane();
		Scene scene = new Scene(root , 1200, 700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
