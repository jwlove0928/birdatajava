package ������Ʈ;

import javax.swing.JOptionPane;

public class MemberDelete1 {

	public static void main(String[] args) {

		String uid = JOptionPane.showInputDialog("������ID�Է� : ");
		
		MemberDAO2 dbdelete = new MemberDAO2();
		try {
			dbdelete.delete(uid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
