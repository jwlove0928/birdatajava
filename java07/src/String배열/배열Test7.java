package String배열;

import java.util.Scanner;

public class 배열Test7 {

	public static void main(String[] args) {
		
		//숫자를 최소값 순서대로 배열하기
		
		int[] num = {12,1,56,77,66,99,89};
		
		int min = num[0];
		int imsi = 0;
		
		for (int i = 1; i < num.length; i++) {
			if(min>num[i]) {
				imsi = min;
				min = num[i];
				num[i] = min;
			}
			System.out.println(num[i]);
//			imsi = num[6];
//			num[6] = num[0];
//			num[0] = imsi;
//			System.out.println(num[i]);
		}
	}	
}
