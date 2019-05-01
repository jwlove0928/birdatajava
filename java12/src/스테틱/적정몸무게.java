package 스테틱;

public class 적정몸무게 {

	public static void main(String[] args) {

		Person p = new Person();
		Person p1 = new Person(180,75,"비밀","주소");
		
		System.out.println("자신의 적정몸무게 : " + (p1.height-100)*0.9);
		
	}

}
