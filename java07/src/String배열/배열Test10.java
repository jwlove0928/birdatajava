package String배열;

import java.util.Scanner;

public class 배열Test10 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		int[] java = new int[3];
		int[] spring = new int[3];
		
		int max = java[0];
		int imsi = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i <names.length; i++) {
			System.out.print("학생이름 : ");
			String name = sc.next();
			names[i] = name;
			
			System.out.print("학생점수(자바) : ");
			int JumSu = sc.nextInt();
			java[i] = JumSu;
			
			System.out.print("학생점수(스프링) : ");
			int JumSu2 = sc.nextInt();
			spring[i] = JumSu2;
		}
		System.out.println("=====================");
		for (int i = 0; i < 1; i++) {
			System.out.println("세 학생의 이름은 " + names[0] + ", " + names[1] + ", " + names[2]);
		}
		
		int best = 0;
		
		for (int i = 1; i < java.length; i++) {
			if(max < java[i]) {
				imsi = max;
				max = java[i];
				java[i] = imsi;
				best = i;
			}
		}
		for (int j = 0; j < 1; j++) {
			System.out.println("학생 점수 중 제일 높은 자바 점수는 " + max + names[best] + "입니다.");
		}
		
		int worth = 0;
		
		int min = spring[0];
		int imsi2 = 0;
		for (int i = 1; i < spring.length; i++) {
			if(min > spring[i]) {
				imsi2 = min;
				min = spring[i];
				spring[i] = imsi2;
				worth = i;
			}
		}
		for (int i = 0; i < 1; i++) {
			System.out.println("학생 점수 중 제일 낮은 스프링 점수는 " + min + names[worth] + "입니다.");
		}
	}
}