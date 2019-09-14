package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class TableViewTemplate implements IGenerator<Entity>{
	
	override filename(Entity t) {
		t.name.toFirstUpper+'TableView'
	}
	
	override gen(Entity t)'''
	package «t.packagePath».control;
	
	import java.util.function.Function;
	import com.google.inject.Inject;
	
	import «t.packagePath».model.*;
	import «t.packagePath».repository.*;
	import javafx.beans.property.SimpleObjectProperty;
	import javafx.beans.value.ObservableValue;
	import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableColumn.CellDataFeatures;
	import javafx.scene.control.TableView;
	
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.collections.transformation.FilteredList;
	
	«val name = t.name.toFirstUpper»
	public class «name»TableView extends TableView<«name»>{
		
		private ObservableList<«name»> masterData = FXCollections.observableArrayList();
		private FilteredList<«name»> filteredData = new FilteredList<>(masterData, p->true);
		
		private «name»FX context;
		private «name»Repository «name.toFirstLower»Repository;
		
		@Inject
		public «name»TableView(«name»FX context, «name»Repository «name.toFirstLower»Repository) {
			this.context = context;
			this.«name.toFirstLower»Repository = «name.toFirstLower»Repository;
			
			TableColumn<«name», Long> columnId = new TableColumn<>("#ID");
			columnId.setPrefWidth(100);
			setupCellValueFactory(columnId, e->new SimpleObjectProperty<>(e.getId()));
			getColumns().add(columnId);
			«FOR field : t.field»«IF field.useByTableView»
			TableColumn<«name», «field.datatype.qualifiedName»> column«field.name» = new TableColumn<>("#«field.name.toUpperCase»");
			column«field.name».setPrefWidth(«'''«IF field.control===null»100.0«ELSE»«field.control.columnWidth»«ENDIF»'''»);
			setupCellValueFactory(column«field.name», e->new SimpleObjectProperty<>(e.get«field.name»()));
			getColumns().add(column«field.name»);
			«ENDIF»«ENDFOR»
			
			context.getMasterData().addAll(«name.toFirstLower»Repository.findAll());
			setItems(context.getFilteredMasterData());
		}
	
		public FilteredList<«name»> getFilteredList(){
			return filteredData;
		}
		
		public ObservableList<«name»> getMasterData(){
			return masterData;
		}
		
		public void add(«name»... «name.toFirstLower»s) {
			masterData.addAll(«name.toFirstLower»s);
		}
		
		public void remove(«name»... «name.toFirstLower»s) {
			masterData.removeAll(«name.toFirstLower»s);
		}
	
		private <T, U> void setupCellValueFactory(TableColumn<T, U> column, Function<T, ObservableValue<U>> mapper) {
			column.setCellValueFactory((CellDataFeatures<T, U> c) -> mapper.apply(c.getValue()));
		}
	}
	'''
	
}