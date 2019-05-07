package 프로젝트;

import javax.swing.JOptionPane;

public class Memberupdate {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("name값 입력 : ");
		String sort = JOptionPane.showInputDialog("sort값 입력 : ");
		String content = JOptionPane.showInputDialog("content값 입력 : ");
		String image = JOptionPane.showInputDialog("image값 입력 : ");
		String price = JOptionPane.showInputDialog("price값 입력 : ");
		String company = JOptionPane.showInputDialog("company값 입력 : ");
		String id = JOptionPane.showInputDialog("id값 입력 : ");
		
		MemberDAO dbupdate = new MemberDAO();
		try {
			dbupdate.update(name, sort, content, image, price, company, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
