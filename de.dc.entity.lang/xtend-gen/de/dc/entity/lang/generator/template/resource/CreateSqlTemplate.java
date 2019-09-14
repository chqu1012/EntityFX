package de.dc.entity.lang.generator.template.resource;

import de.dc.entity.lang.generator.template.EntityConstantTemplate;
import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import de.dc.entity.model.Field;
import de.dc.entity.model.Repository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CreateSqlTemplate implements IGenerator<Entity> {
  private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy hh:mm");
  
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("create.sql");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<Field, Boolean> _function = (Field it) -> {
      return Boolean.valueOf(it.isUseByRepository());
    };
    final Function1<Field, String> _function_1 = (Field it) -> {
      final Function1<String, String> _function_2 = (String it_1) -> {
        return it_1;
      };
      final Function2<String, String, String> _function_3 = (String p1, String p2) -> {
        return ((p1 + "_") + p2);
      };
      String _upperCase = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(this.splitCamelCaseString(it.getName()))), _function_2), _function_3).toUpperCase();
      String _plus = (_upperCase + " ");
      String _value = this.getValue(it.getDatatype());
      return (_plus + _value);
    };
    final Function2<String, String, String> _function_2 = (String p1, String p2) -> {
      return ((p1 + ", ") + p2);
    };
    final String parametersWithDatatype = IterableExtensions.<String>reduce(IterableExtensions.<Field, String>map(IterableExtensions.<Field>filter(t.getField(), _function), _function_1), _function_2);
    _builder.newLineIfNotEmpty();
    final Function1<Field, Boolean> _function_3 = (Field it) -> {
      return Boolean.valueOf(it.isUseByRepository());
    };
    final Function1<Field, String> _function_4 = (Field it) -> {
      final Function1<String, String> _function_5 = (String it_1) -> {
        return it_1;
      };
      final Function2<String, String, String> _function_6 = (String p1, String p2) -> {
        return ((p1 + "_") + p2);
      };
      return IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(this.splitCamelCaseString(it.getName()))), _function_5), _function_6).toUpperCase();
    };
    final Function2<String, String, String> _function_5 = (String p1, String p2) -> {
      return ((p1 + ", ") + p2);
    };
    final String parameters = IterableExtensions.<String>reduce(IterableExtensions.<Field, String>map(IterableExtensions.<Field>filter(t.getField(), _function_3), _function_4), _function_5);
    _builder.newLineIfNotEmpty();
    _builder.append("CREATE TABLE IF NOT EXISTS ");
    final Function1<String, String> _function_6 = (String it) -> {
      return it;
    };
    final Function2<String, String, String> _function_7 = (String p1, String p2) -> {
      return ((p1 + "_") + p2);
    };
    String _upperCase = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(this.splitCamelCaseString(t.getName()))), _function_6), _function_7).toUpperCase();
    _builder.append(_upperCase);
    _builder.append("(ID BIGINT AUTO_INCREMENT, ");
    _builder.append(parametersWithDatatype);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      Repository _repository = t.getRepository();
      boolean _tripleNotEquals = (_repository != null);
      if (_tripleNotEquals) {
        {
          boolean _isGenerateDummyInsert = t.getRepository().isGenerateDummyInsert();
          if (_isGenerateDummyInsert) {
            {
              IntegerRange _upTo = new IntegerRange(1, 50);
              for(final Integer i : _upTo) {
                _builder.append("INSERT INTO ");
                String _upperCase_1 = t.getName().toUpperCase();
                _builder.append(_upperCase_1);
                _builder.append("(");
                _builder.append(parameters);
                _builder.append(") VALUES(");
                Object _parameterValues = this.getParameterValues(t);
                _builder.append(_parameterValues);
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public Object getParameterValues(final Entity t) {
    final Function1<Field, Boolean> _function = (Field it) -> {
      return Boolean.valueOf(it.isUseByRepository());
    };
    final Function1<Field, Object> _function_1 = (Field it) -> {
      return this.getRandomValue(it.getDatatype());
    };
    final Function2<Object, Object, Object> _function_2 = (Object p1, Object p2) -> {
      String _plus = (p1 + ", ");
      return (_plus + p2);
    };
    return IterableExtensions.<Object>reduce(IterableExtensions.<Field, Object>map(IterableExtensions.<Field>filter(t.getField(), _function), _function_1), _function_2);
  }
  
  private final Random random = new Random();
  
  public Object getRandomValue(final JvmTypeReference reference) {
    String _simpleName = reference.getSimpleName();
    if (_simpleName != null) {
      switch (_simpleName) {
        case "String":
          String _string = UUID.randomUUID().toString();
          String _plus = ("\'" + _string);
          return (_plus + "\'");
        case "Integer":
          return Integer.valueOf(this.random.nextInt(50));
        case "int":
          return Integer.valueOf(this.random.nextInt(50));
        case "LocalDateTime":
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("PARSEDATETIME(\'");
          String _randomeLocalDateTime = this.getRandomeLocalDateTime();
          _builder.append(_randomeLocalDateTime);
          _builder.append("\', \'ddMMyyyy hh:mm\')");
          return _builder.toString();
        case "LocalDate":
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("PARSEDATETIME(\'");
          String _randomeLocalDateTime_1 = this.getRandomeLocalDateTime();
          _builder_1.append(_randomeLocalDateTime_1);
          _builder_1.append("\', \'ddMMyyyy hh:mm\')");
          return _builder_1.toString();
        case "Boolean":
          return Boolean.valueOf(this.random.nextBoolean());
        case "bool":
          return Boolean.valueOf(this.random.nextBoolean());
        case "Float":
          int _nextInt = this.random.nextInt(50);
          return (Integer.valueOf(_nextInt) + "f");
        case "float":
          int _nextInt_1 = this.random.nextInt(50);
          return (Integer.valueOf(_nextInt_1) + "f");
        case "Double":
          int _nextInt_2 = this.random.nextInt(50);
          return (Integer.valueOf(_nextInt_2) + "d");
        case "double":
          int _nextInt_3 = this.random.nextInt(50);
          return (Integer.valueOf(_nextInt_3) + "d");
        case "Long":
          int _nextInt_4 = this.random.nextInt(50);
          return (Integer.valueOf(_nextInt_4) + "l");
        case "long":
          int _nextInt_5 = this.random.nextInt(50);
          return (Integer.valueOf(_nextInt_5) + "l");
        default:
          String _string_1 = UUID.randomUUID().toString();
          String _plus_1 = ("\'" + _string_1);
          return (_plus_1 + "\'");
      }
    } else {
      String _string_1 = UUID.randomUUID().toString();
      String _plus_1 = ("\'" + _string_1);
      return (_plus_1 + "\'");
    }
  }
  
  public String getRandomeLocalDateTime() {
    String _xblockexpression = null;
    {
      final LocalDateTime time = LocalDateTime.of(LocalDate.now(), 
        LocalTime.of(this.random.nextInt(24), this.random.nextInt(60), 
          this.random.nextInt(60), this.random.nextInt((999999999 + 1))));
      _xblockexpression = time.format(this.formatter);
    }
    return _xblockexpression;
  }
  
  public String getValue(final JvmTypeReference type) {
    return EntityConstantTemplate.getSqlValue(type);
  }
  
  public String[] splitCamelCaseString(final String s) {
    return EntityConstantTemplate.splitCamelCaseString(s);
  }
}
