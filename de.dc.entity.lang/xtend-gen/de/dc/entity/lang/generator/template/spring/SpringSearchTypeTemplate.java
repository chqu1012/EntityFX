package de.dc.entity.lang.generator.template.spring;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SpringSearchTypeTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper);
    _builder.append("SearchType");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".filter;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public enum ");
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper);
    _builder.append("SearchType {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("START_WITH,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("CONTAINS,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ENDS_WITH,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("EQUALS_TO,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("NOT_EQUALS_TO,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("GREATER_THAN,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("GREATER_THAN_OR_EQUALS,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("LESS_THAN,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("LESS_THAN_OR_EQUALS");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(";");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
