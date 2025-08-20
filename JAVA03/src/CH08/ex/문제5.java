package CH08.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class 문제5 {
	//DB CONN DATA
	private static String id = "root";
	private static String pw = "1234";
	private static String url = "jdbc:mysql://localhost:3306/tmpdb";
	
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	//연결
	public static void conn() throws SQLException{
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("DB CONNECTED...");
	}	
	//SelectAll
	public static List<BookDto> selectAll() throws SQLException{
		pstmt = conn.prepareStatement("select * from tbl_book");
		rs = pstmt.executeQuery();
		List<BookDto> list = new ArrayList<>();
		while(rs.next()) {
			BookDto dto = new BookDto(rs.getLong("bookCode"),rs.getString("bookName"),rs.getString("publisher"),rs.getString("isbn"));
			list.add(dto);
		}
		rs.close();
		pstmt.close();
		return list;
	}
	//Select
	public static BookDto select(Long code) throws SQLException{
		pstmt = conn.prepareStatement("select * from tbl_book where bookCode=?");
		pstmt.setLong(1, code);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			BookDto dto = new BookDto(rs.getLong("bookCode"),rs.getString("bookname"),rs.getString("publisher"),rs.getString("isbn"));
			rs.close();
			pstmt.close();
			return dto;
		}
		else return null;
	}
	//Insert
	public static int insertBook(BookDto bookDto) throws SQLException{
		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
		pstmt.setLong(1, bookDto.getBookCode());
		pstmt.setString(2, bookDto.getBookName());
		pstmt.setString(3, bookDto.getPublisher());
		pstmt.setString(4, bookDto.getIsbn());
		int result=pstmt.executeUpdate();
		pstmt.close();
		if(result>0) {return  1;}
		else 		 {return -1;}
	}
	//Update
	static int updateBook(BookDto dto) throws SQLException{
		pstmt = conn.prepareStatement("update tbl_book set bookname=?,publisher=?,isbn=? where bookCode=?");
		pstmt.setString(1, dto.getBookName());
		pstmt.setString(2, dto.getPublisher());
		pstmt.setString(3, dto.getIsbn());
		pstmt.setLong(4, dto.getBookCode());
		int result=pstmt.executeUpdate();
		pstmt.close();
		if(result>0) {return  1;}
		else 		 {return -1;}
	}
	//Delete
	public static int deleteBook(Long code) throws SQLException{
		pstmt = conn.prepareStatement("delete from tbl_book where bookCode=?");
		pstmt.setLong(1, code);
		int result=pstmt.executeUpdate();
		pstmt.close();
		if(result>0) {return  1;}
		else 		 {return -1;}
	}
	//DeleteAll
	public static int deleteAll() throws SQLException{
		pstmt = conn.prepareStatement("delete from tbl_book");
		int result=pstmt.executeUpdate();
		pstmt.close();
		if(result>0) {return  1;}
		else 		 {return -1;}
	}
	
	public static void main(String[] args) {
		try {
			//DBConn
			Class.forName("com.mysql.cj.jdbc.Driver");	//jdbc 드라이버클래스를 호출하는 코드 ps. 중간의 .cj부분은 최신버젼에서 생김
			System.out.println("Driver Loading Success..."); 
			conn();	//데이터베이스와 실제로 연결하는 코드
			//Tx start
			conn.setAutoCommit(false);	// 
			//Insert
			insertBook(new BookDto(1L,"도서명1","출판사명1","isbn-1"));
			insertBook(new BookDto(2L,"도서명2","출판사명2","isbn-2"));
			insertBook(new BookDto(3L,"도서명3","출판사명3","isbn-3"));
			
			//SelectAll
			List<BookDto> allBook = selectAll();
			System.out.println("selectAll : ");
			allBook.forEach(el->System.out.println(el));
			//Select
			BookDto dto = select(1L);
			System.out.println("Select : "+dto);
			//Updata
			dto.setBookName("수정도서명-2");
			dto.setPublisher("수정출판사명-2");
			int r1 = updateBook(dto);
			if(r1>0) 
				System.out.println("수정완료 : " + r1);
			//Delete
			int r2 = deleteBook(2L);
			if(r2>0)
				System.out.println("삭제완료 : " + r2);
			//DeleteAll
			int r3 = deleteAll();
			if(r3>0)
				System.out.println("전부삭제완료");
			//Tx End
			conn.commit();
		}
		catch(ClassNotFoundException e) {System.out.println("ClassNotFoundException");}
		catch(SQLException e) {
			try {System.out.println("SQLException!!"); conn.rollback();} 
			catch (SQLException e2) {System.out.println("SQLException"); e2.printStackTrace();}}
		finally {
			try {if(rs!=null) {rs.close();}} catch (SQLException e) {e.printStackTrace();}
			try {if(pstmt!=null) {pstmt.close();}} catch (SQLException e) {e.printStackTrace();}
			try {if(conn!=null) {conn.close();}} catch (SQLException e) {e.printStackTrace();}
			
		}
	}
}