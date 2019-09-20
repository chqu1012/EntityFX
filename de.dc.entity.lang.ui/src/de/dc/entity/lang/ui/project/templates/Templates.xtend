package de.dc.entity.lang.ui.project.templates

class Templates {
	
	def static String genProjectFile(String projectName)'''
	<?xml version="1.0" encoding="UTF-8"?>
	<projectDescription>
		<name>«projectName»</name>
		<comment>Project «projectName» created by EntityFX.</comment>
		<projects>
		</projects>
		<buildSpec>
			<buildCommand>
				<name>org.eclipse.jdt.core.javabuilder</name>
				<arguments>
				</arguments>
			</buildCommand>
			<buildCommand>
				<name>org.eclipse.buildship.core.gradleprojectbuilder</name>
				<arguments>
				</arguments>
			</buildCommand>
		</buildSpec>
		<natures>
			<nature>org.eclipse.jdt.core.javanature</nature>
			<nature>org.eclipse.buildship.core.gradleprojectnature</nature>
		 	<nature>org.eclipse.pde.PluginNature</nature>
		</natures>
	</projectDescription>
	
	'''
	
	def static String genBuildGradle()'''
	buildscript {
		ext {
			springBootVersion = '+'
		}
		repositories {
			mavenCentral()
			maven { url "http://maven.bestsolution.at/efxclipse-releases/" }
			maven { url "https://mvnrepository.com/" }
			maven { url "https://repo.spring.io/snapshot" }
			maven { url "https://repo.spring.io/milestone" }
		}
		dependencies {
			classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
		}
	}
	
	apply plugin: 'java'
	apply plugin: 'eclipse'
	apply plugin: 'org.springframework.boot'
	apply plugin: 'io.spring.dependency-management'
	
	version = '0.0.1-SNAPSHOT'
	sourceCompatibility = 1.8
	
	repositories {
		mavenCentral()
		maven { url "https://mvnrepository.com/" }
		maven { url "http://maven.bestsolution.at/efxclipse-releases/" }
		maven { url "https://repo.spring.io/snapshot" }
		maven { url "https://repo.spring.io/milestone" }
	}
	
	dependencies {
		compile('org.springframework.boot:spring-boot-starter-data-jpa')
		compile('org.springframework.boot:spring-boot-starter-validation')
		compile group: 'com.jfoenix', name: 'jfoenix', version: '8.0.2'
		compile group: 'org.controlsfx', name: 'controlsfx', version: '8.40.14'
		runtime('com.h2database:h2')
		
		compile group: 'org.jfxtras', name: 'jfxtras-labs', version: '8.0-r5'
		
		compile group: 'org.eclipse.emf', name: 'org.eclipse.emf.common', version: '2.15.0'
		compile group: 'org.eclipse.emf', name: 'org.eclipse.emf.ecore', version: '2.15.0'
		compile group: 'org.eclipse.emf', name: 'org.eclipse.emf.ecore.xmi', version: '2.15.0'
	
		compile group: 'at.bestsolution.efxclipse.rt', name: 'org.eclipse.fx.ui.controls', version: '2.5.0'
		compile group: 'at.bestsolution.efxclipse.rt', name: 'org.eclipse.fx.ui.dialogs', version: '2.5.0'
	}
	'''
	
	def static String genClasspathXml()'''
	<?xml version="1.0" encoding="UTF-8"?>
	<classpath>
		<classpathentry kind="src" output="bin/main" path="src/main/java">
			<attributes>
				<attribute name="gradle_scope" value="main"/>
				<attribute name="gradle_used_by_scope" value="main,test"/>
			</attributes>
		</classpathentry>
		<classpathentry kind="src" output="bin/main" path="src/main/resources">
			<attributes>
				<attribute name="gradle_scope" value="main"/>
				<attribute name="gradle_used_by_scope" value="main,test"/>
			</attributes>
		</classpathentry>
		<classpathentry kind="src" path="src/main/java"/>
		<classpathentry kind="src" path="src-gen"/>
		<classpathentry kind="src" path="src/main/resources"/>
		<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8/"/>
		<classpathentry kind="con" path="org.eclipse.buildship.core.gradleclasspathcontainer"/>
		<classpathentry kind="output" path="bin/default"/>
	</classpath>
	'''
}