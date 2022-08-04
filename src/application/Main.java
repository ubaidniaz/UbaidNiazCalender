package application;
	
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

//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
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new	FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/CalenderView.fxml"));
			Scene scene = new Scene(root,800,500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ubaid's Final Project");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}