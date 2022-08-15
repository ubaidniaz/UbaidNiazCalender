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
    	 secsHowFar.setValue(secsTextfield, secsTextSet, Calendar.SECOND);
   
    }
    @FXML
    void getMins(ActionEvent event) {
    	
    }
    
    @FXML
    void getDays(ActionEvent event) {
    	Calendar c = Calendar.getInstance();
      System.out.println("The Current Date is:" + c.getTime());
       int num = Integer.parseInt(daysTextfield.getText());
       
       
       c.add(Calendar.DATE, num);
       System.out.println(c.getTime());
       daysTextSet.setText(num + " days later: " + String.valueOf(c.getTime()));
    }
    
    @FXML
    void getMonths(ActionEvent event) {
    	
    }
    @FXML
    void getYears(ActionEvent event) {
    	
    }
}
