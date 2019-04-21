package control;

import java.util.Scanner;

public class 성적등급 {
	public static void main(String[] args) {
		
		System.out.println("등급별로 평가를 해주세요.");
		System.out.println("===================");
		System.out.print("등급을 입력해주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char data = s.charAt(0);
		
		switch(data) {
			case 'A' :
				System.out.println("최우수입니다."); break;
			case 'B' :
				System.out.println("우수입니다."); break;
			case 'C' :
				System.out.println("보통입니다."); break;
			default :
				System.out.println("통과하지 못했습니다."); break;
		}
	}
}
