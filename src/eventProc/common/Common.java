package eventProc.common;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class Common implements CommonService{

	@Override
	public void exit(Parent root) {
		Stage stage = (Stage) root.getScene().getWindow();
		stage.close();
		
	}

}
