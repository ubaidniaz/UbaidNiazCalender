package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class CalenderController {
	  Stage applicationStage;
	
	
	@FXML
	public void timeZonesButton(ActionEvent event) throws IOException {
		FxmlLoader calender = new FxmlLoader("TimeZoneView");
		calender.setScene("TimeZoneView", event);
	}
	
	@FXML
	public void howFarButton(ActionEvent event) throws IOException {
		FxmlLoader calender = new FxmlLoader("HowFarAway");
		calender.setScene("HowFarAway", event);
	}
	@FXML
	public void calenderButton(ActionEvent event) throws IOException {
		FxmlLoader calender = new FxmlLoader("CalenderButtonView");
		calender.setScene("CalenderButtonView", event);
	}
}