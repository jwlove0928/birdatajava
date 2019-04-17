package cal;

import java.util.Scanner;

public class CalTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은? ");
		String name = sc.next();
		System.out.println("당신이 태어난 년도는? ");
		int year = sc.nextInt();
		int age = 2019 - year + 1;
		System.out.print("당신의 관심과목은? ");
		String major = sc.next();
	
//		System.out.println("당신의 이름은? ");
//		System.out.println("당신의 나이는? ");
//		System.out.println("당신의 관심과목은? ");
//		
//		String name = sc.next();
//		int age = sc.nextInt();
//		String major = sc.next();
		
		
		System.out.println("------------");
		System.out.println(name + "님은 " + year + "살이고, " + major + "에 관심있습니다.");
		System.out.println("정확한 나이는 " + age);
	}

}
