package control;

import java.util.Date;

public class 계절판별 {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		int month = date.getMonth() +1;
		
		//String result = "";
		String result = null;//String 초기값이 없어서 null을 입력 ex)기본형변수는 0값
		
		switch(month){
			case 3: case 4: case 5:
				result = "봄"; break;
			case 6: case 7: case 8:
				result = "여름"; break;
			case 9: case 10: case 11:
				result = "가을"; break;
			default :
				result = "겨울"; break;
		}
		System.out.print("지금은 " + month + "월, " + result + "입니다.");
	}
}
