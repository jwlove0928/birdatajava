package �������̽�;

public class BbsDAO implements BbsInterface {

	@Override
	public void insert(BbsDTO dto) {
		System.out.println("�Խ��� �Է�");
	}

	@Override
	public void update(BbsDTO dto) {
		System.out.println("�Խ��� ����");
	}

	@Override
	public void delete(String id) {
		System.out.println("�Խ��� ��ϻ���");
	}

	@Override
	public BbsDTO select(String id) {
		System.out.println("�Խ��� �˻�");
		
		BbsDTO dto = new BbsDTO("kwon","kwon","kwon");
		return dto;
	}

}
