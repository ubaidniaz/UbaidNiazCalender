package application;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalenderController {
	Stage applicationStage;
	

	@FXML
	void timeZonesButton(ActionEvent event) throws IOException {
		Parent timeZoneParent = FXMLLoader.load(getClass().getResource("TimeZoneView.fxml"));
		Scene howFarScene = new Scene(timeZoneParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(howFarScene);
		window.show();
    	

	}
	
	@FXML
	void howFarButton(ActionEvent event) throws IOException {
		Parent howFarParent = FXMLLoader.load(getClass().getResource("HowFarAway.fxml"));
		Scene howFarScene = new Scene(howFarParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(howFarScene);
		window.show();
	}
	@FXML
	void calenderButton(ActionEvent event) throws IOException {
		Parent calenderButton = FXMLLoader.load(getClass().getResource("CalenderButtonView.fxml"));
		Scene calenderScene = new Scene(calenderButton);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(calenderScene);
		window.show();
	}
}