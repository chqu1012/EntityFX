package de.dc.entity.lang.generator.template.resource;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import de.dc.entity.model.Field;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class FxmlSearchPaneTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper);
    _builder.append("SearchPane.fxml");
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
    _builder.append("<?import javafx.scene.control.Button?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.CheckBox?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.ComboBox?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.Hyperlink?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.Label?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.TextField?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.AnchorPane?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.HBox?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.VBox?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.text.Font?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<fx:root fx:id=\"root\" maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" prefHeight=\"400.0\" prefWidth=\"600.0\" type=\"VBox\" xmlns=\"http://javafx.com/javafx/8.0.221\" xmlns:fx=\"http://javafx.com/fxml/1\">");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<AnchorPane minHeight=\"100.0\" prefHeight=\"99.0\" prefWidth=\"600.0\" style=\"-fx-background-color: white;\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Label layoutX=\"31.0\" layoutY=\"22.0\" text=\"Search Content Dialog\">");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("<font>");
    _builder.newLine();
    _builder.append("                  ");
    _builder.append("<Font name=\"System Bold\" size=\"14.0\" />");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("</font>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</Label>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Label layoutX=\"31.0\" layoutY=\"59.0\" text=\"Multiple search for ");
    String _name = t.getName();
    _builder.append(_name, "            ");
    _builder.append(" objects available.\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</AnchorPane>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<VBox fx:id=\"paneContent\" maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" minHeight=\"300.0\" prefHeight=\"367.0\" prefWidth=\"600.0\" spacing=\"5.0\" VBox.vgrow=\"ALWAYS\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<children>");
    _builder.newLine();
    {
      EList<Field> _field = t.getField();
      for(final Field field : _field) {
        _builder.append("            ");
        String _buildRow = this.buildRow(field);
        _builder.append(_buildRow, "            ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("         ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<padding>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Insets left=\"40.0\" right=\"20.0\" top=\"20.0\" />");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("</padding>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</VBox>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<AnchorPane maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" minHeight=\"60.0\" style=\"-fx-background-color: white;\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Button fx:id=\"buttonAccept\" layoutX=\"523.0\" layoutY=\"18.0\" mnemonicParsing=\"false\" onAction=\"#onActionEvent\" text=\"Accept\" />");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<Hyperlink fx:id=\"linkCancel\" layoutX=\"479.0\" layoutY=\"19.0\" text=\"Cancel\" onAction=\"#onActionEvent\"/>");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</AnchorPane>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("</fx:root>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String buildRow(final Field field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<HBox alignment=\"CENTER_LEFT\" prefHeight=\"30.0\" spacing=\"10.0\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<CheckBox fx:id=\"checkbox");
    String _firstUpper = StringExtensions.toFirstUpper(field.getName());
    _builder.append(_firstUpper, "\t");
    _builder.append("\" minWidth=\"120.0\" mnemonicParsing=\"false\" text=\"");
    String _firstUpper_1 = StringExtensions.toFirstUpper(field.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<HBox fx:id=\"hbox");
    String _firstUpper_2 = StringExtensions.toFirstUpper(field.getName());
    _builder.append(_firstUpper_2, "\t");
    _builder.append("\" alignment=\"CENTER_LEFT\" maxHeight=\"1.7976931348623157E308\" maxWidth=\"1.7976931348623157E308\" spacing=\"5.0\" HBox.hgrow=\"ALWAYS\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<ComboBox fx:id=\"combobox");
    String _firstUpper_3 = StringExtensions.toFirstUpper(field.getName());
    _builder.append(_firstUpper_3, "\t\t\t");
    _builder.append("\" prefWidth=\"150.0\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<TextField fx:id=\"text");
    String _firstUpper_4 = StringExtensions.toFirstUpper(field.getName());
    _builder.append(_firstUpper_4, "\t\t\t");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</HBox>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("</HBox>");
    _builder.newLine();
    return _builder.toString();
  }
}
