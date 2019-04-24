package String배열;

public class 스트링배열 {

	public static void main(String[] args) {
		
		
		int[] ages = {50,100,10};
		for (int i : ages) {
			System.out.println(i);
		}
		String [] names = {"홍길동", "박길동", "김길동"};
		
		names[2] = "김동길";
		names[names.length-1] = "김동순";
		
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}
//		for (int j = 0; j < names.length; j++) {
//			System.out.println(names[j]);
//		}
		
		for (String imsi : names) { //하나씩 자동으로 증가하며 반복하는 for문
									//imsi라는 임시변수에 하나씩 값을 저장
			System.out.println(imsi);
		}
	}

}
