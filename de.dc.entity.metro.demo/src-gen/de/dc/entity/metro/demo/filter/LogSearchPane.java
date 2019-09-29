package de.dc.entity.metro.demo.filter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.util.Optional;

public class LogSearchPane extends VBox{

    @FXML
    protected VBox paneContent;

    @FXML
    protected Button buttonAccept;

    @FXML
    protected Hyperlink linkCancel;

    @FXML
    protected VBox root;
    @FXML
    protected HBox hboxName;

    @FXML
    protected CheckBox checkboxName;

    @FXML
    protected ComboBox<LogSearchType> comboboxName;

    @FXML
    protected TextField textName;
    @FXML
    protected HBox hboxMessage;

    @FXML
    protected CheckBox checkboxMessage;

    @FXML
    protected ComboBox<LogSearchType> comboboxMessage;

    @FXML
    protected TextField textMessage;
    @FXML
    protected HBox hboxStatus;

    @FXML
    protected CheckBox checkboxStatus;

    @FXML
    protected ComboBox<LogSearchType> comboboxStatus;

    @FXML
    protected TextField textStatus;
    @FXML
    protected HBox hboxCreatedOn;

    @FXML
    protected CheckBox checkboxCreatedOn;

    @FXML
    protected ComboBox<LogSearchType> comboboxCreatedOn;

    @FXML
    protected TextField textCreatedOn;
    @FXML
    protected HBox hboxUpdatedOn;

    @FXML
    protected CheckBox checkboxUpdatedOn;

    @FXML
    protected ComboBox<LogSearchType> comboboxUpdatedOn;

    @FXML
    protected TextField textUpdatedOn;
    
    private ObservableList<LogSearchContent> content = FXCollections.observableArrayList();
     
	public static final String FXML = "/de/dc/fx/ui/log/spring/filter/LogSearchPane.fxml";

	public LogSearchPane() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		hboxName.disableProperty().bind(checkboxName.selectedProperty().not());
		comboboxName.setItems(FXCollections.observableArrayList(LogSearchType.values()));
		comboboxName.getSelectionModel().selectFirst();
		hboxMessage.disableProperty().bind(checkboxMessage.selectedProperty().not());
		comboboxMessage.setItems(FXCollections.observableArrayList(LogSearchType.values()));
		comboboxMessage.getSelectionModel().selectFirst();
		hboxStatus.disableProperty().bind(checkboxStatus.selectedProperty().not());
		comboboxStatus.setItems(FXCollections.observableArrayList(LogSearchType.values()));
		comboboxStatus.getSelectionModel().selectFirst();
		hboxCreatedOn.disableProperty().bind(checkboxCreatedOn.selectedProperty().not());
		comboboxCreatedOn.setItems(FXCollections.observableArrayList(LogSearchType.values()));
		comboboxCreatedOn.getSelectionModel().selectFirst();
		hboxUpdatedOn.disableProperty().bind(checkboxUpdatedOn.selectedProperty().not());
		comboboxUpdatedOn.setItems(FXCollections.observableArrayList(LogSearchType.values()));
		comboboxUpdatedOn.getSelectionModel().selectFirst();
	}
     
    @FXML
    protected void onActionEvent(ActionEvent event) {
    	if (event.getSource()==buttonAccept) {
    		content.clear();
			if(checkboxName.isSelected()){
				String value = textName.getText();
				String name = checkboxName.getText();
				LogSearchType type = comboboxName.getSelectionModel().getSelectedItem();
				content.add(new LogSearchContent(name, value, type));
			}
			if(checkboxMessage.isSelected()){
				String value = textMessage.getText();
				String name = checkboxMessage.getText();
				LogSearchType type = comboboxMessage.getSelectionModel().getSelectedItem();
				content.add(new LogSearchContent(name, value, type));
			}
			if(checkboxStatus.isSelected()){
				String value = textStatus.getText();
				String name = checkboxStatus.getText();
				LogSearchType type = comboboxStatus.getSelectionModel().getSelectedItem();
				content.add(new LogSearchContent(name, value, type));
			}
			if(checkboxCreatedOn.isSelected()){
				String value = textCreatedOn.getText();
				String name = checkboxCreatedOn.getText();
				LogSearchType type = comboboxCreatedOn.getSelectionModel().getSelectedItem();
				content.add(new LogSearchContent(name, value, type));
			}
			if(checkboxUpdatedOn.isSelected()){
				String value = textUpdatedOn.getText();
				String name = checkboxUpdatedOn.getText();
				LogSearchType type = comboboxUpdatedOn.getSelectionModel().getSelectedItem();
				content.add(new LogSearchContent(name, value, type));
			}
			
			String select = "SELECT * FROM CONTACT WHERE ";
			Optional<String> result = content.stream().map(e-> e.getName()+" = '"+e.getValue()+"'").reduce((e1,e2) -> e1 +" OR "+e2);
			result.ifPresent(e-> System.out.println(select+e));
		}
    	root.toBack();
    }
}
