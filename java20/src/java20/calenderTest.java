package java20;

import java.util.Calendar;

public class calenderTest {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance(); //static메소드를 통해  Calendar
		
		
		Calendar myday = Calendar.getInstance();
		myday.set(2019, 05, 14, 11, 15, 30);
		
		
		System.out.println(today.get(Calendar.YEAR) + ("년")); // 연도
		System.out.println(today.get(Calendar.MONTH)+1 + ("월"));//달 
		System.out.println(today.get(Calendar.DATE) + ("일"));//일
		System.out.println(today.get(Calendar.HOUR) + ("시"));//시간
		System.out.println(today.get(Calendar.MINUTE) + ("분"));//분
		System.out.println(today.get(Calendar.SECOND) + ("초"));//초
		
		
		System.out.println(myday.get(Calendar.YEAR));//set을 통해 년도값 미리 설정
		System.out.println(myday.get(Calendar.SECOND));//set을 통해 초값 미리 설정
	}
}
