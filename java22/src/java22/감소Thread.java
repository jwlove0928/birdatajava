package java22;

public class ����Thread extends Thread{

	@Override
	public void run() {
		for (int i = 100; i >= 1; i--) {
			System.out.println("���� : " + i);
		}
	}
}
