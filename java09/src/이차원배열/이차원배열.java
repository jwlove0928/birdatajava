package 이차원배열;

public class 이차원배열 {
	
	public static void main(String[] args) {
		//배열을 만들때
		//초기값을 지정하는 경우
		int[][] num = {
				{1,2},
				{4,5,6}
				};
		
		System.out.println(num[0][1]); // 2의 값이 위치
		System.out.println(num[1][2]); // 6의 값이 위치
			
		System.out.println("배열의 개수 : " + num.length); //length는 행의 개수만 들어간다
		System.out.println("배열 0행의 열개수 : " + num[0].length);
		System.out.println("배열 1행의 열개수 : " + num[1].length);
			
		//초기값을 지정하지 않는 경우
		int[][] seat = new int[3][10];
		
		for (int i = 0; i < num.length; i++) { //2줄 프린트
			for (int j = 0; j < num[i].length; j++) { //1줄 프린트
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
	}
}
