package application;

import java.util.Calendar;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HowFarController {
	Stage applicationStage;
	
	@FXML
	private Label titleLabel;
	
	@FXML
	private TextField secsTextfield;
	
	@FXML
	private TextField minsTextfield;
	
	@FXML
	private TextField daysTextfield;
	
	@FXML
	private TextField monthsTextfield;
	
	@FXML
	private TextField yearsTextfield;
	
	@FXML
	private Label secsTextSet;
	
	@FXML
	private Label minsTextSet;
	
	@FXML
	private Label daysTextSet;
	
	@FXML
	private Label monthsTextSet;
	
	@FXML
	private Label yearsTextSet;
	
	
	
    @FXML
    void goBack(ActionEvent event) {
    	

//    	Scene mainScene = mainStage.getScene();
//    	applicationStage.setScene(mainScene);

    }
    @FXML
    void getSecs(ActionEvent event) {
    	 HowFar secsHowFar = new HowFar(secsTextfield, secsTextSet, Calendar.SECOND);
    	 secsHowFar.setValue(secsTextfield, secsTextSet, Calendar.SECOND , "seconds");
   
    }
    
	@FXML
    void getMins(ActionEvent event) {
    	 HowFar minsHowFar = new HowFar(minsTextfield, minsTextSet, Calendar.MINUTE);
    	 minsHowFar.setValue(minsTextfield, minsTextSet, Calendar.MINUTE, "minutes");
    }
    
    @FXML
    void getDays(ActionEvent event) {
    	 HowFar daysHowFar = new HowFar(daysTextfield, daysTextSet, Calendar.DATE);
    	 daysHowFar.setValue(daysTextfield, daysTextSet, Calendar.DATE, "days");
    	
    }
    
    @FXML
    void getMonths(ActionEvent event) {
    	 HowFar monthsHowFar = new HowFar(monthsTextfield, monthsTextSet, Calendar.MONTH);
    	 monthsHowFar.setValue(monthsTextfield, monthsTextSet, Calendar.MONTH, "months");
    	
    }
    @FXML
    void getYears(ActionEvent event) {
    	 HowFar yearsHowFar = new HowFar(yearsTextfield, secsTextSet, Calendar.YEAR);
    	 yearsHowFar.setValue(yearsTextfield, yearsTextSet, Calendar.YEAR, "years");
    	
    }
}
