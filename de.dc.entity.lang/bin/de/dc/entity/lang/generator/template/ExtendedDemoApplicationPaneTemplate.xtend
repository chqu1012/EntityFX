package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class ExtendedDemoApplicationPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Extended«t.name»ApplicationPane'''
	
	override gen(Entity t)'''
	package «t.packagePath».extended;
	
	import java.io.IOException;
	
	import org.apache.log4j.Logger;
	
	import «t.packagePath».control.*;
	import «t.packagePath».di.*;
	import «t.packagePath».model.*;
	import «t.packagePath».repository.*;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.layout.AnchorPane;
	import javafx.scene.web.WebView;
	import javafx.application.Platform;
	
	import java.sql.*;
	import org.h2.tools.Server;
	
	public class Extended«t.name»ApplicationPane extends ExtendedBase«t.name»ApplicationPane<«t.name»> {
	
		private Logger log = Logger.getLogger(getClass());
		
		private static final String FXML = "/«t.packagePath.replace('.', '/')»/extended/Extended«t.name»ApplicationPane.fxml";
		
		protected «t.name»FX context; 
		protected  «t.name»Repository «t.name.toFirstLower»Repository;
		
		public Extended«t.name»ApplicationPane() {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML));
			fxmlLoader.setRoot(this);
			fxmlLoader.setController(this);
	
			try {
				fxmlLoader.load();
			} catch (IOException exception) {
				log.error("Failed to load fxml " + FXML, exception);
			}
			
			this.«t.name.toFirstLower»Repository = «t.name»Platform.getInstance(«t.name»Repository.class);
			this.context = «t.name»Platform.getInstance(«t.name»FX.class);
			
			Filtered«t.name»TableView tableView = «t.name»Platform.getInstance(Filtered«t.name»TableView.class);
			AnchorPane.setBottomAnchor(tableView, 0d);
			AnchorPane.setTopAnchor(tableView, 0d);
			AnchorPane.setRightAnchor(tableView, 0d);
			AnchorPane.setLeftAnchor(tableView, 0d);
			anchorPaneTableView.getChildren().add(tableView);
	
			«t.name»Formular form = «t.name»Platform.getInstance(«t.name»Formular.class);
			AnchorPane.setBottomAnchor(form, 0d);
			AnchorPane.setTopAnchor(form, 0d);
			AnchorPane.setRightAnchor(form, 0d);
			AnchorPane.setLeftAnchor(form, 0d);
			anchorPaneFormular.getChildren().add(form);
			
			WebView webView = new WebView();
			AnchorPane.setBottomAnchor(webView, 0d);
			AnchorPane.setTopAnchor(webView, 0d);
			AnchorPane.setRightAnchor(webView, 0d);
			AnchorPane.setLeftAnchor(webView, 0d);
			anchorPanePreferences.getChildren().add(webView);
			
			try {
				Class.forName("org.h2.Driver");
				Server server = Server.createWebServer("-web", "-webAllowOthers", "-webPort", "9082");
				server.start();
				String serverUrl = server.getURL();
				Platform.runLater(() ->webView.getEngine().load(serverUrl));
			} catch (ClassNotFoundException | SQLException e) {
				log.error("Failed to open h2 console!", e);
			}
		}
	}
	'''
}