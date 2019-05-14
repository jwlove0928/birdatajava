package java19;

import java.util.HashSet;

public class 팀구성 {

	public static void main(String[] args) {

		HashSet team = new HashSet();
		
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리");
		
		System.out.println("팀원 목록 : " + team);
		
	}

}
