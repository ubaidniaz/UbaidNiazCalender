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
	
	FxmlLoader(String fxmlFile){
		file = fxmlFile;
	}
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
