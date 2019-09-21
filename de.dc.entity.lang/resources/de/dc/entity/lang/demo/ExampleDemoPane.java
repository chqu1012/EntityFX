package de.dc.entity.lang.demo;

import java.io.IOException;

import org.apache.log4j.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;

public class ExampleDemoPane extends BaseDemoPane<Object> {

	private Logger log = Logger.getLogger(getClass());
	
	private static final String FXML = "/de/dc/entity/lang/demo/ExampleDemo.fxml";
	
	public ExampleDemoPane() {
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
