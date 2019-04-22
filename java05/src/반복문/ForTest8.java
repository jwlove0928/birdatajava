package 반복문;

import java.util.Scanner;

public class ForTest8 {

	public static void main(String[] args) {
		
		System.out.println("다음과 같이 출력하세요 (1.-봄 2.-여름 3.-가을 4.-겨울");
		System.out.println("=======================================");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("계절은 봄입니다.");
				break;
			}else if(num == 2) {
				System.out.println("계절은 여름입니다.");
				break;
			}else if(num == 3) {
				System.out.println("계절은 가을입니다.");
				break;
			}else if(num == 4){
				System.out.println("계절은 겨울입니다.");
				break;
			}	
		}
	}
}
