package java20;

public class SuperMan extends Man{
	int height;
	String strong;
	
	public SuperMan() {
		System.out.println("³ª´Â ½´ÆÛ¸Ç...");
	}
	
	public SuperMan(int height, String strong) {
//		super();
		this.height = height;
		this.strong = strong;
	}

	public SuperMan(String weak, int weight, int height, String strong) {
		super(weak, weight);
		this.height = height;
		this.strong = strong;
	}
	
	
}
