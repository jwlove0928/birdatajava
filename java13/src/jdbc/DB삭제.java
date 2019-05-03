package jdbc;

import javax.swing.JOptionPane;

public class DB昏力 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("昏力且 id涝仿 : ");
		
		DB贸府3 db3 = new DB贸府3();
		try {
			db3.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
