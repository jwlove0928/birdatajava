package 인터페이스2;

public class MemberUser2 {

	public static void main(String[] args) {
		
		MemberDAO2 dao2 = new MemberDAO2();
		MemberDTO2 dto2 = new MemberDTO2 ("kwon","1234","010-8493-7348","부평");
		dao2.insert(dto2);
		dao2.update(dto2);
		dao2.delete("kwon");
		MemberDTO2 dto3 = dao2.select("kwon");
		System.out.println(dto2);
		
	}
}
