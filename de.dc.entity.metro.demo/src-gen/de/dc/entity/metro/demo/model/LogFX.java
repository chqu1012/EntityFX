package de.dc.entity.metro.demo.model;

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
public class LogFX {
	
  private Log log;
  private ObjectProperty<Log> logProperty = new SimpleObjectProperty<>();
  private ObservableList<Log> masterData = FXCollections.observableArrayList();
  private FilteredList<Log> filteredMasterData = new FilteredList<>(masterData, p-> true);
  
  private LongProperty idProperty = new SimpleLongProperty();
  private BooleanProperty enableSubmitProperty = new SimpleBooleanProperty(false);
  
  private StringProperty nameProperty = new SimpleStringProperty();
  private StringProperty messageProperty = new SimpleStringProperty();
  private IntegerProperty statusProperty = new SimpleIntegerProperty();
  private ObjectProperty<java.time.LocalDateTime> createdOnProperty = new SimpleObjectProperty<>(LocalDateTime.now());
  private ObjectProperty<java.time.LocalDateTime> updatedOnProperty = new SimpleObjectProperty<>(LocalDateTime.now());
  
  public LogFX() {
    this(new Log());
  }
  
  public LogFX(Log log) {
    this.log=log;
    this.logProperty.set(log);
    
	this.logProperty.addListener((observable, oldValue, newValue) -> {
		if (newValue!=null) {
			nameProperty.set(newValue.getName());
			messageProperty.set(newValue.getMessage());
			statusProperty.set(newValue.getStatus());
			createdOnProperty.set(newValue.getCreatedOn());
			updatedOnProperty.set(newValue.getUpdatedOn());
		}
	});

    BooleanBinding isEnabled = nameProperty.isNotEmpty().and(messageProperty.isNotEmpty());
    this.enableSubmitProperty.bind(isEnabled);
  }

  public ObjectProperty<Log> getLogProperty() {
    return logProperty;
  }

  public BooleanProperty getEnabledSubmitProperty() {
    return enableSubmitProperty;
  }
  
  public ObservableList<Log>  getMasterData(){
  	return masterData;
  }

  public FilteredList<Log> getFilteredMasterData(){
  	return filteredMasterData;
  }
  
  public Log getLog() {
  	this.log = new Log();
  	this.log.setName(nameProperty.getValue());
  	this.log.setMessage(messageProperty.getValue());
  	this.log.setStatus(statusProperty.getValue());
  	this.log.setCreatedOn(createdOnProperty.getValue());
  	this.log.setUpdatedOn(updatedOnProperty.getValue());
    return this.log;
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
  public ObjectProperty<java.time.LocalDateTime> getUpdatedOnProperty() {
    return this.updatedOnProperty;
  }
  
  public void setUpdatedOnProperty(ObjectProperty<java.time.LocalDateTime> updatedOnProperty) {
    this.updatedOnProperty = updatedOnProperty;
  }

  public void clear() {
  	  this.nameProperty.set("");
  	  this.messageProperty.set("");
  	  this.statusProperty.set(0);
  	  this.createdOnProperty.set(java.time.LocalDateTime.now());
  	  this.updatedOnProperty.set(java.time.LocalDateTime.now());
  }

  public String toString() {
    return  org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(getLog());
  }
}
