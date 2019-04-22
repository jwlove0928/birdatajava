package 반복문;

import java.util.Scanner;

public class for무한루프test1 {

	public static void main(String[] args) {
		
		System.out.println("입력 후 출력");
		
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.print("숫자를 입력 : ");
			int num = sc.nextInt();
				if(num == 1) {
					System.out.println("봄");
					break;
				}else if(num == 2) {
					System.out.println("여름");
					break;
				}else if(num == 3) {
					System.out.println("가을");
					break;
				}else if(num == 4) {
					System.out.println("겨울");
					break;
				}else {
					System.out.println("다시 입력");
				}
			}
		}
}
