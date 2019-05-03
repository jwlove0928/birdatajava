package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DB처리 {
	//멤버변수
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	
	//멤버메소드
	public String[] select(String id) throws Exception{

//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK....");
		
//		2.DB연결(DB명, id, pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK....");
		
		//3.SQL문 결정
		String sql = "select * from member where id = ?";
		ps = con.prepareStatement(sql); //?를 문법으로 인식
		ps.setString(1, id);
		
		System.out.println("3. SQL문 결정 OK.....");
		
//		String url = "http://www.naver.com" 이 경우 url에 있는 스트링이라 인식
//		URL url1 = new URL(url); 로 객체화 시켜야 사이트 인식
//		3.SQL선택
//		4.SQL전송
		
		rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 OK....");
		String[] mem = null;
		
		if(rs.next()) { //레코드 존재
			mem = new String[4];
			String s1 = rs.getString(1); //id
			String s2 = rs.getString(2); //pw
			String s3 = rs.getString(3); //name
			String s4 = rs.getString(4); //tel
			mem[0] = s1;
			mem[1] = s2;
			mem[2] = s3;
			mem[3] = s4;
//			System.out.println("검색된 ID : " + s1);
//			System.out.println("검색된 PW : " + s2);
//			System.out.println("검색된 NAME : " + s3);
//			System.out.println("검색된 TEL : " + s4);
		}else { //레코드 존재x
			System.out.println("검색 결과가 없습니다.");
		}
		return mem; //배열값이 없으면 null이 들어간다.
	}
	
	public void insert(String id, String pw, String name, String tel) throws Exception{

//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK....");
		
//		2.DB연결(DB명, id, pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK....");
		
		//3.SQL문 결정
		String sql = "insert into member values (?, ?, ?, ?)";
		ps = con.prepareStatement(sql); //?를 문법으로 인식
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. SQL문 결정 OK.....");
		
//		String url = "http://www.naver.com" 이 경우 url에 있는 스트링이라 인식
//		URL url1 = new URL(url); 로 객체화 시켜야 사이트 인식
//		3.SQL선택
//		4.SQL전송
		
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK....");
	}

}
