package application;

import java.util.Calendar;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HowFar  {
	TextField tf;
	Label lb;
	int add;
	
	
	HowFar (TextField howFarTextField, Label howFarSetLabel, int whatToAdd){
		tf = howFarTextField;
		lb = howFarSetLabel;
		add = whatToAdd;
				
	}
	
	void setValue(TextField getHowFar, Label display, int howFarAdd, String displayWhat) {
		
		Calendar c = Calendar.getInstance() ;
	       int num = Integer.parseInt(getHowFar.getText());
	      
	       c.add(howFarAdd, num);
	       
	      
	       if(num < 0) {
		       display.setText(num* -1 + " " + displayWhat + " before: " + String.valueOf(c.getTime()));
	       }
	       else {
		       display.setText(num + " " + displayWhat + " later: " + String.valueOf(c.getTime()));

	       }
	    	}
	}
	

