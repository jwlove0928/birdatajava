package java22;

public class StarThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("¡Ú");
		}
	}
}
