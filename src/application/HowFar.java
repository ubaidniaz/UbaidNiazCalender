package application;

import java.util.Calendar;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HowFar extends HowFarController  {
	private TextField tf;
	private Label lb;
	private int add;
	
	// Constructor for HowFarController
	HowFar (TextField howFarTextField, Label howFarSetLabel, int whatToAdd){
		setTf(howFarTextField);
		setLb(howFarSetLabel);
		setAdd(whatToAdd);
				
	}
	/**
	 * Error check user input and set the labels value accordingly 
	 * @param getHowFar : The user input value textfield (to add or subtract)
	 * @param display : The label to be updated
	 * @param howFarAdd : This adds the specified time to add seconds , minutes , days etc
	 * @param displayWhat : display before or later depending on scenario
	 * @author ubaidullah.niaz
	 */
	 public void setValue(TextField getHowFar, Label display, int howFarAdd, String displayWhat) {
		 						                 
		String userValue = getHowFar.getText();     
		boolean valid = true;
		boolean minusExists = false;              // Assume minus sign is false
		for(char c : userValue.toCharArray()) {   // If any char is not digit
											      //  or a negative then validation complete
			if(!Character.isDigit(c)) {
				if (!minusExists && c == '-') {   
    				minusExists = true;

				}else {
					valid = false;
					display.setText("PLEASE ENTER A NUMERIC VALUE");
				}
				}
			
			// Once user input is validated, move to computation and setting label
			}
		 if (valid){
			Calendar c = Calendar.getInstance() ;                 // create new instance of calender
		       int num = Integer.parseInt(getHowFar.getText());   // Store user value as int from textbox
		      
		       c.add(howFarAdd, num);                             // add or subtract that stored num 
		                                                          // to whatever(sec/min etc) is specified 
		                                                          // by user
		       
		       // If user value is < 0 then it sets the text as before
		       // also computes num * -1 as before specifies the negative value
		       if(num < 0) {
			       display.setText(num* -1 + " " + displayWhat + " before: " + String.valueOf(c.getTime()));
		       }
		       else {
		    	 // If user value is > 0 then text as later
			       display.setText(num + " " + displayWhat + " later: " + String.valueOf(c.getTime()));

		       }
		    	}
			
		}

	public TextField getTf() {
		return tf;
	}

	public void setTf(TextField tf) {
		this.tf = tf;
	}

	public Label getLb() {
		return lb;
	}

	public void setLb(Label lb) {
		this.lb = lb;
	}

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}
		
		
	}
	

