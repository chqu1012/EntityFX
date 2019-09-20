package de.dc.entity.lang.generator.template;

import com.google.common.base.Objects;
import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Binding;
import de.dc.entity.model.Entity;
import de.dc.entity.model.FXControl;
import de.dc.entity.model.Field;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class FormularTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    return (_firstUpper + "Formular");
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
    _builder.append("import javafx.geometry.Insets;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.input.MouseEvent;");
    _builder.newLine();
    _builder.newLine();
    final String name = StringExtensions.toFirstUpper(t.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("Formular extends VBox{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    _builder.append(name, "\t");
    _builder.append("FX context;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ");
    _builder.append(name, "\t");
    _builder.append("Repository ");
    String _firstLower = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower, "\t");
    _builder.append("Repository;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(name, "\t");
    _builder.append("Formular(");
    _builder.append(name, "\t");
    _builder.append("FX context, ");
    _builder.append(name, "\t");
    _builder.append("Repository ");
    String _firstLower_1 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_1, "\t");
    _builder.append("Repository) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.context = context;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.");
    String _firstLower_2 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_2, "\t\t");
    _builder.append("Repository = ");
    String _firstLower_3 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_3, "\t\t");
    _builder.append("Repository;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setPadding(new Insets(10));");
    _builder.newLine();
    {
      EList<Field> _field = t.getField();
      for(final Field field : _field) {
        {
          FXControl _control = field.getControl();
          boolean _tripleNotEquals = (_control != null);
          if (_tripleNotEquals) {
            _builder.append("\t\t");
            final FXControl control = field.getControl();
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            StringConcatenation _builder_1 = new StringConcatenation();
            {
              String _name = control.getName();
              boolean _tripleNotEquals_1 = (_name != null);
              if (_tripleNotEquals_1) {
                String _name_1 = control.getName();
                _builder_1.append(_name_1);
              } else {
                String _name_2 = field.getName();
                _builder_1.append(_name_2);
              }
            }
            final String controlName = _builder_1.toString();
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("getChildren().add(new Label(\"");
            _builder.append(controlName, "\t\t");
            _builder.append(":\"));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            String _qualifiedName = control.getControl().getQualifiedName();
            _builder.append(_qualifiedName, "\t\t");
            _builder.append(" ");
            String _firstLower_4 = StringExtensions.toFirstLower(controlName);
            _builder.append(_firstLower_4, "\t\t");
            String _simpleName = control.getControl().getSimpleName();
            _builder.append(_simpleName, "\t\t");
            _builder.append(" = new ");
            String _qualifiedName_1 = control.getControl().getQualifiedName();
            _builder.append(_qualifiedName_1, "\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            String _firstLower_5 = StringExtensions.toFirstLower(controlName);
            _builder.append(_firstLower_5, "\t\t");
            String _simpleName_1 = control.getControl().getSimpleName();
            _builder.append(_simpleName_1, "\t\t");
            _builder.append(".setPromptText(\"Please enter a ");
            String _name_3 = field.getName();
            _builder.append(_name_3, "\t\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            {
              if (((control.getBinding() == null) || Objects.equal(control.getBinding(), Binding.TEXT_PROPERTY))) {
                _builder.append("\t\t");
                String _firstLower_6 = StringExtensions.toFirstLower(controlName);
                _builder.append(_firstLower_6, "\t\t");
                String _simpleName_2 = control.getControl().getSimpleName();
                _builder.append(_simpleName_2, "\t\t");
                _builder.append(".textProperty().bindBidirectional(context.get");
                String _name_4 = field.getName();
                _builder.append(_name_4, "\t\t");
                _builder.append("Property() ");
                String _format = this.getFormat(field);
                _builder.append(_format, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t\t");
                String _firstLower_7 = StringExtensions.toFirstLower(controlName);
                _builder.append(_firstLower_7, "\t\t");
                String _simpleName_3 = control.getControl().getSimpleName();
                _builder.append(_simpleName_3, "\t\t");
                _builder.append(".");
                String _string = control.getBinding().toString();
                _builder.append(_string, "\t\t");
                _builder.append("().bindBidirectional(context.get");
                String _name_5 = field.getName();
                _builder.append(_name_5, "\t\t");
                _builder.append("Property());");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("getChildren().add(");
            String _firstLower_8 = StringExtensions.toFirstLower(controlName);
            _builder.append(_firstLower_8, "\t\t");
            String _simpleName_4 = control.getControl().getSimpleName();
            _builder.append(_simpleName_4, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Button clearButton = new Button(\"Reset\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("clearButton.setOnMouseClicked(this::onButtonReset);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("clearButton.disableProperty().bind(context.getEnabledSubmitProperty().not());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Button submitButton = new Button(\"Submit\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("submitButton.setOnMouseClicked(this::onButtonSubmit);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("submitButton.disableProperty().bind(context.getEnabledSubmitProperty().not());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("HBox hbox = new HBox(5);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("hbox.getChildren().addAll(clearButton, submitButton);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("getChildren().addAll(hbox);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void onButtonReset(MouseEvent e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("context.clear();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void onButtonSubmit(MouseEvent e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("EventLog eventLog = context.getEventLog ();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("eventLogRepository.save(eventLog);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("context.getMasterData().add(eventLog);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("context.clear();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String getFormat(final Field field) {
    final String type = field.getDatatype().getSimpleName();
    boolean _equals = type.equals("LocalDateTime");
    if (_equals) {
      return ", java.text.DateFormat.getInstance()";
    } else {
      if ((type.equals("Long") || type.equals("long"))) {
        return ", java.text.NumberFormat.getInstance()";
      } else {
        if ((type.equals("Integer") || type.equals("int"))) {
          return ", java.text.NumberFormat.getInstance()";
        } else {
          if ((type.equals("Float") || type.equals("float"))) {
            return ", java.text.NumberFormat.getInstance()";
          }
        }
      }
    }
    return "";
  }
}
