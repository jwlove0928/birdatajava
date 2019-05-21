package java22;

public class ThreadUser3 {

	public static void main(String[] args) {

		StarThread star = new StarThread();
		PhoneThread phone = new PhoneThread();
		CloberThread clober = new CloberThread();
		
		star.start();
		phone.start();
		clober.start();
		
	}

}
