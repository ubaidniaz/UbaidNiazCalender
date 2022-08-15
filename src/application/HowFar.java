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
	
	void setValue(TextField getHowFar, Label display, int howFarAdd) {
		
		Calendar c = Calendar.getInstance() ;
	       int num = Integer.parseInt(getHowFar.getText());
	       
	       c.add(howFarAdd, num);;
	       display.setText(num + " days later: " + String.valueOf(c.getTime()));
	    
	}

}
