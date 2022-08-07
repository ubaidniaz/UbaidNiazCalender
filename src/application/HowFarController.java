package application;

import java.util.Calendar;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HowFarController {
//	Stage applicationStage;
	
	@FXML
	private Label testLabel;
	
	@FXML
	private Label daysTextSet;
	
	@FXML
	private TextField daysTextfield;
	


    @FXML
    void goBack(ActionEvent event) {
    	//testLabel.setText("WOW");

//    	Scene mainScene = applicationStage.getScene();
//		applicationStage.setScene(mainScene);

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

}
