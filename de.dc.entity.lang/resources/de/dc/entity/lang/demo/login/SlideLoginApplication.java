package de.dc.entity.lang.demo.login;

import de.dc.entity.lang.demo.ExampleDemoPane;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SlideLoginApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = new SlideLoginController();
		Scene scene = new Scene(root , 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
