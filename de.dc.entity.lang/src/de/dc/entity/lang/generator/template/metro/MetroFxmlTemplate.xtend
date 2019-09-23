package de.dc.entity.lang.generator.template.metro

import de.dc.entity.lang.generator.template.IGenerator
import de.dc.entity.model.Entity

class MetroFxmlTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Metro�t.name�Pane.fxml'''
	
	override gen(Entity t)'''
	<?xml version="1.0" encoding="UTF-8"?>
	
	<?import javafx.geometry.Insets?>
	<?import javafx.scene.control.Label?>
	<?import javafx.scene.control.ListView?>
	<?import javafx.scene.control.SplitPane?>
	<?import javafx.scene.control.TextField?>
	<?import javafx.scene.layout.StackPane?>
	<?import javafx.scene.layout.VBox?>
	<?import javafx.scene.text.Font?>
	
	<fx:root dividerPositions="0.2" prefHeight="800.0" prefWidth="1200.0" stylesheets="@Metro�t.name�Pane.css" type="SplitPane" 
	xmlns="http://javafx.com/javafx/8.0.221" xmlns:fx="http://javafx.com/fxml/1">
	   <items>
	      <VBox maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" spacing="5.0" styleClass="navigation">
	         <children>
	            <Label fx:id="labelTitle" alignment="BOTTOM_CENTER" maxWidth="1.7976931348623157E308" prefHeight="49.0" prefWidth="200.0" text="My Application" textFill="WHITE">
	               <font>
	                  <Font name="System Bold" size="25.0" />
	               </font>
	            </Label>
	            <Label fx:id="labelTitleDescription" alignment="CENTER" maxWidth="1.7976931348623157E308" text="Small application description" textFill="WHITE">
	               <font>
	                  <Font name="System Italic" size="12.0" />
	               </font>
	            </Label>
	            <TextField fx:id="textSearchField" promptText="Search for Modules">
	               <VBox.margin>
	                  <Insets left="15.0" right="15.0" top="10.0" />
	               </VBox.margin>
	            </TextField>
	            <ListView fx:id="listViewNavigation" maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" onMouseClicked="#onMouseClicked" VBox.vgrow="ALWAYS">
	               <VBox.margin>
	                  <Insets bottom="20.0" top="5.0" />
	               </VBox.margin>
	               <padding>
	                  <Insets left="10.0" />
	               </padding>
	            </ListView>
	         </children>
	      </VBox>
	      <StackPane fx:id="stackPane" prefHeight="150.0" prefWidth="200.0" />
	   </items>
	</fx:root>
	'''
	
}