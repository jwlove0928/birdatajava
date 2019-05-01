package 스테틱;

public class ClockResult {

	public static void main(String[] args) {

		Clock c = new Clock(5000,"장채연",1,"회사1");
		Clock c1 = new Clock(10000,2,"회사2");
		Clock c2 = new Clock(30000,"회사3");
		
		System.out.println("객체 첫번째 회사이름과 가격 : " + c.getcompany() + " " + c.getPrice());
		System.out.println("객체 두번째 회사이름과 가격 : " + c1.getcompany() + " " + c1.getPrice());
		System.out.println("객체 세번째 회사이름과 가격 : " + c2.getcompany() + " " + c2.getPrice());
		
		
	}

}
