package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlLoader {
	private String file;
	
	// Constructor for this class(user specifies FXML file without .fxml)
	FxmlLoader(String fxmlFile){
		file = fxmlFile;
	}
	
	/**
	 *   Method for any class to call whenever needed to switch scenes
	 * @param fxml : the FXML file you want to open without the .fxml
	 * @param event : the specified ActionEvent for any button
	 * @throws IOException
	 * @author ubaidullah.niaz
	 */
	void setScene(String fxml, ActionEvent event) throws IOException{
		Parent parent = FXMLLoader.load(getClass().getResource(fxml+".fxml"));
		Scene scene = new Scene(parent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	
	
	
	
}
