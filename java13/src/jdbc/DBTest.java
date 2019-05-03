package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBTest {

	public static void main(String[] args) throws Exception{

//		1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK....");
		
//		2.DB����(DB��, id, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� OK....");
		//3.SQL�� ����
		String sql = "insert into member values ('win','win','win','win')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL�� ���� OK.....");
		//String url = "http://www.naver.com" �� ��� url�� �ִ� ��Ʈ���̶� �ν�
		//URL url1 = new URL(url); �� ��üȭ ���Ѿ� ����Ʈ �ν�
//		3.SQL����
//		4.SQL����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� OK....");
		
		
	}

}
