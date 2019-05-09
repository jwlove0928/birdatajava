package java16;

import java.util.ArrayList;

public class °í°´°ü¸®½Ã½ºÅÛ {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("±èµ¥ÀÌ");
		list.add("±è»çÀü");
		list.add("±è±¸Á¶");
		list.add("±èÀÚ·á");
		
		int sum = 100;
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)*sum + "¹ø °í°´´Ô : " + list.get(i));
		}
		
		System.out.println("200¹ø °í°´Àº Å»Åğ, 300¹ø °í°´Àº °³¸í(±èÃæ¼º)");
		
		list.remove(1);
		list.set(2, "±èÃæ¼º");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)*sum + "¹ø °í°´´Ô : " + list.get(i));
		}
	}
}
