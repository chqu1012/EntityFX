package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class ExtendedDemoApplicationTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Extended«t.name»Demo'''
	
	override gen(Entity t)'''
	package «t.packagePath»;
	
	import «t.packagePath».extended.*;
	import «t.packagePath».di.*;
	import javafx.application.Application;
	import javafx.scene.*;
	import javafx.stage.Stage;
	
	public class Extended«t.name»Demo extends Application{
	
		@Override
		public void start(Stage primaryStage) throws Exception {
			Parent root = new Extended«t.name»ApplicationPane();
			Scene scene = new Scene(root , 800, 600);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	
		public static void main(String[] args) {
			«t.name»Platform.init();
			
			launch(args);
		}
	}
	'''
}