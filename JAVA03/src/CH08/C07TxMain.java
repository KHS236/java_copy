package CH08;

//	Tranxation
//	데이터베이스 시스템에서 더 이상 쪼갤 수 없는 독립적인 작업 단위




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C07TxMain {

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
			
//			Insert 코드
//			각각 수동으로 값 넣기 (이러면 트랜잭션이 각각 따로따로 지정돼 있음)
//			이 경우 1끼리 겹치면 트랜잭션 예외발생이 일어나지만 2 4는 값이 바뀜
//			얘내를 하나의 트랜잭션 단위로 묶어주면 예외가 발생했을 때 나머지 값들도 변화가 없도록 해줄 수 있음
//			pstmt = conn.prepareStatement("insert into tbl_a values(1,'a')");
//			pstmt.executeUpdate();
//			pstmt = conn.prepareStatement("insert into tbl_a values(2,'b')");
//			pstmt.executeUpdate();
//			pstmt = conn.prepareStatement("insert into tbl_a values(1,'c')");
//			pstmt.executeUpdate();
//			pstmt = conn.prepareStatement("insert into tbl_a values(4,'d')");
//			pstmt.executeUpdate();
			
//			TX START
			conn.setAutoCommit(false); //커밋 = 승인 아래 쿼리문이 원래 자동 커밋인데 자동커밋을 끔
			pstmt = conn.prepareStatement("insert into tbl_a values(1,'a')");
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("insert into tbl_a values(2,'b')");
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("insert into tbl_a values(1,'c')");
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("insert into tbl_a values(4,'d')");
			pstmt.executeUpdate();
//			TX END
			conn.commit();
//			오토커밋을 끄고 켜는 사이에 코드가 하나의 트랜잭션 단위로 묶인다
//			여기서 문제가 발생하면 예외발생
//			아래 예외처리 코드로 던져지고 롤백처리
			
			
			
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생");
//			e2.printStackTrace();
			try { System.out.println("rollback처리!"); conn.rollback();} catch (SQLException e) {e.printStackTrace();}
		}
		finally {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();
			}
		}
		
		
		
		

	}

}
