package CH08.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DB연결 정리
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
5 ResultSet 객체로부터 데이터 조회
 - 실행된 SQL 쿼리문에 대한 결과 데이터 셋
 (자원관리↓)
6 ResultSet 객체 Close
7 Statement 객체 Close
8 Connection 객체 Close
 - JDBC API를 통해 사용된 객체들은 생성된 객체들을 사용한 순서의 역순으로 Close

*/

public class 문제2 {
	// DB CONN DATA
	private static String id = "root";
	private static String pw = "1234";
	private static String url = "jdbc:mysql://localhost:3306/opendatadb";
	/*
	 root계정 비밀번호 1234
	 DBMS의 위치 현재 컴퓨터니까 localhost
	 연결
	 */
	

	// JDBC참조변수
	private static Connection conn = null; // DBMS 의 특정 DB와 연결되는 객체
	private static PreparedStatement pstmt = null; // SQL Query 전송용 객체
	private static ResultSet rs = null; // 표형태(Select 결과물을) 담을 객체

	// 연결작업
	// DBMS Driver 메모리 적재
	public static void conn() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("DB CONNECTED...");
	}
	/* JDBC 드라이버 로딩
		 - MySQL의 JDBC Driver Class를 로딩
		   Class.forName("driver")를 이용해 Driver Class를 로딩하면 객체 생성
		   driverManager에 등록
		   
		 - Connection 객체 생성
		   conn = DriverManager.getConnection(url, id, pw) 데이터베이스와 연결하는 객체 생성
		   연결문자열"jdbc:Driver 종류://IP:포트번호/DB명"
		   DB 연결완료
		   */

	
	
	
	
//	=================================================================================
//	SelectAll 흐름 주석 정리
//	=================================================================================
	public static List<BookDto> selectAll() throws SQLException {
		/*어디서든 접근 가능한(public) BookDto자료형 리스트를 반환하는 정적(static) 메서드 selectAll(전체조회의미)
		  SQLException이 발생하면 호출한 메서드의 try-catch블럭에서 처리하도록 예외를 던짐(?)*/
		pstmt = conn.prepareStatement("SELECT * FROM tbl_book");
		/*Statement 객체 생성 정적SQL 쿼리문("SELECT * FROM tbl_book")문자열 입력
		 SELECT *(모두) 조회할 테이블 이름*/

		rs = pstmt.executeQuery();
		/*
		 쿼리 실행후 resultset 객체에 데이터 조회 결과를 저장
		 (정확히는 조회 결과 저장이 아니라 rs가 커서를 관리한다고 하네요)
		 */
		
		
		List<BookDto> list = new ArrayList();
		BookDto dto = null;
		if (rs != null) {
			while (rs.next()) {
				dto = new BookDto();
				dto.setBookCode(rs.getLong("bookCode"));
				dto.setBookName(rs.getString("bookName"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setIsbn(rs.getString("isbn"));
				list.add(dto);
//				
////				System.out.print(rs.getInt("bookCode")+" ");
////				System.out.print(rs.getString("bookName")+" ");
////				System.out.print(rs.getString("publisher")+" ");
////				System.out.println(rs.getString("isbn"));
			}
		}
		return list;
	}
	/*
	 list 객체에 rs의 처리결과를 저장시키기
	 - List<BookDto> 객체들을 담을 list 객체
	 - BookDto 자료형의 참조변수 dto 선언 초기값 null
	 반복문 안에서 new BookDto()를 이용해 객체를 생성하고 컬럼데이터를 담음
	 ->한 행을 옮겨담는 임시 객체라고 보면 된다
	 
	 - rs가 null값이 아닐 경우 next()를 통해 커서를 한 칸씩 아래로 이동 반복
	 각 행 컬럼값을 Bookdto 객체 (dto)에 담아 list에 add
	 더이상 내려갈 행이 없을 때 (rs가 null일때) 반복 종료
	 list 결과를 반환
	 */
	
	
	
	
	
//	=================================================================================
//	Select
//	=================================================================================

	public static BookDto select(Long bookCode) throws SQLException {
		/*어디서든 접근 가능한 BookDto자료형을 반환하는 정적 메서드 select(조회 의미) 매개변수(Long bookCode)
		  SQLException이 발생하면 호출한 메서드의 try-catch블럭에서 처리하도록 던짐*/

		pstmt = conn.prepareStatement("SELECT * FROM tbl_book where bookCode=?");
		/*Statement 객체 생성, 쿼리문("SELECT * FROM tbl_book where bookCode=?")문자열 입력
		 조회할 테이블 어디를 조회해야할지 정해야하니 where bookCode=? 입력 , ?는 아직 값이 정해지지않은 변수로 sql문법*/
		pstmt.setLong(1, bookCode);
		/*첫 ?위치에 Long자료형의 bookCode변수가 가진 값을 넣는다(호출할 때 1L으르 넣으면 Long자료형 1이 대입됨)*/
		rs = pstmt.executeQuery();
		/*
		 쿼리 실행후 resultset 객체에 데이터 조회 결과를 반환 그에 대한 커서 관리
		 */
 
		BookDto dto = null;
		if (rs != null) {
			rs.next();
			dto = new BookDto();
			dto.setBookCode(rs.getLong("bookCode"));
			dto.setBookName(rs.getString("bookName"));
			dto.setPublisher(rs.getString("publisher"));
			dto.setIsbn(rs.getString("isbn"));
		}
		return dto;
	}
	/*
	 BookDto 자료형의 참조변수 dto 선언 초기값 null
	 if분기문 안에서 new BookDto()를 이용해 임시 객체를 생성하고 행의 컬럼데이터를 담음
	 
	 - rs가 null값이 아닐 경우(사실상 당연히 값이 있으니 다음 행이 없으면 false를 반환하는 구조)
	  	next()를 통해 커서를 아래로 이동, 행 컬럼값을 dto객체에 담아 결과를 반환
	 */
	
	
	
	
	
//	=====================================================================================
//	Insert
//	=====================================================================================

	public static int insertBook(BookDto bookDto) throws SQLException {
		/*삽입 메서드 insertBook(삽입 의미)매개변수(BookDto bookDto)
		  SQLException이 발생하면 예외를 던짐*/

		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
		/*Statement 객체 생성 ("insert into tbl_book values(?,?,?,?)")입력
	 	삽입할 테이블이름 각 컬럼 값을 삽입 > 컬럼 개수에 맞게 ? 배치*/
		pstmt.setLong(1, bookDto.getBookCode());
		pstmt.setString(2, bookDto.getBookName());
		pstmt.setString(3, bookDto.getPublisher());
		pstmt.setString(4, bookDto.getIsbn());
		/*각 순서 ?위치에 insertbook 호출시 bookDto매개변수로 들어온 값을
		  각 컬럼에 삽입*/
		
		int result = pstmt.executeUpdate();
		/*쿼리 실행후 result에 결과값(영향받은 행 수)을 저장*/

		return result;
	}
//		결과값이 담긴 result를 반환

	
	
	
	
//	=========================================================================================
//	update
//	==========================================================================================
	public static int updateBook(BookDto bookDto) throws SQLException {
		/*수정 메서드 updateBook매개변수(BookDto bookDto)
		  SQLException 발생시 예외를 던져버려*/

		pstmt = conn.prepareStatement("update tbl_book set bookName=?,publisher=?,isbn=? where bookCode=?");
		/*Statement 객체 생성 ("update tbl_book set bookName=?,publisher=?,isbn=? where bookCode=?")
	 	수정할 테이블 set 수정할 컬럼=?,where 수정할 행=?*/
		
		pstmt.setString(1, bookDto.getBookName());
		pstmt.setString(2, bookDto.getPublisher());
		pstmt.setString(3, bookDto.getIsbn());
		pstmt.setLong(4, bookDto.getBookCode());
		/*각 순서 ?위치에 updateBook 호출시 bookDto매개변수로 들어온 값을 각 컬럼에 수정*/
		
		int result = pstmt.executeUpdate();
//		영향받은 행 수를 result에 저장

		return result;
	}
//		result 값을 반환
	
	
	
	
	
//	==============================================================================================
//	Delete
//	==============================================================================================

	public static int deleteBook(BookDto bookDto) throws SQLException {
		/*삭제 메서드 deleteBook매개변수(BookDto bookDto) SQLException 발생시 예외를 던진다아*/
		pstmt = conn.prepareStatement("delete from tbl_book where bookCode=?");
		/*Statement 객체 생성 ("delete from tbl_book where bookCode=?")
	 	삭제할 테이블, where 삭제할 행=?*/
		pstmt.setLong(1, bookDto.getBookCode());	
		/*?위치에 deleteBook 호출시 bookDto매개변수로 들어온 값을 찾아 행 삭제*/
		int result = pstmt.executeUpdate();
//		영향받은 행 개수를 result에 담음
		return result;
	}
//		result 값을 반환
	
	
	
	
	
	
//	==============================================================================================
//	메인메서드 (호출)
//	==============================================================================================
	public static void main(String[] args) {
		try {
			// DBCONN
			conn(); // << DB 연결 객체

			// TX START << 트랜잭션 시작
			conn.setAutoCommit(false);//커밋 = 승인, 아래 쿼리문이 원래 자동 커밋인데 자동커밋을 끔
			/* 
			 << 호출하면서 각각 수동으로 값 넣기 (이러면 트랜잭션이 각각 따로따로 지정돼 있음)
			 이 경우 예외발생이 일어나지만 정상적인 값들은 적용이 돼버림
			 얘내를 하나의 트랜잭션 단위로 묶어주면 예외가 발생했을 때 나머지 값들도 변화가 없도록 해줄 수 있음
			 */

			
////			 INSERT
////			insertBook(new BookDto(1L, "도서명1", "출판사명1", "isbn-1"));
////			insertBook(new BookDto(2L, "도서명1", "출판사명1", "isbn-1"));
////			insertBook(new BookDto(3L, "도서명1", "출판사명1", "isbn-1"));
////			insertBook(new BookDto(4L, "도서명1", "출판사명1", "isbn-1"));
//
////			// SELECTALL
////			List<BookDto> allBook = selectAll();
////			System.out.println("SelectAll : ");
////			allBook.forEach(System.out::println);
//
//			// SELECT <<select 호출
			BookDto dto = select(1L);
			System.out.println("select : " + dto);
			/*
			 select를 호출해서 북코드 1인곳을 찾아 조회 후 dto에 담아서 출력
			 */

////			// UPDATE
////			dto.setBookName("수정도서명-2");
////			dto.setPublisher("수정출판사명-2");
////			int r1 = updateBook(dto);
////			if (r1 > 0)
////				System.out.println("수정완료 : " + r1);
//
//			// DELETE <<delete호출
			int r2 = deleteBook(dto);
			if (r2 > 0)
				System.out.println("삭제완료 : " + r2);
			/*
			 deletebook호출 dto에 담긴 북코드 값을 이용해 해당 행 삭제후r2에 담음
			 삭제된 행이 1개 이상일 경우 출력
			 
			 (dto 자체는 위에서 하나의 행 자체를 담았지만
			 deleteBook 함수에서 .getBookCode를 통해 dto에 담긴 행의 북코드만 참조해서 해당 행을 삭제하는 흐름)
			 */
			

//			//TX END <<트랜잭션 끝
			conn.commit();
			/*오토커밋을 끄고 켜는 사이에 코드가 하나의 트랜잭션 단위로 묶인다
			여기서 문제가 발생하면 예외발생
			아래 예외처리 코드로 던져지고 롤백(수정 전으로)처리*/
			
		} catch (Exception e) {
			// TX ROLLBACKALL <<여기서 롤백
			try{conn.rollback();}catch(Exception e2) {}
		} finally {
			//자원제거
			/*- JDBC API를 통해 사용된 객체들은 사용한 순서의 역순
			   (resultset > statement > connection 객체 순)으로 Close*/
			try{rs.close();}catch(Exception e3) {}
			try{pstmt.close();}catch(Exception e3) {}
			try{conn.close();}catch(Exception e3) {}
		}

	}

}