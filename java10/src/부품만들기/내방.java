package 부품만들기;

public class 내방 {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.company = "apple";
		p1.shape = "네모모양";
		p1.size = 11;
		
		System.out.println(p1.company);
		System.out.println(p1.shape);
		System.out.println(p1.size);
		p1.call();
		p1.text();
		p1.alarm();
		System.out.println("---------------");
		
		Phone p2 = new Phone();
		p2.company = "LG";
		p2.shape = "네모모양";
		p2.size = 20;
		System.out.println(p2.company);
		System.out.println(p2.shape);
		System.out.println(p2.size);
		System.out.println("---------------");
		
		
		//생성자 이용
		TV tv1 = new TV();
		tv1.color = "검정색";
		tv1.power = true;
		tv1.size = 50;
		
//		System.out.println(tv1.color);
//		System.out.println(tv1.power);
//		System.out.println(tv1.size);
		
		System.out.println(tv1);
		
		tv1.changeCh();
		tv1.connect();
		tv1.sound();
		System.out.println("---------------");
		
		//class를 복사해서 만든 tv2를 객체(대상, object)라고 한다.
		//new의 역할 : 객체 생성
		TV tv2 = new TV();
		tv2.color = "빨강색";
		tv2.power = true;
		tv2.size = 100;
		
//		System.out.println(tv2.color);
//		System.out.println(tv2.power);
//		System.out.println(tv2.size);
		
		System.out.println(tv2);
	}

}
