package 배열;

public class 배열연습2 {

	public static void main(String[] args) {

		int [] list = {44, 66, 22, 88};
		
		int count = 0;
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			count++;
		}
		System.out.println("리스트에 들어있는 값들의 개수 : " + count);
		
		if(list[3] == 88) {
			for (int j = 0; j < list.length; j++) {
				list[0] = 55;
				System.out.println(list[j]);		
			}
		}
	}
}
