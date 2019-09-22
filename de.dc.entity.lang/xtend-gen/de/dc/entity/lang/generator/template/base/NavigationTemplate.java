package de.dc.entity.lang.generator.template.base;

import de.dc.entity.model.Entity;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class NavigationTemplate {
  public static String gen(final List<Entity> entities) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = entities.get(0).getPackagePath();
    _builder.append(_packagePath);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public enum NavigationType {");
    _builder.newLine();
    {
      for(final Entity entity : entities) {
        _builder.append("\t");
        String _name = entity.getName();
        _builder.append(_name, "\t");
        _builder.append("(\"");
        String _packagePath_1 = entity.getPackagePath();
        _builder.append(_packagePath_1, "\t");
        _builder.append("\"),");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append(";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String packagePath;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private NavigationType(String packagePath) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.packagePath = packagePath;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getPackagePath() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return packagePath;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
