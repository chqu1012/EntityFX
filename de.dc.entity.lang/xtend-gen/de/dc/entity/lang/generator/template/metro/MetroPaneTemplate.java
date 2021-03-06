package de.dc.entity.lang.generator.template.metro;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MetroPaneTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Metro");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Pane.java");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".control.metro;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".model.*;\t");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import org.apache.log4j.Logger;");
    _builder.newLine();
    _builder.append("import javafx.event.ActionEvent;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javafx.beans.value.*;");
    _builder.newLine();
    _builder.append("import javafx.collections.*;");
    _builder.newLine();
    _builder.append("import javafx.collections.transformation.*;");
    _builder.newLine();
    _builder.append("import javafx.fxml.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.input.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Metro");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Pane extends SplitPane{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Logger log = Logger.getLogger(getClass());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Label labelTitle;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Label labelTitleDescription;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private TextField textSearchField;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ListView<String> listViewNavigation;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private StackPane stackPane;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String FXML = \"/");
    String _replace = t.getPackagePath().replace(".", "/");
    _builder.append(_replace, "\t");
    _builder.append("/control/metro/Metro");
    String _name_1 = t.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Pane.fxml\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Map<String, Region> paneMap = new HashMap<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ObservableList<String> navigationItems = FXCollections.observableArrayList();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private FilteredList<String> filteredNavigationItem = new FilteredList<>(navigationItems);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Metro");
    String _name_2 = t.getName();
    _builder.append(_name_2, "\t");
    _builder.append("Pane() {");
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
    _builder.append("navigationItems.addAll(paneMap.keySet());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("listViewNavigation.setItems(filteredNavigationItem);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("textSearchField.textProperty().addListener(this::onNavigationItemSearch);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addNavigationItem(String name, Region pane) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("paneMap.put(name, pane);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("navigationItems.add(name);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void onNavigationItemSearch(ObservableValue<? extends String> observable, String oldValue, String newValue) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("filteredNavigationItem.setPredicate(p->{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("boolean isEmpty = newValue==null || newValue.isEmpty();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("boolean containsItem = p.toLowerCase().contains(newValue.toLowerCase());");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return isEmpty || containsItem;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private void onMouseClicked(MouseEvent event) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String selection = listViewNavigation.getSelectionModel().getSelectedItem();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (selection!=null && paneMap.get(selection)!=null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("paneMap.get(selection).toFront();");
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
