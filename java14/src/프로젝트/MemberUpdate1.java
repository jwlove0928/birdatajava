package ������Ʈ;

import javax.swing.JOptionPane;

public class MemberUpdate1 {

	public static void main(String[] args) {

		String pid = JOptionPane.showInputDialog("��ǰID�Է� : ");
		String date = JOptionPane.showInputDialog("��¥�Է� : ");
		String uid = JOptionPane.showInputDialog("ȸ��ID�Է� : ");
		
		MemberDAO2 dbupdate = new MemberDAO2();
		
		try {
			dbupdate.update(pid, date, uid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
