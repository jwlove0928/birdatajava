package jdbc;

import javax.swing.JOptionPane;

public class �˻�ó�� {

	public static void main(String[] args) throws Exception{
		
		DBó�� db = new DBó��();
		String id = JOptionPane.showInputDialog("ID�Է� : ");
		String[] mem = db.select(id);
		for (String s : mem) {
			System.out.println(s);
		}
		//select * from member where id = ?
	}

}
