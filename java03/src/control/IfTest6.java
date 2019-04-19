package control;

import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 점수 입력 : ");
		int jumsu = sc.nextInt();
		String result;
		
		if(jumsu >= 90) {
			//System.out.println("A");
			result = "A";
		}else if(jumsu<90 && jumsu>=80) {
			//System.out.println("A");
			result = "B";
		}else if(jumsu<80 && jumsu>=70) {
			//System.out.println("A");
			result = "C";
		}else if(jumsu<70 && jumsu>=60) {
			//System.out.println("A");
			result = "D";
		}else {
			//System.out.println("A");
			result = "F";
		}
		
		System.out.println("당신의 학점은 " + result + "입니다.");
	}

}
