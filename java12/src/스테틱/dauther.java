package ����ƽ;

public class dauther {

	String name;
	int age;
	static int count;
	static int money;
	
	public dauther() {
	}
	
	public dauther(String name, int age) {
		this.name = name;
		this.age = age;
		money = 10000;
		count = 1000;
		count += count;
	}
	public void play() {
		System.out.print("�پ���");
	}
	public void play2() {
		System.out.println("TV����");
	}
}
