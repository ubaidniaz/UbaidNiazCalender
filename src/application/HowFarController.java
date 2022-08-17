package application;

import java.io.IOException;
import java.util.Calendar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HowFarController {
	
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
	// Calls FxmlLoader Class to create new instance of scene and set scene
   public void goBack(ActionEvent event) throws IOException {
    	FxmlLoader calender = new FxmlLoader("CalenderView");
		calender.setScene("CalenderView", event);

    }
    @FXML
    // Uses the subclass HowFar to create an instance of the argument and set value that way
    // (For all action events below as well)                                                                                       
   public void getSecs(ActionEvent event) {
    	 HowFar secsHowFar = new HowFar(secsTextfield, secsTextSet, Calendar.SECOND);
    	 secsHowFar.setValue(secsTextfield, secsTextSet, Calendar.SECOND , "seconds");
   
    }
    
	@FXML
    public void getMins(ActionEvent event) {
    	 HowFar minsHowFar = new HowFar(minsTextfield, minsTextSet, Calendar.MINUTE);
    	 minsHowFar.setValue(minsTextfield, minsTextSet, Calendar.MINUTE, "minutes");
    }
    
    @FXML
    public void getDays(ActionEvent event) {
    	 HowFar daysHowFar = new HowFar(daysTextfield, daysTextSet, Calendar.DATE);
    	 daysHowFar.setValue(daysTextfield, daysTextSet, Calendar.DATE, "days");
    	
    }
    
    @FXML
    public void getMonths(ActionEvent event) {
    	 HowFar monthsHowFar = new HowFar(monthsTextfield, monthsTextSet, Calendar.MONTH);
    	 monthsHowFar.setValue(monthsTextfield, monthsTextSet, Calendar.MONTH, "months");
    	
    }
    @FXML
    public void getYears(ActionEvent event) {
    	 HowFar yearsHowFar = new HowFar(yearsTextfield, secsTextSet, Calendar.YEAR);
    	 yearsHowFar.setValue(yearsTextfield, yearsTextSet, Calendar.YEAR, "years");
    	
    }
}
