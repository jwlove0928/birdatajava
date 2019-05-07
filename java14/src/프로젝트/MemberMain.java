package 프로젝트;

import javax.swing.JOptionPane;

public class MemberMain {

	public static void main(String[] args) {

		String id = JOptionPane.showInputDialog("id값 입력 : ");
		String name = JOptionPane.showInputDialog("name값 입력 : ");
		String sort = JOptionPane.showInputDialog("sort값 입력 : ");
		String content = JOptionPane.showInputDialog("content값 입력 : ");
		String image = JOptionPane.showInputDialog("image값 입력 : ");
		String price = JOptionPane.showInputDialog("price값 입력 : ");
		String company = JOptionPane.showInputDialog("company값 입력 : ");
		
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
