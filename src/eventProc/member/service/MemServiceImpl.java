package eventProc.member.service;

import eventProc.Controller;
import eventProc.memberDTO.MemDTO;
import javafx.scene.Parent;
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
		TextField pw = (TextField) root.lookup("#fxPw");
		TextField name = (TextField) root.lookup("#fxName");
		TextField age = (TextField) root.lookup("#fxAge");
		TextArea addr = (TextArea) root.lookup("#fxAddress");
		
		MemDTO dto = new MemDTO();
		dto.setId(id.getText());
		dto.setId(pw.getText());
		dto.setId(name.getText());
		dto.setId(age.getText());
		dto.setId(addr.getText());
		if(gender) {
			dto.setGender(1);
		}else {
			dto.setGender(0);
		}
	}
	
}














