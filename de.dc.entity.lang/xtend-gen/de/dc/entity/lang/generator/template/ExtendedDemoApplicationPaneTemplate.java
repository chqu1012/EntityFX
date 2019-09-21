package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ExtendedDemoApplicationPaneTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Extended");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("ApplicationPane");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".extended;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.apache.log4j.Logger;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".control.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_2 = t.getPackagePath();
    _builder.append(_packagePath_2);
    _builder.append(".di.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_3 = t.getPackagePath();
    _builder.append(_packagePath_3);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_4 = t.getPackagePath();
    _builder.append(_packagePath_4);
    _builder.append(".repository.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.fxml.FXMLLoader;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.AnchorPane;");
    _builder.newLine();
    _builder.append("import javafx.scene.web.WebView;");
    _builder.newLine();
    _builder.append("import javafx.beans.binding.*;");
    _builder.newLine();
    _builder.append("import javafx.application.Platform;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.sql.*;");
    _builder.newLine();
    _builder.append("import org.h2.tools.Server;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Extended");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("ApplicationPane extends ExtendedBase");
    String _name_1 = t.getName();
    _builder.append(_name_1);
    _builder.append("ApplicationPane<");
    String _name_2 = t.getName();
    _builder.append(_name_2);
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Logger log = Logger.getLogger(getClass());");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String FXML = \"/");
    String _replace = t.getPackagePath().replace(".", "/");
    _builder.append(_replace, "\t");
    _builder.append("/extended/Extended");
    String _name_3 = t.getName();
    _builder.append(_name_3, "\t");
    _builder.append("ApplicationPane.fxml\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected ");
    String _name_4 = t.getName();
    _builder.append(_name_4, "\t");
    _builder.append("FX context; ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("protected  ");
    String _name_5 = t.getName();
    _builder.append(_name_5, "\t");
    _builder.append("Repository ");
    String _firstLower = StringExtensions.toFirstLower(t.getName());
    _builder.append(_firstLower, "\t");
    _builder.append("Repository;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Extended");
    String _name_6 = t.getName();
    _builder.append(_name_6, "\t");
    _builder.append("ApplicationPane() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fxmlLoader.setRoot(this);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fxmlLoader.setController(this);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("fxmlLoader.load();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch (IOException exception) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("log.error(\"Failed to load fxml \" + FXML, exception);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.");
    String _firstLower_1 = StringExtensions.toFirstLower(t.getName());
    _builder.append(_firstLower_1, "\t\t");
    _builder.append("Repository = ");
    String _name_7 = t.getName();
    _builder.append(_name_7, "\t\t");
    _builder.append("Platform.getInstance(");
    String _name_8 = t.getName();
    _builder.append(_name_8, "\t\t");
    _builder.append("Repository.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.context = ");
    String _name_9 = t.getName();
    _builder.append(_name_9, "\t\t");
    _builder.append("Platform.getInstance(");
    String _name_10 = t.getName();
    _builder.append(_name_10, "\t\t");
    _builder.append("FX.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("labelItemsCounter.textProperty().bind(Bindings.size(context.getMasterData()).asString());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("labelFilteredItemsCounter.textProperty().bind(Bindings.size(context.getFilteredMasterData()).asString());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Filtered");
    String _name_11 = t.getName();
    _builder.append(_name_11, "\t\t");
    _builder.append("TableView tableView = ");
    String _name_12 = t.getName();
    _builder.append(_name_12, "\t\t");
    _builder.append("Platform.getInstance(Filtered");
    String _name_13 = t.getName();
    _builder.append(_name_13, "\t\t");
    _builder.append("TableView.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setBottomAnchor(tableView, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setTopAnchor(tableView, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setRightAnchor(tableView, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setLeftAnchor(tableView, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("anchorPaneTableView.getChildren().add(tableView);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    String _name_14 = t.getName();
    _builder.append(_name_14, "\t\t");
    _builder.append("Formular form = ");
    String _name_15 = t.getName();
    _builder.append(_name_15, "\t\t");
    _builder.append("Platform.getInstance(");
    String _name_16 = t.getName();
    _builder.append(_name_16, "\t\t");
    _builder.append("Formular.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setBottomAnchor(form, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setTopAnchor(form, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setRightAnchor(form, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setLeftAnchor(form, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("anchorPaneFormular.getChildren().add(form);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("WebView webView = new WebView();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setBottomAnchor(webView, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setTopAnchor(webView, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setRightAnchor(webView, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AnchorPane.setLeftAnchor(webView, 0d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("anchorPanePreferences.getChildren().add(webView);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Class.forName(\"org.h2.Driver\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Server server = Server.createWebServer(\"-web\", \"-webAllowOthers\", \"-webPort\", \"9082\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("server.start();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("String serverUrl = server.getURL();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Platform.runLater(() ->webView.getEngine().load(serverUrl));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch (ClassNotFoundException | SQLException e) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("log.error(\"Failed to open h2 console!\", e);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
