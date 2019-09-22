package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class ExtendedDemoBaseApplicationPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''ExtendedBase«t.name»ApplicationPane'''
	
	override gen(Entity t)'''
	package «t.packagePath».extended;
	
	import java.util.function.Function;
	
	import javafx.beans.value.*;
	import javafx.event.*;
	import javafx.fxml.FXML;
	import javafx.scene.control.*;
	import javafx.scene.control.TableColumn.CellDataFeatures;
	import javafx.scene.layout.*;
	
	public abstract class ExtendedBase«t.name»ApplicationPane<T> extends BorderPane{
	
		 @FXML
	     protected TabPane tabPaneLeft;
	     
	     @FXML
	     protected TabPane tabPaneCenter;
	     
	     @FXML
	     protected TabPane tabPaneRight;
	     
	     @FXML
	     protected TabPane tabPaneBottom;
	 
	     @FXML
	     protected TableView<?> tableViewPropertyView;
	 
	     @FXML
	     protected TableColumn<?, ?> columnProperty;
	 
	     @FXML
	     protected TableColumn<?, ?> columnValue;

	     @FXML
	     protected Label labelItemsCounter;
	
	     @FXML
	     protected Label labelFilteredItemsCounter;

		 protected <T, U> void setupCellValueFactory(TableColumn<T, U> column, Function<T, ObservableValue<U>> mapper) {
			column.setCellValueFactory((CellDataFeatures<T, U> c) -> mapper.apply(c.getValue()));
		 }
	}
	'''
}