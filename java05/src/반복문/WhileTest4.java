package 반복문;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
	
		
		System.out.println("두수를 입력받아 조건에 맞는 값을 구하시오");
		System.out.println("==========================");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두수를 입력하세요");
		System.out.println("==========================");
		System.out.print("첫번째 수를 입력하시오 : ");
		int n1 =  sc.nextInt();
		System.out.print("두번째 수를 입력하시오 : ");
		int n2 =  sc.nextInt();
		
		int num1 = n1;
		int num2 = n2;
		
		int sum = 0;
		
		while(num1 <= num2) {
			sum = sum + num1;
			num1++;
		}
		System.out.println("11부터 20까지의 합은 : " + sum);
	}

}
