package de.dc.entity.lang.generator.template

import de.dc.entity.lang.generator.template.IGenerator
import de.dc.entity.model.Entity

class FilteredTableViewTemplate implements IGenerator<Entity> {
	
	override filename(Entity t){
		'Filtered'+t.name.toFirstUpper+'TableView'
	}
	
	override gen(Entity t)'''
	package «t.packagePath».control;
	
	import com.google.inject.Inject;
	
	import javafx.scene.input.MouseEvent;
	import javafx.scene.control.Dialog;
	import «t.packagePath».model.*;
	import «t.packagePath».util.*;
	import «t.packagePath».repository.*;
	import javafx.beans.value.ChangeListener;
	import javafx.beans.value.ObservableValue;
	import javafx.geometry.Insets;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.Priority;
	import javafx.scene.layout.VBox;
	import javafx.scene.control.ButtonType;
	import javafx.util.Pair;
	import javafx.scene.layout.GridPane;
	import javafx.scene.control.*;
	import javafx.event.ActionEvent;
	import javafx.stage.FileChooser;
	import javafx.stage.Stage;
	
	import java.io.File;
	import java.io.IOException;
	
	public class Filtered«t.name»TableView extends VBox{
	
		private TextField textSearch = new TextField();
		private «t.name»FX context;
		private «t.name»TableView tableView;
		
		private Menu menuExport = new Menu("Export");
		private MenuItem menuItemText = new MenuItem("Text");
		private MenuItem menuItemExcel = new MenuItem("Excel");
		private MenuItem menuItemHtml = new MenuItem("Html");
		private MenuItem menuItemOpenDetails = new MenuItem("Open Details");
		
		private «t.name»Exporter «t.name.toFirstLower»Exporter = new «t.name»Exporter();
		
		@Inject
		public Filtered«t.name»TableView(«t.name»FX context, «t.name»TableView tableView) {
			this.context = context;
			this.tableView = tableView;
			setSpacing(10d);
			getChildren().add(textSearch);
			VBox.setVgrow(tableView, Priority.ALWAYS);
			getChildren().add(tableView);
			
			textSearch.setPromptText("Search...");
			textSearch.textProperty().addListener(this::onSearchTextChanged);
			
			setPadding(new Insets(10d));
			
			tableView.getSelectionModel().selectedItemProperty().addListener(this::onTableSelectionChanged);
			tableView.setOnMouseClicked(this::openDialog);
			
			menuItemHtml.setOnAction(this::onMenuItemAction);
			menuItemExcel.setOnAction(this::onMenuItemAction);
			menuItemHtml.setOnAction(this::onMenuItemAction);
			menuItemOpenDetails.setOnAction(this::onMenuItemAction);
					
			menuExport.getItems().addAll(menuItemText, menuItemExcel, menuItemHtml);
			
			ContextMenu menu = new ContextMenu();
			menu.getItems().add(menuExport);
			menu.getItems().add(menuItemOpenDetails);
			tableView.setContextMenu(menu);
		}
		
		public void onMenuItemAction(ActionEvent e) {
			Object source = e.getSource();
			if (source == menuItemHtml) {
				export(EventLogExporter.Type.HTML, "export.html");
			}else if (source == menuItemExcel) {
				export(EventLogExporter.Type.EXCEL, "export.xlsx");
			}else if (source == menuItemText) {
				export(EventLogExporter.Type.TEXT, "export.txt");
			}else if (source == menuItemOpenDetails) {
				openDialog(null);
			}
		}
	
		private void export(«t.name»Exporter.Type type, String filename) {
			FileChooser chooser = new FileChooser();
			chooser.setTitle(type.name()+" Export");
			chooser.setInitialFileName(filename);
			File file = chooser.showSaveDialog(new Stage());
			if (file!=null) {
				try {
					«t.name.toFirstLower»Exporter.export(type, tableView, file);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		private void openDialog(MouseEvent e) {
			if (e == null || e.getClickCount()==2) {
				«t.name» selection = tableView.getSelectionModel().getSelectedItem();
				if (selection!=null) {
					Dialog<Pair<String, String>> dialog = new Dialog<>();
					dialog.setTitle("«t.name» Dialog");
		
					dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
		
					GridPane grid = new GridPane();
					grid.setHgap(10);
					grid.setVgap(10);
					grid.setPadding(new Insets(20, 150, 10, 10));
		
					«FOR i : 0..(t.field.size-1)»
					grid.add(new Label("«t.field.get(i).name»:"), 0, «i»);
					TextField «t.field.get(i).name.toLowerCase»Text = new TextField();
					«t.field.get(i).name.toLowerCase»Text.setText(String.valueOf(context.get«t.field.get(i).name»Property().get()));
					grid.add(«t.field.get(i).name.toLowerCase»Text, 1, «i»);
					«ENDFOR»
					dialog.getDialogPane().setContent(grid);
					dialog.showAndWait();
				}
			}
		}
		
		public void onTableSelectionChanged(ObservableValue<? extends «t.name»> observable, «t.name» oldValue, «t.name» newValue) {
			if (newValue!=null) {
				«FOR field : t.field»
				context.get«field.name»Property().set(newValue.get«field.name»());
				«ENDFOR»
			}
		}
		
		public void onSearchTextChanged(ObservableValue<? extends String> observable, String oldValue, String newValue) {
			context.getFilteredMasterData().setPredicate(p->{
				boolean isEmpty = newValue==null || newValue.isEmpty();
				«FOR field : t.field»
				«IF field.isRequired»
				boolean contains«field.name» = String.valueOf(p.get«field.name»()).toLowerCase().contains(newValue.toLowerCase());
				«ENDIF»
				«ENDFOR»
				«val contains = t.field.filter[isRequired].map['contains'+it.name].reduce[p1, p2|p1+' || '+p2]»
				return isEmpty «IF t.field.filter[isRequired].size>0»||«ENDIF» «contains»;
			});
		}
	}
	'''
	
}