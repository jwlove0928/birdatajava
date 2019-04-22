package 반복문;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		
			System.out.println("입력받은 값만큼 ★을 출력하시오");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("값을 입력하시오 : ");
			
			int star = sc.nextInt();
			
			for (int i = 0; i < star; i++) {
				System.out.print("★");
			}
		}
	}
