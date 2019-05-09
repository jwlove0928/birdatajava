package java17;

public class BankUser {

	public static void main(String[] args) {
		
		
		Bank b = new Bank();
		BadBank b1 = new BadBank();
		NormalBank n1 = new NormalBank();
		GoodBank g1 = new GoodBank();
		
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : " + n1.getInterestRate());
		System.out.println("GoodBank의 이자율 : " + g1.getInterestRate());
	}

}
