package java19;

import java.util.ArrayList;

public class ListTest {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		
		
		list.add("나는 스트링");
		list.add(100);
//		int <---> Integer 자동변환
//		int --> Inteer --> Object
//		int ---> Integer (auto-boxing) 기초형이 클래스로 바꾸느것
//		boxing	upcasting
//		int <--- Integer (auto-unboxing) 클래스를 기초형으로 변환하는것

		int num = (Integer)list.get(1);
		
		list.add(11.22);
		list.add(true);
		
		MemberDTO dto = new MemberDTO("java","java","java","java");
		list.add(dto);
		list.remove(3);
		
		System.out.println(list);
	}
}
