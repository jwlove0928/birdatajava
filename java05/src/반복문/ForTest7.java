package 반복문;

public class ForTest7 {

	public static void main(String[] args) {
		
		System.out.println("1부터 9까지의 구구단을 출력하세요");
		
		for (int i = 1; i <=9; i++) {
			for (int j = 2; j <=9; j++) {
				System.out.println(i+"단 " + ": " + i + "*" + j + "=" + j*i );
			}
			System.out.println();
		}
	}
}
