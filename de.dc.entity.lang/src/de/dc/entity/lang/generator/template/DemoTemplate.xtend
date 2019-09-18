package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class DemoTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name»Demo'''
	
	override gen(Entity t)'''
	package «t.packagePath»;
	
	import «t.packagePath».control.*;
	import «t.packagePath».di.*;
	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.layout.BorderPane;
	import javafx.stage.Stage;
	
	«val name = t.name.toFirstUpper»
	public class «name»Demo extends Application {
	
		@Override
		public void start(Stage stage) throws Exception {
			// «name»TableView «name.toFirstLower»TableView = «name»Platform.getInstance(«name»TableView.class);
			«name»Formular «name.toFirstLower»Formular = «name»Platform.getInstance(«name»Formular.class);
			Filtered«name»TableView «name.toFirstLower»TableView = «name»Platform.getInstance(Filtered«name»TableView.class);
			
			BorderPane root = new BorderPane();
			root.setCenter(«name.toFirstLower»TableView);
			root.setRight(«name.toFirstLower»Formular);
			stage.setScene(new Scene(root , 1200, 600));
			stage.show();
		}
	
		public static void main(String[] args) {
			«name»Platform.init();
			
			launch(args);
		}
	}
	'''
	
}