package java22;

public class ThreadUser2 {

	public static void main(String[] args) {

		����Thread increase = new ����Thread();
		����Thread decrease = new ����Thread();
		
		increase.start();
		decrease.start();
	}

}
