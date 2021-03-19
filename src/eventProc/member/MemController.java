package eventProc.member;

import java.net.URL;
import java.util.ResourceBundle;

import eventProc.Controller;
import javafx.fxml.Initializable;
import javafx.scene.Parent;


public class MemController implements Initializable{
	Parent root;

	
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void cancelProc() {
		Controller.cm.exit(root);
	}
	public void saveProc() {
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
}
