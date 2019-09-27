package de.dc.entity.lang.demo.login;
import java.io.IOException;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class SlideLoginController extends BorderPane{

    private static final String FXML = "/de/dc/entity/lang/demo/login/SlideLogin.fxml";

    @FXML
    protected Button buttonSignIn;

    @FXML
    protected Button buttonSignUp;

    @FXML
    protected Button buttonSwitchSignIn;
    
    @FXML
    protected Button buttonSwitchSignUp;

    @FXML
    protected StackPane paneStack;

    @FXML
    protected AnchorPane paneSignIn;

    @FXML
    protected TextField textSignInUsername;

    @FXML
    protected PasswordField textSignInPassword;

    @FXML
    protected Hyperlink linkForgotten;

    @FXML
    protected AnchorPane paneSignUp;

    @FXML
    protected TextField textSignUpFullname;

    @FXML
    protected PasswordField textSignUpPassword;

    @FXML
    protected TextField textSignUpUsername;

	public SlideLoginController() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
    
    @FXML
    protected void onButtonAction(ActionEvent event) {
    	Object source = event.getSource();
		if (source == buttonSwitchSignIn) {
    		dispatchSwitchToSignIn();
		}else if (source == buttonSwitchSignUp) {
			dispatchSwitchToSignUp();
		}else if (source == buttonSignIn) {
			dispatchOnSignIn();
		}else if (source == buttonSignUp) {
			dispatchOnSignUp();
		}
    }

	private void dispatchOnSignUp() {
		
	}

	private void dispatchOnSignIn() {
		
	}

	private void dispatchSwitchToSignUp() {
		TranslateTransition transition = new TranslateTransition(Duration.millis(250), paneStack);
		transition.setToX(10);
		paneSignUp.toFront();
		transition.play();
	}

	private void dispatchSwitchToSignIn() {
		TranslateTransition transition = new TranslateTransition(Duration.millis(250), paneStack);
		transition.setToX(330);
		paneSignIn.toFront();
		transition.play();
	}

}
