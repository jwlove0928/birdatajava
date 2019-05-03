package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DBó�� {
	//�������
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	
	//����޼ҵ�
	public String[] select(String id) throws Exception{

//		1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK....");
		
//		2.DB����(DB��, id, pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� OK....");
		
		//3.SQL�� ����
		String sql = "select * from member where id = ?";
		ps = con.prepareStatement(sql); //?�� �������� �ν�
		ps.setString(1, id);
		
		System.out.println("3. SQL�� ���� OK.....");
		
//		String url = "http://www.naver.com" �� ��� url�� �ִ� ��Ʈ���̶� �ν�
//		URL url1 = new URL(url); �� ��üȭ ���Ѿ� ����Ʈ �ν�
//		3.SQL����
//		4.SQL����
		
		rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� OK....");
		String[] mem = null;
		
		if(rs.next()) { //���ڵ� ����
			mem = new String[4];
			String s1 = rs.getString(1); //id
			String s2 = rs.getString(2); //pw
			String s3 = rs.getString(3); //name
			String s4 = rs.getString(4); //tel
			mem[0] = s1;
			mem[1] = s2;
			mem[2] = s3;
			mem[3] = s4;
//			System.out.println("�˻��� ID : " + s1);
//			System.out.println("�˻��� PW : " + s2);
//			System.out.println("�˻��� NAME : " + s3);
//			System.out.println("�˻��� TEL : " + s4);
		}else { //���ڵ� ����x
			System.out.println("�˻� ����� �����ϴ�.");
		}
		return mem; //�迭���� ������ null�� ����.
	}
	
	public void insert(String id, String pw, String name, String tel) throws Exception{

//		1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK....");
		
//		2.DB����(DB��, id, pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� OK....");
		
		//3.SQL�� ����
		String sql = "insert into member values (?, ?, ?, ?)";
		ps = con.prepareStatement(sql); //?�� �������� �ν�
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. SQL�� ���� OK.....");
		
//		String url = "http://www.naver.com" �� ��� url�� �ִ� ��Ʈ���̶� �ν�
//		URL url1 = new URL(url); �� ��üȭ ���Ѿ� ����Ʈ �ν�
//		3.SQL����
//		4.SQL����
		
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� OK....");
	}

}
