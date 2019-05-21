package java22;

public class 증가Thread extends Thread{

	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			System.out.println("증가 : " + i);
		}
	}
}
