package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBTest {

	public static void main(String[] args) throws Exception{

//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK....");
		
//		2.DB연결(DB명, id, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK....");
		//3.SQL문 결정
		String sql = "insert into member values ('win','win','win','win')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 결정 OK.....");
		//String url = "http://www.naver.com" 이 경우 url에 있는 스트링이라 인식
		//URL url1 = new URL(url); 로 객체화 시켜야 사이트 인식
//		3.SQL선택
//		4.SQL전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK....");
		
		
	}

}
