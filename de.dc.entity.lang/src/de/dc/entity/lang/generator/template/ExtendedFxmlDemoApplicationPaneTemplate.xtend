package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class ExtendedFxmlDemoApplicationPaneTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''Extended«t.name»ApplicationPane.fxml'''
	
	override gen(Entity t)'''
	<?xml version="1.0" encoding="UTF-8"?>
	
	<?import javafx.geometry.Insets?>
	<?import javafx.scene.control.ContextMenu?>
	<?import javafx.scene.control.Label?>
	<?import javafx.scene.control.Menu?>
	<?import javafx.scene.control.MenuBar?>
	<?import javafx.scene.control.MenuItem?>
	<?import javafx.scene.control.SplitPane?>
	<?import javafx.scene.control.Tab?>
	<?import javafx.scene.control.TabPane?>
	<?import javafx.scene.control.TableColumn?>
	<?import javafx.scene.control.TableView?>
	<?import javafx.scene.control.TextField?>
	<?import javafx.scene.control.ToolBar?>
	<?import javafx.scene.layout.AnchorPane?>
	<?import javafx.scene.layout.BorderPane?>
	<?import javafx.scene.layout.ColumnConstraints?>
	<?import javafx.scene.layout.GridPane?>
	<?import javafx.scene.layout.HBox?>
	<?import javafx.scene.layout.RowConstraints?>
	<?import javafx.scene.layout.VBox?>
	
	
	<fx:root maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" prefHeight="600.0" prefWidth="800.0" type="BorderPane" 
	xmlns="http://javafx.com/javafx/8.0.221" xmlns:fx="http://javafx.com/fxml/1">
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
	                          <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0">
	                                 <children>
	                                    <VBox layoutX="71.0" layoutY="14.0" prefHeight="348.0" prefWidth="472.0" spacing="5.0" AnchorPane.bottomAnchor="0.0" AnchorPane.leftAnchor="0.0" AnchorPane.rightAnchor="0.0" AnchorPane.topAnchor="0.0">
	                                       <padding>
	                                          <Insets bottom="5.0" left="5.0" right="5.0" top="5.0" />
	                                       </padding>
	                                       <children>
	                                          <HBox spacing="5.0">
	                                             <children>
	                                                <Label maxHeight="1.7976931348623157E308" text="Search:" />
	                                                <TextField fx:id="textFieldSearch" maxWidth="1.7976931348623157E308" HBox.hgrow="ALWAYS" />
	                                             </children>
	                                          </HBox>
	                                          <TableView fx:id="tableView" maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" VBox.vgrow="ALWAYS">
	                                          	 <columns>
	                                          	 	«FOR field : t.field»
	                                          	 	<TableColumn fx:id="column«field.name.toFirstUpper»" prefWidth="100.0" text="#«field.name.toUpperCase»" />
	                                          	 	«ENDFOR»
												</columns>
	                                             <contextMenu>
	                                                <ContextMenu>
	                                                  <items>
	                                                      <Menu mnemonicParsing="false" text="Copy">
	                                                        <items>
	                                                          <MenuItem fx:id="menuItemClipboard" mnemonicParsing="false" onAction="#onMenuItemAction" text="Clipboard" />
	                                                        </items>
	                                                      </Menu>
	                                                      <Menu mnemonicParsing="false" text="Export">
	                                                        <items>
	                                                          <MenuItem fx:id="menuItemExportToExcel" mnemonicParsing="false" onAction="#onMenuItemAction" text="Excel" />
	                                                            <MenuItem fx:id="menuItemExportToHtml" mnemonicParsing="false" onAction="#onMenuItemAction" text="Html" />
	                                                            <MenuItem fx:id="menuItemExportToText" mnemonicParsing="false" onAction="#onMenuItemAction" text="Text" />
	                                                        </items>
	                                                      </Menu>
	                                                      <MenuItem fx:id="menuItemOpenDetailsDeialog" mnemonicParsing="false" onAction="#onMenuItemAction" text="Open Details Dialog" />
	                                                      <MenuItem fx:id="menuItemOpenSearchDialog" mnemonicParsing="false" onAction="#onMenuItemAction" text="Open Search Dialog" />
	                                                  </items>
	                                                </ContextMenu>
	                                             </contextMenu>
	                                          </TableView>
	                                       </children>
	                                    </VBox>
	                                 </children>
	                              </AnchorPane>
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
	                          <AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0">
	                                 <children>
	                                    <GridPane fx:id="gridPaneFormular" layoutX="-36.0" layoutY="113.0" maxHeight="1.7976931348623157E308" maxWidth="1.7976931348623157E308" AnchorPane.leftAnchor="0.0" AnchorPane.rightAnchor="0.0" AnchorPane.topAnchor="0.0">
	                                      <columnConstraints>
	                                        <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
	                                        <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
	                                      </columnConstraints>
	                                      <rowConstraints>
	                                        <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
	                                        <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
	                                        <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
	                                      </rowConstraints>
	                                    </GridPane>
	                                 </children>
	                              </AnchorPane>
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