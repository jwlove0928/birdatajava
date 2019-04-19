package control;

public class Test4 {
	public static void main(String[] args) {
		
		float pi = 3.14f;
		int r = 12;
		double result = pi*r*r;
		
		int width =11;
		int height = 22;
		
		int result2 = width*height;
		
		System.out.println("========================================");
		System.out.println("반지름이 " + r + "인 원의 면적은 ...." + result);
		System.out.println("가로가" + width + "," + " 세로가 " + height + "인 사격형의 면적은 "
						+ result2);
		System.out.print("가로 세로가 같은가요?");
		if(width != height) {
			System.out.println(" false");
		}
		System.out.print("반지름이 10보다 큰가요?");
		if(r > 10) {
			System.out.println(" true");
		}
		System.out.println("========================================");
	}
}
