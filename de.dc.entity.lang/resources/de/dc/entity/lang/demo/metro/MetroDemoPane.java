package de.dc.entity.lang.demo.metro;

import java.io.IOException;

import org.apache.log4j.Logger;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class MetroDemoPane extends SplitPane{
	
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
	
    private Logger log = Logger.getLogger(getClass());
	
	private static final String FXML = "/de/dc/entity/lang/demo/metro/MetroDemo.fxml";
	
	private ObservableList<String> navigationItems = FXCollections.observableArrayList("Eins", "Zwei", "Drei", "Vier", "Fünf");
	private FilteredList<String> filteredNavigationItem = new FilteredList<>(navigationItems);
	
	public MetroDemoPane() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.error("Failed to load fxml " + FXML, exception);
		}
		
		listViewNavigation.setItems(filteredNavigationItem);
		textSearchField.textProperty().addListener(this::onNavigationItemSearch);
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
		
	}

}
