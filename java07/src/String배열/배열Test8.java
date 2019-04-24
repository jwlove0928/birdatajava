package String배열;

import java.util.Scanner;

public class 배열Test8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int [10];
		int count = 0;
		int money = 10000;
		while(true) {
		

		System.out.println("----------------------------");		
		for (int i = 1; i <= 10 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("----------------------------");		
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
		}			
		System.out.println();
		System.out.println("----------------------------");		
		System.out.print("종료는 x, 예매는 o >>");
		String end = sc.next();
		if(end.equals("x")) {
			System.out.println("예매를 종료합니다.");
			break;
		}
		System.out.println("원하시는 좌석번호를 입력해주세요 : ");
		
		int choose = sc.nextInt();
		
		System.out.println("한 좌석당 10000원입니다. 계속진행하겠습니까? 진행:yes, 취소:no" );
		String contiue = sc.next();
		if(contiue.equals("no")) {
			System.out.println("취소합니다.");
			break;
		}
		if(num[choose-1] != 1) {
			num[choose-1] = 1;
			count++;
			int total = money * count;
			System.out.println("좌석 예매 완료");
			System.out.println("좌석 예매 수 : " + count);
			System.out.println("전체 금액은 : " + total);
		}else {
			System.out.println("이미 예매완료된 자석입니다.");
			System.out.println("다른 좌석을 선택해주세요");
			}
		}
	}	
}
