package eventProc;

import java.net.URL;
import java.util.ResourceBundle;

import eventProc.common.Common;
import eventProc.member.MemberMain;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable {
	Parent root;
	MemberMain mm;
	public static Common cm; //공통적으로 사용할 기능
	static {
		cm = new Common();
	}
	
	public void setRoot(Parent root) {
		this.root = root;
		
	}
	public void loginProc() {
		
	}
	public void cancelProc() {
		System.out.println("취소 버튼 선택");
		cm.exit(root);
	}
	public void memberProc() {
		System.out.println("회원가입 버튼 클릭");
		mm.saveMemberStage();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mm = new MemberMain();
		
	}

}
