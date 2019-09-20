package de.dc.entity.lang.generator.template;

import com.google.common.base.Objects;
import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import de.dc.entity.model.Field;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ModelFXTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("FX");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".model;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.beans.binding.BooleanBinding;");
    _builder.newLine();
    _builder.append("import javafx.beans.property.*;");
    _builder.newLine();
    _builder.append("import javafx.collections.FXCollections;");
    _builder.newLine();
    _builder.append("import javafx.collections.ObservableList;");
    _builder.newLine();
    _builder.append("import javafx.collections.transformation.FilteredList;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Field> _field = t.getField();
      for(final Field field : _field) {
        {
          boolean _isUseByRepository = field.isUseByRepository();
          if (_isUseByRepository) {
            _builder.append("import ");
            String _qualifiedName = field.getDatatype().getQualifiedName();
            _builder.append(_qualifiedName);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    final String name = StringExtensions.toFirstUpper(t.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("FX {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("private ");
    _builder.append(name, "  ");
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower, "  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("private ObjectProperty<");
    _builder.append(name, "  ");
    _builder.append("> ");
    String _firstLower_1 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_1, "  ");
    _builder.append("Property = new SimpleObjectProperty<>();");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("private ObservableList<");
    _builder.append(name, "  ");
    _builder.append("> masterData = FXCollections.observableArrayList();");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("private FilteredList<");
    _builder.append(name, "  ");
    _builder.append("> filteredMasterData = new FilteredList<>(masterData, p-> true);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("private LongProperty idProperty = new SimpleLongProperty();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("private BooleanProperty enableSubmitProperty = new SimpleBooleanProperty(false);");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// UI configurations");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("private BooleanProperty showSearchPanelMenu = new SimpleBooleanProperty(");
    boolean _isShowSearchPanel = t.isShowSearchPanel();
    _builder.append(_isShowSearchPanel, "  ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("private BooleanProperty showDetailsPanelMenu = new SimpleBooleanProperty(");
    boolean _isShowDetailsPanel = t.isShowDetailsPanel();
    _builder.append(_isShowDetailsPanel, "  ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Field> _field_1 = t.getField();
      for(final Field field_1 : _field_1) {
        {
          boolean _isUseByRepository_1 = field_1.isUseByRepository();
          if (_isUseByRepository_1) {
            _builder.append("  ");
            _builder.append("private ");
            String _declaredProperty = this.getDeclaredProperty(field_1);
            _builder.append(_declaredProperty, "  ");
            _builder.append(" ");
            String _firstLower_2 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_2, "  ");
            _builder.append("Property = new ");
            String _instanceProperty = this.getInstanceProperty(field_1);
            _builder.append(_instanceProperty, "  ");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _contains = field_1.getDatatype().getQualifiedName().contains("java.util.List");
            if (_contains) {
              _builder.append("  ");
              _builder.append("private ");
              String _replace = field_1.getDatatype().getQualifiedName().replace("java.util.List", "ListProperty");
              _builder.append(_replace, "  ");
              _builder.append(" ");
              String _firstLower_3 = StringExtensions.toFirstLower(field_1.getName());
              _builder.append(_firstLower_3, "  ");
              _builder.append("Property = new SimpleListProperty<>();");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public ");
    _builder.append(name, "  ");
    _builder.append("FX() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("this(new ");
    _builder.append(name, "    ");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public ");
    _builder.append(name, "  ");
    _builder.append("FX(");
    _builder.append(name, "  ");
    _builder.append(" ");
    String _firstLower_4 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_4, "  ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("this.");
    String _firstLower_5 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_5, "    ");
    _builder.append("=");
    String _firstLower_6 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_6, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("this.");
    String _firstLower_7 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_7, "    ");
    _builder.append("Property.set(");
    String _firstLower_8 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_8, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.");
    String _firstLower_9 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_9, "\t");
    _builder.append("Property.addListener((observable, oldValue, newValue) -> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (newValue!=null) {");
    _builder.newLine();
    {
      EList<Field> _field_2 = t.getField();
      for(final Field field_2 : _field_2) {
        {
          boolean _contains_1 = field_2.getDatatype().getQualifiedName().contains("java.util.List");
          if (_contains_1) {
            _builder.append("\t\t\t");
            String _firstLower_10 = StringExtensions.toFirstLower(field_2.getName());
            _builder.append(_firstLower_10, "\t\t\t");
            _builder.append("Property.set(FXCollections.observableArrayList(newValue.get");
            String _firstUpper = StringExtensions.toFirstUpper(field_2.getName());
            _builder.append(_firstUpper, "\t\t\t");
            _builder.append("()));");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t\t");
            String _firstLower_11 = StringExtensions.toFirstLower(field_2.getName());
            _builder.append(_firstLower_11, "\t\t\t");
            _builder.append("Property.set(newValue.get");
            String _firstUpper_1 = StringExtensions.toFirstUpper(field_2.getName());
            _builder.append(_firstUpper_1, "\t\t\t");
            _builder.append("());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    final Function1<Field, Boolean> _function = (Field it) -> {
      return Boolean.valueOf(it.isUseByRepository());
    };
    final Function1<Field, Boolean> _function_1 = (Field it) -> {
      String _simpleName = it.getDatatype().getSimpleName();
      return Boolean.valueOf(Objects.equal(_simpleName, "String"));
    };
    final Iterable<Field> filteredFields = IterableExtensions.<Field>filter(IterableExtensions.<Field>filter(t.getField(), _function), _function_1);
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    final Function1<Field, String> _function_2 = (Field it) -> {
      String _firstLower_12 = StringExtensions.toFirstLower(it.getName());
      return (_firstLower_12 + "Property.isNotEmpty()");
    };
    final Function2<String, String, String> _function_3 = (String p1, String p2) -> {
      return (((p1 + ".and(") + p2) + ")");
    };
    final String fields = IterableExtensions.<String>reduce(IterableExtensions.<Field, String>map(filteredFields, _function_2), _function_3);
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = IterableExtensions.isEmpty(filteredFields);
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("    ");
        _builder.append("BooleanBinding isEnabled = ");
        _builder.append(fields, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("this.enableSubmitProperty.bind(isEnabled);");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public ObjectProperty<");
    _builder.append(name, "  ");
    _builder.append("> get");
    _builder.append(name, "  ");
    _builder.append("Property() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("return ");
    String _firstLower_12 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_12, "    ");
    _builder.append("Property;");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public BooleanProperty getEnabledSubmitProperty() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return enableSubmitProperty;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public ObservableList<");
    _builder.append(name, "  ");
    _builder.append(">  getMasterData(){");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t");
    _builder.append("return masterData;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public FilteredList<");
    _builder.append(name, "  ");
    _builder.append("> getFilteredMasterData(){");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t");
    _builder.append("return filteredMasterData;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public ");
    _builder.append(name, "  ");
    _builder.append(" get");
    _builder.append(name, "  ");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t");
    _builder.append("this.");
    String _firstLower_13 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_13, "  \t");
    _builder.append(" = new ");
    String _firstUpper_2 = StringExtensions.toFirstUpper(name);
    _builder.append(_firstUpper_2, "  \t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    {
      EList<Field> _field_3 = t.getField();
      for(final Field field_3 : _field_3) {
        {
          if ((field_3.isUseByRepository() || field_3.getDatatype().getQualifiedName().contains("java.util.List"))) {
            _builder.append("  \t");
            _builder.append("this.");
            String _firstLower_14 = StringExtensions.toFirstLower(name);
            _builder.append(_firstLower_14, "  \t");
            _builder.append(".set");
            String _firstUpper_3 = StringExtensions.toFirstUpper(field_3.getName());
            _builder.append(_firstUpper_3, "  \t");
            _builder.append("(");
            String _firstLower_15 = StringExtensions.toFirstLower(field_3.getName());
            _builder.append(_firstLower_15, "  \t");
            _builder.append("Property.getValue());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("return this.");
    String _firstLower_16 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_16, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public LongProperty getIdProperty(){");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("return idProperty;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public void setIdProperty(LongProperty idProperty){");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("this.idProperty = idProperty;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    {
      EList<Field> _field_4 = t.getField();
      for(final Field field_4 : _field_4) {
        {
          if ((field_4.isUseByRepository() || field_4.getDatatype().getQualifiedName().contains("java.util.List"))) {
            _builder.append("  ");
            _builder.append("public ");
            String _declaredProperty_1 = this.getDeclaredProperty(field_4);
            _builder.append(_declaredProperty_1, "  ");
            _builder.append(" get");
            String _firstUpper_4 = StringExtensions.toFirstUpper(field_4.getName());
            _builder.append(_firstUpper_4, "  ");
            _builder.append("Property() {");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("  ");
            _builder.append("return this.");
            String _firstLower_17 = StringExtensions.toFirstLower(field_4.getName());
            _builder.append(_firstLower_17, "    ");
            _builder.append("Property;");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("  ");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("public void set");
            String _firstUpper_5 = StringExtensions.toFirstUpper(field_4.getName());
            _builder.append(_firstUpper_5, "  ");
            _builder.append("Property(");
            String _declaredProperty_2 = this.getDeclaredProperty(field_4);
            _builder.append(_declaredProperty_2, "  ");
            _builder.append(" ");
            String _firstLower_18 = StringExtensions.toFirstLower(field_4.getName());
            _builder.append(_firstLower_18, "  ");
            _builder.append("Property) {");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("  ");
            _builder.append("this.");
            String _firstLower_19 = StringExtensions.toFirstLower(field_4.getName());
            _builder.append(_firstLower_19, "    ");
            _builder.append("Property = ");
            String _firstLower_20 = StringExtensions.toFirstLower(field_4.getName());
            _builder.append(_firstLower_20, "    ");
            _builder.append("Property;");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public BooleanProperty getShowSearchPanelMenu() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return showSearchPanelMenu;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public void setShowSearchPanelMenu(BooleanProperty showSearchPanelMenu) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.showSearchPanelMenu = showSearchPanelMenu;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public BooleanProperty getShowDetailsPanelMenu() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return showDetailsPanelMenu;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public void setShowDetailsPanelMenu(BooleanProperty showDetailsPanelMenu) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.showDetailsPanelMenu = showDetailsPanelMenu;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public void clear() {");
    _builder.newLine();
    {
      EList<Field> _field_5 = t.getField();
      for(final Field field_5 : _field_5) {
        {
          boolean _isUseByRepository_2 = field_5.isUseByRepository();
          if (_isUseByRepository_2) {
            _builder.append("  \t  ");
            _builder.append("this.");
            String _firstLower_21 = StringExtensions.toFirstLower(field_5.getName());
            _builder.append(_firstLower_21, "  \t  ");
            _builder.append("Property.set(");
            String _resetPropertyValue = this.getResetPropertyValue(field_5);
            _builder.append(_resetPropertyValue, "  \t  ");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return  org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(get");
    _builder.append(name, "    ");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String getResetPropertyValue(final Field field) {
    String _simpleName = field.getDatatype().getSimpleName();
    if (_simpleName != null) {
      switch (_simpleName) {
        case "String":
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\"\"");
          return _builder.toString();
        case "Integer":
          return "0";
        case "int":
          return "0";
        case "Float":
          return "0f";
        case "float":
          return "0f";
        case "Double":
          return "0d";
        case "double":
          return "0d";
        case "Long":
          return "0l";
        case "long":
          return "0l";
        case "List":
          return "ObservableList";
        case "LocalDate":
          return "java.time.LocalDate.now()";
        case "LocalDateTime":
          return "java.time.LocalDateTime.now()";
        default:
          return "Property";
      }
    } else {
      return "Property";
    }
  }
  
  public String getDeclaredProperty(final Field field) {
    boolean _contains = field.getDatatype().getQualifiedName().contains("java.util.List");
    if (_contains) {
      return field.getDatatype().getQualifiedName().replace("java.util.List", "ListProperty");
    }
    String _simpleName = field.getDatatype().getSimpleName();
    if (_simpleName != null) {
      switch (_simpleName) {
        case "String":
          return "StringProperty";
        case "Integer":
          return "IntegerProperty";
        case "int":
          return "IntegerProperty";
        case "Float":
          return "FloatProperty";
        case "float":
          return "FloatProperty";
        case "Double":
          return "DoubleProperty";
        case "double":
          return "DoubleProperty";
        case "Long":
          return "LongProperty";
        case "long":
          return "LongProperty";
        case "List":
          return "ObservableList";
        case "LocalDate":
          return "ObjectProperty<java.time.LocalDate>";
        case "LocalDateTime":
          return "ObjectProperty<java.time.LocalDateTime>";
        default:
          return "Property";
      }
    } else {
      return "Property";
    }
  }
  
  public String getInstanceProperty(final Field field) {
    boolean _contains = field.getDatatype().getQualifiedName().contains("java.util.List");
    if (_contains) {
      return "SimpleListProperty<>";
    }
    String _simpleName = field.getDatatype().getSimpleName();
    if (_simpleName != null) {
      switch (_simpleName) {
        case "String":
          return "SimpleStringProperty";
        case "Integer":
          return "SimpleIntegerProperty";
        case "int":
          return "SimpleIntegerProperty";
        case "Float":
          return "SimpleFloatProperty";
        case "float":
          return "SimpleFloatProperty";
        case "Double":
          return "SimpleDoubleProperty";
        case "double":
          return "SimpleDoubleProperty";
        case "Long":
          return "SimpleLongProperty";
        case "long":
          return "SimpleLongProperty";
        case "List":
          return "FXCollections.observableArrayList";
        case "LocalDate":
          return "SimpleObjectProperty<>";
        case "LocalDateTime":
          return "SimpleObjectProperty<>";
        default:
          return "Property";
      }
    } else {
      return "Property";
    }
  }
}
