package jdbc;

import javax.swing.JOptionPane;

public class DB갱신 {

	public static void main(String[] args) {
		
		String tel = JOptionPane.showInputDialog("tel변경값 입력 : ");
		String id = JOptionPane.showInputDialog("id입력 : ");
		
		DB처리2 db2 = new DB처리2();
		try {
			db2.update(tel, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
