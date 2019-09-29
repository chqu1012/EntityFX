package de.dc.entity.metro.demo.control;

import org.springframework.stereotype.Controller;

import javafx.scene.layout.BorderPane;

@Controller
public class AboutController extends BorderPane{

	public AboutController() {
		setStyle("-fx-background-color: blue;");
		setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
	}
}
