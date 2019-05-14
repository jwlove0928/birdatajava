package java19;

import java.util.HashMap;

public class 게시판 {

	public static void main(String[] args) {

		HashMap board = new HashMap();
		
		BoardMember b1 = new BoardMember("나는 누구인가", "모르겠다", "kim", "1234");
		BoardMember b2 = new BoardMember("나는 누구인가", "나는 나다", "park", "5678");
		BoardMember b3 = new BoardMember("나는 누구인가", "왜물어보냐", "kwon", "9101");
		
		board.put(100, b1);
		board.put(200, b2);
		board.put(300, b3);
		
		
		System.out.println(board);
		
		for (int i = 1; i <= board.size(); i++) {
			System.out.println(board.get(100*i));
		}
	}
}
