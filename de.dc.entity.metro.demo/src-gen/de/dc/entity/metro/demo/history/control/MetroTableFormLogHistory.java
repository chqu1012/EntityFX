package de.dc.entity.metro.demo.history.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.dc.entity.lang.templates.core.BaseMetroTableForm;
import de.dc.entity.metro.demo.history.model.LogHistory;
import de.dc.entity.metro.demo.history.model.LogHistoryFX;
import de.dc.entity.metro.demo.history.repository.LogHistoryRepository;
import javafx.application.Platform;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

@Controller
public class MetroTableFormLogHistory extends BaseMetroTableForm<LogHistory> {
	
	@Autowired LogHistoryFX context;
	@Autowired LogHistoryRepository repository;

	public void initialize() {
		initTableView();
		initForm();
	}

	private void initForm(){
		createText("Name").textProperty().bindBidirectional(context.getNameProperty() );
		createText("Message").textProperty().bindBidirectional(context.getMessageProperty() );
		createText("Status").textProperty().bindBidirectional(context.getStatusProperty() , java.text.NumberFormat.getInstance());
		createLDTTextField("CreatedOn").localDateTimeProperty().bindBidirectional(context.getCreatedOnProperty());
		createButtons();
	}

	private void initTableView() {
		setupCellValueFactory(createTableColumn("#Name"), e->new SimpleObjectProperty<>(String.valueOf(e.getName())));
		setupCellValueFactory(createTableColumn("#Message"), e->new SimpleObjectProperty<>(String.valueOf(e.getMessage())));
		setupCellValueFactory(createTableColumn("#Status"), e->new SimpleObjectProperty<>(String.valueOf(e.getStatus())));
		setupCellValueFactory(createTableColumn("#CreatedOn"), e->new SimpleObjectProperty<>(String.valueOf(e.getCreatedOn())));
		
		Platform.runLater(()->context.getMasterData().addAll(repository.findAll()));
		tableView.setItems(context.getFilteredMasterData());
		
		textSearch.textProperty().addListener(this::onDispatchSearchTextChanged);
	}
	
	public void onDispatchSearchTextChanged(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		context.getFilteredMasterData().setPredicate(p->{
			boolean isEmpty = newValue==null || newValue.isEmpty();
			boolean containsName = String.valueOf(p.getName()).toLowerCase().contains(newValue.toLowerCase());
			boolean containsMessage = String.valueOf(p.getMessage()).toLowerCase().contains(newValue.toLowerCase());
			boolean containsStatus = String.valueOf(p.getStatus()).toLowerCase().contains(newValue.toLowerCase());
			boolean containsCreatedOn = String.valueOf(p.getCreatedOn()).toLowerCase().contains(newValue.toLowerCase());
			return isEmpty || containsName || containsMessage || containsStatus || containsCreatedOn;
		});
	}
	
	protected void createButtons() {
		Button clearButton = new Button("Reset");
		clearButton.setOnMouseClicked(this::dispatchOnButtonReset);
		clearButton.disableProperty().bind(context.getEnabledSubmitProperty().not());
		
		Button submitButton = new Button("Submit");
		submitButton.setOnMouseClicked(this::dispatchOnButtonSubmit);
		submitButton.disableProperty().bind(context.getEnabledSubmitProperty().not());

		HBox hbox = new HBox(5);
		hbox.getChildren().addAll(clearButton, submitButton);
		paneFormular.getChildren().addAll(hbox);
	}
	
	private void dispatchOnButtonSubmit(MouseEvent e) {
		LogHistory logHistory = repository.save(context.getLogHistory());
		context.getMasterData().add(logHistory);
		context.clear();
	}

	private void dispatchOnButtonReset(MouseEvent e) {
		context.clear();
	}
	
	@Override
	protected void dispatchOpenSearchPanel() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void dispatchOpenDetails(LogHistory selection) {
		// TODO Auto-generated method stub
	}
}
