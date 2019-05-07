package 프로젝트;

import javax.swing.JOptionPane;

public class MemberMain1 {

	public static void main(String[] args) {
		
		String uid = JOptionPane.showInputDialog("회원ID 입력 : ");
		String pid = JOptionPane.showInputDialog("제품ID 입력 : ");
		String date = JOptionPane.showInputDialog("날짜 입력 : ");
		
		MemberDAO2 dbinsert = new MemberDAO2();
		try {
			dbinsert.insert(uid, pid, date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
