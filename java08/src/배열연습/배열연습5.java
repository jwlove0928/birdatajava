package 배열연습;

import java.util.Scanner;

public class 배열연습5 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	  int[] num = new int[5];
			      
	  	System.out.println("----------콘도 예약을 진행합니다.----------");
			      
	  	System.out.println();
			      
	  	while(true) {
		  System.out.println("원하는 지역을 신청해주세요(각 지역은 2명까지 신청가능)");
		  System.out.println("-----------------------------------------");
		  System.out.println("1)강원도 2)전라도 3)파주 4)제주도 5)충청도");
		  System.out.println("-----------------------------------------");
			      
		for (int i = 0; i < num.length; i++) {
			         System.out.print(num[i]+"\t");
			 }
			System.out.println();
			System.out.println("=========================================");
			      
			      System.out.print("원하시는 지역코드를 입력하세요.(종료는 0)>> ");
			      int code = sc.nextInt();
			      
			      if(code == 0) {
			         System.out.println("종료합니다.");
			         break;
			      }
			      if(num[code-1] != 2) {
			            num[code-1]++;
			            System.out.println("신청 완료입니다.");
			            System.out.println("신청이 완료되었습니다.");
			      }else {
			         System.out.println("인원이 초과하였습니다.");
			      System.out.println("다시 선택해주세요.");
			      }
		}
	}
}