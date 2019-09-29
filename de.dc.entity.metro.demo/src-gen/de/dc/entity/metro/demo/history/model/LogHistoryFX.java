package de.dc.entity.metro.demo.history.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

@Component
public class LogHistoryFX {
	
  private LogHistory logHistory;
  private ObjectProperty<LogHistory> logHistoryProperty = new SimpleObjectProperty<>();
  private ObservableList<LogHistory> masterData = FXCollections.observableArrayList();
  private FilteredList<LogHistory> filteredMasterData = new FilteredList<>(masterData, p-> true);
  
  private LongProperty idProperty = new SimpleLongProperty();
  private BooleanProperty enableSubmitProperty = new SimpleBooleanProperty(false);
  
  private StringProperty nameProperty = new SimpleStringProperty();
  private StringProperty messageProperty = new SimpleStringProperty();
  private IntegerProperty statusProperty = new SimpleIntegerProperty();
  private ObjectProperty<java.time.LocalDateTime> createdOnProperty = new SimpleObjectProperty<>(LocalDateTime.now());
  
  public LogHistoryFX() {
    this(new LogHistory());
  }
  
  public LogHistoryFX(LogHistory logHistory) {
    this.logHistory=logHistory;
    this.logHistoryProperty.set(logHistory);
    
	this.logHistoryProperty.addListener((observable, oldValue, newValue) -> {
		if (newValue!=null) {
			nameProperty.set(newValue.getName());
			messageProperty.set(newValue.getMessage());
			statusProperty.set(newValue.getStatus());
			createdOnProperty.set(newValue.getCreatedOn());
		}
	});

    BooleanBinding isEnabled = nameProperty.isNotEmpty().and(messageProperty.isNotEmpty());
    this.enableSubmitProperty.bind(isEnabled);
  }

  public ObjectProperty<LogHistory> getLogHistoryProperty() {
    return logHistoryProperty;
  }

  public BooleanProperty getEnabledSubmitProperty() {
    return enableSubmitProperty;
  }
  
  public ObservableList<LogHistory>  getMasterData(){
  	return masterData;
  }

  public FilteredList<LogHistory> getFilteredMasterData(){
  	return filteredMasterData;
  }
  
  public LogHistory getLogHistory() {
  	this.logHistory = new LogHistory();
  	this.logHistory.setName(nameProperty.getValue());
  	this.logHistory.setMessage(messageProperty.getValue());
  	this.logHistory.setStatus(statusProperty.getValue());
  	this.logHistory.setCreatedOn(createdOnProperty.getValue());
    return this.logHistory;
  }
  
  public LongProperty getIdProperty(){
  	return idProperty;
  }
  
  public void setIdProperty(LongProperty idProperty){
  	this.idProperty = idProperty;
  }
  
  public StringProperty getNameProperty() {
    return this.nameProperty;
  }
  
  public void setNameProperty(StringProperty nameProperty) {
    this.nameProperty = nameProperty;
  }
  public StringProperty getMessageProperty() {
    return this.messageProperty;
  }
  
  public void setMessageProperty(StringProperty messageProperty) {
    this.messageProperty = messageProperty;
  }
  public IntegerProperty getStatusProperty() {
    return this.statusProperty;
  }
  
  public void setStatusProperty(IntegerProperty statusProperty) {
    this.statusProperty = statusProperty;
  }
  public ObjectProperty<java.time.LocalDateTime> getCreatedOnProperty() {
    return this.createdOnProperty;
  }
  
  public void setCreatedOnProperty(ObjectProperty<java.time.LocalDateTime> createdOnProperty) {
    this.createdOnProperty = createdOnProperty;
  }

  public void clear() {
  	  this.nameProperty.set("");
  	  this.messageProperty.set("");
  	  this.statusProperty.set(0);
  	  this.createdOnProperty.set(java.time.LocalDateTime.now());
  }

  public String toString() {
    return  org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(getLogHistory());
  }
}
