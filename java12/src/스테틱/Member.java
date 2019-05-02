package 스테틱;

public class Member {
	
	String name;
	String gender;
	int age;
	
	static int count;
	static int sumage;
	
	public Member() {
		
	}

	public Member(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sumage += age;
	}
	
	public void work() {
		System.out.println("일하다");
	}
	public void friendship() {
		System.out.println("친화력이 있다.");
	}
}
