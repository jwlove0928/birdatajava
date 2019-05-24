package 인터페이스;

public class BbsUser {

	public static void main(String[] args) {
		
		BbsDAO dao = new BbsDAO();
		BbsDTO dto = new BbsDTO("kwon","kwon","kwon");
		dao.insert(dto);
		dao.delete("kwon");
		dao.update(dto);
		BbsDTO dto2 = dao.select("kwon");
	}

}
