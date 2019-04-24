package String배열;

import java.util.Scanner;

public class 배열Test6 {

	public static void main(String[] args) {
		
		int[] num = {66,77,88,99};
		
			int imsi = num[0];
			num[0] = num[3];
			num[3] = imsi;			
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
