package 배열;

public class 배열연습3 {

	public static void main(String[] args) {

		int imsi = 0;
		
		int[] num = {444, 666, 777};
		//배열의 첫번째 값의 세번째 값을 넣어보세요.
		
		num[0] = num[2];
		
		//첫번째 값을 확인, 세번째 값을 확인
		System.out.println(num[0]);
		System.out.println(num[2]);
		
		imsi = num[0];
		num[0] = num[2];
		num[2] = imsi;

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
}
