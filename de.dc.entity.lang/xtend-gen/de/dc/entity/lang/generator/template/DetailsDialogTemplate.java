package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class DetailsDialogTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Dialog");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".dialog;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.google.inject.Inject;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.geometry.Insets;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.GridPane;");
    _builder.newLine();
    _builder.append("import javafx.util.Pair;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Dialog extends Dialog<Pair<String, String>>{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = t.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Dialog(");
    String _name_2 = t.getName();
    _builder.append(_name_2, "\t");
    _builder.append("FX context) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("setTitle(\"");
    String _name_3 = t.getName();
    _builder.append(_name_3, "\t\t");
    _builder.append(" Dialog\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("GridPane grid = new GridPane();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("grid.setHgap(10);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("grid.setVgap(10);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("grid.setPadding(new Insets(20, 150, 10, 10));");
    _builder.newLine();
    _builder.newLine();
    {
      int _size = t.getField().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      boolean _hasElements = false;
      for(final Integer i : _upTo) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "\t\t");
        }
        _builder.append("\t\t");
        _builder.append("grid.add(new Label(\"");
        String _name_4 = t.getField().get((i).intValue()).getName();
        _builder.append(_name_4, "\t\t");
        _builder.append(":\"), 0, ");
        _builder.append(i, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("TextField ");
        String _lowerCase = t.getField().get((i).intValue()).getName().toLowerCase();
        _builder.append(_lowerCase, "\t\t");
        _builder.append("Text = new TextField();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        String _lowerCase_1 = t.getField().get((i).intValue()).getName().toLowerCase();
        _builder.append(_lowerCase_1, "\t\t");
        _builder.append("Text.setText(String.valueOf(context.get");
        String _name_5 = t.getField().get((i).intValue()).getName();
        _builder.append(_name_5, "\t\t");
        _builder.append("Property().get()));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("grid.add(");
        String _lowerCase_2 = t.getField().get((i).intValue()).getName().toLowerCase();
        _builder.append(_lowerCase_2, "\t\t");
        _builder.append("Text, 1, ");
        _builder.append(i, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("getDialogPane().setContent(grid);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
