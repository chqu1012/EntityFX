package de.dc.entity.lang.generator.template.metro

import de.dc.entity.lang.generator.template.IGenerator
import de.dc.entity.model.Entity

class MetroPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Metro«t.name»Pane.java'''
	
	override gen(Entity t)'''
	package «t.packagePath».control.metro;

	import «t.packagePath».model.*;	
	import java.io.IOException;
	import org.apache.log4j.Logger;
	import javafx.event.ActionEvent;
	import java.util.*;

	import javafx.beans.value.*;
	import javafx.collections.*;
	import javafx.collections.transformation.*;
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import javafx.scene.input.*;
	import javafx.scene.layout.*;
	
	public class Metro«t.name»Pane extends SplitPane{
	
		private Logger log = Logger.getLogger(getClass());
	
		@FXML
	    private Label labelTitle;
	
	    @FXML
	    private Label labelTitleDescription;
	
	    @FXML
	    private TextField textSearchField;
	
	    @FXML
	    private ListView<String> listViewNavigation;
	
	    @FXML
	    private StackPane stackPane;
	
		private static final String FXML = "/«t.packagePath.replace('.', '/')»/control/metro/Metro«t.name»Pane.fxml";
	
		private Map<String, Region> paneMap = new HashMap<>();
		private ObservableList<String> navigationItems = FXCollections.observableArrayList();
		private FilteredList<String> filteredNavigationItem = new FilteredList<>(navigationItems);
	
		public Metro«t.name»Pane() {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML));
			fxmlLoader.setRoot(this);
			fxmlLoader.setController(this);
	
			try {
				fxmlLoader.load();
			} catch (IOException exception) {
				log.error("Failed to load fxml " + FXML, exception);
			}
			
			navigationItems.addAll(paneMap.keySet());
			
			listViewNavigation.setItems(filteredNavigationItem);
			textSearchField.textProperty().addListener(this::onNavigationItemSearch);
		}
		
		public void addNavigationItem(String name, Region pane) {
			paneMap.put(name, pane);
			navigationItems.add(name);
		}
	
		private void onNavigationItemSearch(ObservableValue<? extends String> observable, String oldValue, String newValue) {
			filteredNavigationItem.setPredicate(p->{
				boolean isEmpty = newValue==null || newValue.isEmpty();
				boolean containsItem = p.toLowerCase().contains(newValue.toLowerCase());
				return isEmpty || containsItem;
			});
		}
		
		@FXML
	    private void onMouseClicked(MouseEvent event) {
			String selection = listViewNavigation.getSelectionModel().getSelectedItem();
			if (selection!=null && paneMap.get(selection)!=null) {
				paneMap.get(selection).toFront();
			}
		}
	}
	'''
	
}