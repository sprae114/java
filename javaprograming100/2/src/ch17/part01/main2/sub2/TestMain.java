package ch17.part01.main2.sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain {
	public static void main(String[] args) {

	Connection conn = null;
    PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		/** OracleDriver 클래스 로딩  → 정적초기화 작업 실행 */
		Class.forName("oracle.jdbc.driver.OracleDriver");

		/** 오라클데이터베이스 네트워크 접속 후 Connection 객체생성 */
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "javastudy";
		String pass = "oracle";
		conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection 연결 : " + conn);

		/** 쿼리실행을 위한 객체생성: PreparedStatement  */
		// 【동적으로 처리하기 위한 파라미터 분리】
		int totalAmount = 9000;
		String saleDateStart = "20190101";
		String saleDateEnd = "20190102";

		// 【쿼리작성】 파라미터는 『?』로 입력한다.
		String query = "";
		query += " SELECT	TO_CHAR(B.SALE_DATE, 'YYYY-MM-DD') AS SALE_DATE ";
		query += "       ,	C.PRODUCT_NO ";
		query += "       ,	A.PRODUCT_NAME ";
		query += "       ,	C.PRICE ";
		query += "       ,	C.QTY ";
		query += "       ,	C.PRICE * C.QTY AS TOTAL_AMOUNT ";
		query += " FROM	PRODUCT A ";
		query += "      ,	PRODUCT_PURCHASE B ";
		query += "      ,	PRODUCT_PURCHASE_DETAIL C ";
		query += "WHERE A.PRODUCT_NO = C.PRODUCT_NO ";
		query += "  AND B.ACCOUNT_NO = C.ACCOUNT_NO ";
		query += "  AND (C.PRICE * C.QTY) >= ?" ; 		/** 첫 번째 파라미터 */
		query += "  AND B.SALE_DATE >= TO_DATE(?) ";	/** 두 번째 파라미터 */
		query += "  AND B.SALE_DATE <= TO_DATE(?) ";	/** 세 번째 파라미터 */

		// 【PreparedStatement 객체생성】
		pstmt = conn.prepareStatement(query);

		// 【파라미터 입력】 pstmt를 이용하여 값을 직접 입력한다.
		pstmt.setInt(1, totalAmount); 		/** 첫 번째 파라미터에 입력 */
		pstmt.setString(2, saleDateStart);	/** 두 번째 파라미터에 입력 */
		pstmt.setString(3, saleDateEnd); 	/** 세 번째 파라미터에 입력 */

		// 【쿼리실행】
		rs = pstmt.executeQuery();
		/** 자료에 관한 정보를 조회를 위해 ResultSetMetaData 객체생성 */
		ResultSetMetaData rsmd = rs.getMetaData();
		/** rs.next()를 이용하여 다음 자료접근 */
		while( rs.next() ){
			for( int i = 0; i< rsmd.getColumnCount(); i++){
      			String columnName = rsmd.getColumnName( i+1 );
				/** 인덱스를 이용하여 해당 컬럼의 값을 조회 */
      			String value = rs.getString( i + 1 );
      			System.out.print( "\t"+ columnName + "[" + value + "]" );
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