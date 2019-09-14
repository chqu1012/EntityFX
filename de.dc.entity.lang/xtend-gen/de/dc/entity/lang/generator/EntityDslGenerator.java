package de.dc.entity.lang.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.dc.entity.lang.generator.template.ResourceTemplate;
import de.dc.entity.lang.generator.template.Templates;
import de.dc.entity.lang.generator.template.spring.SpringTemplates;
import de.dc.entity.model.Entity;
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
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      {
        final String exportPath = entity.getPackagePath().replace(".", "/");
        boolean _isUseSpring = entity.isUseSpring();
        if (_isUseSpring) {
          final Consumer<SpringTemplates> _function = (SpringTemplates tpl) -> {
            final String tplPath = tpl.getExportPath(entity);
            final String content = tpl.getTemplate().gen(entity);
            fsa.generateFile(((exportPath + "/") + tplPath), content);
          };
          ((List<SpringTemplates>)Conversions.doWrapArray(SpringTemplates.values())).forEach(_function);
        } else {
          final Consumer<Templates> _function_1 = (Templates tpl) -> {
            final String tplPath = tpl.getExportPath(entity);
            final String content = tpl.getTemplate().gen(entity);
            fsa.generateFile(((exportPath + "/") + tplPath), content);
          };
          ((List<Templates>)Conversions.doWrapArray(Templates.values())).forEach(_function_1);
          final Consumer<ResourceTemplate> _function_2 = (ResourceTemplate tpl) -> {
            final String tplPath = tpl.getExportPath(entity);
            final String content = tpl.getTemplate().gen(entity);
            fsa.generateFile(((exportPath + "/") + tplPath), content);
          };
          ((List<ResourceTemplate>)Conversions.doWrapArray(ResourceTemplate.values())).forEach(_function_2);
        }
      }
    }
  }
}
