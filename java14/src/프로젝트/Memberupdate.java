package ������Ʈ;

import javax.swing.JOptionPane;

public class Memberupdate {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("name�� �Է� : ");
		String sort = JOptionPane.showInputDialog("sort�� �Է� : ");
		String content = JOptionPane.showInputDialog("content�� �Է� : ");
		String image = JOptionPane.showInputDialog("image�� �Է� : ");
		String price = JOptionPane.showInputDialog("price�� �Է� : ");
		String company = JOptionPane.showInputDialog("company�� �Է� : ");
		String id = JOptionPane.showInputDialog("id�� �Է� : ");
		
		MemberDAO dbupdate = new MemberDAO();
		try {
			dbupdate.update(name, sort, content, image, price, company, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
