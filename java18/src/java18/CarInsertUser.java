package java18;

import javax.swing.JOptionPane;

public class CarInsertUser {
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("�Է��� id : ");
		String name = JOptionPane.showInputDialog("�Է��� name : ");
		String content = JOptionPane.showInputDialog("�Է��� content : ");
		String price = JOptionPane.showInputDialog("�Է��� price : ");
		
		CarDAO indao = new CarDAO();
		CarDTO dto = new CarDTO();
		
		dto.setId(id);
		dto.setName(name);
		dto.setContent(content);
		dto.setPrice(price);
		
		indao.insert(dto);
	}
	
}
