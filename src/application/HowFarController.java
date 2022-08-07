package application;

import java.util.Calendar;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HowFarController {
//	Stage applicationStage;
	
	@FXML
	private Label testLabel;
	


    @FXML
    void goBack(ActionEvent event) {
    	testLabel.setText("WOW");
    	Calendar c = Calendar.getInstance();
      //System.out.println("The Current Date is:" + c.getTime());
      
      Scanner myObj = new Scanner(System.in);
      int num = myObj.nextInt();
      
      c.add(Calendar.DATE, num);
      System.out.println(c.getTime());
//    	Scene mainScene = applicationStage.getScene();
//		applicationStage.setScene(mainScene);


    	

    }

}
