package de.dc.entity.lang.generator.template.resource

import de.dc.entity.lang.generator.template.IGenerator
import de.dc.entity.model.Entity
import de.dc.entity.model.Field

class FxmlSearchPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name.toFirstUpper»SearchPane.fxml'''
	
	override gen(Entity t)'''
	<?xml version="1.0" encoding="UTF-8"?>
	
	<?import javafx.geometry.Insets?>
	<?import javafx.scene.control.Button?>
	<?import javafx.scene.control.CheckBox?>
	<?import javafx.scene.control.ComboBox?>
	<?import javafx.scene.control.Hyperlink?>
	<?import javafx.scene.control.Label?>
	<?import javafx.scene.control.TextField?>
	<?import javafx.scene.layout.AnchorPane?>
	<?import javafx.scene.layout.HBox?>
	<?import javafx.scene.layout.VBox?>
	<?import javafx.scene.text.Font?>
	
	<fx:root fx:id="root" maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" prefHeight="400.0" prefWidth="600.0" type="VBox" xmlns="http://javafx.com/javafx/8.0.221" xmlns:fx="http://javafx.com/fxml/1">
	   <children>
	      <AnchorPane minHeight="100.0" prefHeight="99.0" prefWidth="600.0" style="-fx-background-color: white;">
	         <children>
	            <Label layoutX="31.0" layoutY="22.0" text="Search Content Dialog">
	               <font>
	                  <Font name="System Bold" size="14.0" />
	               </font>
	            </Label>
	            <Label layoutX="31.0" layoutY="59.0" text="Multiple search for «t.name» objects available." />
	         </children>
	      </AnchorPane>
	      <VBox fx:id="paneContent" maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" minHeight="300.0" prefHeight="367.0" prefWidth="600.0" spacing="5.0" VBox.vgrow="ALWAYS">
	         <children>
	            «FOR field : t.field»
	            «field.buildRow»
	            «ENDFOR»
	         </children>
	         <padding>
	            <Insets left="40.0" right="20.0" top="20.0" />
	         </padding>
	      </VBox>
	      <AnchorPane maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" minHeight="60.0" style="-fx-background-color: white;">
	         <children>
	            <Button fx:id="buttonAccept" layoutX="523.0" layoutY="18.0" mnemonicParsing="false" onAction="#onActionEvent" text="Accept" />
	            <Hyperlink fx:id="linkCancel" layoutX="479.0" layoutY="19.0" text="Cancel" onAction="#onActionEvent"/>
	         </children>
	      </AnchorPane>
	   </children>
	</fx:root>
	'''
	
	def String buildRow(Field field)'''
	<HBox alignment="CENTER_LEFT" prefHeight="30.0" spacing="10.0">
		<children>
		<CheckBox fx:id="checkbox«field.name.toFirstUpper»" minWidth="120.0" mnemonicParsing="false" text="«field.name.toFirstUpper»" />
		<HBox fx:id="hbox«field.name.toFirstUpper»" alignment="CENTER_LEFT" maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" spacing="5.0" HBox.hgrow="ALWAYS">
			<children>
				<ComboBox fx:id="combobox«field.name.toFirstUpper»" prefWidth="150.0" />
				<TextField fx:id="text«field.name.toFirstUpper»" />
			</children>
		</HBox>
		</children>
	</HBox>
	'''
	
}