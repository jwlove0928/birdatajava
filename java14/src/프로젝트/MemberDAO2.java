package 프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {
	
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	public void insert(String uid, String pid, String date) throws Exception{
	
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK..");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 Ok..");
		
		String sql = "insert into orrder values (?, ?, ?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, uid);
		ps.setString(2, pid);
		ps.setString(3, date);
		
		System.out.println("3. SQL문 결정 OK..");
		
		ps.executeUpdate();
		
		System.out.println("4. SQL문 전송  OK...");
	}
	
	public void update(String pid, String date, String uid) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 Ok..");
		
		String sql2 = "update orrder set pid=?, date=? where uid = ?";
		ps = con.prepareStatement(sql2);
		ps.setString(1, pid);
		ps.setString(2, date);
		ps.setString(3, uid);
		
		System.out.println("3. SQL문 결정 OK...");
		
		ps.executeUpdate();
		
		System.out.println("4. SQL문 전송 OK....");
	}
	
	public void delete(String uid) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 Ok..");
		
		String sql3 = "delete from orrder where uid = ?";
		ps = con.prepareStatement(sql3);
		ps.setString(1, uid);
		
		System.out.println("3. SQL문 결정 OK...");
		
		ps.executeUpdate();
		
		System.out.println("4. SQL문 전송 OK...");
	}
}
