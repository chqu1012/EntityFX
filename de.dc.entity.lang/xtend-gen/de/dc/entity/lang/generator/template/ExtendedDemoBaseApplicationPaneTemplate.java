package de.dc.entity.lang.generator.template;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ExtendedDemoBaseApplicationPaneTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ExtendedBase");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("ApplicationPane");
    return _builder.toString();
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".extended;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.function.Function;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javafx.beans.value.ObservableValue;");
    _builder.newLine();
    _builder.append("import javafx.event.*;");
    _builder.newLine();
    _builder.append("import javafx.fxml.FXML;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.TableColumn.CellDataFeatures;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ExtendedBase");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("ApplicationPane<T> extends BorderPane{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("protected AnchorPane anchorPaneTableView;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("protected AnchorPane anchorPanePreferences;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("protected AnchorPane anchorPaneFormular;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("protected TableView<?> tableViewPropertyView;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("protected TableColumn<?, ?> columnProperty;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("protected TableColumn<?, ?> columnValue;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("   ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Label labelItemsCounter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@FXML");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Label labelFilteredItemsCounter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected <T, U> void setupCellValueFactory(TableColumn<T, U> column, Function<T, ObservableValue<U>> mapper) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("column.setCellValueFactory((CellDataFeatures<T, U> c) -> mapper.apply(c.getValue()));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}