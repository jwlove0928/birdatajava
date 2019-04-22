package 반복문;

import java.util.Scanner;

public class WhileTest6 {

	public static void main(String[] args) {
		
		System.out.println("1부터 9까지의 곱한값을 구하시오");
//		
//		int num1 = 1;
//		int num2 = 9;
//		
//		int dev = 1;
//		
//		while(num1 <= num2) {
//			dev = dev*num1;
//			num1++;
//		}
//		System.out.println("1부터 9까지의 곱한값은 : " + dev + " 입니다.");
		
		int result = 1;
		
		for(int num1 = 1; num1<=9; num1++) {
				result = num1*result;
			}
			System.out.println(result);
		}
	}
