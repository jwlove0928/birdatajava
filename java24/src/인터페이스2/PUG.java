package 인터페이스2;

public class PUG implements Game {

	@Override
	public void start() {
		System.out.println("게임을 시작하다.");
	}

	@Override
	public void move() {
		System.out.println("캐릭터를 움직이다.");
	}

	@Override
	public void shout() {
		System.out.println("총을 쏘다.");
	}

}
