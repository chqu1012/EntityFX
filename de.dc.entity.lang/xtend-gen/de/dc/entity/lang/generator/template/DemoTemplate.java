package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DemoTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Demo");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".control.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_2 = t.getPackagePath();
    _builder.append(_packagePath_2);
    _builder.append(".di.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.application.Application;");
    _builder.newLine();
    _builder.append("import javafx.scene.Scene;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.BorderPane;");
    _builder.newLine();
    _builder.append("import javafx.stage.Stage;");
    _builder.newLine();
    _builder.newLine();
    final String name = StringExtensions.toFirstUpper(t.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("Demo extends Application {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start(Stage stage) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(name, "\t\t");
    _builder.append("TableView ");
    String _firstLower = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower, "\t\t");
    _builder.append("TableView = ");
    _builder.append(name, "\t\t");
    _builder.append("Platform.getInstance(");
    _builder.append(name, "\t\t");
    _builder.append("TableView.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(name, "\t\t");
    _builder.append("Formular ");
    String _firstLower_1 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_1, "\t\t");
    _builder.append("Formular = ");
    _builder.append(name, "\t\t");
    _builder.append("Platform.getInstance(");
    _builder.append(name, "\t\t");
    _builder.append("Formular.class);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("BorderPane root = new BorderPane();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("root.setCenter(");
    String _firstLower_2 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_2, "\t\t");
    _builder.append("TableView);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("root.setRight(");
    String _firstLower_3 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_3, "\t\t");
    _builder.append("Formular);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("stage.setScene(new Scene(root , 1200, 600));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("stage.show();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(name, "\t\t");
    _builder.append("Platform.init();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("launch(args);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
