package java16;

import java.util.ArrayList;


public class BbsDAO {
	
	public ArrayList selectAll() {
		
		BbsDTO b1 = new BbsDTO("100", "java", "fun java", "java");
		BbsDTO b2 = new BbsDTO("200", "jsp", "fun jsp", "jsp");
		BbsDTO b3 = new BbsDTO("300", "spring", "fun spring", "spring");
		BbsDTO b4 = new BbsDTO("400", "android", "fun android", "android");
		ArrayList list = new ArrayList();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		return list;
		
//		System.out.println(list);
//		System.out.println(list.get(0));
//		BbsDTO dto = (BbsDTO)list.get(0);
//		System.out.println(dto.getId());
//		System.out.println(dto.getTitle());
//		System.out.println(dto.getContent());
//		System.out.println(dto.getEtc());
		
	}
}