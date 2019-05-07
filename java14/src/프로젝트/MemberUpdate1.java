package 프로젝트;

import javax.swing.JOptionPane;

public class MemberUpdate1 {

	public static void main(String[] args) {

		String pid = JOptionPane.showInputDialog("제품ID입력 : ");
		String date = JOptionPane.showInputDialog("날짜입력 : ");
		String uid = JOptionPane.showInputDialog("회원ID입력 : ");
		
		MemberDAO2 dbupdate = new MemberDAO2();
		
		try {
			dbupdate.update(pid, date, uid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
