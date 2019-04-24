package String배열;

import java.util.Scanner;

public class 배열Test5 {

	public static void main(String[] args) {
		
		int[] num = {66,77,88,99};
		
		int max = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]){
				max = num[i];
			}
		}
		System.out.println("max값은 : " + max);
	}
}
