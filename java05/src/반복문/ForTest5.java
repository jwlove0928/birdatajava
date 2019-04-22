package 반복문;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		
		System.out.println("세 수를 입력 받아서 그 수를 더한 값을 출력하시오");
		System.out.println("==============================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하시오 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하시오 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 수를 입력하시오 : ");
		int num3 = sc.nextInt();
		
		int result = num1 + num2 + num3;
		
		System.out.println("세 수를 더한 값은 : " + result);
		}
	}
