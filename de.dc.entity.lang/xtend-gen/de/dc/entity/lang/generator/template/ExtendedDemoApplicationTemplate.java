package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ExtendedDemoApplicationTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Extended");
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
    _builder.append(".extended.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_2 = t.getPackagePath();
    _builder.append(_packagePath_2);
    _builder.append(".*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.application.Application;");
    _builder.newLine();
    _builder.append("import javafx.scene.*;");
    _builder.newLine();
    _builder.append("import javafx.stage.Stage;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Extended");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("Demo extends Application{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start(Stage primaryStage) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Parent root = new Extended");
    String _name_1 = t.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("ApplicationPane();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("Scene scene = new Scene(root , 800, 600);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.setScene(scene);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.show();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_2 = t.getName();
    _builder.append(_name_2, "\t\t");
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
