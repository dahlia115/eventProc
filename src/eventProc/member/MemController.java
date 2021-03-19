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
	public void cancelProc() {	//��� ��ư
		System.out.println("��� ��ư Ŭ��");
		ms.memberClose();
	}
	public void saveProc() { //���� ��ư
		System.out.println("���� ��ư Ŭ��");
		ms.memberShip();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new MemServiceImpl();
		
	}
}
