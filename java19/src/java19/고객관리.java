package java19;

import java.util.HashMap;

public class ������ {

	public static void main(String[] args) {
		
		 HashMap mem = new HashMap();
		 
		 mem.put(100, "�赥��");
		 mem.put(200, "�����");
		 mem.put(300, "�豸��");
		 mem.put(400, "���ڷ�");
		 
		 System.out.println(mem);
		 
		 System.out.println("200�� ���� Ż��, 300���� ���� ����(���漺)");
		 
		 mem.remove(200);
		 mem.put(300, "���漺");
		 
		 System.out.println(mem);
	}

}
