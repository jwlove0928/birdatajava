package control;

import java.util.Date;

public class 년도계산 {
	public static void main(String[] args) {
		
		Date date = new Date();
		int year = date.getYear() + 1900;
		int result = 2222-year;
		
		System.out.println("년도 계산");
		System.out.println("=============================");
		System.out.println("앞으로 2222년 되기까지의 남은 년도는 " + result + "년입니다.");
	}
}
