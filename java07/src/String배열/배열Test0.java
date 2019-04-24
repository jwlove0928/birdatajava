package String배열;

import java.util.Scanner;

public class 배열Test0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] text = new String[3];
		
		for (int i = 0; i < text.length; i++) {
			System.out.println("문자 입력 : ");
			text[i] = sc.next();
		}
		System.out.println("**" + text[0] +"보다는 " + text[2] + "**");
	}

}
