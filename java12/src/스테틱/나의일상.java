package ����ƽ;

public class �����ϻ� {

	public static void main(String[] args) {
		
		Day day1 = new Day("�ڹٰ���", 10, "����");
		Day day2 = new Day("����", 15, "������");
		Day day3 = new Day("�", 11, "��Ʈ�Ͻ�");
		
		System.out.println("��ü �ϴ� ���� �ð��� : " + Day.stime);
		System.out.println("��� �ϴ� ���� �ð��� : " + Day.avr);
		System.out.println("���� ������ �󸶳� ��𿡼� �ߴ��� ����Ʈ : \n" + day1 + "\n" + day2 + "\n" + day3);
		System.out.println("��ĥ �� �ߴ���? : " + Day.count + "��");
	}
}
