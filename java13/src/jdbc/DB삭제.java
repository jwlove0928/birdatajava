package jdbc;

import javax.swing.JOptionPane;

public class DB���� {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("������ id�Է� : ");
		
		DBó��3 db3 = new DBó��3();
		try {
			db3.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
