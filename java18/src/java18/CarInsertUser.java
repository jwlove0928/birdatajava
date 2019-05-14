package java18;

import javax.swing.JOptionPane;

public class CarInsertUser {
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("입력할 id : ");
		String name = JOptionPane.showInputDialog("입력할 name : ");
		String content = JOptionPane.showInputDialog("입력할 content : ");
		String price = JOptionPane.showInputDialog("입력할 price : ");
		
		CarDAO indao = new CarDAO();
		CarDTO dto = new CarDTO();
		
		dto.setId(id);
		dto.setName(name);
		dto.setContent(content);
		dto.setPrice(price);
		
		indao.insert(dto);
	}
	
}
