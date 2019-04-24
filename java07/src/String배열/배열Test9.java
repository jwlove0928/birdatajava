package String배열;

import java.util.Scanner;

public class 배열Test9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		String[] singer = new String[3];
		
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i <singer.length; i++) {
			System.out.print("가수 이름 입력하세요 : ");
			String input = sc.next();
			singer[i] = input;
		}
		for (int i = 0; i < singer.length; i++) {
			System.out.print(singer[i] + ", ");
		}
		System.out.println();
		System.out.println("======================");
		
		String first = "아이유";
		String second = "블랙핑크";
		String thred = "김연우";

		while(true) {
		
		System.out.println("투표를 해주세요");
		System.out.println("1) 아이유, 2) 블랙핑크 3) 김연우");
		System.out.print("당신이 원하는 사람의 번호를 입력해주세요 : ");
		int choose = sc.nextInt();
		
			if(choose == 1) {
				count++;
			}else if(choose == 2) {
				count1++;
			}else if(choose == 3) {
				count2++;
			}else {
				break;
			}
		}
		System.out.println(first + ": " + count);
		System.out.println(second + ": " + count1);
		System.out.println(thred + ": " + count2);
		
	}
}