package control;

import java.util.Random;
import java.util.Scanner;

public class IfTest7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int target = random.nextInt(100);
		int count = 0;
		while(true) {
			count = count + 1;
			System.out.print("당신이 생각한 숫자를 입력하세요>> ");
			int guess = sc.nextInt();
			if(target == guess) {
				System.out.println("정답입니다.");
				System.out.println("당신이 시도한 횟수는 " + count);
				break; //while문의 무한루프를 끝내기 위한 명령어!
			}else {
				System.out.println("정답이 아닙니다. 다시 입력해주세요");
				if(target < guess) {
					System.out.println("정답보다 너무 커요");
				}else {
					System.out.println("정답보다 너무 작아요");
				}
			} //else end.
		} //while end.
	} //main end.
} //class end.
