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
		FxmlLoader calender = new FxmlLoader("TimeZoneView");
		calender.setScene("TimeZoneView", event);
	}
	
	@FXML
	void howFarButton(ActionEvent event) throws IOException {
		FxmlLoader calender = new FxmlLoader("HowFarAway");
		calender.setScene("HowFarAway", event);
	}
	@FXML
	void calenderButton(ActionEvent event) throws IOException {
		FxmlLoader calender = new FxmlLoader("CalenderButtonView");
		calender.setScene("CalenderButtonView", event);
	}
}