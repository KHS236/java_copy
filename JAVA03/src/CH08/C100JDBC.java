package CH08;

public class C100JDBC {

	public static void main(String[] args) {

		
		

	}

}








/*
 JDBC API 사용 흐름
 
 1 JDBC 드라이버 로딩
  - 사용하고자 하는 JDBC 드라이버를 로딩,
    JDBC 드라이버는 DriverManager 클래스를 통해 로딩된다
 2 Connection 객체 생성
  - JDBC 드라이버가 정상적으로 로딩되면 DRiverManager를 통해 데이터 베이스와
    연결되는 세션인 Connection 객체를 생성
 3 Statement 객체 생성
  - Statement 객체는 작성된 SQL 쿼리문을 실행하기 위한 객체로
    정적 SQL 쿼리 문자열을 입력으로 가진다
 4 Query 실행
  - 생성된 Statement 객체를 이용해 입력한 SQL 쿼리를 실행한다.
 5 ResultSett 객체로부터 데이터 조회
  - 실횡된 SQL 쿼리문에 대한 결과 데이터 셋
 6 ResultSet 객체 Close
 7 Statement 객체 Close
 8 Connection 객체 Close
  - JDBC API를 통해 사용된 객체들은 생성된 객체들을 사용한 순서의 역순으로 Close
 
 */


// Connection 객체 생성
// PreparedStatement 객체 불러옴 + SQL 쿼리문 준비
// ResultSet rs = .executeQuery() , int result = .executteUpdate()
// while(rs.next())
//{
//}
//close()
