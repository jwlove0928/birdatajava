package jdbc;

import javax.swing.JOptionPane;

public class �˻�ó��2 {

	public static void main(String[] args) throws Exception{
		
		DBó�� db = new DBó��();
		String id = JOptionPane.showInputDialog("ID�Է� : ");
		String[] mem = db.select(id);
		for (String s : mem) {
			JOptionPane.showMessageDialog(null, mem);
		}
		//select * from member where id = ?
	}

}
