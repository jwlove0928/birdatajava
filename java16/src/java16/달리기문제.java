package java16;

import java.util.ArrayList;

public class �޸��⹮�� {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add("�ڼ���");
		list.add("������");
		list.add("������");
		list.add("�谳��");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "�� : " + list.get(i));
		}
		System.out.println("2���� ��Ģ -> Ż��");
		list.remove(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "�� : " + list.get(i));
		}
	}

}
