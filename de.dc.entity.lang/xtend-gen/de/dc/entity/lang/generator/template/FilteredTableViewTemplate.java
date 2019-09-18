package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import de.dc.entity.model.Field;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class FilteredTableViewTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    String _plus = ("Filtered" + _firstUpper);
    return (_plus + "TableView");
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".control;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.google.inject.Inject;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javafx.scene.input.MouseEvent;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.Dialog;");
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_2 = t.getPackagePath();
    _builder.append(_packagePath_2);
    _builder.append(".repository.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.beans.value.ChangeListener;");
    _builder.newLine();
    _builder.append("import javafx.beans.value.ObservableValue;");
    _builder.newLine();
    _builder.append("import javafx.geometry.Insets;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.TextField;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.Priority;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.VBox;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.ButtonType;");
    _builder.newLine();
    _builder.append("import javafx.util.Pair;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.Label;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.GridPane;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Filtered");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("TableView extends VBox{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private TextField textSearch = new TextField();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _name_1 = t.getName();
    _builder.append(_name_1, "\t");
    _builder.append("FX context;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ");
    String _name_2 = t.getName();
    _builder.append(_name_2, "\t");
    _builder.append("TableView tableView;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Filtered");
    String _name_3 = t.getName();
    _builder.append(_name_3, "\t");
    _builder.append("TableView(");
    String _name_4 = t.getName();
    _builder.append(_name_4, "\t");
    _builder.append("FX context, ");
    String _name_5 = t.getName();
    _builder.append(_name_5, "\t");
    _builder.append("TableView tableView) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.context = context;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.tableView = tableView;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setSpacing(10d);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("getChildren().add(textSearch);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("VBox.setVgrow(tableView, Priority.ALWAYS);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("getChildren().add(tableView);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("textSearch.setPromptText(\"Search...\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("textSearch.textProperty().addListener(this::onSearchTextChanged);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setPadding(new Insets(10d));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("tableView.getSelectionModel().selectedItemProperty().addListener(this::onTableSelectionChanged);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("tableView.setOnMouseClicked(this::openDialog);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void openDialog(MouseEvent e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (e.getClickCount()==2) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _name_6 = t.getName();
    _builder.append(_name_6, "\t\t\t");
    _builder.append(" selection = tableView.getSelectionModel().getSelectedItem();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("if (selection!=null) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Dialog<Pair<String, String>> dialog = new Dialog<>();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("dialog.setTitle(\"");
    String _name_7 = t.getName();
    _builder.append(_name_7, "\t\t\t\t");
    _builder.append(" Dialog\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("GridPane grid = new GridPane();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("grid.setHgap(10);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("grid.setVgap(10);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("grid.setPadding(new Insets(20, 150, 10, 10));");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      int _size = t.getField().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer i : _upTo) {
        _builder.append("\t\t\t\t");
        _builder.append("grid.add(new Label(\"");
        String _name_8 = t.getField().get((i).intValue()).getName();
        _builder.append(_name_8, "\t\t\t\t");
        _builder.append(":\"), 0, ");
        _builder.append(i, "\t\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("TextField ");
        String _lowerCase = t.getField().get((i).intValue()).getName().toLowerCase();
        _builder.append(_lowerCase, "\t\t\t\t");
        _builder.append("Text = new TextField();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        String _lowerCase_1 = t.getField().get((i).intValue()).getName().toLowerCase();
        _builder.append(_lowerCase_1, "\t\t\t\t");
        _builder.append("Text.setText(String.valueOf(context.get");
        String _name_9 = t.getField().get((i).intValue()).getName();
        _builder.append(_name_9, "\t\t\t\t");
        _builder.append("Property().get()));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("grid.add(");
        String _lowerCase_2 = t.getField().get((i).intValue()).getName().toLowerCase();
        _builder.append(_lowerCase_2, "\t\t\t\t");
        _builder.append("Text, 1, ");
        _builder.append(i, "\t\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t");
    _builder.append("dialog.getDialogPane().setContent(grid);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("dialog.showAndWait();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void onTableSelectionChanged(ObservableValue<? extends ");
    String _name_10 = t.getName();
    _builder.append(_name_10, "\t");
    _builder.append("> observable, ");
    String _name_11 = t.getName();
    _builder.append(_name_11, "\t");
    _builder.append(" oldValue, ");
    String _name_12 = t.getName();
    _builder.append(_name_12, "\t");
    _builder.append(" newValue) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (newValue!=null) {");
    _builder.newLine();
    {
      EList<Field> _field = t.getField();
      for(final Field field : _field) {
        _builder.append("\t\t\t");
        _builder.append("context.get");
        String _name_13 = field.getName();
        _builder.append(_name_13, "\t\t\t");
        _builder.append("Property().set(newValue.get");
        String _name_14 = field.getName();
        _builder.append(_name_14, "\t\t\t");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void onSearchTextChanged(ObservableValue<? extends String> observable, String oldValue, String newValue) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("context.getFilteredMasterData().setPredicate(p->{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("boolean isEmpty = newValue==null || newValue.isEmpty();");
    _builder.newLine();
    {
      EList<Field> _field_1 = t.getField();
      for(final Field field_1 : _field_1) {
        {
          boolean _isRequired = field_1.isRequired();
          if (_isRequired) {
            _builder.append("\t\t\t");
            _builder.append("boolean contains");
            String _name_15 = field_1.getName();
            _builder.append(_name_15, "\t\t\t");
            _builder.append(" = String.valueOf(p.get");
            String _name_16 = field_1.getName();
            _builder.append(_name_16, "\t\t\t");
            _builder.append("()).toLowerCase().contains(newValue.toLowerCase());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t\t");
    final Function1<Field, Boolean> _function = (Field it) -> {
      return Boolean.valueOf(it.isRequired());
    };
    final Function1<Field, String> _function_1 = (Field it) -> {
      String _name_17 = it.getName();
      return ("contains" + _name_17);
    };
    final Function2<String, String, String> _function_2 = (String p1, String p2) -> {
      return ((p1 + " || ") + p2);
    };
    final String contains = IterableExtensions.<String>reduce(IterableExtensions.<Field, String>map(IterableExtensions.<Field>filter(t.getField(), _function), _function_1), _function_2);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return isEmpty ");
    {
      final Function1<Field, Boolean> _function_3 = (Field it) -> {
        return Boolean.valueOf(it.isRequired());
      };
      int _size_1 = IterableExtensions.size(IterableExtensions.<Field>filter(t.getField(), _function_3));
      boolean _greaterThan = (_size_1 > 0);
      if (_greaterThan) {
        _builder.append("||");
      }
    }
    _builder.append(" ");
    _builder.append(contains, "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
