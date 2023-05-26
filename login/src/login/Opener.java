package login;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Opener {
	private Stage primaryStage;
	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public void loginOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("loginForm.fxml"));
		
		Parent loginForm;
		try {
			loginForm = loader.load();
			primaryStage.setScene(new Scene(loginForm));
			primaryStage.setTitle("메인 화면");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
