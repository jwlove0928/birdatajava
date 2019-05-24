package 인터페이스;

public class BbsDAO implements BbsInterface {

	@Override
	public void insert(BbsDTO dto) {
		System.out.println("게시판 입력");
	}

	@Override
	public void update(BbsDTO dto) {
		System.out.println("게시판 수정");
	}

	@Override
	public void delete(String id) {
		System.out.println("게시판 목록삭제");
	}

	@Override
	public BbsDTO select(String id) {
		System.out.println("게시판 검색");
		
		BbsDTO dto = new BbsDTO("kwon","kwon","kwon");
		return dto;
	}

}
