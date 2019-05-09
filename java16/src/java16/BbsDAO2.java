package java16;

import java.sql.*;
import java.util.ArrayList;

import java16.BbsDTO;

public class BbsDAO2 {
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		
		BbsDTO dto = null; //변수의 생존범위 : 선언의 위치!!
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 OK..");
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK...");
			//3. SQL문 결정(객체화)
			String sql = "select * from bbs";
			ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 결정 OK...");
			//4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 OK...");
			//SQL문의 결과가 있으면, 받아서 처리
			while(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
				list.add(dto);
			}//while close			
			
		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생...");
			System.out.println(e.getMessage());
		} finally { //에러 발생 여부와 상관없이 무조건 실행시켜야 하는 코드있을시 사용
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("자원 해제 중 에러 발생!!");
			} //catch
		} //try - catch - finally
		
		return list;
	}
	//CRUD
	//각각을 메소드를 만들어야한다.
	//SQL문 select * from bbs where id = ?
	public BbsDTO select(String inputId) {
		BbsDTO dto = null; //변수의 생존범위 : 선언의 위치!!
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 OK..");
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK...");
			//3. SQL문 결정(객체화)
			String sql = "select * from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3. SQL문 결정 OK...");
			//4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 OK...");
			//SQL문의 결과가 있으면, 받아서 처리
			if(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
			}else {
				System.out.println("검색 결과가 없습니다.");
			}
			
			
		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생...");
			System.out.println(e.getMessage());
		} finally { //에러 발생 여부와 상관없이 무조건 실행시켜야 하는 코드있을시 사용
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("자원 해제 중 에러 발생!!");
			} //catch
		} //try - catch - finally
		return dto;
	} //select
	public void insert(String id, String title, String content, String etc) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
		String sql1 = "insert into bbs values (?, ?, ?, ?)";
		ps = con.prepareStatement(sql1);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, etc);
		System.out.println("3. SQL문 결정 OK...");
		
		ps.executeUpdate();
	}
	public void update(String id, String title, String content, String etc) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정  OK");
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
		String sql2 = "update bbs set title=?, content=?, etc=? where id = ?";
		
		ps = con.prepareStatement(sql2);
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setString(3, etc);
		ps.setString(4, id);
		
		System.out.println("3. SQL문 결정 OK...");
		
		ps.executeUpdate();
	}
	public void delete(String id) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK..");
		
		con = DriverManager.getConnection(url,user,password);
		System.out.println("2. DB연결 OK..");
		
		String sql3 = "delete from bbs where id = ?";
		ps = con.prepareStatement(sql3);
		ps.setString(1, id);
		
		System.out.println("3. SQL문 결정 OK..");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK..");
	}
} //class
