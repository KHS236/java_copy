package CH08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C01DBconn {

	public static void main(String[] args) {
		
//		DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";
						//DBMS의 위치 이 컴퓨터니까 localhost
		
//		JDBC 참조변수
		Connection conn = null;			//DBMS의 특정 dB와 연결되는 객체
		PreparedStatement pstmt = null; //SQL Query전송용 객체
		ResultSet rs = null;			//표형태(Select 결과물을) 담을 객체
		
		
//		연결작업
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		

	}

}
