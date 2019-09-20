package de.dc.entity.lang.ui.project.util;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.util.StringInputStream;

import de.dc.entity.lang.ui.project.model.NewProjectModel;
import de.dc.entity.lang.ui.project.templates.EntityTemplate;
import de.dc.entity.lang.ui.project.templates.Templates;

public class ProjectUtil {
	
	private static final Logger LOG = Logger.getLogger(ProjectUtil.class);

	public static IProject create(String projectName) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		try {
			project.create(null);
			project.open(null);
		} catch (CoreException e) {
			LOG.error("Failed to create project.", e);
		}
		return project;
	}
	
	public static IJavaProject createForJava(NewProjectModel model) {
		IProject project = create(model.getName());
		initJavaDescriptor(project);
		IJavaProject javaProject = JavaCore.create(project);
		createFolder(project, "bin");
		IFolder srcFolder = createFolder(project, "src");
		IFolder xentityFolder;
		if (model.isUseGradle()) {
			IFolder mainFolder = createFolder(srcFolder.getFolder("main"));
			createFolder(mainFolder.getFolder("java"));
			IFolder resource = createFolder(mainFolder.getFolder("resources"));
			xentityFolder = createFolder(resource.getFolder("xentity"));
		}else {
			createFolder(project.getFolder("resources"));
			xentityFolder = createFolder(srcFolder.getFolder("xentity"));
		}
		createFolder(project, "src-gen");
		createFolder(project, "data");
		IFolder metaInfFolder = createFolder(project, "META-INF");
		
		try {
				project.getFile(".classpath").create(new StringInputStream(Templates.genClasspathXml(model.isUseGradle())), true, null);
			if(model.isUseGradle()) {
				project.getFile("build.gradle").create(new StringInputStream(Templates.genBuildGradle()), true, null);
			}
			xentityFolder.getFile(model.getEntityName()+".xentity").create(new StringInputStream(EntityTemplate.gen(model)), true, null);
			if (project.getFile(".project").exists()) {
				project.getFile(".project").delete(true, null);
			}
			project.getFile(".project").create(new StringInputStream(Templates.genProjectFile(model.getName(), model.isUseGradle())), true, null);
			metaInfFolder.getFile("MANIFEST.MF").create(new StringInputStream(Templates.genMetaInfXml(model.getName())), true, null);
			project.getFile("build.properties").create(new StringInputStream(Templates.genBuildProperties()), true, null);
		} catch (CoreException e) {
			LOG.error("Failed to create file", e);
		}
		
		return javaProject; 
	}

	private static void initJavaDescriptor(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			description.setNatureIds(new String[] { JavaCore.NATURE_ID });
			project.setDescription(description, null);
		} catch (CoreException e) {
			LOG.error("Failed to add java descriptor to project", e);
		}
	}

	private static IFolder createFolder(IProject project, String folderName) {
		IFolder folder = project.getFolder(folderName);
		try {
			folder.create(false, true, null);
		} catch (CoreException e) {
			LOG.error("Failed to initialize bin folder", e);
		}
		return folder;
	}

	private static IFolder createFolder(IFolder folder) {
		try {
			folder.create(false, true, null);
		} catch (CoreException e) {
			LOG.error("Failed to initialize bin folder", e);
		}
		return folder;
	}

}
