package java22;

public class 감소Thread extends Thread{

	@Override
	public void run() {
		for (int i = 100; i >= 1; i--) {
			System.out.println("감소 : " + i);
		}
	}
}
