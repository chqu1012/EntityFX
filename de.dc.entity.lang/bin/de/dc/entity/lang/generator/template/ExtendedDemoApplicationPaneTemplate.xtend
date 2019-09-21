package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class ExtendedDemoApplicationPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Extended«t.name»ApplicationPane'''
	
	override gen(Entity t)'''
	package «t.packagePath».extended;
	
	import java.io.*;
	
	import org.apache.log4j.Logger;
	import «t.packagePath».repository.*;
	import «t.packagePath».model.*;
	import «t.packagePath».di.*;
	import javafx.beans.property.*;
	import javafx.beans.value.*;
	import javafx.collections.transformation.*;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXMLLoader;
	
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
			
			context.getMasterData().addAll(personRepository.findAll());
			SortedList<Person> sortedData = new SortedList<>(context.getFilteredMasterData());
			sortedData.comparatorProperty().bind(tableView.comparatorProperty());
			tableView.setItems(sortedData);
		}
		
		public void initialize() {
			textFieldSearch.textProperty().addListener(this::onSearchTextChanged);
			«FOR field : t.field»
			setupCellValueFactory(column«field.name.toFirstUpper», e-> new SimpleObjectProperty(e.get«field.name.toFirstUpper»()));
			«ENDFOR»
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
		
		@Override
		protected void onMenuItemAction(ActionEvent event) {
			Object source = event.getSource();
			if (source == menuItemClipboard) {
				dispatchTableRowToClipboard();
			} else if (source == menuItemExportToExcel) {
				dispatchExportToExcel();
			} else if (source == menuItemExportToHtml) {
				dispatchExportToHtml();
			} else if (source == menuItemExportToText) {
				dispatchExportToText();
			} else if (source == menuItemOpenDetailsDeialog) {
				dispatchOpenDetailsDialog();
			} else if (source == menuItemOpenSearchDialog) {
				dispatchOpenSearchDialog();
			}
		}
	
		private void dispatchOpenDetailsDialog() {
			// TODO Auto-generated method stub
		}
	
		private void dispatchOpenSearchDialog() {
			// TODO Auto-generated method stub
		}
	
		private void dispatchExportToText() {
			// TODO Auto-generated method stub
		}
	
		private void dispatchExportToHtml() {
			// TODO Auto-generated method stub
		}
	
		private void dispatchExportToExcel() {
			// TODO Auto-generated method stub
		}
	
		private void dispatchTableRowToClipboard() {
			// TODO Auto-generated method stub
		}
	}
	'''
}