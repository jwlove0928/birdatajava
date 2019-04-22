package 반복문;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값을 입력 : ");
		int num1 = sc.nextInt();	
		System.out.print("두번째 값을 입력 : ");
		int num2 = sc.nextInt();
		
		
		int sum = 0;
		
		while(num1 <= num2) {
			sum = sum + num1;
			num1++;
		}
		System.out.println("11부터 20까지의 합은 : " + sum);
	}
}
