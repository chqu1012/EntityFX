package de.dc.entity.lang.generator.template.spring;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SpringDemoTemplate implements IGenerator<Entity> {
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
    final String name = StringExtensions.toFirstUpper(t.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".control.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.beans.factory.config.AutowireCapableBeanFactory;");
    _builder.newLine();
    _builder.append("import org.springframework.boot.SpringApplication;");
    _builder.newLine();
    _builder.append("import org.springframework.boot.autoconfigure.SpringBootApplication;");
    _builder.newLine();
    _builder.append("import org.springframework.context.ConfigurableApplicationContext;");
    _builder.newLine();
    _builder.append("import org.springframework.context.annotation.Bean;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javafx.application.Application;");
    _builder.newLine();
    _builder.append("import javafx.application.HostServices;");
    _builder.newLine();
    _builder.append("import javafx.fxml.FXMLLoader;");
    _builder.newLine();
    _builder.append("import javafx.scene.Scene;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.BorderPane;");
    _builder.newLine();
    _builder.append("import javafx.scene.paint.Color;");
    _builder.newLine();
    _builder.append("import javafx.stage.Stage;");
    _builder.newLine();
    _builder.append("import javafx.stage.StageStyle;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SpringBootApplication");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("Demo extends Application {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ConfigurableApplicationContext springContext;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private BorderPane root;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void init() throws Exception {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("springContext = SpringApplication.run(");
    _builder.append(name, "        ");
    _builder.append("Demo.class);");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t");
    _builder.append("AutowireCapableBeanFactory factory = springContext.getAutowireCapableBeanFactory();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(name, "        ");
    _builder.append("TableView ");
    String _firstLower = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower, "        ");
    _builder.append("TableView = factory.createBean(");
    _builder.append(name, "        ");
    _builder.append("TableView.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(name, "\t\t");
    _builder.append("Formular ");
    String _firstLower_1 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_1, "\t\t");
    _builder.append("Formular = factory.createBean(");
    _builder.append(name, "\t\t");
    _builder.append("Formular.class);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("root = new BorderPane();");
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
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void start(Stage primaryStage) throws Exception {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("primaryStage.setTitle(\"");
    _builder.append(name, "        ");
    _builder.append(" Application\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("Scene scene = new Scene(root, 1400, 820);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("scene.setFill(Color.TRANSPARENT);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("primaryStage.initStyle(StageStyle.DECORATED);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("primaryStage.setScene(scene);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("primaryStage.show();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void stop() throws Exception {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("springContext.stop();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("springContext.close();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Bean");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public HostServices getHostService() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return getHostServices();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("// Used for avoiding screenshot robot exception");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("System.setProperty(\"java.awt.headless\", \"false\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("launch(");
    _builder.append(name, "        ");
    _builder.append("Demo.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
