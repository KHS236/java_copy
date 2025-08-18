package CH08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C06EX {

	public static void main(String[] args) {

		
		
//		00.charge_station.sql을 dbms에 복원하기(opendatadb.tbl_charge)
//		아 이거 자바에서 하는 게 아니라 워크벤치 열어서 하면 되나요?
		
//		charge_station 내용은
//		순번 / 행정구역 / 지사 / 시설명 / 우편번호 / 주소
		
		
//		01.tbl_charge에insert코드실행
		
//		DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";
		
		
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
			
//			Insert 코드=============================================================================
//			sql코드 객체 생성
//			pstmt = conn.prepareStatement("insert into charge_station values(?,?,?,?,?,?)"); //행에 컬럼이 6개니까 ?도 6개
//			pstmt.setInt(1,Integer.parseInt(args[0])); //첫뻔제 칼럼은 순번 숫자니까 args의 인덱스0을 인티저로 변환해서 대입
//			pstmt.setString(2, args[1]); //나머지 말그대로 args인덱스 순서대로 넣어주면 됨
//			pstmt.setString(3, args[2]);
//			pstmt.setString(4, args[3]);
//			pstmt.setString(5, args[4]);
//			pstmt.setString(6, args[5]);
			
//			입력
//			205 "서울어쩌구" "무슨지사" "코리아IT" "11111" "무슨중앙대로어쩌구"
			
			
//			update 코드 =========================================================================
//			pstmt = conn.prepareStatement("Update charge_station set 행정구역=?, 지사=?, 시설명=?, 우편번호=?, 주소=? where 순번=?");
			
//			pstmt.setString(1, args[0]);
//			pstmt.setString(2, args[1]);
//			pstmt.setString(3, args[2]);
//			pstmt.setString(4, args[3]);
//			pstmt.setString(5, args[4]);
//			pstmt.setInt(6,Integer.parseInt(args[5]));
			
//			입력
//			"서울어쩌구" "무슨지사" "코리아IT" "11111" "무슨중앙대로어쩌구" 205
			
			
//			Delete코드
			pstmt = conn.prepareStatement("DELETE FROM `opendatadb`.`charge_station` WHERE (`순번` = '205');");
			
//			pstmt.setInt(1,Integer.parseInt(args[0])); //순번만 있으면 되니까 하나만 쓰면 댐
//			입력
//			205
			
//			sql을 dbms로 전달
			int result = pstmt.executeUpdate();
//			PreparedStatement의 함수중 하나로 DB에서 변경을 가하는 SQL문을 실행할 때 사용
//			실행 후 몇 행이 영향을 받았는지 정수로 리턴한다고 한당 (insert 삽입된 행 수, update 수정된 행 수, delete 삭제된 행 수)
			
//			java에서 결과값으로 처리
			if (result > 0) {
				System.out.println("테이블 수정 성공!");
			}else {
				System.out.println("실패, 영향받은 행 없음");
			}
			
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
		
		
		
		
//		02.tbl_charge에update코드실행
//		03.tbl_charge에delete코드실행
//		04.tbl_charge의 내용을 Selec한 결과 console에서 확인
		
		

		
		
		
		
	}

}
