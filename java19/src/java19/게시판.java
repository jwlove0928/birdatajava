package java19;

import java.util.HashMap;

public class �Խ��� {

	public static void main(String[] args) {

		HashMap board = new HashMap();
		
		BoardMember b1 = new BoardMember("���� �����ΰ�", "�𸣰ڴ�", "kim", "1234");
		BoardMember b2 = new BoardMember("���� �����ΰ�", "���� ����", "park", "5678");
		BoardMember b3 = new BoardMember("���� �����ΰ�", "�ֹ����", "kwon", "9101");
		
		board.put(100, b1);
		board.put(200, b2);
		board.put(300, b3);
		
		
		System.out.println(board);
		
		for (int i = 1; i <= board.size(); i++) {
			System.out.println(board.get(100*i));
		}
	}
}
