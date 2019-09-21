package de.dc.entity.lang.demo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExampleDemoApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = new ExampleDemoPane();
		Scene scene = new Scene(root , 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
