package java18;

import javax.swing.JOptionPane;

public class CarUpdateUser {
	
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("갱신 name 입력 : ");
		String content = JOptionPane.showInputDialog("갱신 content 입력 : ");
		String price = JOptionPane.showInputDialog("갱신 price 입력 : ");
		String id = JOptionPane.showInputDialog("id 입력 : ");
		
		CarDTO dto = new CarDTO();
		
		dto.setName(name);
		dto.setContent(content);
		dto.setPrice(price);
		dto.setId(id);
		
		CarDAO updao = new CarDAO();
		updao.update(dto);
	}

}
