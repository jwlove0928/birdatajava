package ����ƽ;

public class ClockResult {

	public static void main(String[] args) {

		Clock c = new Clock(5000,"��ä��",1,"ȸ��1");
		Clock c1 = new Clock(10000,2,"ȸ��2");
		Clock c2 = new Clock(30000,"ȸ��3");
		
		System.out.println("��ü ù��° ȸ���̸��� ���� : " + c.getcompany() + " " + c.getPrice());
		System.out.println("��ü �ι�° ȸ���̸��� ���� : " + c1.getcompany() + " " + c1.getPrice());
		System.out.println("��ü ����° ȸ���̸��� ���� : " + c2.getcompany() + " " + c2.getPrice());
		
		
	}

}
