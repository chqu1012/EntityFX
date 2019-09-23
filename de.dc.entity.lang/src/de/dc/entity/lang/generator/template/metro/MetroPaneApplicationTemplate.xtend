package de.dc.entity.lang.generator.template.metro

import de.dc.entity.lang.generator.template.IGenerator
import de.dc.entity.model.Entity

class MetroPaneApplicationTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Metro«t.name»Demo.java'''
	
	override gen(Entity t)'''
	package «t.packagePath»;
	
	import «t.packagePath».control.*;
	import «t.packagePath».di.*;
	import «t.packagePath».history.control.*;
	import «t.packagePath».control.metro.*;
	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.SplitPane;
	import javafx.stage.Stage;
	
	public class Metro«t.name»Demo extends Application {
	
		@Override
		public void start(Stage stage) throws Exception {
			SplitPane «t.name.toFirstLower»Pane = init«t.name»();
			SplitPane «t.name.toFirstLower»HistoryPane = init«t.name»History();
			
			Metro«t.name»Pane root = «t.name»Platform.getInstance(Metro«t.name»Pane.class);
			root.addNavigationItem("«t.name» Management", «t.name.toFirstLower»Pane);
			root.addNavigationItem("«t.name» History Management", «t.name.toFirstLower»HistoryPane);
			
			stage.setScene(new Scene(root , 1200, 600));
			stage.show();
		}
	
		private SplitPane init«t.name»History() {
			«t.name»HistoryFormular formular = «t.name»Platform.getInstance(«t.name»HistoryFormular.class);
			Filtered«t.name»HistoryTableView tableView = «t.name»Platform.getInstance(Filtered«t.name»HistoryTableView.class);
			
			SplitPane «t.name.toFirstLower»Pane = new SplitPane(tableView, formular);
			«t.name.toFirstLower»Pane.setStyle("-fx-box-border: transparent;");
			«t.name.toFirstLower»Pane.setDividerPosition(0, 0.7);
			return «t.name.toFirstLower»Pane;
		}
	
		private SplitPane init«t.name»() {
			«t.name»Formular formular = «t.name»Platform.getInstance(«t.name»Formular.class);
			Filtered«t.name»TableView tableView = «t.name»Platform.getInstance(Filtered«t.name»TableView.class);
			
			SplitPane «t.name.toFirstLower»Pane = new SplitPane(tableView, formular);
			«t.name.toFirstLower»Pane.setStyle("-fx-box-border: transparent;");
			«t.name.toFirstLower»Pane.setDividerPosition(0, 0.7);
			return «t.name.toFirstLower»Pane;
		}
	
		public static void main(String[] args) {
			«t.name»Platform.init();
			
			launch(args);
		}
	}
	'''
	
}