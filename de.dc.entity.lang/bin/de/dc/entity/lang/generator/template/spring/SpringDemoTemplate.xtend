package de.dc.entity.lang.generator.template.spring

import de.dc.entity.model.Entity
import de.dc.entity.lang.generator.template.IGenerator

class SpringDemoTemplate implements IGenerator<Entity>{
	
	override filename(Entity t)'''«t.name»Demo'''
	
	override gen(Entity t)'''
	package «t.packagePath»;
	«val name = t.name.toFirstUpper»
	import «t.packagePath».control.*;
	
	import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.ConfigurableApplicationContext;
	import org.springframework.context.annotation.Bean;
	
	import javafx.application.Application;
	import javafx.application.HostServices;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Scene;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.paint.Color;
	import javafx.stage.Stage;
	import javafx.stage.StageStyle;
	
	@SpringBootApplication
	public class «name»Demo extends Application {
	
	    private ConfigurableApplicationContext springContext;
	    private BorderPane root;
		
	    @Override
	    public void init() throws Exception {
	        springContext = SpringApplication.run(«name»Demo.class);
	 		AutowireCapableBeanFactory factory = springContext.getAutowireCapableBeanFactory();
	        «name»TableView «name.toFirstLower»TableView = factory.createBean(«name»TableView.class);
			«name»Formular «name.toFirstLower»Formular = factory.createBean(«name»Formular.class);
	
			root = new BorderPane();
			root.setCenter(«name.toFirstLower»TableView);
			root.setRight(«name.toFirstLower»Formular);
	    }
	
	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        primaryStage.setTitle("«name» Application");
	        Scene scene = new Scene(root, 1400, 820);
	        scene.setFill(Color.TRANSPARENT);
	        primaryStage.initStyle(StageStyle.DECORATED);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	
	    @Override
	    public void stop() throws Exception {
	    	springContext.stop();
	        springContext.close();
	    }
	
	    @Bean
	    public HostServices getHostService() {
	    	return getHostServices();
	    }
	    
	
	    public static void main(String[] args) {
	    	// Used for avoiding screenshot robot exception
	    	System.setProperty("java.awt.headless", "false");
	        launch(«name»Demo.class);
	    }
	}
	'''
	
}