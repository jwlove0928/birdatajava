package java18;

import javax.swing.JOptionPane;

public class CarSelectUser {
	
	public static void main(String[] args) {
		
		String inputId = JOptionPane.showInputDialog("�˻��� id�Է� : ");
		
		CarDAO sedao = new CarDAO();
		CarDTO dto = sedao.select(inputId);
		
		
		System.out.println("�˻��� Id : " + dto.getId());
		System.out.println("�˻��� Name : " + dto.getName());
		System.out.println("�˻��� Content : " + dto.getContent());
		System.out.println("�˻��� Price : " + dto.getPrice());
	}
}
