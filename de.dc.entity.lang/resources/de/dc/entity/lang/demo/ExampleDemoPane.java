package de.dc.entity.lang.demo;

import java.io.IOException;

import org.apache.log4j.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class ExampleDemoPane extends SplitPane{

	private Logger log = Logger.getLogger(getClass());

	@FXML
	protected TextField textFieldSearch;

	@FXML
	protected TableView<Object> tableView;

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

	@FXML
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
