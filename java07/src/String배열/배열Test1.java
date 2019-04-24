package String배열;

import java.util.Scanner;

public class 배열Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자 입력 : ");
			num[i] = sc.nextInt();
			sum = num[0] + num[2];
		}
		System.out.println(num[0] + " + " + num[2] + " 은 " + sum+"입니다.");
	}
}
