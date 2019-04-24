package String배열;

import java.util.Scanner;

public class 배열Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double avr = 0;
		
		int[] score = new int[5];
		System.out.println("5명의 성적을 입력하시오 : ");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			avr = (score[0]+score[1]+score[2]+score[3]+score[4])/5;
		}
		System.out.println("평균 성적은 = " + avr);
		
	}
}
