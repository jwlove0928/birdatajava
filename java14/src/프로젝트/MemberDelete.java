package ������Ʈ;

import javax.swing.JOptionPane;

public class MemberDelete {

	public static void main(String[] args) {

		String id = JOptionPane.showInputDialog("������ ���̵� �Է� : ");
		
		MemberDAO dbDelete = new MemberDAO();
		try {
			dbDelete.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
