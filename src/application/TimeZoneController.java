package application;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.TimeZone;

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
	
	
	SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss a");
	Date localDate = new Date();
	Date resultDate;
	String dateToString = dateFormatter.format(localDate);
	

	
	@FXML
	void getTimeZoneButton (ActionEvent event){
		// user chooses value, TimeZone ID stored as String 
		String pickedTimeZone = countriesComboBox.getValue();
		String timeZone = getSelectedTimeZone(pickedTimeZone);
		
		// gets the timezone for the given ID and sets it
		TimeZone tzTimeZone = TimeZone.getTimeZone(timeZone);
	    dateFormatter.setTimeZone(tzTimeZone);
	    
	    // Stores the date as a String
	    String stringResultTimeZone = dateFormatter.format(resultDate);
	    
	    // Creates new null date 
	    Date resultTimeZone = null;
		try {
			// Converts String to Date object
			resultTimeZone = dateFormatter.parse(stringResultTimeZone);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    resultTimeLabel.setText(dateFormatter.format(resultTimeZone));
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		countriesComboBox.setItems(listOfCountries);
		try {
			resultDate = dateFormatter.parse(dateToString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		localTimeLabel.setText(dateFormatter.format(localDate));
	}
	
	public String getSelectedTimeZone(String selectedTimeZone) {
		switch (selectedTimeZone) {
		case "Australia":	
			return "Australia/Canberra";
		case "Algeria":	
			return "Africa/Algiers";
		case "Brazil":	
			return "America/Sao_Paulo";
		case "China":	
			return "Asia/Shanghai";
		case "Denmark":	
			return "Europe/Copenhagen";
		case "Egypt":	
			return "Africa/Cairo";
		case "France":	
			return "Europe/Paris";
		case "Greenland":	
			return "America/Godthab";
		case "Honduras":	       
			return "America/Tegucigalpa";
		case "Italy":	
			return "Europe/Rome";
		case "India":	
			return "Asia/Kolkata";
		case "Japan":	
			return "Asia/Tokyo";
		case "Kuwait":	
			return "Asia/Kuwait";
		case "Mexico":	
			return "America/Mexico_City";
		case "Nigeria":	
			return "Africa/Lagos";
		case "Russia":	
			return "Europe/Moscow";
		case "South Africa":	
			return "Africa/Johannesburg";
		case "Sweden":	
			return "Europe/Stockholm";
		case "Thailand":	
			return "Asia/Bangkok";
		case "Yemen":	
			return "Asia/Aden";
		case "Zimbabwe":	
			return "Africa/Harare";
		default:
			
		}
		return "America/Edmonton";
	}
}

