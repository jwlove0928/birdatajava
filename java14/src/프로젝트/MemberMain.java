package ������Ʈ;

import javax.swing.JOptionPane;

public class MemberMain {

	public static void main(String[] args) {

		String id = JOptionPane.showInputDialog("id�� �Է� : ");
		String name = JOptionPane.showInputDialog("name�� �Է� : ");
		String sort = JOptionPane.showInputDialog("sort�� �Է� : ");
		String content = JOptionPane.showInputDialog("content�� �Է� : ");
		String image = JOptionPane.showInputDialog("image�� �Է� : ");
		String price = JOptionPane.showInputDialog("price�� �Է� : ");
		String company = JOptionPane.showInputDialog("company�� �Է� : ");
		
		MemberDAO dbinsert = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setName(name);
		dto.setSort(sort);
		dto.setContent(content);
		dto.setImage(image);
		dto.setPrice(price);
		dto.setCompany(company);
		try {
			dbinsert.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
