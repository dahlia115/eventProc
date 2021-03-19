package eventProc.common;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Common implements CommonService{

	@Override
	public void exit(Parent root) {
		Stage stage = (Stage) root.getScene().getWindow();
		stage.close();
		
	}
	public void alert(String message) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(message);
		alert.show();
		
	}
}
