package sceneBuildersMerge;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class RegService {
	private MemberDAO memberDao;
	
	public RegService() {
		memberDao = new MemberDAO();
	}
	
	public void insert(Parent regForm) {
	
		
		Button regButton = (Button) regForm.lookup("#regButton");
		PasswordField pwFld = (PasswordField) regForm.lookup("#pw");
		PasswordField confirmFld = (PasswordField) regForm.lookup("#confirm");
		if (pwFld.getText().equals(confirmFld.getText())) {
			TextField idFld = (TextField) regForm.lookup("#id");
			if (idFld.getText().isEmpty() == false) {
				TextField nameFld = (TextField) regForm.lookup("#name");
				TextField phoneFld = (TextField) regForm.lookup("#phone");
				TextField carFld = (TextField) regForm.lookup("#car");

				memberDao.insert(idFld.getText(), pwFld.getText(), nameFld.getText(), phoneFld.getText(), carFld.getText());
				CommonService.windowClose(regForm);
			} else {
				CommonService.msg("아이디를 입력하고 다시 시도하세요.");
			}
		} else {
			CommonService.msg("비밀번호를 확인 후 다시 입력하세요.");
		}
	}
}