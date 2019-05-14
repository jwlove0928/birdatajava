package java18;

import java.util.ArrayList;

public class CarSelctAllUser {
	public static void main(String[] args) {
		
		CarDAO seadao = new CarDAO();
		ArrayList list = seadao.selectAll();
		
		for (int i = 0; i < list.size(); i++) {
			CarDTO dto = (CarDTO)list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getName());
			System.out.println(dto.getContent());
			System.out.println(dto.getPrice());
		}
	}

}
