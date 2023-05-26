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

	public void adminFormOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("adminForm.fxml"));

		Parent adminForm;
		try {
			adminForm = loader.load();
			primaryStage.setScene(new Scene(adminForm));
			primaryStage.setTitle("관리자 화면");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userFormOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("userForm.fxml"));

		Parent userForm;
		try {
			userForm = loader.load();
			primaryStage.setScene(new Scene(userForm));
			primaryStage.setTitle("입주민 화면");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
