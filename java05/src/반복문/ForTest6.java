package 반복문;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		
		System.out.println("문자열 2개를 입력받아 출력하시오");
		
		System.out.println("=====================");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 문자열 : ");
		String text = sc.next();		
		System.out.print("두번째 문자열 : ");
		String text2 = sc.next();
		
		System.out.println("**" + text + " " + text2 + "**");
	}
}
