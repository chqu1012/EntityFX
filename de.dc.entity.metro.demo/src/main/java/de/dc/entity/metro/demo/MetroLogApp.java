package de.dc.entity.metro.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import de.dc.entity.lang.templates.core.MetroConstants;
import de.dc.entity.metro.demo.control.AboutController;
import de.dc.entity.metro.demo.control.InformationController;
import de.dc.entity.metro.demo.control.MetroControlLog;
import de.dc.entity.metro.demo.control.MetroLogin;
import de.dc.entity.metro.demo.control.MetroTableFormLog;
import de.dc.entity.metro.demo.history.control.MetroTableFormLogHistory;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

@SpringBootApplication
public class MetroLogApp extends Application {

	private ConfigurableApplicationContext springContext;
	private MetroControlLog metroControl;
	private Map<String, Region> controlRegistry = new HashMap<>(); 
	
	@Override
	public void init() throws Exception {
		springContext = SpringApplication.run(MetroLogApp.class);
		metroControl = loadFxml(MetroConstants.FXML_METRO_CONTROL, MetroControlLog.class, "root");
		loadFxml(MetroConstants.FXML_METRO_TABLE_FORM, MetroTableFormLog.class, "Log");
		loadFxml(MetroConstants.FXML_METRO_TABLE_FORM, MetroTableFormLogHistory.class, "LogHistory");
		loadFxml(MetroConstants.FXML_METRO_LOGIN, MetroLogin.class, "Login");
	}
	
	@SuppressWarnings("unchecked")
	private <T> T loadFxml(String fxml, Class<?> clazz, String id) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
		Object bean = springContext.getBean(clazz);
		fxmlLoader.setController(bean);
        fxmlLoader.setControllerFactory(springContext::getBean);
        Region panel = fxmlLoader.load();
        controlRegistry.put(id, panel);
		return (T) bean;		
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
		launch(MetroLogApp.class);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Log Application");
		
		Scene scene = new Scene(controlRegistry.get("root"), 1400, 820);
		metroControl.addNavigationItem("Log", controlRegistry.get("Log"));
		metroControl.addNavigationItem("LogHistory", controlRegistry.get("LogHistory"));
		metroControl.addNavigationItem("About", new AboutController());
		metroControl.addNavigationItem("Information", new InformationController());
		metroControl.addNavigationItem("Metro Login", controlRegistry.get("Login"));
		scene.setFill(Color.TRANSPARENT);
		stage.initStyle(StageStyle.DECORATED);
		stage.setScene(scene);
		stage.show();
	}
}
