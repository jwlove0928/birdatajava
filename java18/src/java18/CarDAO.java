package java18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarDAO {
	
	String url = "jdbc:mysql://localhost:3306/car";
	String user = "root";
	String password = "1234";
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(CarDTO dto) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.Driver 연결OK");
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2.DB연결 OK");
			
			String sql = "insert into carsale values (?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getPrice());
			System.out.println("3.SQL문 결정 OK");
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(CarDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.Driver연결  OK");
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2.DB연결 OK");
			
			String sql1 = "update carsale set name=?, content=?, price=? where id = ?";
			ps = con.prepareStatement(sql1);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getPrice());
			ps.setString(4, dto.getId());
			System.out.println("3.SQL문 결정 OK");
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void delete(CarDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.Driver연결 OK");
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2. DB연결 Ok");
			
			String sql2 = "delete from carsale where id = ?";
			ps = con.prepareStatement(sql2);
			ps.setString(1, dto.getId());
			System.out.println("3.SQL문 결정 OK");
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public CarDTO select(String inputId) {
		CarDTO dto = new CarDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.Driver연결 OK");
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2.DB연결 OK");
			
			String sql3 = "select * from carsale where id = ?";
			ps = con.prepareStatement(sql3);
			ps.setString(1, inputId);
			rs = ps.executeQuery();
			if(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				System.out.println("3.SQL문 결정OK");
			}else {
				System.out.println("값이 없다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		CarDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.Driver연결 OK");
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2.DB연결 OK");
			
			String sql4 = "select * from carsale";
			ps = con.prepareStatement(sql4);
			System.out.println("3.SQL문 전송  OK");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto = new CarDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
