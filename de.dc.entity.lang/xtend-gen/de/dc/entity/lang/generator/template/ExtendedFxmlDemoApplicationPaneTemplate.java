package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ExtendedFxmlDemoApplicationPaneTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Extended");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("ApplicationPane.fxml");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.Label?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.Menu?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.MenuBar?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.MenuItem?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.Separator?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.SplitPane?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.Tab?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.TabPane?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.TableColumn?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.TableView?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.ToolBar?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.AnchorPane?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.BorderPane?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.VBox?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<fx:root maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" prefHeight=\"600.0\" prefWidth=\"800.0\" ");
    _builder.newLine();
    _builder.append("type=\"BorderPane\" xmlns=\"http://javafx.com/javafx/8.0.221\" xmlns:fx=\"http://javafx.com/fxml/1\"");
    _builder.newLine();
    _builder.append("stylesheets=\"@Extended");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("ApplicationPane.css\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<center>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<SplitPane dividerPositions=\"0.7\" maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" orientation=\"VERTICAL\" prefHeight=\"600.0\" prefWidth=\"800.0\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<items>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<SplitPane dividerPositions=\"0.2, 0.8\" maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" minHeight=\"-Infinity\" minWidth=\"-Infinity\">");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("<items>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<TabPane fx:id=\"tabPaneLeft\" maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" tabClosingPolicy=\"UNAVAILABLE\">");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<tabs>");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append("<Tab text=\"Explorer\">");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<content>");
    _builder.newLine();
    _builder.append("                          ");
    _builder.append("<AnchorPane minHeight=\"0.0\" minWidth=\"0.0\" prefHeight=\"180.0\" prefWidth=\"200.0\" />");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("</content>");
    _builder.newLine();
    _builder.append("                      ");
    _builder.append("</Tab>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</tabs>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("</TabPane>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<TabPane fx:id=\"tabPaneCenter\" prefHeight=\"200.0\" prefWidth=\"200.0\" tabClosingPolicy=\"UNAVAILABLE\" />");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<TabPane fx:id=\"tabPaneRight\" prefHeight=\"200.0\" prefWidth=\"200.0\" tabClosingPolicy=\"UNAVAILABLE\" />");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("</items>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</SplitPane>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<TabPane fx:id=\"tabPaneBottom\" prefHeight=\"200.0\" prefWidth=\"200.0\" tabClosingPolicy=\"UNAVAILABLE\">");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<tabs>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<Tab text=\"PropertyView\">");
    _builder.newLine();
    _builder.append("                     ");
    _builder.append("<content>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<TableView fx:id=\"tableViewPropertyView\" prefHeight=\"200.0\" prefWidth=\"200.0\">");
    _builder.newLine();
    _builder.append("                          ");
    _builder.append("<columns>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<TableColumn fx:id=\"columnProperty\" prefWidth=\"180.0\" text=\"Property\" />");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<TableColumn fx:id=\"columnValue\" prefWidth=\"618.0\" text=\"Value\" />");
    _builder.newLine();
    _builder.append("                          ");
    _builder.append("</columns>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("</TableView>");
    _builder.newLine();
    _builder.append("                     ");
    _builder.append("</content>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("</Tab>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("</tabs>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</TabPane>");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("</items>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</SplitPane>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</center>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<top>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<VBox BorderPane.alignment=\"CENTER\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<MenuBar>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<menus>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<Menu mnemonicParsing=\"false\" text=\"File\">");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<items>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<MenuItem mnemonicParsing=\"false\" text=\"Close\" />");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("</items>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</Menu>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<Menu mnemonicParsing=\"false\" text=\"Edit\">");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<items>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<MenuItem mnemonicParsing=\"false\" text=\"Delete\" />");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("</items>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</Menu>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<Menu mnemonicParsing=\"false\" text=\"Help\">");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<items>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<MenuItem mnemonicParsing=\"false\" text=\"About\" />");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("</items>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</Menu>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("</menus>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</MenuBar>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<ToolBar prefHeight=\"31.0\" prefWidth=\"800.0\" />");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</VBox>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</top>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<bottom>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<ToolBar BorderPane.alignment=\"CENTER\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<items>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Label text=\"Items:\" />");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Label fx:id=\"labelItemsCounter\" text=\"---\" />");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Separator orientation=\"VERTICAL\" />");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Label text=\"Filtered Items:\" />");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Label fx:id=\"labelFilteredItemsCounter\" text=\"---\" />");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("</items>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</ToolBar>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</bottom>");
    _builder.newLine();
    _builder.append("</fx:root>");
    _builder.newLine();
    return _builder.toString();
  }
}
