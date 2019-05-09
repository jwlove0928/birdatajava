package java17;

public class studuentUser {

	public static void main(String[] args) {
		elementary e = new elementary();
		middle m = new middle();
		high h = new high();
		h.unitform = "교복";
		h.progame = "배그";
		System.out.println(h);
		
		h.wearing();
		h.gun();
		
		e.공부하다();
		m.공부하다();
	}

}
