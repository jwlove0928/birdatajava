package 인터페이스2;

public interface MemberInterface2 {
	
	void insert(MemberDTO2 dto);
	void update(MemberDTO2 dto);
	void delete(String id);
	MemberDTO2 select(String id);
}
