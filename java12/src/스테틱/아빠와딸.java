package ����ƽ;

public class �ƺ��͵� {

	public static void main(String[] args) {
		
		dauther d = new dauther();
		dauther d1 = new dauther("��ä��", 29);
		dauther d2 = new dauther("�̼���", 17);
		
		System.out.println("�� ���� ����� ���� ������\n"
				+ "�ƺ����������� 1000�� ���̳ʽ�.");
		System.out.println();
		System.out.println("�ƺ��������� 10,000�� ����־����.");
		System.out.println("�� ���� �ѹ��� �뵷�� ����.");
		System.out.println();
		
		System.out.println("�� ���� �̸��� : " + d1.name + ", " + d2.name);
		System.out.print("�� ���� ���� ���ϴ��� : ");
		d.play(); 
		d.play2();
		System.out.print("�ƺ� ������ �󸶰� ���Ҵ°�... : " + (dauther.money-dauther.count));
		
	}

}
