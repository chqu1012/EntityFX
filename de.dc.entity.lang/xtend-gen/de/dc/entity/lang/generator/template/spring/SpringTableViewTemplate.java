package de.dc.entity.lang.generator.template.spring;

import de.dc.entity.lang.generator.template.IGenerator;
import de.dc.entity.model.Entity;
import de.dc.entity.model.FXControl;
import de.dc.entity.model.Field;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SpringTableViewTemplate implements IGenerator<Entity> {
  @Override
  public String filename(final Entity t) {
    String _firstUpper = StringExtensions.toFirstUpper(t.getName());
    return (_firstUpper + "TableView");
  }
  
  @Override
  public String gen(final Entity t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".control;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Component;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.function.Function;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_2 = t.getPackagePath();
    _builder.append(_packagePath_2);
    _builder.append(".repository.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.beans.property.SimpleObjectProperty;");
    _builder.newLine();
    _builder.append("import javafx.beans.value.ObservableValue;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.TableColumn;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.TableColumn.CellDataFeatures;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.TableView;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.annotation.PostConstruct;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javafx.collections.FXCollections;");
    _builder.newLine();
    _builder.append("import javafx.collections.ObservableList;");
    _builder.newLine();
    _builder.append("import javafx.collections.transformation.FilteredList;");
    _builder.newLine();
    _builder.newLine();
    final String name = StringExtensions.toFirstUpper(t.getName());
    _builder.newLineIfNotEmpty();
    _builder.append("@Component");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(name);
    _builder.append("TableView extends TableView<");
    _builder.append(name);
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Autowired");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    _builder.append(name, "\t");
    _builder.append("FX context;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@PostConstruct");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void init() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("TableColumn<");
    _builder.append(name, "\t\t");
    _builder.append(", Long> columnId = new TableColumn<>(\"#ID\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("columnId.setPrefWidth(100);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setupCellValueFactory(columnId, e->new SimpleObjectProperty<>(e.getId()));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("getColumns().add(columnId);");
    _builder.newLine();
    {
      EList<Field> _field = t.getField();
      for(final Field field : _field) {
        {
          boolean _isUseByTableView = field.isUseByTableView();
          if (_isUseByTableView) {
            _builder.append("\t\t");
            _builder.append("TableColumn<");
            _builder.append(name, "\t\t");
            _builder.append(", ");
            String _qualifiedName = field.getDatatype().getQualifiedName();
            _builder.append(_qualifiedName, "\t\t");
            _builder.append("> column");
            String _name = field.getName();
            _builder.append(_name, "\t\t");
            _builder.append(" = new TableColumn<>(\"#");
            String _upperCase = field.getName().toUpperCase();
            _builder.append(_upperCase, "\t\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("column");
            String _name_1 = field.getName();
            _builder.append(_name_1, "\t\t");
            _builder.append(".setPrefWidth(");
            {
              FXControl _control = field.getControl();
              boolean _tripleEquals = (_control == null);
              if (_tripleEquals) {
                _builder.append("100.0");
              } else {
                double _columnWidth = field.getControl().getColumnWidth();
                _builder.append(_columnWidth, "\t\t");
              }
            }
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("setupCellValueFactory(column");
            String _name_2 = field.getName();
            _builder.append(_name_2, "\t\t");
            _builder.append(", e->new SimpleObjectProperty<>(e.get");
            String _name_3 = field.getName();
            _builder.append(_name_3, "\t\t");
            _builder.append("()));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("getColumns().add(column");
            String _name_4 = field.getName();
            _builder.append(_name_4, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SortedList<Person> sortedData = new SortedList<>(context.getFilteredMasterData());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("sortedData.comparatorProperty().bind(comparatorProperty());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setItems(sortedData);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public FilteredList<");
    _builder.append(name, "\t");
    _builder.append("> getFilteredList(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return context.getFilteredMasterData();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ObservableList<");
    _builder.append(name, "\t");
    _builder.append("> getMasterData(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return context.getMasterData();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void add(");
    _builder.append(name, "\t");
    _builder.append("... ");
    String _firstLower = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower, "\t");
    _builder.append("s) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("context.getMasterData().addAll(");
    String _firstLower_1 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_1, "\t\t");
    _builder.append("s);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void remove(");
    _builder.append(name, "\t");
    _builder.append("... ");
    String _firstLower_2 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_2, "\t");
    _builder.append("s) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("context.getMasterData().removeAll(");
    String _firstLower_3 = StringExtensions.toFirstLower(name);
    _builder.append(_firstLower_3, "\t\t");
    _builder.append("s);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private <T, U> void setupCellValueFactory(TableColumn<T, U> column, Function<T, ObservableValue<U>> mapper) {");
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
