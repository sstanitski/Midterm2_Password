package MainView;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import MainApp.MainClass;;


public class PasswordControl {
	@FXML
	private Button okButton;
	@FXML
	private Button helpButton;
	@FXML
	private PasswordField passwordField;
	@FXML
	private void ok(){
		if(passwordField.getText().equals("bugaboo")){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Correct");
			alert.setHeaderText("Correct Password");
			alert.setContentText("Your password is correct. Press OK to continue");
			alert.showAndWait();
			
			
		}
		else{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Incorrect");
			alert.setHeaderText("Incorrect Password");
			alert.setContentText("Your password is incorrect. Please try again.");
			alert.showAndWait();
	}
	}
	@FXML
	private void help(){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Help");
		alert.setHeaderText("Help Button Pressed");
		alert.setContentText("Help has been clicked.");
		alert.showAndWait();
	}

}

	
