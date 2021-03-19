package eventProc.member;

import eventProc.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MemberMain {
	public void saveMemberStage() {
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("saveMem.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (Exception e) {
			e.printStackTrace();
		} 		
		Scene scene = new Scene(root);
		
		MemController controller = loader.getController();
		controller.setRoot(root);
		stage.setScene(scene);
		stage.show();
	
	}
}
