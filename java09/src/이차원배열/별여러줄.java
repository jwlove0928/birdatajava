package 이차원배열;

public class 별여러줄 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { //10줄 프린트
			for (int j = 0; j < 10; j++) { //1줄 프린트
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
