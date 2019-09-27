package de.dc.entity.lang.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.dc.entity.lang.templates.ResourceTemplate;
import de.dc.entity.lang.templates.Templates;
import de.dc.entity.lang.templates.base.metro.MetroAppTemplates;
import de.dc.entity.lang.templates.spring.SpringEntityTemplate;
import de.dc.entity.lang.templates.spring.SpringTemplates;
import de.dc.entity.model.Entity;
import de.dc.entity.model.Metro;
import de.dc.entity.model.SpringMetro;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class EntityDslGenerator implements IGenerator {
  @Inject
  JvmModelGenerator jvmModelGenerator;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    this.jvmModelGenerator.doGenerate(input, fsa);
    this.generateEntity(input, fsa);
    this.generateMetro(input, fsa);
    this.generateSpringMetro(input, fsa);
  }
  
  public void generateSpringMetro(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<SpringMetro> _filter = Iterables.<SpringMetro>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), SpringMetro.class);
    for (final SpringMetro item : _filter) {
      final Consumer<SpringTemplates> _function = (SpringTemplates tpl) -> {
        final String exportPath = item.getPackagePath().replace(".", "/");
        final String tplPath = tpl.getExportPath(item);
        final String content = tpl.getTemplate().gen(item);
        fsa.generateFile(((exportPath + "/") + tplPath), content);
      };
      ((List<SpringTemplates>)Conversions.doWrapArray(SpringTemplates.values())).forEach(_function);
    }
  }
  
  public void generateMetro(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<Metro> _filter = Iterables.<Metro>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Metro.class);
    for (final Metro item : _filter) {
      final Consumer<MetroAppTemplates> _function = (MetroAppTemplates tpl) -> {
        final String exportPath = item.getPackagePath().replace(".", "/");
        final String tplPath = tpl.getExportPath(item);
        final String content = tpl.getTemplate().gen(item);
        fsa.generateFile(((exportPath + "/") + tplPath), content);
      };
      ((List<MetroAppTemplates>)Conversions.doWrapArray(MetroAppTemplates.values())).forEach(_function);
    }
  }
  
  public void generateEntity(final Resource input, final IFileSystemAccess fsa) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      {
        final String exportPath = entity.getPackagePath().replace(".", "/");
        boolean _isUseSpring = entity.isUseSpring();
        if (_isUseSpring) {
          final Consumer<SpringEntityTemplate> _function = (SpringEntityTemplate tpl) -> {
            final String tplPath = tpl.getExportPath(entity);
            final String content = tpl.getTemplate().gen(entity);
            fsa.generateFile(((exportPath + "/") + tplPath), content);
          };
          ((List<SpringEntityTemplate>)Conversions.doWrapArray(SpringEntityTemplate.values())).forEach(_function);
        } else {
          final Consumer<Templates> _function_1 = (Templates tpl) -> {
            if (((!entity.isGenerateDemo()) && (((Objects.equal(tpl, Templates.Demo) || 
              Objects.equal(tpl, Templates.ExtendedDemoApplication)) || Objects.equal(tpl, Templates.ExtendedDemoApplicationPane)) || 
              Objects.equal(tpl, Templates.ExtendedDemoBaseApplicationPane)))) {
            } else {
              final String tplPath = tpl.getExportPath(entity);
              final String content = tpl.getTemplate().gen(entity);
              fsa.generateFile(((exportPath + "/") + tplPath), content);
            }
          };
          ((List<Templates>)Conversions.doWrapArray(Templates.values())).forEach(_function_1);
          final Consumer<ResourceTemplate> _function_2 = (ResourceTemplate tpl) -> {
            if (((!entity.isGenerateDemo()) && (Objects.equal(tpl, ResourceTemplate.FXML_EXTENDED_DEMO) || Objects.equal(tpl, ResourceTemplate.CSS)))) {
              return;
            } else {
              final String tplPath = tpl.getExportPath(entity);
              final String content = tpl.getTemplate().gen(entity);
              fsa.generateFile(((exportPath + "/") + tplPath), content);
            }
          };
          ((List<ResourceTemplate>)Conversions.doWrapArray(ResourceTemplate.values())).forEach(_function_2);
        }
      }
    }
  }
}
