package java20;

import java.util.Calendar;

public class calenderTest {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance(); //static�޼ҵ带 ����  Calendar
		
		
		Calendar myday = Calendar.getInstance();
		myday.set(2019, 05, 14, 11, 15, 30);
		
		
		System.out.println(today.get(Calendar.YEAR) + ("��")); // ����
		System.out.println(today.get(Calendar.MONTH)+1 + ("��"));//�� 
		System.out.println(today.get(Calendar.DATE) + ("��"));//��
		System.out.println(today.get(Calendar.HOUR) + ("��"));//�ð�
		System.out.println(today.get(Calendar.MINUTE) + ("��"));//��
		System.out.println(today.get(Calendar.SECOND) + ("��"));//��
		
		
		System.out.println(myday.get(Calendar.YEAR));//set�� ���� �⵵�� �̸� ����
		System.out.println(myday.get(Calendar.SECOND));//set�� ���� �ʰ� �̸� ����
	}
}
