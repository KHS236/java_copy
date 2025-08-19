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



// DB연결 정리
//	1 DBMS Driver 메모리 적재
//	2. Connection 객체 생성
//	3. PreparedStatement 객체 내 SQL 보관
//	4. .executeQuery() - Select / .executeUpdate() - Insert / Update / Delete
//	5. 자원관리

//	Mysql 아카이브 다운받아서 eclipse에 넣고 자바프로젝트 우클릭 > 프로퍼티
//	> 라이브러리 > Add JARs... > mysql 자바 아카이브 등록 Apply


