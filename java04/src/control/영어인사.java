package control;

import java.util.Date;

public class 영어인사 {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		int hour = date.getHours();
		
		if(hour < 12) {
			System.out.println("Good morning");
		}else if(hour < 17) {
			System.out.println("Good afternoon");
		}else if(hour <20) {
			System.out.println("Good evening");
		}else {
			System.out.println("Good night");
		}
	
	}
}
