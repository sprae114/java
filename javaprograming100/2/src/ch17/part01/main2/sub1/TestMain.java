package ch17.part01.main2.sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class TestMain {
	public static void main(String[] args) {

		Connection conn = null;
    PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			/** OracleDriver 클래스 로딩  → 정적초기화 작업실행 */
			Class.forName("oracle.jdbc.driver.OracleDriver");

			/** 오라클데이터베이스 네트워크 접속 후 Connection 객체생성 */
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javastudy";
			String pass = "oracle";
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection 연결 : " + conn);

			/** 쿼리실행을 위한 객체생성: PreparedStatement  */
			String query = "SELECT * FROM PRODUCT";
			pstmt = conn.prepareStatement(query);

			/** executeQuery()를 이용한 조회 */
			rs = pstmt.executeQuery();

			/** 자료에 관한 정보를 조회를 위해 ResultSetMetaData 객체생성 */
		ResultSetMetaData rsmd = rs.getMetaData();

		/** rs.next()를 이용하여 다음 자료접근 */
		while( rs.next() ){
			for( int i = 0; i< rsmd.getColumnCount(); i++){
      			String columnName = rsmd.getColumnName( i+1 );
				/** 인덱스를 이용하여 해당 컬럼의 값을 조회 */
      			String value = rs.getString( i + 1 );
      			System.out.print( "\t"+ columnName + "[" + value + "]");
    		}
  			System.out.println();
		}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		/** ResultSet 종료 */
		try { if(rs!=null) rs.close(); }
		catch (SQLException e) { e.printStackTrace(); }

		/** PreparedStatement 종료 */
		try { if(pstmt!=null) pstmt.close(); }
		catch (SQLException e) { e.printStackTrace(); }

		/** Connection 종료 */
		try { if(conn!=null) conn.close(); }
		catch (SQLException e) { e.printStackTrace(); }
	}
}