package java19;

import java.util.ArrayList;

public class LIstTest2 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("���� ��Ʈ��"); 
		//String(�ڽ�, �۴�) -> Object(�θ�, ũ��)
		//�ڵ�����ȯ, ��ĳ����
		list.add(100);
		
		System.out.println(list);
		
		String name = (String)list.get(0);
		//Object(�θ�, ũ��) -> String(�ڽ�, �۴�)
		//��������ȯ, �ٿ�ĳ����
	}
}
