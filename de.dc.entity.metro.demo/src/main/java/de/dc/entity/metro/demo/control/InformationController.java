package de.dc.entity.metro.demo.control;

import org.springframework.stereotype.Controller;

import de.dc.entity.lang.templates.core.BaseMetroControl;
import javafx.scene.layout.AnchorPane;

@Controller
public class InformationController extends AnchorPane{

	public InformationController() {
		setStyle("-fx-background-color: green;");
		setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
	}
}
