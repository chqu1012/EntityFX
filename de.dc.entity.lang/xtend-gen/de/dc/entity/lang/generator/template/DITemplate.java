package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DITemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Module");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".di;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.google.inject.AbstractModule;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".control.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_2 = t.getPackagePath();
    _builder.append(_packagePath_2);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_3 = t.getPackagePath();
    _builder.append(_packagePath_3);
    _builder.append(".repository.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper);
    _builder.append("Module extends AbstractModule{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void configure() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bind(");
    String _firstUpper_1 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append("FX.class).asEagerSingleton();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bind(");
    String _firstUpper_2 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_2, "\t\t");
    _builder.append("Repository.class).asEagerSingleton();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bind(");
    String _firstUpper_3 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append("TableView.class).asEagerSingleton();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("bind(");
    String _firstUpper_4 = StringExtensions.toFirstUpper(t.getName());
    _builder.append(_firstUpper_4, "\t\t");
    _builder.append("Formular.class).asEagerSingleton();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
