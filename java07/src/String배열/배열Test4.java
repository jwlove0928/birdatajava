package String배열;

import java.util.Scanner;

public class 배열Test4 {

	public static void main(String[] args) {
		
		int[] num1 = {11,22,33,44};
		
		for (int i = 0; i < num1.length; i++) {
			if(num1[i] == 33) {
				System.out.println("33의 주소값은 : " + i);
			}
		}
	}
}
