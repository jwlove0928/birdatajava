package 프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	public void insert(MemberDTO dto) throws Exception{
	
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK..");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 Ok..");
		
		String sql = "insert into menu values (?, ?, ?, ?, ?, ?, ?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getName());
		ps.setString(3, dto.getSort());
		ps.setString(4, dto.getContent());
		ps.setString(5, dto.getImage());
		ps.setString(6, dto.getPrice());
		ps.setString(7, dto.getCompany());
		
		System.out.println("3. SQL문 결정 OK..");
		
		ps.executeUpdate();
		
		System.out.println("4. SQL문 전송  OK...");
	}
	
	public void update(String name, String sort, String content, String image, String price, String company, String id) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 Ok..");
		
		String sql2 = "update menu set name=?, sort=?, content=?, image=?, price=?, company=? where id = ?";
		ps = con.prepareStatement(sql2);
		ps.setString(1, name);
		ps.setString(2, sort);
		ps.setString(3, content);
		ps.setString(4, image);
		ps.setString(5, price);
		ps.setString(6, company);
		ps.setString(7, id);
		
		System.out.println("3. SQL문 결정 OK...");
		
		ps.executeUpdate();
		
		System.out.println("4. SQL문 전송 OK....");
	}
	
	public void delete(String id) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		
		url = "jdbc:mysql://localhost:3306/clothes";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 Ok..");
		
		String sql3 = "delete from menu where id = ?";
		ps = con.prepareStatement(sql3);
		ps.setString(1, id);
		
		System.out.println("3. SQL문 결정 OK...");
		
		ps.executeUpdate();
		
		System.out.println("4. SQL문 전송 OK...");
	}
}
