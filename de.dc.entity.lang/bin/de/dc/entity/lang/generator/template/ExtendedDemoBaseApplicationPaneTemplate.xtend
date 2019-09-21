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
	    protected TextField textFieldSearch;
	
	    @FXML
	    protected TableView<T> tableView;
		
		«FOR field : t.field»
		@FXML
		protected TableColumn<T, String> column«field.name.toFirstUpper»;
	 	«ENDFOR»
	 	
	    @FXML
	    protected MenuItem menuItemClipboard;
	
	    @FXML
	    protected MenuItem menuItemExportToExcel;
	
	    @FXML
	    protected MenuItem menuItemExportToHtml;
	
	    @FXML
	    protected MenuItem menuItemExportToText;
	
	    @FXML
	    protected MenuItem menuItemOpenDetailsDeialog;
	
	    @FXML
	    protected MenuItem menuItemOpenSearchDialog;
	
	    @FXML
	    protected AnchorPane anchorPanePreferences;
	
	    @FXML
	    protected GridPane gridPaneFormular;
	
	    @FXML
	    protected TableView<?> tableViewPropertyView;
	
	    @FXML
	    protected TableColumn<?, ?> columnProperty;
	
	    @FXML
	    protected TableColumn<?, ?> columnValue;
	
	    @FXML
	    protected abstract void onMenuItemAction(ActionEvent event);
	    
		protected <T, U> void setupCellValueFactory(TableColumn<T, U> column, Function<T, ObservableValue<U>> mapper) {
			column.setCellValueFactory((CellDataFeatures<T, U> c) -> mapper.apply(c.getValue()));
		}
	}
	'''
}