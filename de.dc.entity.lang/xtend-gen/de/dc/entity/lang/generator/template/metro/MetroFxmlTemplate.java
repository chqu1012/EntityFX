package de.dc.entity.lang.generator.template.metro;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MetroFxmlTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Metro");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Pane.fxml");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<?import javafx.geometry.Insets?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.Label?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.ListView?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.SplitPane?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.TextField?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.StackPane?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.VBox?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.text.Font?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<fx:root dividerPositions=\"0.2\" prefHeight=\"800.0\" prefWidth=\"1200.0\" stylesheets=\"@Metro");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Pane.css\" type=\"SplitPane\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("xmlns=\"http://javafx.com/javafx/8.0.221\" xmlns:fx=\"http://javafx.com/fxml/1\">");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<items>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<VBox maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" spacing=\"5.0\" styleClass=\"navigation\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Label fx:id=\"labelTitle\" alignment=\"BOTTOM_CENTER\" maxWidth=\"1.7976931348623157E308\" prefHeight=\"49.0\" prefWidth=\"200.0\" text=\"My Application\" textFill=\"WHITE\">");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("<font>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<Font name=\"System Bold\" size=\"25.0\" />");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("</font>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</Label>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Label fx:id=\"labelTitleDescription\" alignment=\"CENTER\" maxWidth=\"1.7976931348623157E308\" text=\"Small application description\" textFill=\"WHITE\">");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("<font>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<Font name=\"System Italic\" size=\"12.0\" />");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("</font>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</Label>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<TextField fx:id=\"textSearchField\" promptText=\"Search for Modules\">");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("<VBox.margin>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<Insets left=\"15.0\" right=\"15.0\" top=\"10.0\" />");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("</VBox.margin>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</TextField>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<ListView fx:id=\"listViewNavigation\" maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" onMouseClicked=\"#onMouseClicked\" VBox.vgrow=\"ALWAYS\">");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("<VBox.margin>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<Insets bottom=\"20.0\" top=\"5.0\" />");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("</VBox.margin>");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("<padding>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<Insets left=\"10.0\" />");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("</padding>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</ListView>");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</VBox>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<StackPane fx:id=\"stackPane\" prefHeight=\"150.0\" prefWidth=\"200.0\" />");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</items>");
    _builder.newLine();
    _builder.append("</fx:root>");
    _builder.newLine();
    return _builder.toString();
  }
}
