package java16;

import java.util.ArrayList;

public class �������ý��� {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("�赥��");
		list.add("�����");
		list.add("�豸��");
		list.add("���ڷ�");
		
		int sum = 100;
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)*sum + "�� ���� : " + list.get(i));
		}
		
		System.out.println("200�� ���� Ż��, 300�� ���� ����(���漺)");
		
		list.remove(1);
		list.set(2, "���漺");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)*sum + "�� ���� : " + list.get(i));
		}
	}
}
