package java17;

public class BankUser {

	public static void main(String[] args) {
		
		
		Bank b = new Bank();
		BadBank b1 = new BadBank();
		NormalBank n1 = new NormalBank();
		GoodBank g1 = new GoodBank();
		
		System.out.println("BadBank�� ������ : " + b1.getInterestRate());
		System.out.println("NormalBank�� ������ : " + n1.getInterestRate());
		System.out.println("GoodBank�� ������ : " + g1.getInterestRate());
	}

}
