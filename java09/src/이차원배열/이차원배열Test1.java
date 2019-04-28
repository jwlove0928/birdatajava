package 이차원배열;

public class 이차원배열Test1 {

	public static void main(String[] args) {
		
		int[][] ban1 = {
				{44,55,66},
				{77,88,99,100}
		};
		
		int sum = 0;
		
		for (int i = 0; i < ban1.length; i++) {
			for (int j = 0; j < ban1[i].length; j++) {				
				sum = sum + ban1[i][j];
			}
			System.out.println(i+1+"반의 평균점수는 : " + sum/ban1[i].length);
			sum = 0;
		}

	}

}
