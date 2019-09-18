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
	
	import «t.packagePath».model.*;
	import «t.packagePath».repository.*;
	import javafx.beans.value.ChangeListener;
	import javafx.beans.value.ObservableValue;
	import javafx.geometry.Insets;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.Priority;
	import javafx.scene.layout.VBox;
	
	
	public class Filtered«t.name»TableView extends VBox{
	
		private TextField textSearch = new TextField();
		private «t.name»FX context;
		
		@Inject
		public Filtered«t.name»TableView(«t.name»FX context, «t.name»TableView tableView) {
			this.context = context;
			setSpacing(10d);
			getChildren().add(textSearch);
			VBox.setVgrow(tableView, Priority.ALWAYS);
			getChildren().add(tableView);
			
			textSearch.setPromptText("Search...");
			textSearch.textProperty().addListener(this::onSearchTextChanged);
			
			setPadding(new Insets(10d));
			
			tableView.getSelectionModel().selectedItemProperty().addListener(this::onTableSelectionChanged);
			tableView.setOnMouseClicked(this::openDialog);
		}
		
		private void openDialog(MouseEvent e) {
			if (e.getClickCount()==2) {
				«t.name» selection = getSelectionModel().getSelectedItem();
				if (selection!=null) {
					Dialog<Pair<String, String>> dialog = new Dialog<>();
					dialog.setTitle("«t.name» Dialog");
		
					dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
		
					GridPane grid = new GridPane();
					grid.setHgap(10);
					grid.setVgap(10);
					grid.setPadding(new Insets(20, 150, 10, 10));
		
					«FOR i : 0..(t.field.size-1)»
					grid.add(new Label("«t.name»:"), 0, «i»);
					TextField «t.name.toLowerCase»Text = new TextField();
					«t.name.toLowerCase»Text.setText(String.valueOf(context.get«t.field.get(i)»()));
					grid.add(«t.name.toLowerCase»Text, 1, «i»);
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
				boolean contains«field.name» = p.get«field.name»().toLowerCase().contains(newValue.toLowerCase());
				«ENDIF»
				«ENDFOR»
				«val contains = t.field.filter[isRequired].map['contains'+it.name].reduce[p1, p2|p1+' || '+p2]»
				return isEmpty «IF t.field.filter[isRequired].size>0»||«ENDIF» «contains»;
			});
		}
	}
	'''
	
}