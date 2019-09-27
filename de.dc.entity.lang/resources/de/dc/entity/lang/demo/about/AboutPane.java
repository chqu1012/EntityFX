package de.dc.entity.lang.demo.about;
import java.io.IOException;

import org.apache.log4j.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class AboutPane extends BorderPane{

	private Logger log = Logger.getLogger(getClass());
	
    @FXML
    protected ImageView imageView;

    @FXML
    protected Label labelTitle;

    @FXML
    protected Label labelVersion;

    @FXML
    protected Label labelBuilt;

	private static final String FXML = "/de/dc/entity/lang/demo/about/AboutPane.fxml";

	public AboutPane() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.error("Failed to load fxml " + FXML, exception);
		}
	}
}
