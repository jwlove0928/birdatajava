package java18;

import javax.swing.JOptionPane;

public class CarUpdateUser {
	
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("���� name �Է� : ");
		String content = JOptionPane.showInputDialog("���� content �Է� : ");
		String price = JOptionPane.showInputDialog("���� price �Է� : ");
		String id = JOptionPane.showInputDialog("id �Է� : ");
		
		CarDTO dto = new CarDTO();
		
		dto.setName(name);
		dto.setContent(content);
		dto.setPrice(price);
		dto.setId(id);
		
		CarDAO updao = new CarDAO();
		updao.update(dto);
	}

}
