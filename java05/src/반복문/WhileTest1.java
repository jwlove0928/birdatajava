package 반복문;

public class WhileTest1 {
	
	public static void main(String[] args) {
		//1~10 까지 더하는 문법
		int start = 1;
		int sum = 0;
		while(start <= 10) {
//			start++;
			sum = sum + start;
			start = start + 1;
		}
		System.out.println(sum);
	}
}
