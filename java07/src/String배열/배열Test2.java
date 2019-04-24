package String배열;

import java.util.Scanner;

public class 배열Test2 {

	public static void main(String[] args) {
		
		int[] num1 = new int[5];
		
		for (int i = 0; i < num1.length; i++) {
			num1[i] = i+1;
			System.out.println(num1[i]);
		}		
	}
}
