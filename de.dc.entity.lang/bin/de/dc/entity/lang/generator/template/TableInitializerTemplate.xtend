package de.dc.entity.lang.generator.template

import de.dc.entity.model.Entity

class TableInitializerTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name»TableInitializer'''
	
	override gen(Entity t)'''
	package «t.packagePath».init;
	
	import java.io.*;
	import java.net.URL;
	import java.sql.*;
	
	import org.h2.tools.RunScript;
	
	import «t.packagePath».repository.*;
	«val name = t.name.toFirstUpper»
	public class «name»TableInitializer{
		public static void main(String[] args) throws SQLException, FileNotFoundException {
			Connection connection = DriverManager.getConnection(«name»Repository.JDBC_URL,"SA", "SA");
			URL createUrl = «name»TableInitializer.class.getResource("/«t.packagePath.replace('.', '/')»/init/create.sql");
			RunScript.execute(connection, new FileReader(new File(createUrl.getFile())));
			
			System.out.println("«t.name» table initialized!");
		}
	}
	'''
	
}