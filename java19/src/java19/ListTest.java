package java19;

import java.util.ArrayList;

public class ListTest {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		
		
		list.add("���� ��Ʈ��");
		list.add(100);
//		int <---> Integer �ڵ���ȯ
//		int --> Inteer --> Object
//		int ---> Integer (auto-boxing) �������� Ŭ������ �ٲٴ���
//		boxing	upcasting
//		int <--- Integer (auto-unboxing) Ŭ������ ���������� ��ȯ�ϴ°�

		int num = (Integer)list.get(1);
		
		list.add(11.22);
		list.add(true);
		
		MemberDTO dto = new MemberDTO("java","java","java","java");
		list.add(dto);
		list.remove(3);
		
		System.out.println(list);
	}
}
