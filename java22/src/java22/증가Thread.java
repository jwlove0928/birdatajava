package java22;

public class ����Thread extends Thread{

	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			System.out.println("���� : " + i);
		}
	}
}
