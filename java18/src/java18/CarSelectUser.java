package java18;

import javax.swing.JOptionPane;

public class CarSelectUser {
	
	public static void main(String[] args) {
		
		String inputId = JOptionPane.showInputDialog("검색할 id입력 : ");
		
		CarDAO sedao = new CarDAO();
		CarDTO dto = sedao.select(inputId);
		
		
		System.out.println("검색한 Id : " + dto.getId());
		System.out.println("검색한 Name : " + dto.getName());
		System.out.println("검색한 Content : " + dto.getContent());
		System.out.println("검색한 Price : " + dto.getPrice());
	}
}
