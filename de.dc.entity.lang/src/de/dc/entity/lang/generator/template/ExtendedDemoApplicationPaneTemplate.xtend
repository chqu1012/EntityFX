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
	import javafx.beans.binding.*;
	import javafx.application.Platform;
	import javafx.scene.Node;
	import java.sql.*;
	import org.h2.tools.Server;
	import javafx.scene.control.Tab;
	
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
			
			labelItemsCounter.textProperty().bind(Bindings.size(context.getMasterData()).asString());
			labelFilteredItemsCounter.textProperty().bind(Bindings.size(context.getFilteredMasterData()).asString());
			
			Filtered«t.name»TableView tableView = «t.name»Platform.getInstance(Filtered«t.name»TableView.class);
			createCenterTab("«t.name» TableView", tableView);
	
			«t.name»Formular form = «t.name»Platform.getInstance(«t.name»Formular.class);
			createRightTab("«t.name» Form", form);
			
			WebView webView = new WebView();
			createCenterTab("Preferences", webView);
			
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
		
		protected void createRightTab(String name, Node node) {
			tabPaneRight.getTabs().add(createTab(name, node));
		}
		protected void createLeftTab(String name, Node node) {
			tabPaneLeft.getTabs().add(createTab(name, node));
			
		}
		protected void createCenterTab(String name, Node node) {
			tabPaneCenter.getTabs().add(createTab(name, node));
			
		}
		protected void createBottomTab(String name, Node node) {
			tabPaneBottom.getTabs().add(createTab(name, node));
		}
		
		private Tab createTab(String name, Node node) {
			Tab tab = new Tab(name);
			AnchorPane.setBottomAnchor(node, 0d);
			AnchorPane.setTopAnchor(node, 0d);
			AnchorPane.setRightAnchor(node, 0d);
			AnchorPane.setLeftAnchor(node, 0d);
			AnchorPane anchorPane = new AnchorPane(node);
			tab.setContent(anchorPane);
			return tab;
		}
	}
	'''
}