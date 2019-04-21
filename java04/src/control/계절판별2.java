package control;

import java.util.Date;

public class 계절판별2 {
	public static void main(String[] args) {
		
		Date date = new Date();
	
		int month = date.getMonth()+1;
				
		//String result = "";
		String result = null;//String 초기값이 없어서 null을 입력 ex)기본형변수는 0값
		
		switch(month) {
			case 2 :
				result = "28일까지 있는 달"; break;
			case 1: case 3: case 5: case 7: case 9: case 11:
				result = "30일까지 있는 달"; break;
			case 4: case 6: case 8: case 10: case 12:
				result = "31일까지 있는 달"; break;
		}
		System.out.print("지금은 " + month + "월, " + result + "입니다.");
	}
}
