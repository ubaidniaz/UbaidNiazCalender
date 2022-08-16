package application;

import java.net.URL;

import java.util.ResourceBundle;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class TimeZoneController implements Initializable {
	
	@FXML
	private Label localTimeLabel;
	
	@FXML
	private Label resultTimeLabel;
	
	@FXML
	private ComboBox <String> countriesComboBox;
	ObservableList<String> 
	listOfCountries=FXCollections.observableArrayList("Australia","Algeria","Brazil","China","Denmark","Egypt","France","Greenland","Honduras",
			"Italy","India","Japan","Kuwait","Mexico","Nigeria","Russia","South Africa","Sweden","Thailand","Yemen","Zimbabwe");
	

	
	@FXML
	void getTimeZoneButton (ActionEvent event){
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}

