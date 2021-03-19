package eventProc.member;

import java.net.URL;
import java.util.ResourceBundle;

import eventProc.member.service.MemServiceImpl;
import eventProc.member.service.MemberService;
import javafx.fxml.Initializable;
import javafx.scene.Parent;


public class MemController implements Initializable{
	Parent root;
	MemberService ms;
	
	public void setRoot(Parent root) {
		this.root = root;
		ms.setRoot(root);
	}
	public void cancelProc() {	//취소 버튼
		System.out.println("취소 버튼 클릭");
		ms.memberClose();
	}
	public void saveProc() { //가입 버튼
		System.out.println("가입 버튼 클릭");
		ms.memberShip();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new MemServiceImpl();
		
	}
}
