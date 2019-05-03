package jdbc;

import javax.swing.JOptionPane;

public class 八祸贸府2 {

	public static void main(String[] args) throws Exception{
		
		DB贸府 db = new DB贸府();
		String id = JOptionPane.showInputDialog("ID涝仿 : ");
		String[] mem = db.select(id);
		for (String s : mem) {
			JOptionPane.showMessageDialog(null, mem);
		}
		//select * from member where id = ?
	}

}
