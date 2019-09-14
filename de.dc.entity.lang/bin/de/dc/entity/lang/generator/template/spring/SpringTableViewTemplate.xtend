package de.dc.entity.lang.generator.template.spring

import de.dc.entity.model.Entity
import de.dc.entity.lang.generator.template.IGenerator

class SpringTableViewTemplate implements IGenerator<Entity>{
	
	override filename(Entity t) {
		t.name.toFirstUpper+'TableView'
	}
	
	override gen(Entity t)'''
	package «t.packagePath».control;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	
	import java.util.function.Function;
	
	import «t.packagePath».model.*;
	import «t.packagePath».repository.*;
	import javafx.beans.property.SimpleObjectProperty;
	import javafx.beans.value.ObservableValue;
	import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableColumn.CellDataFeatures;
	import javafx.scene.control.TableView;
	
	import javax.annotation.PostConstruct;
	
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.collections.transformation.FilteredList;
	
	«val name = t.name.toFirstUpper»
	@Component
	public class «name»TableView extends TableView<«name»>{
		
		@Autowired
		private «name»FX context;

		@PostConstruct
		public void init() {
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
			
			setItems(context.getMasterData());
		}
	
		public FilteredList<«name»> getFilteredList(){
			return context.getFilteredMasterData();
		}
		
		public ObservableList<«name»> getMasterData(){
			return context.getMasterData();
		}
		
		public void add(«name»... «name.toFirstLower»s) {
			context.getMasterData().addAll(«name.toFirstLower»s);
		}
		
		public void remove(«name»... «name.toFirstLower»s) {
			context.getMasterData().removeAll(«name.toFirstLower»s);
		}
	
		private <T, U> void setupCellValueFactory(TableColumn<T, U> column, Function<T, ObservableValue<U>> mapper) {
			column.setCellValueFactory((CellDataFeatures<T, U> c) -> mapper.apply(c.getValue()));
		}
	}
	'''
	
}