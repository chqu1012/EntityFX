package de.dc.entity.lang.demo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public abstract class BaseDemoPane<T> extends BorderPane{

    @FXML
    protected TextField textFieldSearch;

    @FXML
    protected TableView<T> tableView;

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

}
