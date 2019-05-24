package 인터페이스2;

public class MemberDAO2 implements MemberInterface2 {

	@Override
	public void insert(MemberDTO2 dto) {
		System.out.println("회원 가입");
	}

	@Override
	public void update(MemberDTO2 dto) {
		System.out.println("회원 수정");
	}

	@Override
	public void delete(String id) {
		System.out.println("회원 삭제");
	}

	@Override
	public MemberDTO2 select(String id) {
		
		MemberDTO2 dto2 = new MemberDTO2 ("kwon","1234","010-9832-8345","부평");
		
		return dto2;
	}

}
