package CH08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class C08Ex {

	public static void main(String[] args) throws Exception {
		
		//01 DBMS DRIVER 클래스 메모리공간에 적재
		Class.forName("com.mysql.cj.jdbc.Driver");
		//02 CONNECTION
		//jdbc:mysql://<호스트>:<포트>/<데이터베이스이름>
		//java.sql.Connection import
		Connection conn =
		DriverManager.getConnection("\"jdbc:mysql://localhost:3306/testdb\"","root","1234");
		//03 PREPAREDSTATEMENT("SQL")
//		PreparedStatement pstmt = conn.prepareStatement("안에 쿼리문");
		PreparedStatement pstmt = conn.prepareStatement("select * from tbl_sample");
		//04 EXCUTE(.executeQuery() , INSERT/UPDATE/DELETE .executeUpdate()
		ResultSet rs = pstmt.executeQuery();;
		//05 결과값 확인
		List<SampleDto> list = new ArrayList();
		SampleDto dto = null;
		if(rs!=null) {
			while(rs.next()) {
				dto = new SampleDto();
				dto.set위반구분(rs.getString("위반구분"));
				dto.set위반일시(rs.getString("위반일시"));
				dto.set위반장소(rs.getString("위반장소"));
				dto.set과태료부과일자(rs.getString("과태료부과일자"));
				dto.set데이터기준일자(rs.getString("데이터기준일자"));
				list.add(dto);
			}
		}
		
		list.forEach(System.out::println);

	}

}
