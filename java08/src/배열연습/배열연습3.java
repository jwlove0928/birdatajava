package 배열연습;

import java.util.Scanner;

public class 배열연습3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("파티에 참석한 사람의 명단(이름 + 나이)을 입력");
		
		String[] names = new String[5];
		int[] age = new int[5];
		
		
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			count++;
		}
		
		System.out.println("전체 인원수 출력 : " + count + "명");
		
		System.out.println("====================");
		
		System.out.print("이름을 입력하시오 : ");
		String name = sc.next();
		System.out.print("나이를 입력하시오 : ");
		int ages = sc.nextInt();
		
		for (int i = 0; i < names.length; i++) {
			names[i] = name;			
			age[i] = ages;
			System.out.println(names[i] + " " + age[i]);
		}
	}
}
