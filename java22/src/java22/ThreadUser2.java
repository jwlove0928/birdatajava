package java22;

public class ThreadUser2 {

	public static void main(String[] args) {

		증가Thread increase = new 증가Thread();
		감소Thread decrease = new 감소Thread();
		
		increase.start();
		decrease.start();
	}

}
