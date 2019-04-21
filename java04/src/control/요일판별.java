package control;

import java.util.Date;

public class 요일판별 {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		int day = date.getDay();
		
		System.out.println("요일별 해야할 일");
		
		switch(day) {
			case 1 :
				System.out.println("월요일 : " + "학원에 가는 날"); break;
			case 2 :
				System.out.println("화요일 : " + "동네 한바퀴 도는 날"); break;
			case 3 :
				System.out.println("수요일 : " + "운동하는 날"); break;
			case 4 :
				System.out.println("목요일 : " + "자바 공부 하는 날"); break;
			case 5 :
				System.out.println("금요일 : " + "볼링 치는 날"); break;
			case 6 :
				System.out.println("토요일 : " + "데이트 하는 날"); break;
			default :
				System.out.println("일요일 : " + "집에서 휴식 취하는 날"); break;
		}
	}
}
