package java18;

import javax.swing.JOptionPane;

public class CarDeleteUser {
	
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("삭제할 id 입력 : ");
		
		CarDTO dto = new CarDTO();
		
		dto.setId(id);
		
		CarDAO dedao = new CarDAO();
		dedao.delete(dto);
	}

}
