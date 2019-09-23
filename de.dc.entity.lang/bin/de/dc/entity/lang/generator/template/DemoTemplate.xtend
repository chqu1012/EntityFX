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
	import javafx.scene.control.SplitPane;
	import javafx.stage.Stage;
	
	«val name = t.name.toFirstUpper»
	public class «name»Demo extends Application {
	
		@Override
		public void start(Stage stage) throws Exception {
			// «name»TableView «name.toFirstLower»TableView = «name»Platform.getInstance(«name»TableView.class);
			«name»Formular «name.toFirstLower»Formular = «name»Platform.getInstance(«name»Formular.class);
			Filtered«name»TableView «name.toFirstLower»TableView = «name»Platform.getInstance(Filtered«name»TableView.class);
			
			SplitPane root = new SplitPane(«name.toFirstLower»TableView, «name.toFirstLower»Formular);
			root.setStyle("-fx-box-border: transparent;");
			root.setDividerPosition(0, 0.7);
			
			// Metro«t.name»Pane root = «name»Platform.getInstance(Metro«t.name»Pane.class);
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