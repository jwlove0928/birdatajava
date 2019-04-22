package 반복문;

public class ForTest1 {
	
	int test; //전역변수(global)
	
	public static void main(String[] args) {
		
		int sum = 0;
		int start;
		for(start = 1; start<=10; start++) {
			sum = sum + start;
		}
		System.out.println("1부터 10까지의 합은 : " + sum + " 입니다." );
	}

}
