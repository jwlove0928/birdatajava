package java16;

import java.util.ArrayList;

public class MemberDAO {

	public ArrayList selectAll() {
		
		MemberDTO d1 = new MemberDTO("111","1234","�����","11111111");
		MemberDTO d2 = new MemberDTO("222","1234","��ĥ��","22222222");
		MemberDTO d3 = new MemberDTO("333","1234","����","33333333");
		ArrayList list = new ArrayList();
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		return list;
		//dto�� 3���� ����  list�� ��������.
		//�� ����Ʈ�� ����.
		
	}

}
