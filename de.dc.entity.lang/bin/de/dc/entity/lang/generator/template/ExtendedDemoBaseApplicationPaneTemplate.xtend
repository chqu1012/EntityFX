package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class ExtendedDemoBaseApplicationPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''ExtendedBase«t.name»ApplicationPane'''
	
	override gen(Entity t)'''
	package «t.packagePath».extended;
	
	import java.util.function.Function;
	
	import javafx.beans.value.ObservableValue;
	import javafx.event.*;
	import javafx.fxml.FXML;
	import javafx.scene.control.*;
	import javafx.scene.control.TableColumn.CellDataFeatures;
	import javafx.scene.layout.*;
	
	public abstract class ExtendedBase«t.name»ApplicationPane<T> extends BorderPane{
	
	     @FXML
	     protected AnchorPane anchorPaneTableView;
	 
	     @FXML
	     protected AnchorPane anchorPanePreferences;
	 
	     @FXML
	     protected AnchorPane anchorPaneFormular;
	 
	     @FXML
	     protected TableView<?> tableViewPropertyView;
	 
	     @FXML
	     protected TableColumn<?, ?> columnProperty;
	 
	     @FXML
	     protected TableColumn<?, ?> columnValue;
	    
		protected <T, U> void setupCellValueFactory(TableColumn<T, U> column, Function<T, ObservableValue<U>> mapper) {
			column.setCellValueFactory((CellDataFeatures<T, U> c) -> mapper.apply(c.getValue()));
		}
	}
	'''
}