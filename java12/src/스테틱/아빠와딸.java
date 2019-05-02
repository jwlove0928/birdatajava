package 스테틱;

public class 아빠와딸 {

	public static void main(String[] args) {
		
		dauther d = new dauther();
		dauther d1 = new dauther("장채연", 29);
		dauther d2 = new dauther("이소윤", 17);
		
		System.out.println("두 딸이 용든을 받을 떄마다\n"
				+ "아빠지갑에서는 1000씩 마이너스.");
		System.out.println();
		System.out.println("아빠지갑에는 10,000이 들어있었어요.");
		System.out.println("두 딸은 한번씩 용돈을 받음.");
		System.out.println();
		
		System.out.println("두 딸의 이름은 : " + d1.name + ", " + d2.name);
		System.out.print("두 딸이 매일 뭐하느냐 : ");
		d.play(); 
		d.play2();
		System.out.print("아빠 지갑에 얼마가 남았는가... : " + (dauther.money-dauther.count));
		
	}

}
