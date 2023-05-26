package login;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginService {
	private MemberDAO memberDao;
	
	public LoginService() {
		memberDao = new MemberDAO();
	}
	
	public void login(String id, String pw) {
		if(id == null || id.isEmpty()) {
			CommonService.msg("아이디를 입력하세요.");
			return;
		}
		if(pw == null || pw.isEmpty()) {
			CommonService.msg("비밀번호를 입력하세요.");
			return;
		}

		String dbPw = memberDao.login(id);
		if(dbPw != null && dbPw.equals(pw)) {
			// 로그인 성공
			Login.setId(id);
			CommonService.msg("로그인 성공");
			
		} else {
			CommonService.msg("아이디 또는 비밀번호가 틀렸습니다.");
		}
	}
	
}