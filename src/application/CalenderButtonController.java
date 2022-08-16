package application;

import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalenderButtonController {

    @FXML
    private TextField yearTextfield;

    @FXML
    private TextField monthTextfield;
    
    @FXML
    private Label calenderLabel;
    
    
   @FXML
   void goBackButton(ActionEvent event) throws IOException {
	   FxmlLoader calender = new FxmlLoader("CalenderView");
	   calender.setScene("CalenderView", event);
   }
   @FXML
   void displayCalender(ActionEvent event) {
	   // gets year and month value from user input from textfields
	   int y = Integer.parseInt(yearTextfield.getText());
	   int m = Integer.parseInt(monthTextfield.getText());
	   
	   YearMonth yearNmonth = YearMonth.of(y, m);
	   int counter = 1;
	   
	   // gets according first day of week for given year and month and
	   // stores it as an int variable
	   int firstDay = LocalDate.of(y, m, 1).getDayOfWeek().getValue();
	   
	   if (firstDay != 7) 
	   for (int i = 0; i < firstDay; i++, counter++) {
		   
			   String format = String.format("%-6s", " ");
		       calenderLabel.setText(calenderLabel.getText() + format);
		   }
	   
	   
	   for (int i = 1; i <= yearNmonth.getMonth().length(yearNmonth.isLeapYear()); i++, counter++) {
		   String format1 = String.format("%-4d", i);
		   	calenderLabel.setText(calenderLabel.getText()+ format1);

		   // New line if the value of the counter is multiple of 7(a week)
		   if (counter % 7 == 0) {
			   	calenderLabel.setText(calenderLabel.getText() + "\n");   

		   }
	   }
		   
   }
 }

