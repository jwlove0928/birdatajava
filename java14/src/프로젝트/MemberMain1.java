package ������Ʈ;

import javax.swing.JOptionPane;

public class MemberMain1 {

	public static void main(String[] args) {
		
		String uid = JOptionPane.showInputDialog("ȸ��ID �Է� : ");
		String pid = JOptionPane.showInputDialog("��ǰID �Է� : ");
		String date = JOptionPane.showInputDialog("��¥ �Է� : ");
		
		MemberDAO2 dbinsert = new MemberDAO2();
		try {
			dbinsert.insert(uid, pid, date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
