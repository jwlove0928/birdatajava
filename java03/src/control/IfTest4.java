package control;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("두 수를 입력하시오 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 >= num2) {
			System.out.println(num1 + " >= " + num2);
		}else {
			System.out.println(num1 + " <= " + num2);
		}
	}

}
