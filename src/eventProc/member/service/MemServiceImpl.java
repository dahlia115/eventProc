package eventProc.member.service;

import eventProc.Controller;
import eventProc.database.DatabaseService;
import eventProc.database.DatabaseServiceImpl;
import eventProc.memberDTO.MemDTO;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MemServiceImpl implements MemberService {
	Parent root;
	@Override
	public void setRoot(Parent root) {
		this.root = root;
		
	}

	@Override
	public void memberClose() {
		Controller.cm.exit(root);
		
	}
	public boolean getGender() {
		RadioButton man = (RadioButton) root.lookup("#rdoMan");
		return man.isSelected();//true or false
	}
	@Override
	public void memberShip() {
		boolean gender = getGender();
		TextField id = (TextField) root.lookup("#fxId");
		PasswordField pw = (PasswordField) root.lookup("#fxPw");
		TextField name = (TextField) root.lookup("#fxName");
		TextField age = (TextField) root.lookup("#fxAge");
		TextArea addr = (TextArea) root.lookup("#fxAddress");
		
		System.out.println(id.getText());
		System.out.println(pw.getText());
		System.out.println(name.getText());
		System.out.println(age.getText());
		System.out.println(addr.getText());
		System.out.println(gender);
		
		MemDTO dto = new MemDTO();
		dto.setId(id.getText());
		dto.setPw(pw.getText());
		dto.setName(name.getText());
		dto.setAge(age.getText());
		dto.setAddr(addr.getText());
		if(gender) {
			dto.setGender(1);
		}else {
			dto.setGender(0);
		}
		
		DatabaseService ds = new DatabaseServiceImpl();
		
		int result = ds.saveMember(dto);
		if(result == 1) {
			Controller.cm.alert("가입 성공");
			Controller.cm.exit(root);
		}else {
			Controller.cm.alert("가입 실패");
		}
	}
	
}














