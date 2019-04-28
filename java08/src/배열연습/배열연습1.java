package 배열연습;

import java.util.Scanner;

public class 배열연습1 {

	public static void main(String[] args) {
		
		System.out.println("수강 신청을 진행합니다");
		System.out.println("원하는 과목을 신청해주세요.");
		
		int[] num = new int[5];
		
		while(true) {
		System.out.println("1)자바 2)스프링 3)안드로이드 4)파이썬 5)제이쿼리");
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		System.out.println("===================================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 과목코드를 입력해주세요.(종료 0)==> ");
		int major = sc.nextInt();

		if(major == 0){
			System.out.println("신청을 종료합니다.");
			System.out.println("안녕히가세요.");
			break;
		}
		if(num[major-1] != 1) { //입력값에 -1 즉 1을 입력하였을때 주소값이 0이라면
			num[major-1] = 1; //주소값에 1을 입력하여 수강신청 확인 보여주기
				System.out.println("신청가능 합니다.");
				System.out.println("신청완료되었습니다.");	
		}else if(num[major-1] == 1){ //주소값이 이미 1이라면 다시입력
			System.out.println("신청 불가능 합니다..");
			System.out.println("다른 코드 번호를 입력해주세요.");
		}
		}
	}
}