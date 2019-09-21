package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class ExtendedDemoApplicationPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Extended«t.name»ApplicationPane'''
	
	override gen(Entity t)'''
	package «t.packagePath».extended;
	
	import java.io.*;
	
	import org.apache.log4j.Logger;
	
	import «t.packagePath».model.*;
	
	import javafx.event.ActionEvent;
	import javafx.fxml.FXMLLoader;
	
	public class Extended«t.name»ApplicationPane extends ExtendedBase«t.name»ApplicationPane<«t.name»> {
	
		private Logger log = Logger.getLogger(getClass());
		
		private static final String FXML = "/«t.packagePath.replace('.', '/')»/Extended«t.name»ApplicationPane.fxml";
		
		public Extended«t.name»ApplicationPane() {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML));
			fxmlLoader.setRoot(this);
			fxmlLoader.setController(this);
	
			try {
				fxmlLoader.load();
			} catch (IOException exception) {
				log.error("Failed to load fxml " + FXML, exception);
			}
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