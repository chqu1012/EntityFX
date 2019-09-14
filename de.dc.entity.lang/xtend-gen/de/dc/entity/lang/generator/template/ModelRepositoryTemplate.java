package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import de.dc.entity.model.Field;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ModelRepositoryTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    return (_firstUpper + "Repository");
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".repository;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.sql.*;");
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import java.time.*;");
    _builder.newLine();
    _builder.newLine();
    final String name = StringExtensions.toFirstUpper(t.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("Repository extends BaseRepository<");
    _builder.append(name);
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected ");
    _builder.append(name, "\t");
    _builder.append(" map(ResultSet resultSet) throws SQLException{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(name, "\t\t");
    _builder.append(" ");
    String _firstLower = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower, "\t\t");
    _builder.append(" = new ");
    _builder.append(name, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _firstLower_1 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_1, "\t\t");
    _builder.append(".setId(resultSet.getLong(\"ID\"));");
    _builder.newLineIfNotEmpty();
    {
      EList<Field> _field = t.getField();
      for(final Field field : _field) {
        {
          boolean _isUseByRepository = field.isUseByRepository();
          if (_isUseByRepository) {
            _builder.append("\t\t");
            String _firstLower_2 = StringExtensions.toFirstLower(name);
            _builder.append(_firstLower_2, "\t\t");
            _builder.append(".set");
            String _firstUpper = StringExtensions.toFirstUpper(field.getName());
            _builder.append(_firstUpper, "\t\t");
            _builder.append("(");
            String _value = this.getValue(field);
            _builder.append(_value, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("return ");
    String _firstLower_3 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_3, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Field> _field_1 = t.getField();
      for(final Field field_1 : _field_1) {
        {
          boolean _isUseByRepository_1 = field_1.isUseByRepository();
          if (_isUseByRepository_1) {
            _builder.append("\t");
            final Function1<String, String> _function = (String it) -> {
              return it;
            };
            final Function2<String, String, String> _function_1 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            final String columnName = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(field_1.getName()))), _function), _function_1).toUpperCase();
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("public void update");
            String _firstUpper_1 = StringExtensions.toFirstUpper(field_1.getName());
            _builder.append(_firstUpper_1, "\t");
            _builder.append("(long id, ");
            String _qualifiedName = field_1.getDatatype().getQualifiedName();
            _builder.append(_qualifiedName, "\t");
            _builder.append(" ");
            String _firstLower_4 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_4, "\t");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("queryExecute(\"UPDATE ");
            final Function1<String, String> _function_2 = (String it) -> {
              return it;
            };
            final Function2<String, String, String> _function_3 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            String _upperCase = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(name))), _function_2), _function_3).toUpperCase();
            _builder.append(_upperCase, "\t\t");
            _builder.append(" SET ");
            _builder.append(columnName, "\t\t");
            _builder.append(" =\'\"+");
            String _firstLower_5 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_5, "\t\t");
            _builder.append("+\"\' WHERE ID = \"+id);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public void deleteBy");
            String _firstUpper_2 = StringExtensions.toFirstUpper(field_1.getName());
            _builder.append(_firstUpper_2, "\t");
            _builder.append("(");
            String _qualifiedName_1 = field_1.getDatatype().getQualifiedName();
            _builder.append(_qualifiedName_1, "\t");
            _builder.append(" ");
            String _firstLower_6 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_6, "\t");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("queryExecute(\"DELETE ");
            final Function1<String, String> _function_4 = (String it) -> {
              return it;
            };
            final Function2<String, String, String> _function_5 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            String _upperCase_1 = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(name))), _function_4), _function_5).toUpperCase();
            _builder.append(_upperCase_1, "\t\t");
            _builder.append(" WHERE ");
            _builder.append(columnName, "\t\t");
            _builder.append(" = \'\"+");
            String _firstLower_7 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_7, "\t\t");
            _builder.append("+\"\'\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public List<");
            _builder.append(name, "\t");
            _builder.append("> findAllBy");
            String _firstUpper_3 = StringExtensions.toFirstUpper(field_1.getName());
            _builder.append(_firstUpper_3, "\t");
            _builder.append("(");
            String _simpleName = field_1.getDatatype().getSimpleName();
            _builder.append(_simpleName, "\t");
            _builder.append(" ");
            String _firstLower_8 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_8, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return query(String.format(\"SELECT * FROM ");
            final Function1<String, String> _function_6 = (String it) -> {
              return it;
            };
            final Function2<String, String, String> _function_7 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            String _upperCase_2 = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(name))), _function_6), _function_7).toUpperCase();
            _builder.append(_upperCase_2, "\t\t");
            _builder.append(" WHERE ");
            _builder.append(columnName, "\t\t");
            _builder.append(" = \'%s\'\", String.valueOf(");
            String _firstLower_9 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_9, "\t\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public List<");
            _builder.append(name, "\t");
            _builder.append("> findAllBy");
            String _firstUpper_4 = StringExtensions.toFirstUpper(field_1.getName());
            _builder.append(_firstUpper_4, "\t");
            _builder.append("OrderByAsc(");
            String _simpleName_1 = field_1.getDatatype().getSimpleName();
            _builder.append(_simpleName_1, "\t");
            _builder.append(" ");
            String _firstLower_10 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_10, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return query(String.format(\"SELECT * FROM ");
            final Function1<String, String> _function_8 = (String it) -> {
              return it;
            };
            final Function2<String, String, String> _function_9 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            String _upperCase_3 = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(name))), _function_8), _function_9).toUpperCase();
            _builder.append(_upperCase_3, "\t\t");
            _builder.append(" WHERE ");
            _builder.append(columnName, "\t\t");
            _builder.append(" = \'%s\' ORDER BY ");
            _builder.append(columnName, "\t\t");
            _builder.append(" ASC\", String.valueOf(");
            String _firstLower_11 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_11, "\t\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public List<");
            _builder.append(name, "\t");
            _builder.append("> findAllBy");
            String _firstUpper_5 = StringExtensions.toFirstUpper(field_1.getName());
            _builder.append(_firstUpper_5, "\t");
            _builder.append("OrderByDesc(");
            String _simpleName_2 = field_1.getDatatype().getSimpleName();
            _builder.append(_simpleName_2, "\t");
            _builder.append(" ");
            String _firstLower_12 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_12, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return query(String.format(\"SELECT * FROM ");
            final Function1<String, String> _function_10 = (String it) -> {
              return it;
            };
            final Function2<String, String, String> _function_11 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            String _upperCase_4 = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(name))), _function_10), _function_11).toUpperCase();
            _builder.append(_upperCase_4, "\t\t");
            _builder.append(" WHERE ");
            _builder.append(columnName, "\t\t");
            _builder.append(" = \'%s\' ORDER BY ");
            _builder.append(columnName, "\t\t");
            _builder.append(" DESC\", String.valueOf(");
            String _firstLower_13 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_13, "\t\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public List<");
            _builder.append(name, "\t");
            _builder.append("> findAllBy");
            String _firstUpper_6 = StringExtensions.toFirstUpper(field_1.getName());
            _builder.append(_firstUpper_6, "\t");
            _builder.append("Like(");
            String _simpleName_3 = field_1.getDatatype().getSimpleName();
            _builder.append(_simpleName_3, "\t");
            _builder.append(" ");
            String _firstLower_14 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_14, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return query(String.format(\"SELECT * FROM ");
            final Function1<String, String> _function_12 = (String it) -> {
              return it;
            };
            final Function2<String, String, String> _function_13 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            String _upperCase_5 = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(name))), _function_12), _function_13).toUpperCase();
            _builder.append(_upperCase_5, "\t\t");
            _builder.append(" WHERE ");
            _builder.append(columnName, "\t\t");
            _builder.append(" like \'%%s%\'\", String.valueOf(");
            String _firstLower_15 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_15, "\t\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public List<");
            _builder.append(name, "\t");
            _builder.append("> findAllBy");
            String _firstUpper_7 = StringExtensions.toFirstUpper(field_1.getName());
            _builder.append(_firstUpper_7, "\t");
            _builder.append("LikeOrderByAsc(");
            String _simpleName_4 = field_1.getDatatype().getSimpleName();
            _builder.append(_simpleName_4, "\t");
            _builder.append(" ");
            String _firstLower_16 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_16, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return query(String.format(\"SELECT * FROM ");
            final Function1<String, String> _function_14 = (String it) -> {
              return it;
            };
            final Function2<String, String, String> _function_15 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            String _upperCase_6 = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(name))), _function_14), _function_15).toUpperCase();
            _builder.append(_upperCase_6, "\t\t");
            _builder.append(" WHERE ");
            _builder.append(columnName, "\t\t");
            _builder.append(" like \'%%s%\' ORDER BY ");
            _builder.append(columnName, "\t\t");
            _builder.append(" ASC\", String.valueOf(");
            String _firstLower_17 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_17, "\t\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public List<");
            _builder.append(name, "\t");
            _builder.append("> findAllBy");
            String _firstUpper_8 = StringExtensions.toFirstUpper(field_1.getName());
            _builder.append(_firstUpper_8, "\t");
            _builder.append("LikeOrderByDesc(");
            String _simpleName_5 = field_1.getDatatype().getSimpleName();
            _builder.append(_simpleName_5, "\t");
            _builder.append(" ");
            String _firstLower_18 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_18, "\t");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return query(String.format(\"SELECT * FROM ");
            final Function1<String, String> _function_16 = (String it) -> {
              return it;
            };
            final Function2<String, String, String> _function_17 = (String p1, String p2) -> {
              return ((p1 + "_") + p2);
            };
            String _upperCase_7 = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(name))), _function_16), _function_17).toUpperCase();
            _builder.append(_upperCase_7, "\t\t");
            _builder.append(" WHERE ");
            _builder.append(columnName, "\t\t");
            _builder.append(" like \'%%s%\' ORDER BY ");
            _builder.append(columnName, "\t\t");
            _builder.append(" DESC\", String.valueOf(");
            String _firstLower_19 = StringExtensions.toFirstLower(field_1.getName());
            _builder.append(_firstLower_19, "\t\t");
            _builder.append(")));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String findAllStatement() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    String _firstUpper_9 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_9, "\t\t");
    _builder.append("Constant.SQL_FIND_ALL;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String findByIdStatement(long id) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return String.format(");
    String _firstUpper_10 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_10, "\t\t");
    _builder.append("Constant.SQL_FIND_BY_ID, id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String saveStatement() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    String _firstUpper_11 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_11, "\t\t");
    _builder.append("Constant.SQL_INSERT;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void prepareStatetmentForSave(");
    _builder.append(name, "\t");
    _builder.append(" t, PreparedStatement statement) throws SQLException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    int indexSave = 0;
    _builder.newLineIfNotEmpty();
    {
      int _size = t.getField().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer i : _upTo) {
        _builder.append("\t\t");
        final Field field_2 = t.getField().get((i).intValue());
        _builder.newLineIfNotEmpty();
        {
          boolean _isUseByRepository_2 = field_2.isUseByRepository();
          if (_isUseByRepository_2) {
            _builder.append("\t\t");
            _builder.append("statement.");
            String _preparedMethodName = this.getPreparedMethodName(indexSave = (indexSave + 1), field_2);
            _builder.append(_preparedMethodName, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String updateStatement() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    String _firstUpper_12 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_12, "\t\t");
    _builder.append("Constant.SQL_MERGE;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void prepareStatetmentForUpdate(");
    _builder.append(name, "\t");
    _builder.append(" t, PreparedStatement statement) throws SQLException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("statement.setLong(1, t.getId());");
    _builder.newLine();
    _builder.append("\t\t");
    int indexUpdate = 1;
    _builder.newLineIfNotEmpty();
    {
      int _size_1 = t.getField().size();
      int _minus_1 = (_size_1 - 1);
      IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
      for(final Integer i_1 : _upTo_1) {
        _builder.append("\t\t");
        final Field field_3 = t.getField().get((i_1).intValue());
        _builder.newLineIfNotEmpty();
        {
          boolean _isUseByRepository_3 = field_3.isUseByRepository();
          if (_isUseByRepository_3) {
            _builder.append("\t\t");
            _builder.append("statement.");
            String _preparedMethodName_1 = this.getPreparedMethodName(indexUpdate = (indexUpdate + 1), field_3);
            _builder.append(_preparedMethodName_1, "\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String deleteStatement() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    String _firstUpper_13 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_13, "\t\t");
    _builder.append("Constant.SQL_DELETE_BY_ID;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void prepapreStatementForDelete(");
    _builder.append(name, "\t");
    _builder.append(" t, PreparedStatement statement) throws SQLException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("statement.setLong(1, t.getId());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String[] splitCamelCaseString(final String s) {
    return s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");
  }
  
  public String getPreparedMethodName(final int fieldIndex, final Field field) {
    final String typeName = field.getDatatype().getSimpleName();
    boolean _equals = typeName.equals("LocalDateTime");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("setTimestamp(");
      _builder.append(fieldIndex);
      _builder.append(", Timestamp.valueOf(t.get");
      String _name = field.getName();
      _builder.append(_name);
      _builder.append("()))");
      return _builder.toString();
    } else {
      boolean _equals_1 = typeName.equals("Integer");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("setInt(");
        _builder_1.append(fieldIndex);
        _builder_1.append(", t.get");
        String _name_1 = field.getName();
        _builder_1.append(_name_1);
        _builder_1.append("())");
        return _builder_1.toString();
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("set");
        _builder_2.append(typeName);
        _builder_2.append("(");
        _builder_2.append(fieldIndex);
        _builder_2.append(", t.get");
        String _name_2 = field.getName();
        _builder_2.append(_name_2);
        _builder_2.append("())");
        return _builder_2.toString();
      }
    }
  }
  
  public String getValue(final Field field) {
    final String typeName = field.getDatatype().getSimpleName();
    final Function1<String, String> _function = (String it) -> {
      return it;
    };
    final Function2<String, String, String> _function_1 = (String p1, String p2) -> {
      return ((p1 + "_") + p2);
    };
    final String fieldName = IterableExtensions.<String>reduce(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ModelRepositoryTemplate.splitCamelCaseString(field.getName()))), _function), _function_1).toUpperCase();
    boolean _equals = typeName.equals("LocalDateTime");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("resultSet.getTimestamp(\"");
      _builder.append(fieldName);
      _builder.append("\").toLocalDateTime()");
      return _builder.toString();
    } else {
      boolean _equals_1 = typeName.equals("String");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("resultSet.getString(\"");
        _builder_1.append(fieldName);
        _builder_1.append("\")");
        return _builder_1.toString();
      } else {
        if ((typeName.equals("Double") || typeName.equals("double"))) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("resultSet.getDouble(\"");
          _builder_2.append(fieldName);
          _builder_2.append("\")");
          return _builder_2.toString();
        } else {
          if ((typeName.equals("Long") || typeName.equals("long"))) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("resultSet.getLong(\"");
            _builder_3.append(fieldName);
            _builder_3.append("\")");
            return _builder_3.toString();
          } else {
            if ((typeName.equals("Blob") || typeName.equals("blob"))) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("resultSet.getBlob(\"");
              _builder_4.append(fieldName);
              _builder_4.append("\")");
              return _builder_4.toString();
            } else {
              if ((typeName.equals("Clob") || typeName.equals("clob"))) {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("resultSet.getClob(\"");
                _builder_5.append(fieldName);
                _builder_5.append("\")");
                return _builder_5.toString();
              } else {
                if ((typeName.equals("Integer") || typeName.equals("int"))) {
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("resultSet.getInt(\"");
                  _builder_6.append(fieldName);
                  _builder_6.append("\")");
                  return _builder_6.toString();
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
}
