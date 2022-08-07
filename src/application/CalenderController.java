package application;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalenderController {
	Stage applicationStage;
	

	@FXML
	void timeZonesButton(ActionEvent event) {
    	Scene mainScene = applicationStage.getScene();
		VBox root = new VBox();
		Scene timeZoneScene = new Scene(root,400,400);
		applicationStage.setScene(timeZoneScene);
		
		Label label = new Label("seufkh");
		Button doneButton = new Button("Done");
    	doneButton.setOnAction(new EventHandler <ActionEvent>() {
			public void handle(ActionEvent t) {
				applicationStage.setScene(mainScene);
				
			}
    	});
    	
    	root.getChildren().addAll(doneButton, label);
    	
//    	Calendar c = Calendar.getInstance();
//       System.out.println("The Current Date is:" + c.getTime());
//        
//        Scanner myObj = new Scanner(System.in);
//        int num = myObj.nextInt();
//        
//        c.add(Calendar.DATE, num);
//        System.out.println(c.getTime());
        
        
    	
	}
	

	@FXML
	void howFarButton(ActionEvent event) throws IOException {
		Parent howFarParent = FXMLLoader.load(getClass().getResource("HowFarAway.fxml"));
		Scene howFarScene = new Scene(howFarParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(howFarScene);
		window.show();
		
//		Scene mainScene = applicationStage.getScene();
//		VBox root = new VBox();
//		Scene timeZoneScene = new Scene(root,400,400);
//		applicationStage.setScene(timeZoneScene);
//		Label label = new Label("seufkh");
//		Button doneButton = new Button("Done");
//    	doneButton.setOnAction(new EventHandler <ActionEvent>() {
//			public void handle(ActionEvent t) {
//				applicationStage.setScene(mainScene);
//				
//			}
//    	});
//    	
//    	root.getChildren().addAll(doneButton, label);
//	}
}
}