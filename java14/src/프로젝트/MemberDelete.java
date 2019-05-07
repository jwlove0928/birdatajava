package 프로젝트;

import javax.swing.JOptionPane;

public class MemberDelete {

	public static void main(String[] args) {

		String id = JOptionPane.showInputDialog("삭제할 아이디 입력 : ");
		
		MemberDAO dbDelete = new MemberDAO();
		try {
			dbDelete.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
