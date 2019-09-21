package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CssTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Extended");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("ApplicationPane.css");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".split-pane{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("-fx-base: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0, 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".split-pane > .split-pane-divider {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0 0.1em 0 0.1em; /* 0 3 0 3 */");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("/* horizontal the two nodes are placed to the left/right of each other. */");
    _builder.newLine();
    _builder.append(".split-pane:horizontal > .split-pane-divider {");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("-fx-background-color: #DDDDDD;");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("-fx-background-insets: 0, 0 1 0 1;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("/* vertical the two nodes are placed on top of each other. */");
    _builder.newLine();
    _builder.append(".split-pane:vertical > .split-pane-divider {");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("-fx-background-color: #DDDDDD;");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("-fx-background-insets: 0, 1 0 1 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".tab-pane{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-base: white;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-background-insets: 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("-fx-padding: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
