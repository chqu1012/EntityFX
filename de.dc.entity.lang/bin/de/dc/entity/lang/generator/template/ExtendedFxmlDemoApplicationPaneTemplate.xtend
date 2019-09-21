package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class ExtendedFxmlDemoApplicationPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Extended�t.name�ApplicationPane.fxml'''
	
	override gen(Entity t)'''
	<?xml version="1.0" encoding="UTF-8"?>
	
	<?import javafx.scene.control.Label?>
	<?import javafx.scene.control.Menu?>
	<?import javafx.scene.control.MenuBar?>
	<?import javafx.scene.control.MenuItem?>
	<?import javafx.scene.control.SplitPane?>
	<?import javafx.scene.control.Tab?>
	<?import javafx.scene.control.TabPane?>
	<?import javafx.scene.control.TableColumn?>
	<?import javafx.scene.control.TableView?>
	<?import javafx.scene.control.ToolBar?>
	<?import javafx.scene.layout.AnchorPane?>
	<?import javafx.scene.layout.BorderPane?>
	
	
	<fx:root maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" prefHeight="600.0" prefWidth="800.0" type="BorderPane" xmlns="http://javafx.com/javafx/8.0.221" xmlns:fx="http://javafx.com/fxml/1">
	   <center>
	      <SplitPane dividerPositions="0.7" maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" orientation="VERTICAL" prefHeight="600.0" prefWidth="800.0">
	         <items>
	            <SplitPane dividerPositions="0.2, 0.8" maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" minHeight="-Infinity" minWidth="-Infinity">
	               <items>
	                  <TabPane maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" tabClosingPolicy="UNAVAILABLE">
	                    <tabs>
	                      <Tab text="Explorer">
	                        <content>
	                          <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0" />
	                        </content>
	                      </Tab>
	                    </tabs>
	                  </TabPane>
	                  <TabPane prefHeight="200.0" prefWidth="200.0" tabClosingPolicy="UNAVAILABLE">
	                    <tabs>
	                      <Tab text="TableView">
	                        <content>
	                          <AnchorPane fx:id="anchorPaneTableView" minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0" />
	                        </content>
	                      </Tab>
	                        <Tab text="Perferences">
	                          <content>
	                            <AnchorPane fx:id="anchorPanePreferences" minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0" />
	                          </content>
	                        </Tab>
	                    </tabs>
	                  </TabPane>
	                  <TabPane prefHeight="200.0" prefWidth="200.0" tabClosingPolicy="UNAVAILABLE">
	                    <tabs>
	                      <Tab text="Formular">
	                        <content>
	                          <AnchorPane fx:id="anchorPaneFormular" minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0" />
	                        </content>
	                      </Tab>
	                    </tabs>
	                  </TabPane>
	               </items>
	            </SplitPane>
	            <TabPane prefHeight="200.0" prefWidth="200.0" tabClosingPolicy="UNAVAILABLE">
	              <tabs>
	                <Tab text="PropertyView">
	                     <content>
	                        <TableView fx:id="tableViewPropertyView" prefHeight="200.0" prefWidth="200.0">
	                          <columns>
	                            <TableColumn fx:id="columnProperty" prefWidth="180.0" text="Property" />
	                            <TableColumn fx:id="columnValue" prefWidth="618.0" text="Value" />
	                          </columns>
	                        </TableView>
	                     </content>
	                  </Tab>
	              </tabs>
	            </TabPane>
	         </items>
	      </SplitPane>
	   </center>
	   <top>
	      <MenuBar BorderPane.alignment="CENTER">
	        <menus>
	          <Menu mnemonicParsing="false" text="File">
	            <items>
	              <MenuItem mnemonicParsing="false" text="Close" />
	            </items>
	          </Menu>
	          <Menu mnemonicParsing="false" text="Edit">
	            <items>
	              <MenuItem mnemonicParsing="false" text="Delete" />
	            </items>
	          </Menu>
	          <Menu mnemonicParsing="false" text="Help">
	            <items>
	              <MenuItem mnemonicParsing="false" text="About" />
	            </items>
	          </Menu>
	        </menus>
	      </MenuBar>
	   </top>
	   <bottom>
	      <ToolBar BorderPane.alignment="CENTER">
	         <items>
	            <Label text="Items:" />
	            <Label text="---" />
	         </items>
	      </ToolBar>
	   </bottom>
	</fx:root>
	'''
}