package jdbc;

import javax.swing.JOptionPane;

public class DB���� {

	public static void main(String[] args) {
		
		String tel = JOptionPane.showInputDialog("tel���氪 �Է� : ");
		String id = JOptionPane.showInputDialog("id�Է� : ");
		
		DBó��2 db2 = new DBó��2();
		try {
			db2.update(tel, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
