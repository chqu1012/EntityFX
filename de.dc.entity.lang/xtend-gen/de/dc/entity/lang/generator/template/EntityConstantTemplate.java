package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import de.dc.entity.model.Field;
import de.dc.entity.model.Repository;
import de.dc.entity.model.SQLStatement;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntityConstantTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Constant");
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
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper);
    _builder.append("Constant {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    final Function1<String, String> _function = (String it) -> {
      return it.toUpperCase();
    };
    final Function2<String, String, String> _function_1 = (String p1, String p2) -> {
      return ((p1 + "_") + p2);
    };
    final String name = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(EntityConstantTemplate.splitCamelCaseString(t.getName()))), _function), _function_1);
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("public static final String SQL_FIND_ALL = \"SELECT * FROM ");
    _builder.append(name, "  ");
    _builder.append(" ORDER BY ID DESC\";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public static final String SQL_FIND_BY_ID = \"SELECT * FROM ");
    _builder.append(name, "  ");
    _builder.append(" WHERE ID = %s\";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    final Function1<Field, Boolean> _function_2 = (Field it) -> {
      return Boolean.valueOf(it.isUseByRepository());
    };
    final Function1<Field, String> _function_3 = (Field it) -> {
      final Function1<String, String> _function_4 = (String it_1) -> {
        return it_1;
      };
      final Function2<String, String, String> _function_5 = (String p1, String p2) -> {
        return ((p1 + "_") + p2);
      };
      return IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(EntityConstantTemplate.splitCamelCaseString(it.getName()))), _function_4), _function_5).toUpperCase();
    };
    final Function2<String, String, String> _function_4 = (String p1, String p2) -> {
      return ((p1 + ", ") + p2);
    };
    final String parameters = IterableExtensions.<String>reduce(IterableExtensions.<Field, String>map(IterableExtensions.<Field>filter(t.getField(), _function_2), _function_3), _function_4);
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    final Function1<Field, Boolean> _function_5 = (Field it) -> {
      return Boolean.valueOf(it.isUseByRepository());
    };
    final Function1<Field, String> _function_6 = (Field it) -> {
      return "?";
    };
    final Function2<String, String, String> _function_7 = (String p1, String p2) -> {
      return ((p1 + ", ") + p2);
    };
    final String marks = IterableExtensions.<String>reduce(IterableExtensions.<Field, String>map(IterableExtensions.<Field>filter(t.getField(), _function_5), _function_6), _function_7);
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("public static final String SQL_INSERT = \"INSERT INTO ");
    _builder.append(name, "  ");
    _builder.append(" (");
    _builder.append(parameters, "  ");
    _builder.append(") VALUES (");
    _builder.append(marks, "  ");
    _builder.append(")\";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public static final String SQL_MERGE = \"MERGE INTO ");
    _builder.append(name, "  ");
    _builder.append(" KEY (ID) VALUES (");
    _builder.append(marks, "  ");
    _builder.append(", ?)\";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public static final String SQL_DELETE_BY_ID = \"DELETE ");
    _builder.append(name, "  ");
    _builder.append(" WHERE ID = ?\";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    final Function1<Field, Boolean> _function_8 = (Field it) -> {
      return Boolean.valueOf(it.isUseByRepository());
    };
    final Function1<Field, String> _function_9 = (Field it) -> {
      final Function1<String, String> _function_10 = (String it_1) -> {
        return it_1;
      };
      final Function2<String, String, String> _function_11 = (String p1, String p2) -> {
        return ((p1 + "_") + p2);
      };
      String _upperCase = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(EntityConstantTemplate.splitCamelCaseString(it.getName()))), _function_10), _function_11).toUpperCase();
      String _plus = (_upperCase + " ");
      String _sqlValue = EntityConstantTemplate.getSqlValue(it.getDatatype());
      return (_plus + _sqlValue);
    };
    final Function2<String, String, String> _function_10 = (String p1, String p2) -> {
      return ((p1 + ", ") + p2);
    };
    final String createParameters = IterableExtensions.<String>reduce(IterableExtensions.<Field, String>map(IterableExtensions.<Field>filter(t.getField(), _function_8), _function_9), _function_10);
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("public static final String SQL_CREATE = \"CREATE TABLE IF NOT EXISTS ");
    _builder.append(name, "  ");
    _builder.append("(ID BIGINT AUTO_INCREMENT, ");
    _builder.append(createParameters, "  ");
    _builder.append(");\";");
    _builder.newLineIfNotEmpty();
    {
      Repository _repository = t.getRepository();
      boolean _tripleNotEquals = (_repository != null);
      if (_tripleNotEquals) {
        {
          EList<SQLStatement> _statement = t.getRepository().getStatement();
          for(final SQLStatement statements : _statement) {
            _builder.append("  ");
            _builder.append("public static final String SQL_");
            final Function1<String, String> _function_11 = (String it) -> {
              return it.toUpperCase();
            };
            final Function2<String, String, String> _function_12 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            String _reduce = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(EntityConstantTemplate.splitCamelCaseString(statements.getName()))), _function_11), _function_12);
            _builder.append(_reduce, "  ");
            _builder.append(" = \"");
            String _query = statements.getQuery();
            _builder.append(_query, "  ");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getSqlValue(final JvmTypeReference reference) {
    String _simpleName = reference.getSimpleName();
    if (_simpleName != null) {
      switch (_simpleName) {
        case "String":
          return "VARCHAR";
        case "Integer":
          return "BIGINT";
        case "int":
          return "BIGINT";
        case "LocalDateTime":
          return "TIMESTAMP";
        case "LocalDate":
          return "TIMESTAMP";
        case "Boolean":
          return "BOOLEAN";
        case "bool":
          return "BOOLEAN";
        case "Float":
          return "FLOAT";
        case "float":
          return "FLOAT";
        case "Double":
          return "Double";
        case "double":
          return "Double";
        default:
          return "VARCHAR";
      }
    } else {
      return "VARCHAR";
    }
  }
  
  public static String[] splitCamelCaseString(final String s) {
    return s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");
  }
}
