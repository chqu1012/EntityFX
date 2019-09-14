package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class TableInitializerTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("TableInitializer");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".init;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.*;");
    _builder.newLine();
    _builder.append("import java.net.URL;");
    _builder.newLine();
    _builder.append("import java.sql.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.h2.tools.RunScript;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".repository.*;");
    _builder.newLineIfNotEmpty();
    final String name = StringExtensions.toFirstUpper(t.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("TableInitializer{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) throws SQLException, FileNotFoundException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Connection connection = DriverManager.getConnection(");
    _builder.append(name, "\t\t");
    _builder.append("Repository.JDBC_URL,\"SA\", \"SA\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("URL createUrl = ");
    _builder.append(name, "\t\t");
    _builder.append("TableInitializer.class.getResource(\"/");
    String _replace = t.getPackagePath().replace(".", "/");
    _builder.append(_replace, "\t\t");
    _builder.append("/init/create.sql\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("RunScript.execute(connection, new FileReader(new File(createUrl.getFile())));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"");
    String _name = t.getName();
    _builder.append(_name, "\t\t");
    _builder.append(" table initialized!\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
