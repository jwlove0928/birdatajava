package java20;

public class Truck extends Car {
	int weight;
	int length;
	
	public Truck() {
		System.out.println("Ʈ�� ��ü ����...");
	}

	public Truck(int weight, int length) {
//		super(); //super() == public Car() //�ڽ� Ŭ���� ������ �θ��� �⺻ ������(public Car())�� ������ ȣ���ϰ� �Ǿ��ִ�.
		this.weight = weight;
		this.length = length;
	}

	public Truck(String color, int speed, int weight, int length) {
		super(color, speed);
		this.weight = weight;
		this.length = length;
	}
	
	
}
