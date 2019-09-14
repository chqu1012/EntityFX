package de.dc.entity.lang.generator.template.spring;

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
public class SpringModelTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = t.getName();
    _builder.append(_name);
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
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import java.time.*;");
    _builder.newLine();
    _builder.append("import org.apache.commons.lang.builder.ToStringBuilder;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.persistence.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("public class ");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Column(name = \"ID\", nullable = false, columnDefinition = \"BIGINT\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Long id;");
    _builder.newLine();
    {
      EList<Field> _field = t.getField();
      for(final Field field : _field) {
        {
          boolean _isUseByRepository = field.isUseByRepository();
          if (_isUseByRepository) {
            _builder.append("\t");
            _builder.append("@Column(nullable = ");
            boolean _isRequired = field.isRequired();
            _builder.append(_isRequired, "\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("private ");
            String _simpleName = field.getDatatype().getSimpleName();
            _builder.append(_simpleName, "\t");
            _builder.append(" ");
            String _firstLower = StringExtensions.toFirstLower(field.getName());
            _builder.append(_firstLower, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            boolean _contains = field.getDatatype().getQualifiedName().contains("java.util.List");
            if (_contains) {
              _builder.append("\t");
              _builder.append("private ");
              String _qualifiedName = field.getDatatype().getQualifiedName();
              _builder.append(_qualifiedName, "\t");
              _builder.append(" ");
              String _firstLower_1 = StringExtensions.toFirstLower(field.getName());
              _builder.append(_firstLower_1, "\t");
              _builder.append(" = new java.util.ArrayList<>();");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = t.getName();
    _builder.append(_name_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    final Function1<Field, Boolean> _function = (Field it) -> {
      return Boolean.valueOf((it.isUseByRepository() && it.isRequired()));
    };
    final Function1<Field, String> _function_1 = (Field it) -> {
      String _simpleName_1 = it.getDatatype().getSimpleName();
      String _plus = (_simpleName_1 + " ");
      String _firstLower_2 = StringExtensions.toFirstLower(it.getName());
      return (_plus + _firstLower_2);
    };
    final Function2<String, String, String> _function_2 = (String p1, String p2) -> {
      return ((p1 + ", ") + p2);
    };
    final String param1 = IterableExtensions.<String>reduce(IterableExtensions.<Field, String>map(IterableExtensions.<Field>filter(t.getField(), _function), _function_1), _function_2);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = t.getName();
    _builder.append(_name_2, "\t");
    _builder.append("(");
    _builder.append(param1, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<Field> _field_1 = t.getField();
      for(final Field field_1 : _field_1) {
        {
          boolean _isUseByRepository_1 = field_1.isUseByRepository();
          if (_isUseByRepository_1) {
            _builder.append("\t\t");
            _builder.append("this.");
            String _firstLower_2 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_2, "\t\t");
            _builder.append(" = ");
            String _firstLower_3 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_3, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Long getId(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return id;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setId(Long id){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.id=id;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<Field> _field_2 = t.getField();
      for(final Field field_2 : _field_2) {
        {
          boolean _isUseByRepository_2 = field_2.isUseByRepository();
          if (_isUseByRepository_2) {
            _builder.append("\t");
            _builder.append("public ");
            String _simpleName_1 = field_2.getDatatype().getSimpleName();
            _builder.append(_simpleName_1, "\t");
            _builder.append(" get");
            String _firstUpper = StringExtensions.toFirstUpper(field_2.getName());
            _builder.append(_firstUpper, "\t");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return ");
            String _firstLower_4 = StringExtensions.toFirstLower(field_2.getName());
            _builder.append(_firstLower_4, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public void set");
            String _firstUpper_1 = StringExtensions.toFirstUpper(field_2.getName());
            _builder.append(_firstUpper_1, "\t");
            _builder.append("(");
            String _simpleName_2 = field_2.getDatatype().getSimpleName();
            _builder.append(_simpleName_2, "\t");
            _builder.append(" ");
            String _firstLower_5 = StringExtensions.toFirstLower(field_2.getName());
            _builder.append(_firstLower_5, "\t");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            String _firstLower_6 = StringExtensions.toFirstLower(field_2.getName());
            _builder.append(_firstLower_6, "\t\t");
            _builder.append(" = ");
            String _firstLower_7 = StringExtensions.toFirstLower(field_2.getName());
            _builder.append(_firstLower_7, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            boolean _contains_1 = field_2.getDatatype().getQualifiedName().contains("java.util.List");
            if (_contains_1) {
              _builder.append("\t");
              _builder.append("public ");
              String _qualifiedName_1 = field_2.getDatatype().getQualifiedName();
              _builder.append(_qualifiedName_1, "\t");
              _builder.append(" get");
              String _firstUpper_2 = StringExtensions.toFirstUpper(field_2.getName());
              _builder.append(_firstUpper_2, "\t");
              _builder.append("() {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("return ");
              String _firstLower_8 = StringExtensions.toFirstLower(field_2.getName());
              _builder.append(_firstLower_8, "\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
              _builder.newLine();
              _builder.append("\t");
              _builder.append("public void set");
              String _firstUpper_3 = StringExtensions.toFirstUpper(field_2.getName());
              _builder.append(_firstUpper_3, "\t");
              _builder.append("(");
              String _qualifiedName_2 = field_2.getDatatype().getQualifiedName();
              _builder.append(_qualifiedName_2, "\t");
              _builder.append(" ");
              String _firstLower_9 = StringExtensions.toFirstLower(field_2.getName());
              _builder.append(_firstLower_9, "\t");
              _builder.append(") {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("this.");
              String _firstLower_10 = StringExtensions.toFirstLower(field_2.getName());
              _builder.append(_firstLower_10, "\t\t");
              _builder.append("=");
              String _firstLower_11 = StringExtensions.toFirstLower(field_2.getName());
              _builder.append(_firstLower_11, "\t\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ToStringBuilder.reflectionToString(this);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
